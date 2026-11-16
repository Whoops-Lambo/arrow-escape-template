package com.google.android.exoplayer2.audio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import defpackage.pa;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class AudioCapabilitiesReceiver {

    @Nullable
    AudioCapabilities audioCapabilities;
    private final Context context;

    @Nullable
    private final pa externalSurroundSoundSettingObserver;
    private final Handler handler;
    private final Listener listener;

    @Nullable
    private final BroadcastReceiver receiver;
    private boolean registered;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface Listener {
        void onAudioCapabilitiesChanged(AudioCapabilities audioCapabilities);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onNewAudioCapabilities(AudioCapabilities audioCapabilities) {
        if (!this.registered || audioCapabilities.equals(this.audioCapabilities)) {
            return;
        }
        this.audioCapabilities = audioCapabilities;
        this.listener.onAudioCapabilitiesChanged(audioCapabilities);
    }

    public AudioCapabilities register() {
        Intent intentRegisterReceiverNotExported;
        if (this.registered) {
            return (AudioCapabilities) Assertions.checkNotNull(this.audioCapabilities);
        }
        this.registered = true;
        pa paVar = this.externalSurroundSoundSettingObserver;
        if (paVar != null) {
            paVar.a.registerContentObserver(paVar.b, false, paVar);
        }
        if (this.receiver != null) {
            intentRegisterReceiverNotExported = Util.registerReceiverNotExported(this.context, this.receiver, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), this.handler);
        } else {
            intentRegisterReceiverNotExported = null;
        }
        AudioCapabilities capabilities = AudioCapabilities.getCapabilities(this.context, intentRegisterReceiverNotExported);
        this.audioCapabilities = capabilities;
        return capabilities;
    }

    public void unregister() {
        if (this.registered) {
            this.audioCapabilities = null;
            BroadcastReceiver broadcastReceiver = this.receiver;
            if (broadcastReceiver != null) {
                this.context.unregisterReceiver(broadcastReceiver);
            }
            pa paVar = this.externalSurroundSoundSettingObserver;
            if (paVar != null) {
                paVar.a.unregisterContentObserver(paVar);
            }
            this.registered = false;
        }
    }

    public AudioCapabilitiesReceiver(Context context, Listener listener) {
        com.facebook.internal.f fVar;
        Context applicationContext = context.getApplicationContext();
        this.context = applicationContext;
        this.listener = (Listener) Assertions.checkNotNull(listener);
        Handler handlerCreateHandlerForCurrentOrMainLooper = Util.createHandlerForCurrentOrMainLooper();
        this.handler = handlerCreateHandlerForCurrentOrMainLooper;
        if (Util.SDK_INT >= 21) {
            fVar = new com.facebook.internal.f(this, 1);
        } else {
            fVar = null;
        }
        this.receiver = fVar;
        Uri externalSurroundSoundGlobalSettingUri = AudioCapabilities.getExternalSurroundSoundGlobalSettingUri();
        this.externalSurroundSoundSettingObserver = externalSurroundSoundGlobalSettingUri != null ? new pa(this, handlerCreateHandlerForCurrentOrMainLooper, applicationContext.getContentResolver(), externalSurroundSoundGlobalSettingUri) : null;
    }
}
