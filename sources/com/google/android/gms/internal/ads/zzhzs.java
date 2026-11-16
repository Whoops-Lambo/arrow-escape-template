package com.google.android.gms.internal.ads;

import defpackage.n30;
import defpackage.q63;
import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhzs extends zziac {
    public static final BigInteger g = BigInteger.valueOf(65537);
    public final int a;
    public final BigInteger b;
    public final zzhzr c;
    public final zzhzq d;
    public final zzhzq e;
    public final int f;

    @Override // com.google.android.gms.internal.ads.zzhgt
    public final boolean a() {
        return this.c != zzhzr.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhzs)) {
            return false;
        }
        zzhzs zzhzsVar = (zzhzs) obj;
        return zzhzsVar.a == this.a && Objects.equals(zzhzsVar.b, this.b) && Objects.equals(zzhzsVar.c, this.c) && Objects.equals(zzhzsVar.d, this.d) && Objects.equals(zzhzsVar.e, this.e) && zzhzsVar.f == this.f;
    }

    public final int hashCode() {
        return Objects.hash(zzhzs.class, Integer.valueOf(this.a), this.b, this.c, this.d, this.e, Integer.valueOf(this.f));
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        String strValueOf2 = String.valueOf(this.d);
        String strValueOf3 = String.valueOf(this.e);
        String strValueOf4 = String.valueOf(this.b);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int length3 = strValueOf3.length();
        int i = this.f;
        int length4 = String.valueOf(i).length();
        int length5 = strValueOf4.length();
        int i2 = this.a;
        StringBuilder sb = new StringBuilder(length + 55 + length2 + 17 + length3 + 19 + length4 + 18 + length5 + 6 + String.valueOf(i2).length() + 13);
        q63.y(sb, "RSA SSA PSS Parameters (variant: ", strValueOf, ", signature hashType: ", strValueOf2);
        n30.t(i, ", mgf1 hashType: ", strValueOf3, ", saltLengthBytes: ", sb);
        n30.t(i2, ", publicExponent: ", strValueOf4, ", and ", sb);
        sb.append("-bit modulus)");
        return sb.toString();
    }

    public /* synthetic */ zzhzs(int i, BigInteger bigInteger, zzhzr zzhzrVar, zzhzq zzhzqVar, zzhzq zzhzqVar2, int i2) {
        this.a = i;
        this.b = bigInteger;
        this.c = zzhzrVar;
        this.d = zzhzqVar;
        this.e = zzhzqVar2;
        this.f = i2;
    }
}
