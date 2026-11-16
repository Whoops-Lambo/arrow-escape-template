package com.google.android.gms.internal.ads;

import defpackage.e32;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhil {
    public zzhit a = null;
    public zzidz b = null;
    public Integer c = null;

    public final zzhim a() throws GeneralSecurityException {
        zzidz zzidzVar;
        zzidx zzidxVarB;
        zzhit zzhitVar = this.a;
        if (zzhitVar == null || (zzidzVar = this.b) == null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Cannot build without parameters and/or key material");
            return null;
        }
        if (zzhitVar.a != zzidzVar.a.a.length) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Key size mismatch");
            return null;
        }
        if (zzhitVar.a() && this.c == null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!this.a.a() && this.c != null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        zzhis zzhisVar = this.a.b;
        if (zzhisVar == zzhis.d) {
            zzidxVarB = zzhpo.a;
        } else if (zzhisVar == zzhis.c) {
            zzidxVarB = zzhpo.a(this.c.intValue());
        } else {
            if (zzhisVar != zzhis.b) {
                e32.i("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(zzhisVar)));
                return null;
            }
            zzidxVarB = zzhpo.b(this.c.intValue());
        }
        return new zzhim(this.a, this.b, zzidxVarB, this.c);
    }

    private zzhil() {
    }

    public /* synthetic */ zzhil(int i) {
    }
}
