package com.bytedance.sdk.component.adexpress.dynamic.animation.kgy;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class twf extends uq {
    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.kgy.uq
    public List<ObjectAnimator> kgy() {
        View view = this.rz;
        if ((view instanceof ImageView) && (view.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.nu)) {
            View view2 = (View) this.rz.getParent();
            this.rz = view2;
            ((ViewGroup) view2).setClipChildren(true);
            ((ViewGroup) this.rz.getParent()).setClipChildren(true);
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.rz, "stretchValue", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f).setDuration((int) (this.ahm.ra() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(kgy(duration));
        return arrayList;
    }

    public twf(View view, com.bytedance.sdk.component.adexpress.dynamic.uq.kgy kgyVar) {
        super(view, kgyVar);
    }
}
