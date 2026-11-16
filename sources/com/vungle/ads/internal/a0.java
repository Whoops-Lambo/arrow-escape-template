package com.vungle.ads.internal;

import com.vungle.ads.BaseAdListener;
import defpackage.az2;
import defpackage.rc1;
import defpackage.sr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class a0 extends rc1 implements sr0 {
    public final /* synthetic */ h0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(h0 h0Var) {
        super(0);
        this.a = h0Var;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        BaseAdListener adListener = this.a.getAdListener();
        if (adListener != null) {
            adListener.onAdClicked(this.a);
        }
        return az2.a;
    }
}
