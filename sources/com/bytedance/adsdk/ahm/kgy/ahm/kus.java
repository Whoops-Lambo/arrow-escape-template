package com.bytedance.adsdk.ahm.kgy.ahm;

import android.graphics.PointF;
import com.unity3d.services.UnityAdsConstants;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class kus extends kgy<PointF, PointF> {
    protected com.bytedance.adsdk.ahm.yo.ahm<Float> ct;
    private final kgy<Float, Float> fi;
    private final kgy<Float, Float> gf;
    private final PointF noq;
    protected com.bytedance.adsdk.ahm.yo.ahm<Float> uq;
    private final PointF yo;

    @Override // com.bytedance.adsdk.ahm.kgy.ahm.kgy
    /* JADX INFO: renamed from: gf, reason: merged with bridge method [inline-methods] */
    public PointF yo() {
        return kgy(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public kus(kgy<Float, Float> kgyVar, kgy<Float, Float> kgyVar2) {
        super(Collections.EMPTY_LIST);
        this.noq = new PointF();
        this.yo = new PointF();
        this.fi = kgyVar;
        this.gf = kgyVar2;
        kgy(fi());
    }

    @Override // com.bytedance.adsdk.ahm.kgy.ahm.kgy
    /* JADX INFO: renamed from: ahm, reason: merged with bridge method [inline-methods] */
    public PointF kgy(com.bytedance.adsdk.ahm.yo.kgy<PointF> kgyVar, float f) {
        if (this.uq != null && this.fi.rz() != null) {
            this.fi.ct();
            throw null;
        }
        if (this.ct != null && this.gf.rz() != null) {
            this.gf.ct();
            throw null;
        }
        this.yo.set(this.noq.x, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        PointF pointF = this.yo;
        pointF.set(pointF.x, this.noq.y);
        return this.yo;
    }

    @Override // com.bytedance.adsdk.ahm.kgy.ahm.kgy
    public void kgy(float f) {
        this.fi.kgy(f);
        this.gf.kgy(f);
        this.noq.set(this.fi.yo().floatValue(), this.gf.yo().floatValue());
        for (int i = 0; i < this.kgy.size(); i++) {
            this.kgy.get(i).kgy();
        }
    }
}
