package com.bytedance.sdk.openadsdk.component.ct;

import com.bytedance.sdk.openadsdk.core.model.ioy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class rz {
    private int ahm;
    private int ct;
    private int kgy;
    private String noq;
    private ioy rz;
    private com.bytedance.sdk.openadsdk.core.model.kgy uq;
    private boolean yo;

    public int ahm() {
        return this.kgy;
    }

    public int ct() {
        return this.ct;
    }

    public com.bytedance.sdk.openadsdk.core.model.kgy kgy() {
        return this.uq;
    }

    public String noq() {
        return this.noq;
    }

    public int rz() {
        return this.ahm;
    }

    public ioy uq() {
        return this.rz;
    }

    public rz(int i, int i2, ioy ioyVar, com.bytedance.sdk.openadsdk.core.model.kgy kgyVar) {
        this.kgy = i;
        this.ahm = i2;
        this.rz = ioyVar;
        this.uq = kgyVar;
    }

    public void kgy(boolean z) {
        this.yo = z;
    }

    public rz(int i, int i2, int i3, String str) {
        this.kgy = i;
        this.ahm = i2;
        this.ct = i3;
        this.noq = str;
    }
}
