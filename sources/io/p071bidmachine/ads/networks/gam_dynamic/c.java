package io.p071bidmachine.ads.networks.gam_dynamic;

import defpackage.pv1;
import io.p071bidmachine.utils.lazy.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements b {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;

    public /* synthetic */ c(p pVar, int i) {
        this.a = i;
        this.b = pVar;
    }

    @Override // io.p071bidmachine.utils.lazy.b
    /* JADX INFO: renamed from: get */
    public final Object mo1394get() {
        int i = this.a;
        p pVar = this.b;
        switch (i) {
            case 0:
                return String.format("Remove cheapest ad (%s)", pVar);
            case 1:
                return pv1.n("load (", n.a(pVar.d), ")");
            case 2:
                return pv1.n("onExpired (", n.a(pVar.d), ")");
            case 3:
                return pv1.n("destroy (", n.a(pVar.d), ")");
            default:
                return pv1.n("onAdShown (", n.a(pVar.d), ")");
        }
    }
}
