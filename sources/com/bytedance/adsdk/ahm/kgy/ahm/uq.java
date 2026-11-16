package com.bytedance.adsdk.ahm.kgy.ahm;

import com.unity3d.services.UnityAdsConstants;
import defpackage.e32;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class uq extends yo<Float> {
    public float rz(com.bytedance.adsdk.ahm.yo.kgy<Float> kgyVar, float f) {
        if (kgyVar.kgy == null || kgyVar.ahm == null) {
            e32.i("Missing values for keyframe.");
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (this.rz == null) {
            return com.bytedance.adsdk.ahm.noq.ct.kgy(kgyVar.noq(), kgyVar.yo(), f);
        }
        kgyVar.yo.getClass();
        uq();
        fi();
        throw null;
    }

    public uq(List<com.bytedance.adsdk.ahm.yo.kgy<Float>> list) {
        super(list);
    }

    @Override // com.bytedance.adsdk.ahm.kgy.ahm.kgy
    /* JADX INFO: renamed from: ahm, reason: merged with bridge method [inline-methods] */
    public Float kgy(com.bytedance.adsdk.ahm.yo.kgy<Float> kgyVar, float f) {
        return Float.valueOf(rz(kgyVar, f));
    }

    public float gf() {
        return rz(rz(), ct());
    }
}
