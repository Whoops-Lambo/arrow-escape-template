package com.bytedance.adsdk.ahm.rz.ahm;

import defpackage.h50;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class xh implements rz {
    private final int ahm;
    private final String kgy;
    private final com.bytedance.adsdk.ahm.rz.kgy.fi rz;
    private final boolean uq;

    public com.bytedance.adsdk.ahm.rz.kgy.fi ahm() {
        return this.rz;
    }

    @Override // com.bytedance.adsdk.ahm.rz.ahm.rz
    public com.bytedance.adsdk.ahm.kgy.kgy.rz kgy(com.bytedance.adsdk.ahm.gf gfVar, com.bytedance.adsdk.ahm.yo yoVar, com.bytedance.adsdk.ahm.rz.rz.kgy kgyVar) {
        return new com.bytedance.adsdk.ahm.kgy.kgy.um(gfVar, kgyVar, this);
    }

    public boolean rz() {
        return this.uq;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ShapePath{name=");
        sb.append(this.kgy);
        sb.append(", index=");
        return h50.l(sb, this.ahm, '}');
    }

    public xh(String str, int i, com.bytedance.adsdk.ahm.rz.kgy.fi fiVar, boolean z) {
        this.kgy = str;
        this.ahm = i;
        this.rz = fiVar;
        this.uq = z;
    }

    public String kgy() {
        return this.kgy;
    }
}
