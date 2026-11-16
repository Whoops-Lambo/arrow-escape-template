package com.bytedance.adsdk.ahm.yo;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class rz {
    private float ahm;
    private float kgy;

    public boolean ahm(float f, float f2) {
        return this.kgy == f && this.ahm == f2;
    }

    public void kgy(float f, float f2) {
        this.kgy = f;
        this.ahm = f2;
    }

    public String toString() {
        return kgy() + "x" + ahm();
    }

    public rz(float f, float f2) {
        this.kgy = f;
        this.ahm = f2;
    }

    public float kgy() {
        return this.kgy;
    }

    public rz() {
        this(1.0f, 1.0f);
    }

    public float ahm() {
        return this.ahm;
    }
}
