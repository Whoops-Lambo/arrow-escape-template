package com.google.android.gms.internal.ads;

import defpackage.e32;
import defpackage.pv1;
import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhzv {
    public zzhzs a = null;
    public BigInteger b = null;
    public Integer c = null;

    public final zzhzw a() {
        zzidx zzidxVarA;
        if (this.a == null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Cannot build without parameters");
            return null;
        }
        BigInteger bigInteger = this.b;
        if (bigInteger == null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Cannot build without modulus");
            return null;
        }
        int iBitLength = bigInteger.bitLength();
        zzhzs zzhzsVar = this.a;
        int i = zzhzsVar.a;
        if (iBitLength != i) {
            throw new GeneralSecurityException(pv1.j(iBitLength, i, "Got modulus size ", ", but parameters requires modulus size ", new StringBuilder(String.valueOf(iBitLength).length() + 56 + String.valueOf(i).length())));
        }
        if (zzhzsVar.a() && this.c == null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!this.a.a() && this.c != null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        zzhzr zzhzrVar = this.a.c;
        if (zzhzrVar == zzhzr.e) {
            zzidxVarA = zzhpo.a;
        } else if (zzhzrVar == zzhzr.d || zzhzrVar == zzhzr.c) {
            zzidxVarA = zzhpo.a(this.c.intValue());
        } else {
            if (zzhzrVar != zzhzr.b) {
                e32.i("Unknown RsaSsaPssParameters.Variant: ".concat(String.valueOf(zzhzrVar)));
                return null;
            }
            zzidxVarA = zzhpo.b(this.c.intValue());
        }
        return new zzhzw(this.a, this.b, zzidxVarA, this.c);
    }

    private zzhzv() {
    }

    public /* synthetic */ zzhzv(int i) {
    }
}
