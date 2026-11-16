package com.bytedance.sdk.openadsdk.core.model;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class fi {
    private int ahm;
    private List<String> ct;
    private int kgy;
    private int noq;
    private List<Integer> rz;
    private int uq;
    private int yo;

    public void ahm(int i) {
        this.yo = i;
    }

    public List<Integer> ct() {
        return this.rz;
    }

    public int kgy() {
        int i = this.yo;
        if (i >= 2) {
            return i;
        }
        return 0;
    }

    public int noq() {
        return this.uq;
    }

    public int rz() {
        return this.kgy;
    }

    public int uq() {
        return this.ahm;
    }

    public List<String> ahm() {
        return this.ct;
    }

    public void ct(int i) {
        this.uq = i;
    }

    public void rz(int i) {
        this.kgy = i;
    }

    public void uq(int i) {
        this.ahm = i;
    }

    public void ahm(List<Integer> list) {
        this.rz = list;
    }

    public void kgy(int i) {
        this.noq = i;
    }

    public void kgy(List<String> list) {
        this.ct = list;
    }
}
