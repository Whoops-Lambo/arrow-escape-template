package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhzh {
    public zzhzk a = null;
    public zzidy b = null;
    public zzidy c = null;
    public zzidy d = null;
    public zzidy e = null;
    public zzidy f = null;
    public zzidy g = null;

    public final zzhzi a() throws GeneralSecurityException {
        zzidy zzidyVar;
        zzidy zzidyVar2;
        zzhzk zzhzkVar = this.a;
        if (zzhzkVar == null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Cannot build without a RSA SSA PKCS1 public key");
            return null;
        }
        zzidy zzidyVar3 = this.c;
        if (zzidyVar3 == null || (zzidyVar = this.d) == null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Cannot build without prime factors");
            return null;
        }
        zzidy zzidyVar4 = this.b;
        if (zzidyVar4 == null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Cannot build without private exponent");
            return null;
        }
        zzidy zzidyVar5 = this.e;
        if (zzidyVar5 == null || (zzidyVar2 = this.f) == null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Cannot build without prime exponents");
            return null;
        }
        zzidy zzidyVar6 = this.g;
        if (zzidyVar6 == null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Cannot build without CRT coefficient");
            return null;
        }
        BigInteger bigInteger = zzhzkVar.a.b;
        BigInteger bigInteger2 = zzhzkVar.b;
        zzhhg zzhhgVar = zzhhg.a;
        BigInteger bigInteger3 = zzidyVar3.a;
        BigInteger bigInteger4 = zzidyVar.a;
        BigInteger bigInteger5 = zzidyVar4.a;
        BigInteger bigInteger6 = zzidyVar5.a;
        BigInteger bigInteger7 = zzidyVar2.a;
        BigInteger bigInteger8 = zzidyVar6.a;
        if (!bigInteger3.isProbablePrime(10)) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("p is not a prime");
            return null;
        }
        if (!bigInteger4.isProbablePrime(10)) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("q is not a prime");
            return null;
        }
        if (!bigInteger3.multiply(bigInteger4).equals(bigInteger2)) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("Prime p times prime q is not equal to the public key's modulus");
            return null;
        }
        BigInteger bigInteger9 = BigInteger.ONE;
        BigInteger bigIntegerSubtract = bigInteger3.subtract(bigInteger9);
        BigInteger bigIntegerSubtract2 = bigInteger4.subtract(bigInteger9);
        if (!bigInteger.multiply(bigInteger5).mod(bigIntegerSubtract.divide(bigIntegerSubtract.gcd(bigIntegerSubtract2)).multiply(bigIntegerSubtract2)).equals(bigInteger9)) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("D is invalid.");
            return null;
        }
        if (!bigInteger.multiply(bigInteger6).mod(bigIntegerSubtract).equals(bigInteger9)) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("dP is invalid.");
            return null;
        }
        if (!bigInteger.multiply(bigInteger7).mod(bigIntegerSubtract2).equals(bigInteger9)) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("dQ is invalid.");
            return null;
        }
        if (bigInteger4.multiply(bigInteger8).mod(bigInteger3).equals(bigInteger9)) {
            return new zzhzi(this.a, this.c, this.d, this.b, this.e, this.f, this.g);
        }
        io.p071bidmachine.ads.networks.adaptiverendering.e.d("qInv is invalid.");
        return null;
    }

    private zzhzh() {
    }

    public /* synthetic */ zzhzh(int i) {
    }
}
