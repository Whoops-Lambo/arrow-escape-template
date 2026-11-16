package com.bytedance.sdk.openadsdk.core.model;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class gm {
    private long kgy = 10000;
    private long ahm = 10000;
    private String rz = "";

    public void ahm(long j) {
        if (j < 0) {
            this.ahm = 20L;
        } else {
            this.ahm = j;
        }
    }

    public void kgy(long j) {
        if (j <= 0) {
            this.kgy = 10L;
        } else {
            this.kgy = j;
        }
    }

    public String rz() {
        return this.rz;
    }

    public long ahm() {
        return this.ahm;
    }

    public long kgy() {
        return this.kgy;
    }

    public void kgy(String str) {
        this.rz = str;
    }
}
