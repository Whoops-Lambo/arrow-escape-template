package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhjy extends zzhhp {
    public final zzhkc a;
    public final zzidx b;
    public final Integer c;

    public static zzhjy d(zzhkc zzhkcVar, Integer num) throws GeneralSecurityException {
        zzidx zzidxVarB;
        zzhkb zzhkbVar = zzhkcVar.a;
        if (zzhkbVar == zzhkb.c) {
            if (num != null) {
                io.p071bidmachine.ads.networks.adaptiverendering.e.d("For given Variant NO_PREFIX the value of idRequirement must be null");
                return null;
            }
            zzidxVarB = zzhpo.a;
        } else {
            if (zzhkbVar != zzhkb.b) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(zzhkbVar)));
            }
            if (num == null) {
                io.p071bidmachine.ads.networks.adaptiverendering.e.d("For given Variant TINK the value of idRequirement must be non-null");
                return null;
            }
            zzidxVarB = zzhpo.b(num.intValue());
        }
        return new zzhjy(zzhkcVar, zzidxVarB, num);
    }

    @Override // com.google.android.gms.internal.ads.zzhhp, com.google.android.gms.internal.ads.zzhgc
    public final /* synthetic */ zzhgt a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzhgc
    public final Integer b() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzhhp
    public final zzidx c() {
        return this.b;
    }

    public zzhjy(zzhkc zzhkcVar, zzidx zzidxVar, Integer num) {
        this.a = zzhkcVar;
        this.b = zzidxVar;
        this.c = num;
    }
}
