package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class um {
    private int ahm;
    private boolean ct;
    private String kgy;
    private String noq;
    private int rz;
    private double uq;

    public int ahm() {
        return this.ahm;
    }

    public boolean ct() {
        return !TextUtils.isEmpty(this.kgy) && this.ahm > 0 && this.rz > 0;
    }

    public String kgy() {
        return this.kgy;
    }

    public boolean noq() {
        return this.ct;
    }

    public int rz() {
        return this.rz;
    }

    public double uq() {
        return this.uq;
    }

    public String yo() {
        return this.noq;
    }

    public void ahm(int i) {
        this.rz = i;
    }

    public void kgy(String str) {
        this.kgy = str;
    }

    public void ahm(String str) {
        this.noq = str;
    }

    public void kgy(int i) {
        this.ahm = i;
    }

    public void kgy(boolean z) {
        this.ct = z;
    }
}
