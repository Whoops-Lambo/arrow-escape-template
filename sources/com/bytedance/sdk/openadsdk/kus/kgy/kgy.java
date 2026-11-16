package com.bytedance.sdk.openadsdk.kus.kgy;

import com.bytedance.sdk.openadsdk.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class kgy {
    private String ahm;
    private String ct;
    private String kgy;
    private int noq;
    private String rz;
    private String uq;
    private int yo;

    public int ahm() {
        return this.yo;
    }

    public String ct() {
        return this.ahm;
    }

    public String kgy() {
        return BuildConfig.VERSION_NAME;
    }

    public String noq() {
        return this.rz;
    }

    public String rz() {
        return this.ct;
    }

    public String uq() {
        return this.kgy;
    }

    public String yo() {
        return this.uq;
    }

    public void ahm(int i) {
        this.yo = i;
    }

    public void ct(String str) {
        this.ahm = str;
    }

    public void kgy(int i) {
        this.noq = i;
    }

    public void rz(String str) {
        this.rz = str;
    }

    public void uq(String str) {
        this.kgy = str;
    }

    public void ahm(String str) {
        this.uq = str;
    }

    public void kgy(String str) {
        this.ct = str;
    }
}
