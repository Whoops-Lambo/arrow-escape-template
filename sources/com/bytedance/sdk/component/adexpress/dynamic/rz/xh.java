package com.bytedance.sdk.component.adexpress.dynamic.rz;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.noq.gm;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class xh<E extends gm> implements yo<E> {
    protected Context ahm;
    protected int ct;
    protected gm kgy;
    protected com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ct rz;
    protected com.bytedance.sdk.component.adexpress.dynamic.uq.yo uq;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.rz.yo
    public void ahm() {
        this.kgy.ahm();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.rz.yo
    /* JADX INFO: renamed from: ct, reason: merged with bridge method [inline-methods] */
    public E rz() {
        return (E) this.kgy;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.rz.yo
    public void kgy() {
        this.kgy.kgy();
    }

    public void uq() {
        this.kgy = new gm(this.ahm, this.uq.gbb());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(this.ahm, 200.0f));
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(this.ahm, 100 - this.ct);
        this.kgy.setLayoutParams(layoutParams);
        try {
            this.kgy.setGuideText(this.uq.pxt());
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX6kmT+s/lACo", "aOIkkQaJee6OXtJPjRK0", "UuAkgTW1bNA=", 43);
        }
    }

    public xh(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ct ctVar, com.bytedance.sdk.component.adexpress.dynamic.uq.yo yoVar, int i) {
        this.ct = i;
        this.ahm = context;
        this.rz = ctVar;
        this.uq = yoVar;
        uq();
    }

    public xh(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ct ctVar, com.bytedance.sdk.component.adexpress.dynamic.uq.yo yoVar) {
        this(context, ctVar, yoVar, 0);
    }
}
