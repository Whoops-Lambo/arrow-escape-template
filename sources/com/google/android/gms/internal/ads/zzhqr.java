package com.google.android.gms.internal.ads;

import defpackage.e32;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzhqr {
    public zzhqz a = null;
    public zzidz b = null;
    public Integer c = null;

    public final zzhqs a() throws GeneralSecurityException {
        zzidz zzidzVar;
        zzidx zzidxVarA;
        zzhqz zzhqzVar = this.a;
        if (zzhqzVar == null || (zzidzVar = this.b) == null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Cannot build without parameters and/or key material");
            return null;
        }
        if (zzhqzVar.a != zzidzVar.a.a.length) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Key size mismatch");
            return null;
        }
        if (zzhqzVar.a() && this.c == null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!this.a.a() && this.c != null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        zzhqy zzhqyVar = this.a.c;
        if (zzhqyVar == zzhqy.e) {
            zzidxVarA = zzhpo.a;
        } else if (zzhqyVar == zzhqy.d || zzhqyVar == zzhqy.c) {
            zzidxVarA = zzhpo.a(this.c.intValue());
        } else {
            if (zzhqyVar != zzhqy.b) {
                e32.i("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(zzhqyVar)));
                return null;
            }
            zzidxVarA = zzhpo.b(this.c.intValue());
        }
        return new zzhqs(this.a, this.b, zzidxVarA, this.c);
    }

    private zzhqr() {
    }

    public /* synthetic */ zzhqr(int i) {
    }
}
