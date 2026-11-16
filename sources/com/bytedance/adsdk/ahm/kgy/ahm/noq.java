package com.bytedance.adsdk.ahm.kgy.ahm;

import defpackage.e32;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class noq extends yo<Integer> {
    public int rz(com.bytedance.adsdk.ahm.yo.kgy<Integer> kgyVar, float f) {
        if (kgyVar.kgy == null || kgyVar.ahm == null) {
            e32.i("Missing values for keyframe.");
            return 0;
        }
        if (this.rz == null) {
            return com.bytedance.adsdk.ahm.noq.ct.kgy(kgyVar.fi(), kgyVar.gf(), f);
        }
        kgyVar.yo.getClass();
        uq();
        fi();
        throw null;
    }

    public noq(List<com.bytedance.adsdk.ahm.yo.kgy<Integer>> list) {
        super(list);
    }

    @Override // com.bytedance.adsdk.ahm.kgy.ahm.kgy
    /* JADX INFO: renamed from: ahm, reason: merged with bridge method [inline-methods] */
    public Integer kgy(com.bytedance.adsdk.ahm.yo.kgy<Integer> kgyVar, float f) {
        return Integer.valueOf(rz(kgyVar, f));
    }

    public int gf() {
        return rz(rz(), ct());
    }
}
