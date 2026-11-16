package com.bytedance.adsdk.ahm.rz;

import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class rz {
    private final String ahm;
    private Typeface ct;
    private final String kgy;
    private final String rz;
    private final float uq;

    public String ahm() {
        return this.ahm;
    }

    public String kgy() {
        return this.kgy;
    }

    public String rz() {
        return this.rz;
    }

    public Typeface uq() {
        return this.ct;
    }

    public rz(String str, String str2, String str3, float f) {
        this.kgy = str;
        this.ahm = str2;
        this.rz = str3;
        this.uq = f;
    }

    public void kgy(Typeface typeface) {
        this.ct = typeface;
    }
}
