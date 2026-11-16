package io.p071bidmachine.ads.networks.gam_dynamic;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements io.p071bidmachine.utils.lazy.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;
    public final /* synthetic */ p c;

    public /* synthetic */ b(d dVar, p pVar, int i) {
        this.a = i;
        this.b = dVar;
        this.c = pVar;
    }

    @Override // io.p071bidmachine.utils.lazy.b
    /* JADX INFO: renamed from: get */
    public final Object mo1394get() {
        int i = this.a;
        p pVar = this.c;
        d dVar = this.b;
        switch (i) {
            case 0:
                return String.format("Remove ad from caches (%s, size - %s)", pVar, Integer.valueOf(dVar.b(pVar.c)));
            default:
                return String.format("Store ad (%s, size - %s)", pVar, Integer.valueOf(dVar.b(pVar.c)));
        }
    }
}
