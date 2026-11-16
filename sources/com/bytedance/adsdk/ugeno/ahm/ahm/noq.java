package com.bytedance.adsdk.ugeno.ahm.ahm;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
final class noq {
    int ahm;
    float[] ct;
    int[] fi;
    int[] gf;
    int kgy;
    float[] noq;
    float[] rz;
    float[] uq;
    float[] yo;

    public void kgy(int i) {
        float[] fArr = this.rz;
        if (fArr == null || fArr.length < i) {
            this.rz = new float[i];
            this.uq = new float[i];
            this.ct = new float[i];
            this.noq = new float[i];
            this.yo = new float[i];
            this.fi = new int[i];
            this.gf = new int[i];
        }
    }
}
