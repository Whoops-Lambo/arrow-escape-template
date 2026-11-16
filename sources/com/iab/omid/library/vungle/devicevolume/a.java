package com.iab.omid.library.vungle.devicevolume;

import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class a {
    public float a(int i, int i2) {
        if (i2 <= 0 || i <= 0) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f = i / i2;
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }
}
