package com.bytedance.sdk.component.adexpress.dynamic.animation.kgy;

import android.animation.ObjectAnimator;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class dg extends uq {
    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.kgy.uq
    public List<ObjectAnimator> kgy() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.rz, "translationX", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, com.bytedance.sdk.component.adexpress.uq.yo.kgy(com.bytedance.sdk.component.adexpress.uq.kgy(), 20.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -com.bytedance.sdk.component.adexpress.uq.yo.kgy(com.bytedance.sdk.component.adexpress.uq.kgy(), 20.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration((int) (this.ahm.ra() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(kgy(duration));
        return arrayList;
    }

    public dg(View view, com.bytedance.sdk.component.adexpress.dynamic.uq.kgy kgyVar) {
        super(view, kgyVar);
    }
}
