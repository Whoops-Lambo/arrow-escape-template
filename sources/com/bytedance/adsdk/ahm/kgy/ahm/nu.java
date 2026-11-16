package com.bytedance.adsdk.ahm.kgy.ahm;

import android.graphics.PointF;
import defpackage.e32;
import defpackage.h50;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class nu extends yo<PointF> {
    private final PointF uq;

    @Override // com.bytedance.adsdk.ahm.kgy.ahm.kgy
    /* JADX INFO: renamed from: ahm, reason: merged with bridge method [inline-methods] */
    public PointF kgy(com.bytedance.adsdk.ahm.yo.kgy<PointF> kgyVar, float f, float f2, float f3) {
        PointF pointF;
        PointF pointF2 = kgyVar.kgy;
        if (pointF2 == null || (pointF = kgyVar.ahm) == null) {
            e32.i("Missing values for keyframe.");
            return null;
        }
        PointF pointF3 = pointF2;
        PointF pointF4 = pointF;
        if (this.rz != null) {
            kgyVar.yo.getClass();
            uq();
            fi();
            throw null;
        }
        PointF pointF5 = this.uq;
        float f4 = pointF3.x;
        float fC = h50.c(pointF4.x, f4, f2, f4);
        float f5 = pointF3.y;
        pointF5.set(fC, h50.c(pointF4.y, f5, f3, f5));
        return this.uq;
    }

    public nu(List<com.bytedance.adsdk.ahm.yo.kgy<PointF>> list) {
        super(list);
        this.uq = new PointF();
    }

    @Override // com.bytedance.adsdk.ahm.kgy.ahm.kgy
    /* JADX INFO: renamed from: ahm, reason: merged with bridge method [inline-methods] */
    public PointF kgy(com.bytedance.adsdk.ahm.yo.kgy<PointF> kgyVar, float f) {
        return kgy(kgyVar, f, f, f);
    }
}
