package com.inmobi.media;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import com.inmobi.media.C4119j2;
import defpackage.ud3;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.inmobi.media.j2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C4119j2 {
    public final Context a;
    public boolean b;
    public WeakReference c;
    public final AudioAttributes d;
    public AudioFocusRequest e;
    public AudioManager.OnAudioFocusChangeListener f;

    public static final void a(C4119j2 c4119j2, int i) {
        InterfaceC4092i2 interfaceC4092i2;
        InterfaceC4092i2 interfaceC4092i3;
        WeakReference weakReference;
        InterfaceC4092i2 interfaceC4092i4;
        if (i == -2) {
            c4119j2.b = true;
            WeakReference weakReference2 = c4119j2.c;
            if (weakReference2 == null || (interfaceC4092i2 = (InterfaceC4092i2) weakReference2.get()) == null) {
                return;
            }
            interfaceC4092i2.a();
            return;
        }
        if (i == -1) {
            c4119j2.b = false;
            WeakReference weakReference3 = c4119j2.c;
            if (weakReference3 == null || (interfaceC4092i3 = (InterfaceC4092i2) weakReference3.get()) == null) {
                return;
            }
            interfaceC4092i3.a();
            return;
        }
        if (i != 1) {
            return;
        }
        if (c4119j2.b && (weakReference = c4119j2.c) != null && (interfaceC4092i4 = (InterfaceC4092i2) weakReference.get()) != null) {
            interfaceC4092i4.b();
        }
        c4119j2.b = false;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    public final boolean e() {
        int iRequestAudioFocus;
        try {
            Object systemService = this.a.getSystemService("audio");
            AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
            if (audioManager == null) {
                iRequestAudioFocus = 0;
            } else {
                if (this.f == null) {
                    this.f = b();
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    if (this.e == null) {
                        this.e = c();
                    }
                    AudioFocusRequest audioFocusRequest = this.e;
                    if (audioFocusRequest != null) {
                        iRequestAudioFocus = audioManager.requestAudioFocus(audioFocusRequest);
                    } else {
                        iRequestAudioFocus = 0;
                    }
                } else {
                    iRequestAudioFocus = audioManager.requestAudioFocus(this.f, 3, 2);
                }
            }
            return iRequestAudioFocus == 1;
        } catch (Throwable unused) {
        }
    }

    public final AudioManager.OnAudioFocusChangeListener b() {
        return new AudioManager.OnAudioFocusChangeListener() { // from class: de3
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i) {
                C4119j2.a(this.a, i);
            }
        };
    }

    public final void d() {
        WeakReference weakReference = this.c;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.c = null;
        a();
        if (Build.VERSION.SDK_INT >= 26) {
            this.e = null;
        }
        this.f = null;
    }

    public C4119j2(Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.a = applicationContext;
        AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setUsage(1).setContentType(2).setLegacyStreamType(3).build();
        audioAttributesBuild.getClass();
        this.d = audioAttributesBuild;
    }

    public final AudioFocusRequest c() {
        AudioFocusRequest.Builder audioAttributes = ud3.f().setAudioAttributes(this.d);
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f;
        onAudioFocusChangeListener.getClass();
        AudioFocusRequest audioFocusRequestBuild = audioAttributes.setOnAudioFocusChangeListener(onAudioFocusChangeListener, ((Wc) P6.e.getValue()).a).build();
        audioFocusRequestBuild.getClass();
        return audioFocusRequestBuild;
    }

    public final void a() {
        this.b = false;
        try {
            Object systemService = this.a.getSystemService("audio");
            AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
            if (audioManager != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    AudioFocusRequest audioFocusRequest = this.e;
                    if (audioFocusRequest != null) {
                        audioManager.abandonAudioFocusRequest(audioFocusRequest);
                        return;
                    }
                    return;
                }
                AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f;
                if (onAudioFocusChangeListener != null) {
                    audioManager.abandonAudioFocus(onAudioFocusChangeListener);
                }
            }
        } catch (Throwable unused) {
        }
    }
}
