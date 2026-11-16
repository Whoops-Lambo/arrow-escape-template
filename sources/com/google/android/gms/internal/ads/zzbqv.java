package com.google.android.gms.internal.ads;

import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbqv {
    public boolean a = false;
    public boolean b = false;
    public float c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public final AtomicBoolean d = new AtomicBoolean(false);

    public final synchronized boolean a(boolean z) {
        if (!this.d.get()) {
            return z;
        }
        return this.a;
    }
}
