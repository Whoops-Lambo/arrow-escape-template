package com.bytedance.sdk.openadsdk.core.model;

import defpackage.h50;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class nu {
    public boolean kgy = true;
    public boolean ahm = true;
    public boolean rz = true;
    public boolean uq = true;
    public boolean ct = true;
    public boolean noq = true;

    public String toString() {
        StringBuilder sb = new StringBuilder("ClickArea{clickUpperContentArea=");
        sb.append(this.kgy);
        sb.append(", clickUpperNonContentArea=");
        sb.append(this.ahm);
        sb.append(", clickLowerContentArea=");
        sb.append(this.rz);
        sb.append(", clickLowerNonContentArea=");
        sb.append(this.uq);
        sb.append(", clickButtonArea=");
        sb.append(this.ct);
        sb.append(", clickVideoArea=");
        return h50.m(sb, this.noq, '}');
    }
}
