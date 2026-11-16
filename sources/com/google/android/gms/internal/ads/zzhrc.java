package com.google.android.gms.internal.ads;

import defpackage.e32;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzhrc {
    public zzhrm a = null;
    public zzidz b = null;
    public Integer c = null;

    public final zzhrd a() throws GeneralSecurityException {
        zzidz zzidzVar;
        zzidx zzidxVarA;
        zzhrm zzhrmVar = this.a;
        if (zzhrmVar == null || (zzidzVar = this.b) == null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Cannot build without parameters and/or key material");
            return null;
        }
        if (zzhrmVar.a != zzidzVar.a.a.length) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Key size mismatch");
            return null;
        }
        if (zzhrmVar.a() && this.c == null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!this.a.a() && this.c != null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        zzhrl zzhrlVar = this.a.c;
        if (zzhrlVar == zzhrl.e) {
            zzidxVarA = zzhpo.a;
        } else if (zzhrlVar == zzhrl.d || zzhrlVar == zzhrl.c) {
            zzidxVarA = zzhpo.a(this.c.intValue());
        } else {
            if (zzhrlVar != zzhrl.b) {
                e32.i("Unknown HmacParameters.Variant: ".concat(String.valueOf(zzhrlVar)));
                return null;
            }
            zzidxVarA = zzhpo.b(this.c.intValue());
        }
        return new zzhrd(this.a, this.b, zzidxVarA, this.c);
    }

    private zzhrc() {
    }

    public /* synthetic */ zzhrc(int i) {
    }
}
