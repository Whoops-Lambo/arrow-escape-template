package com.google.android.gms.internal.ads;

import android.os.Handler;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzfxz implements zzfxs {
    public static zzfxz d;
    public float a;
    public zzfxn b;
    public zzfxr c;

    public static zzfxz a() {
        if (d == null) {
            new zzfxk();
            new zzfxo();
            zzfxz zzfxzVar = new zzfxz();
            zzfxzVar.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            d = zzfxzVar;
        }
        return d;
    }

    @Override // com.google.android.gms.internal.ads.zzfxs
    public final void zzd(boolean z) {
        if (z) {
            zzfzh.f.getClass();
            zzfzh.b();
            return;
        }
        zzfzh.f.getClass();
        Handler handler = zzfzh.h;
        if (handler != null) {
            handler.removeCallbacks(zzfzh.j);
            zzfzh.h = null;
        }
    }
}
