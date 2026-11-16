package com.google.android.gms.internal.ads;

import defpackage.e32;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhid {
    public zzhik a = null;
    public zzidz b = null;
    public Integer c = null;

    public final zzhie a() throws GeneralSecurityException {
        zzidz zzidzVar;
        zzidx zzidxVarB;
        zzhik zzhikVar = this.a;
        if (zzhikVar == null || (zzidzVar = this.b) == null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Cannot build without parameters and/or key material");
            return null;
        }
        if (zzhikVar.a != zzidzVar.a.a.length) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Key size mismatch");
            return null;
        }
        if (zzhikVar.a() && this.c == null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!this.a.a() && this.c != null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        zzhij zzhijVar = this.a.c;
        if (zzhijVar == zzhij.d) {
            zzidxVarB = zzhpo.a;
        } else if (zzhijVar == zzhij.c) {
            zzidxVarB = zzhpo.a(this.c.intValue());
        } else {
            if (zzhijVar != zzhij.b) {
                e32.i("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(zzhijVar)));
                return null;
            }
            zzidxVarB = zzhpo.b(this.c.intValue());
        }
        return new zzhie(this.a, this.b, zzidxVarB, this.c);
    }

    private zzhid() {
    }

    public /* synthetic */ zzhid(int i) {
    }
}
