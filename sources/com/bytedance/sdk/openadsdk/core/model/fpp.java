package com.bytedance.sdk.openadsdk.core.model;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class fpp {
    public static int ahm = 2;
    public static int kgy = 1;
    private int rz = 5;
    private int uq = 30;
    private int ct = 70;
    private int noq = 1;
    private int yo = kgy;
    private int fi = 0;
    private int gf = 0;
    private int ra = 3;

    public int ahm() {
        return this.gf;
    }

    public int ct() {
        return this.uq;
    }

    public int fi() {
        return this.yo;
    }

    public boolean kgy(boolean z) {
        int i = this.fi;
        if (z) {
            return i == 1 || i == 3;
        }
        return i == 3 || i == 2;
    }

    public int noq() {
        return this.ct;
    }

    public int rz() {
        return this.fi;
    }

    public int uq() {
        return this.rz;
    }

    public int yo() {
        return this.noq;
    }

    public void ahm(int i) {
        this.gf = i;
    }

    public void ct(int i) {
        this.uq = i;
    }

    public void fi(int i) {
        this.yo = i;
    }

    public void noq(int i) {
        this.ct = i;
    }

    public void rz(int i) {
        this.fi = i;
    }

    public void uq(int i) {
        this.rz = i;
    }

    public void yo(int i) {
        this.noq = i;
    }

    public void kgy(int i) {
        this.ra = i;
    }

    public int kgy() {
        return this.ra;
    }
}
