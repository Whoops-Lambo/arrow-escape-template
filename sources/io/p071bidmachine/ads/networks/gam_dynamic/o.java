package io.p071bidmachine.ads.networks.gam_dynamic;

import defpackage.n30;
import io.p071bidmachine.protobuf.Waterfall;
import io.p071bidmachine.utils.lazy.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o implements b {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;
    public final /* synthetic */ Waterfall.Result.EstimatedPrice c;

    public /* synthetic */ o(p pVar, Waterfall.Result.EstimatedPrice estimatedPrice, int i) {
        this.a = i;
        this.b = pVar;
        this.c = estimatedPrice;
    }

    @Override // io.p071bidmachine.utils.lazy.b
    /* JADX INFO: renamed from: get */
    public final Object mo1394get() {
        String strA;
        String strB;
        String str;
        int i = this.a;
        Waterfall.Result.EstimatedPrice estimatedPrice = this.c;
        p pVar = this.b;
        switch (i) {
            case 0:
                strA = n.a(pVar.d);
                strB = n.b(estimatedPrice);
                str = "onPaidEvent (";
                break;
            default:
                strA = n.a(pVar.d);
                strB = n.b(estimatedPrice);
                str = "onAdLoaded (";
                break;
        }
        return n30.n(str, strA, ", ", strB, ")");
    }
}
