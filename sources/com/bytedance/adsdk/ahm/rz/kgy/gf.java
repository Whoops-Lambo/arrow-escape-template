package com.bytedance.adsdk.ahm.rz.kgy;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class gf implements twf<PointF, PointF> {
    private final ahm ahm;
    private final ahm kgy;

    @Override // com.bytedance.adsdk.ahm.rz.kgy.twf
    public boolean ahm() {
        return this.kgy.ahm() && this.ahm.ahm();
    }

    @Override // com.bytedance.adsdk.ahm.rz.kgy.twf
    public com.bytedance.adsdk.ahm.kgy.ahm.kgy<PointF, PointF> kgy() {
        return new com.bytedance.adsdk.ahm.kgy.ahm.kus(this.kgy.kgy(), this.ahm.kgy());
    }

    @Override // com.bytedance.adsdk.ahm.rz.kgy.twf
    public List<com.bytedance.adsdk.ahm.yo.kgy<PointF>> rz() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    public gf(ahm ahmVar, ahm ahmVar2) {
        this.kgy = ahmVar;
        this.ahm = ahmVar2;
    }
}
