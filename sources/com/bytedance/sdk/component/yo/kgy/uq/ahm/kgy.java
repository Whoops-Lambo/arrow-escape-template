package com.bytedance.sdk.component.yo.kgy.uq.ahm;

import defpackage.e32;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class kgy {
    private int ahm;
    private int kgy;

    public static kgy kgy(int i, int i2) {
        return new kgy(i, i2, 172800000L);
    }

    public static kgy rz() {
        return new kgy(1, 100, 172800000L);
    }

    public int ahm() {
        return this.ahm;
    }

    public kgy(int i, int i2, long j) {
        if (i2 >= i) {
            this.kgy = i;
            this.ahm = i2;
        } else {
            e32.i("atMostBatchSendCount should meet a condition (atMostBatchSendCount >= maxCacheCount)");
            throw null;
        }
    }

    public int kgy() {
        return this.kgy;
    }
}
