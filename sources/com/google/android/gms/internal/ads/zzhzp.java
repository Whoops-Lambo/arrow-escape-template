package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhzp {
    public static final BigInteger g;
    public static final BigInteger h;
    public Integer a = null;
    public BigInteger b = zzhzs.g;
    public zzhzq c = null;
    public zzhzq d = null;
    public Integer e = null;
    public zzhzr f = zzhzr.e;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        g = bigIntegerValueOf;
        h = bigIntegerValueOf.pow(256);
    }

    public final void b(int i) {
        if (i < 0) {
            throw new GeneralSecurityException(String.format("Invalid salt length in bytes %d; salt length must be positive", Integer.valueOf(i)));
        }
        this.e = Integer.valueOf(i);
    }

    public final zzhzs c() {
        Integer num = this.a;
        if (num == null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("key size is not set");
            return null;
        }
        if (this.b == null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("publicExponent is not set");
            return null;
        }
        if (this.c == null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("signature hash type is not set");
            return null;
        }
        if (this.d == null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("mgf1 hash type is not set");
            return null;
        }
        if (this.f == null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("variant is not set");
            return null;
        }
        if (this.e == null) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("salt length is not set");
            return null;
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least %d bits", this.a, 2048));
        }
        if (this.c != this.d) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("MGF1 hash is different from signature hash");
            return null;
        }
        BigInteger bigInteger = this.b;
        int iCompareTo = bigInteger.compareTo(zzhzs.g);
        if (iCompareTo != 0) {
            if (iCompareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(g).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(h) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new zzhzs(this.a.intValue(), this.b, this.f, this.c, this.d, this.e.intValue());
    }

    private zzhzp() {
    }

    public final void a(int i) {
        this.a = Integer.valueOf(i);
    }

    public /* synthetic */ zzhzp(int i) {
    }
}
