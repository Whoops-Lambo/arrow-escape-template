package com.bytedance.adsdk.ahm.rz.ahm;

import android.graphics.PointF;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class nu implements rz {
    private final com.bytedance.adsdk.ahm.rz.kgy.twf<PointF, PointF> ahm;
    private final boolean ct;
    private final String kgy;
    private final com.bytedance.adsdk.ahm.rz.kgy.twf<PointF, PointF> rz;
    private final com.bytedance.adsdk.ahm.rz.kgy.ahm uq;

    public com.bytedance.adsdk.ahm.rz.kgy.ahm ahm() {
        return this.uq;
    }

    public boolean ct() {
        return this.ct;
    }

    @Override // com.bytedance.adsdk.ahm.rz.ahm.rz
    public com.bytedance.adsdk.ahm.kgy.kgy.rz kgy(com.bytedance.adsdk.ahm.gf gfVar, com.bytedance.adsdk.ahm.yo yoVar, com.bytedance.adsdk.ahm.rz.rz.kgy kgyVar) {
        return new com.bytedance.adsdk.ahm.kgy.kgy.vs(gfVar, kgyVar, this);
    }

    public com.bytedance.adsdk.ahm.rz.kgy.twf<PointF, PointF> rz() {
        return this.rz;
    }

    public String toString() {
        return "RectangleShape{position=" + this.ahm + ", size=" + this.rz + '}';
    }

    public com.bytedance.adsdk.ahm.rz.kgy.twf<PointF, PointF> uq() {
        return this.ahm;
    }

    public nu(String str, com.bytedance.adsdk.ahm.rz.kgy.twf<PointF, PointF> twfVar, com.bytedance.adsdk.ahm.rz.kgy.twf<PointF, PointF> twfVar2, com.bytedance.adsdk.ahm.rz.kgy.ahm ahmVar, boolean z) {
        this.kgy = str;
        this.ahm = twfVar;
        this.rz = twfVar2;
        this.uq = ahmVar;
        this.ct = z;
    }

    public String kgy() {
        return this.kgy;
    }
}
