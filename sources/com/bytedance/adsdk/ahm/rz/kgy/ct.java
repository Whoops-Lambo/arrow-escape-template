package com.bytedance.adsdk.ahm.rz.kgy;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class ct implements twf<PointF, PointF> {
    private final List<com.bytedance.adsdk.ahm.yo.kgy<PointF>> kgy;

    @Override // com.bytedance.adsdk.ahm.rz.kgy.twf
    public boolean ahm() {
        return this.kgy.size() == 1 && this.kgy.get(0).ct();
    }

    @Override // com.bytedance.adsdk.ahm.rz.kgy.twf
    public com.bytedance.adsdk.ahm.kgy.ahm.kgy<PointF, PointF> kgy() {
        boolean zCt = this.kgy.get(0).ct();
        List<com.bytedance.adsdk.ahm.yo.kgy<PointF>> list = this.kgy;
        return zCt ? new com.bytedance.adsdk.ahm.kgy.ahm.nu(list) : new com.bytedance.adsdk.ahm.kgy.ahm.ra(list);
    }

    @Override // com.bytedance.adsdk.ahm.rz.kgy.twf
    public List<com.bytedance.adsdk.ahm.yo.kgy<PointF>> rz() {
        return this.kgy;
    }

    public ct(List<com.bytedance.adsdk.ahm.yo.kgy<PointF>> list) {
        this.kgy = list;
    }
}
