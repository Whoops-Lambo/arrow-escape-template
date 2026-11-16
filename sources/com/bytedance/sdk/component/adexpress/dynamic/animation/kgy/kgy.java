package com.bytedance.sdk.component.adexpress.dynamic.animation.kgy;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class kgy extends uq {
    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.kgy.uq
    public List<ObjectAnimator> kgy() {
        float fUm = this.ahm.um() / 100.0f;
        float fFpp = this.ahm.fpp() / 100.0f;
        if ("reverse".equals(this.ahm.dg()) && this.ahm.kus() <= 0.0d) {
            fFpp = fUm;
            fUm = fFpp;
        }
        this.rz.setAlpha(fUm);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.rz, "alpha", fUm, fFpp).setDuration((int) (this.ahm.ra() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(kgy(duration));
        return arrayList;
    }

    public kgy(View view, com.bytedance.sdk.component.adexpress.dynamic.uq.kgy kgyVar) {
        super(view, kgyVar);
    }
}
