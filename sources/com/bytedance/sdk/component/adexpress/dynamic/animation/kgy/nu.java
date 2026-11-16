package com.bytedance.sdk.component.adexpress.dynamic.animation.kgy;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class nu extends uq {
    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.kgy.uq
    public List<ObjectAnimator> kgy() {
        float f;
        float fNu = (float) this.ahm.nu();
        float fAt = (float) this.ahm.at();
        String strDg = this.ahm.dg();
        float f2 = 1.0f;
        if ("reverse".equals(strDg) || "alternate-reverse".equals(strDg)) {
            f = 1.0f;
        } else {
            f = fAt;
            fAt = 1.0f;
            f2 = fNu;
            fNu = 1.0f;
        }
        this.rz.setTag(2097610710, this.ahm.ahm());
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.rz, "scaleX", fNu, f2).setDuration((int) (this.ahm.ra() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.rz, "scaleY", fAt, f).setDuration((int) (this.ahm.ra() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(kgy(duration));
        arrayList.add(kgy(duration2));
        return arrayList;
    }

    public nu(View view, com.bytedance.sdk.component.adexpress.dynamic.uq.kgy kgyVar) {
        super(view, kgyVar);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            if (viewGroup2 != null && (viewGroup2 instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ct)) {
                viewGroup2.setClipChildren(false);
                viewGroup2.setClipToPadding(false);
                ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
                if (viewGroup3 != null && (viewGroup3 instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ct)) {
                    viewGroup3.setClipChildren(false);
                    viewGroup3.setClipToPadding(false);
                }
            }
        }
    }
}
