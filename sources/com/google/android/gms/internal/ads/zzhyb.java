package com.google.android.gms.internal.ads;

import defpackage.e32;
import defpackage.jc1;
import defpackage.pv1;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzhyb extends zziae {
    public final zzhxu a;
    public final zzidx b;
    public final zzidx c;
    public final Integer d;

    public static zzhyb d(zzhxt zzhxtVar, zzidx zzidxVar, Integer num) throws GeneralSecurityException {
        zzidx zzidxVarA;
        byte[] bArr = zzidxVar.a;
        zzhxu zzhxuVar = new zzhxu(zzhxtVar);
        zzhxt zzhxtVar2 = zzhxt.e;
        if (!zzhxtVar.equals(zzhxtVar2) && num == null) {
            String str = zzhxtVar.a;
            throw new GeneralSecurityException(jc1.o("For given Variant ", str, new StringBuilder(str.length() + 62), " the value of idRequirement must be non-null"));
        }
        if (zzhxtVar == zzhxtVar2 && num != null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("For given Variant NO_PREFIX the value of idRequirement must be null");
            return null;
        }
        if (bArr.length != 32) {
            int length = bArr.length;
            throw new GeneralSecurityException(pv1.l(length, "Ed25519 key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(length).length() + 65)));
        }
        zzhxt zzhxtVar3 = zzhxuVar.a;
        if (zzhxtVar3 == zzhxtVar2) {
            zzidxVarA = zzhpo.a;
        } else if (zzhxtVar3 == zzhxt.c || zzhxtVar3 == zzhxt.d) {
            zzidxVarA = zzhpo.a(num.intValue());
        } else {
            if (zzhxtVar3 != zzhxt.b) {
                e32.i("Unknown Variant: ".concat(zzhxtVar3.a));
                return null;
            }
            zzidxVarA = zzhpo.b(num.intValue());
        }
        return new zzhyb(zzhxuVar, zzidxVar, zzidxVarA, num);
    }

    @Override // com.google.android.gms.internal.ads.zziae, com.google.android.gms.internal.ads.zzhgc
    public final /* synthetic */ zzhgt a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzhgc
    public final Integer b() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.zziae
    public final zzidx c() {
        return this.c;
    }

    public zzhyb(zzhxu zzhxuVar, zzidx zzidxVar, zzidx zzidxVar2, Integer num) {
        this.a = zzhxuVar;
        this.b = zzidxVar;
        this.c = zzidxVar2;
        this.d = num;
    }
}
