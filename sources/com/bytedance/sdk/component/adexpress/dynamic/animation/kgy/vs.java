package com.bytedance.sdk.component.adexpress.dynamic.animation.kgy;

import android.animation.ObjectAnimator;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class vs extends uq {
    public vs(View view, com.bytedance.sdk.component.adexpress.dynamic.uq.kgy kgyVar) {
        super(view, kgyVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.kgy.uq
    public List<ObjectAnimator> kgy() {
        float f;
        float fKgy = com.bytedance.sdk.component.adexpress.uq.yo.kgy(com.bytedance.sdk.component.adexpress.uq.kgy(), this.ahm.noq());
        float fKgy2 = com.bytedance.sdk.component.adexpress.uq.yo.kgy(com.bytedance.sdk.component.adexpress.uq.kgy(), this.ahm.yo());
        boolean zEquals = "reverse".equals(this.ahm.dg());
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (zEquals) {
            f = fKgy2;
            fKgy2 = 0.0f;
            f2 = fKgy;
            fKgy = 0.0f;
        } else {
            f = 0.0f;
        }
        if (com.bytedance.sdk.component.adexpress.uq.ahm.kgy(this.rz.getContext())) {
            fKgy = -fKgy;
            f2 = -f2;
        }
        this.rz.setTranslationX(fKgy);
        this.rz.setTranslationY(fKgy2);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.rz, "translationX", fKgy, f2).setDuration((int) (this.ahm.ra() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.rz, "translationY", fKgy2, f).setDuration((int) (this.ahm.ra() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(kgy(duration));
        arrayList.add(kgy(duration2));
        return arrayList;
    }
}
