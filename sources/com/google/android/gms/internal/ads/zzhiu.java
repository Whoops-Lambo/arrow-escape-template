package com.google.android.gms.internal.ads;

import defpackage.e32;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhiu {
    public zzhjc a = null;
    public zzidz b = null;
    public Integer c = null;

    public final zzhiv a() throws GeneralSecurityException {
        zzidz zzidzVar;
        zzidx zzidxVarB;
        zzhjc zzhjcVar = this.a;
        if (zzhjcVar == null || (zzidzVar = this.b) == null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Cannot build without parameters and/or key material");
            return null;
        }
        if (zzhjcVar.a != zzidzVar.a.a.length) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Key size mismatch");
            return null;
        }
        if (zzhjcVar.a() && this.c == null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!this.a.a() && this.c != null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        zzhjb zzhjbVar = this.a.b;
        if (zzhjbVar == zzhjb.d) {
            zzidxVarB = zzhpo.a;
        } else if (zzhjbVar == zzhjb.c) {
            zzidxVarB = zzhpo.a(this.c.intValue());
        } else {
            if (zzhjbVar != zzhjb.b) {
                e32.i("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(zzhjbVar)));
                return null;
            }
            zzidxVarB = zzhpo.b(this.c.intValue());
        }
        return new zzhiv(this.a, this.b, zzidxVarB, this.c);
    }

    private zzhiu() {
    }

    public /* synthetic */ zzhiu(int i) {
    }
}
