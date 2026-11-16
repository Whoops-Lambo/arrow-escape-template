package com.bytedance.adsdk.ahm.rz.ahm;

import android.graphics.PointF;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class ahm implements rz {
    private final com.bytedance.adsdk.ahm.rz.kgy.twf<PointF, PointF> ahm;
    private final boolean ct;
    private final String kgy;
    private final com.bytedance.adsdk.ahm.rz.kgy.noq rz;
    private final boolean uq;

    public com.bytedance.adsdk.ahm.rz.kgy.twf<PointF, PointF> ahm() {
        return this.ahm;
    }

    public boolean ct() {
        return this.ct;
    }

    @Override // com.bytedance.adsdk.ahm.rz.ahm.rz
    public com.bytedance.adsdk.ahm.kgy.kgy.rz kgy(com.bytedance.adsdk.ahm.gf gfVar, com.bytedance.adsdk.ahm.yo yoVar, com.bytedance.adsdk.ahm.rz.rz.kgy kgyVar) {
        return new com.bytedance.adsdk.ahm.kgy.kgy.noq(gfVar, kgyVar, this);
    }

    public com.bytedance.adsdk.ahm.rz.kgy.noq rz() {
        return this.rz;
    }

    public boolean uq() {
        return this.uq;
    }

    public ahm(String str, com.bytedance.adsdk.ahm.rz.kgy.twf<PointF, PointF> twfVar, com.bytedance.adsdk.ahm.rz.kgy.noq noqVar, boolean z, boolean z2) {
        this.kgy = str;
        this.ahm = twfVar;
        this.rz = noqVar;
        this.uq = z;
        this.ct = z2;
    }

    public String kgy() {
        return this.kgy;
    }
}
