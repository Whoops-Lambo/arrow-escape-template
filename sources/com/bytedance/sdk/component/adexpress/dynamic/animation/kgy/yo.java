package com.bytedance.sdk.component.adexpress.dynamic.animation.kgy;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class yo extends uq {
    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.kgy.uq
    @SuppressLint({"ObjectAnimatorBinding"})
    public List<ObjectAnimator> kgy() {
        this.rz.setTag(2097610709, Integer.valueOf(this.ahm.rz()));
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.rz, "marqueeValue", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f).setDuration((int) (this.ahm.ra() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(kgy(duration));
        return arrayList;
    }

    public yo(View view, com.bytedance.sdk.component.adexpress.dynamic.uq.kgy kgyVar) {
        super(view, kgyVar);
    }
}
