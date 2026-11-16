package com.bytedance.adsdk.ahm.noq;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class uq {
    private int ahm;
    private float kgy;

    public void kgy(float f) {
        float f2 = this.kgy + f;
        this.kgy = f2;
        int i = this.ahm + 1;
        this.ahm = i;
        if (i == Integer.MAX_VALUE) {
            this.kgy = f2 / 2.0f;
            this.ahm = i / 2;
        }
    }
}
