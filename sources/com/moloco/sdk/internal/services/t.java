package com.moloco.sdk.internal.services;

import android.content.Context;
import android.media.AudioManager;
import com.moloco.sdk.internal.MolocoLogger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class t {
    public final AudioManager a;

    public t(Context context) {
        AudioManager audioManager;
        try {
            audioManager = (AudioManager) context.getApplicationContext().getSystemService(AudioManager.class);
        } catch (Exception e) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "AudioService", "couldn't get android.media.AudioManager service", e, false, 8, null);
            audioManager = null;
        }
        this.a = audioManager;
    }
}
