package com.google.android.gms.internal.ads;

import defpackage.e32;
import java.security.spec.ECPoint;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzhxn {
    public zzhxk a = null;
    public ECPoint b = null;
    public Integer c = null;

    public final zzhxo a() {
        zzidx zzidxVarA;
        zzhxk zzhxkVar = this.a;
        if (zzhxkVar == null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Cannot build without parameters");
            return null;
        }
        ECPoint eCPoint = this.b;
        if (eCPoint == null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Cannot build without public point");
            return null;
        }
        zzhoc.a(eCPoint, zzhxkVar.b.b.getCurve());
        if (this.a.a() && this.c == null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!this.a.a() && this.c != null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        zzhxj zzhxjVar = this.a.d;
        if (zzhxjVar == zzhxj.e) {
            zzidxVarA = zzhpo.a;
        } else if (zzhxjVar == zzhxj.d || zzhxjVar == zzhxj.c) {
            zzidxVarA = zzhpo.a(this.c.intValue());
        } else {
            if (zzhxjVar != zzhxj.b) {
                e32.i("Unknown EcdsaParameters.Variant: ".concat(zzhxjVar.a));
                return null;
            }
            zzidxVarA = zzhpo.b(this.c.intValue());
        }
        return new zzhxo(this.a, this.b, zzidxVarA, this.c);
    }

    private zzhxn() {
    }

    public /* synthetic */ zzhxn(int i) {
    }
}
