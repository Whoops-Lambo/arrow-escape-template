package com.bytedance.adsdk.ahm.kgy.ahm;

import android.graphics.Path;
import android.graphics.PointF;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class gf extends com.bytedance.adsdk.ahm.yo.kgy<PointF> {
    private final com.bytedance.adsdk.ahm.yo.kgy<PointF> nu;
    private Path ra;

    public gf(com.bytedance.adsdk.ahm.yo yoVar, com.bytedance.adsdk.ahm.yo.kgy<PointF> kgyVar) {
        super(yoVar, kgyVar.kgy, kgyVar.ahm, kgyVar.rz, kgyVar.uq, kgyVar.ct, kgyVar.noq, kgyVar.yo);
        this.nu = kgyVar;
        kgy();
    }

    public Path ahm() {
        return this.ra;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void kgy() {
        T t;
        T t2;
        T t3 = this.ahm;
        boolean z = (t3 == 0 || (t2 = this.kgy) == 0 || !((PointF) t2).equals(((PointF) t3).x, ((PointF) t3).y)) ? false : true;
        T t4 = this.kgy;
        if (t4 == 0 || (t = this.ahm) == 0 || z) {
            return;
        }
        com.bytedance.adsdk.ahm.yo.kgy<PointF> kgyVar = this.nu;
        this.ra = com.bytedance.adsdk.ahm.noq.noq.kgy((PointF) t4, (PointF) t, kgyVar.fi, kgyVar.gf);
    }
}
