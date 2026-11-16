package com.bytedance.adsdk.ahm.kgy.ahm;

import defpackage.e32;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class at extends yo<com.bytedance.adsdk.ahm.yo.rz> {
    private final com.bytedance.adsdk.ahm.yo.rz uq;

    @Override // com.bytedance.adsdk.ahm.kgy.ahm.kgy
    /* JADX INFO: renamed from: ahm, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.ahm.yo.rz kgy(com.bytedance.adsdk.ahm.yo.kgy<com.bytedance.adsdk.ahm.yo.rz> kgyVar, float f) {
        com.bytedance.adsdk.ahm.yo.rz rzVar;
        com.bytedance.adsdk.ahm.yo.rz rzVar2 = kgyVar.kgy;
        if (rzVar2 == null || (rzVar = kgyVar.ahm) == null) {
            e32.i("Missing values for keyframe.");
            return null;
        }
        com.bytedance.adsdk.ahm.yo.rz rzVar3 = rzVar2;
        com.bytedance.adsdk.ahm.yo.rz rzVar4 = rzVar;
        if (this.rz == null) {
            this.uq.kgy(com.bytedance.adsdk.ahm.noq.ct.kgy(rzVar3.kgy(), rzVar4.kgy(), f), com.bytedance.adsdk.ahm.noq.ct.kgy(rzVar3.ahm(), rzVar4.ahm(), f));
            return this.uq;
        }
        kgyVar.yo.getClass();
        uq();
        fi();
        throw null;
    }

    public at(List<com.bytedance.adsdk.ahm.yo.kgy<com.bytedance.adsdk.ahm.yo.rz>> list) {
        super(list);
        this.uq = new com.bytedance.adsdk.ahm.yo.rz();
    }
}
