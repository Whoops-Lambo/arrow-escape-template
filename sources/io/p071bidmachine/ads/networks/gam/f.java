package io.p071bidmachine.ads.networks.gam;

import defpackage.pv1;
import io.p071bidmachine.NetworkAdUnit;
import io.p071bidmachine.utils.lazy.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements b {
    public final /* synthetic */ int a;
    public final /* synthetic */ NetworkAdUnit b;

    public /* synthetic */ f(NetworkAdUnit networkAdUnit, int i) {
        this.a = i;
        this.b = networkAdUnit;
    }

    @Override // io.p071bidmachine.utils.lazy.b
    /* JADX INFO: renamed from: get */
    public final Object mo1394get() {
        String id;
        String str;
        String str2;
        int i = this.a;
        NetworkAdUnit networkAdUnit = this.b;
        switch (i) {
            case 0:
                id = networkAdUnit.getId();
                str = "unReserveGAMAd (networkAdUnitId - ";
                str2 = ")";
                break;
            case 1:
                id = networkAdUnit.getId();
                str = "Fail to load rewarded (Can't find reserved GAMAd by network ad unit id - ";
                str2 = ")";
                break;
            case 2:
                id = networkAdUnit.getId();
                str = "Fail to load interstitial (Can't find reserved GAMAd by network ad unit id - ";
                str2 = ")";
                break;
            case 3:
                id = networkAdUnit.getId();
                str = "Fail to load banner (Can't find reserved GAMAd by network ad unit id - ";
                str2 = ")";
                break;
            case 4:
                id = networkAdUnit.getId();
                str = "Fail to load interstitial (Can't find reserved ad by network ad unit id - ";
                str2 = ")";
                break;
            case 5:
                id = networkAdUnit.getId();
                str = "Fail to load banner (Can't find reserved ad by network ad unit id - ";
                str2 = ")";
                break;
            default:
                id = networkAdUnit.getId();
                str = "Fail to load rewarded (Can't find reserved ad by network ad unit id - ";
                str2 = ")";
                break;
        }
        return pv1.n(str, id, str2);
    }
}
