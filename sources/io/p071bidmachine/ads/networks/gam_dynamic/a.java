package io.p071bidmachine.ads.networks.gam_dynamic;

import io.p071bidmachine.AdsFormat;
import io.p071bidmachine.NetworkAdUnit;
import io.p071bidmachine.utils.lazy.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements b {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;
    public final /* synthetic */ NetworkAdUnit c;
    public final /* synthetic */ p d;

    public /* synthetic */ a(d dVar, NetworkAdUnit networkAdUnit, p pVar, int i) {
        this.a = i;
        this.b = dVar;
        this.c = networkAdUnit;
        this.d = pVar;
    }

    @Override // io.p071bidmachine.utils.lazy.b
    /* JADX INFO: renamed from: get */
    public final Object mo1394get() {
        int i = this.a;
        p pVar = this.d;
        NetworkAdUnit networkAdUnit = this.c;
        d dVar = this.b;
        switch (i) {
            case 0:
                String id = networkAdUnit.getId();
                AdsFormat adsFormat = pVar.c;
                return String.format("Reserve ad (networkAdUnitId - %s, %s, %s / %s)", id, pVar, Integer.valueOf(dVar.d(adsFormat)), Integer.valueOf(dVar.b(adsFormat)));
            default:
                String id2 = networkAdUnit.getId();
                AdsFormat adsFormat2 = pVar.c;
                return String.format("UnReserve ad (networkAdUnitId - %s, %s, %s / %s)", id2, pVar, Integer.valueOf(dVar.d(adsFormat2)), Integer.valueOf(dVar.b(adsFormat2)));
        }
    }
}
