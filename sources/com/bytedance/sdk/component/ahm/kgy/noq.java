package com.bytedance.sdk.component.ahm.kgy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class noq {
    private final String[] kgy;

    public String ahm(int i) {
        return this.kgy[(i * 2) + 1];
    }

    public String kgy(int i) {
        return this.kgy[i * 2];
    }

    public noq(String[] strArr) {
        this.kgy = strArr;
    }

    public int kgy() {
        return this.kgy.length / 2;
    }
}
