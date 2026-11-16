package com.bytedance.adsdk.ugeno.rz;

import defpackage.h50;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class rz {
    private String ahm;
    private String kgy;
    private int rz;
    private int uq;

    public String ahm() {
        return this.ahm;
    }

    public String kgy() {
        return this.kgy;
    }

    public int rz() {
        return this.rz;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FormattedPart{type='");
        sb.append(this.kgy);
        sb.append("', value='");
        sb.append(this.ahm);
        sb.append("', start=");
        sb.append(this.rz);
        sb.append(", end=");
        return h50.l(sb, this.uq, '}');
    }

    public int uq() {
        return this.uq;
    }

    public rz(String str, String str2, int i, int i2) {
        this.kgy = str;
        this.ahm = str2;
        this.rz = i;
        this.uq = i2;
    }

    public void ahm(String str) {
        this.ahm = str;
    }

    public void kgy(String str) {
        this.kgy = str;
    }

    public void kgy(int i) {
        this.uq = i;
    }
}
