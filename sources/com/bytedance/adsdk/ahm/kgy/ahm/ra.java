package com.bytedance.adsdk.ahm.kgy.ahm;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class ra extends yo<PointF> {
    private final float[] ct;
    private final PathMeasure noq;
    private final PointF uq;
    private gf yo;

    @Override // com.bytedance.adsdk.ahm.kgy.ahm.kgy
    /* JADX INFO: renamed from: ahm, reason: merged with bridge method [inline-methods] */
    public PointF kgy(com.bytedance.adsdk.ahm.yo.kgy<PointF> kgyVar, float f) {
        gf gfVar = (gf) kgyVar;
        Path pathAhm = gfVar.ahm();
        if (pathAhm == null) {
            return kgyVar.kgy;
        }
        if (this.rz != null) {
            gfVar.yo.getClass();
            uq();
            fi();
            throw null;
        }
        if (this.yo != gfVar) {
            this.noq.setPath(pathAhm, false);
            this.yo = gfVar;
        }
        PathMeasure pathMeasure = this.noq;
        pathMeasure.getPosTan(pathMeasure.getLength() * f, this.ct, null);
        PointF pointF = this.uq;
        float[] fArr = this.ct;
        pointF.set(fArr[0], fArr[1]);
        return this.uq;
    }

    public ra(List<? extends com.bytedance.adsdk.ahm.yo.kgy<PointF>> list) {
        super(list);
        this.uq = new PointF();
        this.ct = new float[2];
        this.noq = new PathMeasure();
    }
}
