package io.p071bidmachine.ads.networks.gam_dynamic;

import io.p071bidmachine.utils.lazy.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class y implements b {
    public final /* synthetic */ int a;
    public final /* synthetic */ b0 b;

    public /* synthetic */ y(b0 b0Var, int i) {
        this.a = i;
        this.b = b0Var;
    }

    @Override // io.p071bidmachine.utils.lazy.b
    /* JADX INFO: renamed from: get */
    public final Object mo1394get() {
        int i = this.a;
        b0 b0Var = this.b;
        switch (i) {
            case 0:
                return "(" + b0Var.d + ") Fail to start loading waterfall";
            case 1:
                return "(" + b0Var.d + ") Loading completed";
            case 2:
                return "(" + b0Var.d + ") Request next waterfall";
            default:
                return "(" + b0Var.d + ") onWaterfallRequestSuccess";
        }
    }
}
