package com.google.android.gms.internal.ads;

import defpackage.e32;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhht {
    public zzhic a = null;
    public zzidz b = null;
    public zzidz c = null;
    public Integer d = null;

    public final zzhhu a() throws GeneralSecurityException {
        zzidz zzidzVar;
        zzidx zzidxVarB;
        zzhic zzhicVar = this.a;
        if (zzhicVar == null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Cannot build without parameters");
            return null;
        }
        zzidz zzidzVar2 = this.b;
        if (zzidzVar2 == null || (zzidzVar = this.c) == null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Cannot build without key material");
            return null;
        }
        if (zzhicVar.a != zzidzVar2.a.a.length) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("AES key size mismatch");
            return null;
        }
        if (zzhicVar.b != zzidzVar.a.a.length) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("HMAC key size mismatch");
            return null;
        }
        if (zzhicVar.a() && this.d == null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!this.a.a() && this.d != null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        zzhib zzhibVar = this.a.e;
        if (zzhibVar == zzhib.d) {
            zzidxVarB = zzhpo.a;
        } else if (zzhibVar == zzhib.c) {
            zzidxVarB = zzhpo.a(this.d.intValue());
        } else {
            if (zzhibVar != zzhib.b) {
                e32.i("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(zzhibVar)));
                return null;
            }
            zzidxVarB = zzhpo.b(this.d.intValue());
        }
        return new zzhhu(this.a, this.b, this.c, zzidxVarB, this.d);
    }

    private zzhht() {
    }

    public /* synthetic */ zzhht(int i) {
    }
}
