package com.bytedance.sdk.openadsdk.api.nativeAd;

import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class PAGImageItem {
    private final int ahm;
    private final int kgy;
    private final String rz;
    private float uq;

    public float getDuration() {
        return this.uq;
    }

    public int getHeight() {
        return this.kgy;
    }

    public String getImageUrl() {
        return this.rz;
    }

    public int getWidth() {
        return this.ahm;
    }

    public PAGImageItem(int i, int i2, String str, float f) {
        this.kgy = i;
        this.ahm = i2;
        this.rz = str;
        this.uq = f;
    }

    public PAGImageItem(int i, int i2, String str) {
        this(i, i2, str, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }
}
