package io.p071bidmachine.ads.networks.gam;

import io.p071bidmachine.utils.lazy.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class g implements b {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ g(m mVar, int i) {
        this.a = i;
        this.b = mVar;
    }

    @Override // io.p071bidmachine.utils.lazy.b
    /* JADX INFO: renamed from: get */
    public final Object mo1394get() {
        int i = this.a;
        m mVar = this.b;
        switch (i) {
            case 0:
                return String.format("removeFromCaches (%s)", mVar);
            case 1:
                return "onAdShown (" + mVar.d + ")";
            case 2:
                return "onExpired (" + mVar.d + ")";
            case 3:
                return "destroy (" + mVar.d + ")";
            case 4:
                return "load (" + mVar.d + ")";
            default:
                return "onAdLoaded (" + mVar.d + ")";
        }
    }
}
