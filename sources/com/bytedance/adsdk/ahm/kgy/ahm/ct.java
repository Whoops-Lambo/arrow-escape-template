package com.bytedance.adsdk.ahm.kgy.ahm;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class ct extends yo<com.bytedance.adsdk.ahm.rz.ahm.uq> {
    private final com.bytedance.adsdk.ahm.rz.ahm.uq uq;

    @Override // com.bytedance.adsdk.ahm.kgy.ahm.kgy
    /* JADX INFO: renamed from: ahm, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.ahm.rz.ahm.uq kgy(com.bytedance.adsdk.ahm.yo.kgy<com.bytedance.adsdk.ahm.rz.ahm.uq> kgyVar, float f) {
        this.uq.kgy(kgyVar.kgy, kgyVar.ahm, f);
        return this.uq;
    }

    public ct(List<com.bytedance.adsdk.ahm.yo.kgy<com.bytedance.adsdk.ahm.rz.ahm.uq>> list) {
        super(list);
        com.bytedance.adsdk.ahm.rz.ahm.uq uqVar = list.get(0).kgy;
        int iRz = uqVar != null ? uqVar.rz() : 0;
        this.uq = new com.bytedance.adsdk.ahm.rz.ahm.uq(new float[iRz], new int[iRz]);
    }
}
