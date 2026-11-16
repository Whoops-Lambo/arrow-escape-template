package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzciv implements AudioManager.OnAudioFocusChangeListener {
    public final AudioManager a;
    public final zzchx b;
    public boolean c;
    public boolean d;
    public boolean e;
    public float f = 1.0f;

    public final void a() {
        boolean z = this.d;
        zzchx zzchxVar = this.b;
        AudioManager audioManager = this.a;
        if (!z || this.e || this.f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (this.c) {
                if (audioManager != null) {
                    this.c = audioManager.abandonAudioFocus(this) == 0;
                }
                zzchxVar.x();
                return;
            }
            return;
        }
        if (this.c) {
            return;
        }
        if (audioManager != null) {
            this.c = audioManager.requestAudioFocus(this, 3, 2) == 1;
        }
        zzchxVar.x();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.c = i > 0;
        this.b.x();
    }

    public zzciv(Context context, zzchx zzchxVar) {
        this.a = (AudioManager) context.getSystemService("audio");
        this.b = zzchxVar;
    }
}
