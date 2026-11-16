package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzhxf {
    public zzhxi a = null;
    public zzhxg b = null;
    public zzhxh c = null;
    public zzhxj d = zzhxj.e;

    public final zzhxk a() {
        zzhxi zzhxiVar = this.a;
        if (zzhxiVar == null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("signature encoding is not set");
            return null;
        }
        zzhxg zzhxgVar = this.b;
        if (zzhxgVar == null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("EC curve type is not set");
            return null;
        }
        zzhxh zzhxhVar = this.c;
        if (zzhxhVar == null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("hash type is not set");
            return null;
        }
        zzhxj zzhxjVar = this.d;
        if (zzhxgVar == zzhxg.c && zzhxhVar != zzhxh.b) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("NIST_P256 requires SHA256");
            return null;
        }
        zzhxg zzhxgVar2 = zzhxg.d;
        zzhxh zzhxhVar2 = zzhxh.d;
        if (zzhxgVar == zzhxgVar2 && zzhxhVar != zzhxh.c && zzhxhVar != zzhxhVar2) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("NIST_P384 requires SHA384 or SHA512");
            return null;
        }
        if (zzhxgVar != zzhxg.e || zzhxhVar == zzhxhVar2) {
            return new zzhxk(zzhxiVar, zzhxgVar, zzhxhVar, zzhxjVar);
        }
        io.p071bidmachine.ads.networks.adaptiverendering.e.d("NIST_P521 requires SHA512");
        return null;
    }

    private zzhxf() {
    }

    public /* synthetic */ zzhxf(int i) {
    }
}
