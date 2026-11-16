package com.bytedance.adsdk.ahm.rz.rz;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class noq extends kgy {
    public noq(com.bytedance.adsdk.ahm.gf gfVar, ct ctVar) {
        super(gfVar, ctVar);
    }

    @Override // com.bytedance.adsdk.ahm.rz.rz.kgy
    public void ahm(Canvas canvas, Matrix matrix, int i) {
        super.ahm(canvas, matrix, i);
    }

    @Override // com.bytedance.adsdk.ahm.rz.rz.kgy, com.bytedance.adsdk.ahm.kgy.kgy.ct
    public void kgy(RectF rectF, Matrix matrix, boolean z) {
        super.kgy(rectF, matrix, z);
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }
}
