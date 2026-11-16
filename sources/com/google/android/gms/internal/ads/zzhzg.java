package com.google.android.gms.internal.ads;

import defpackage.n30;
import defpackage.q63;
import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhzg extends zziac {
    public static final BigInteger e = BigInteger.valueOf(65537);
    public final int a;
    public final BigInteger b;
    public final zzhzf c;
    public final zzhze d;

    @Override // com.google.android.gms.internal.ads.zzhgt
    public final boolean a() {
        return this.c != zzhzf.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhzg)) {
            return false;
        }
        zzhzg zzhzgVar = (zzhzg) obj;
        return zzhzgVar.a == this.a && Objects.equals(zzhzgVar.b, this.b) && zzhzgVar.c == this.c && zzhzgVar.d == this.d;
    }

    public final int hashCode() {
        return Objects.hash(zzhzg.class, Integer.valueOf(this.a), this.b, this.c, this.d);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        String strValueOf2 = String.valueOf(this.d);
        String strValueOf3 = String.valueOf(this.b);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int length3 = strValueOf3.length();
        int i = this.a;
        StringBuilder sb = new StringBuilder(length + 47 + length2 + 18 + length3 + 6 + String.valueOf(i).length() + 13);
        q63.y(sb, "RSA SSA PKCS1 Parameters (variant: ", strValueOf, ", hashType: ", strValueOf2);
        n30.t(i, ", publicExponent: ", strValueOf3, ", and ", sb);
        sb.append("-bit modulus)");
        return sb.toString();
    }

    public /* synthetic */ zzhzg(int i, BigInteger bigInteger, zzhzf zzhzfVar, zzhze zzhzeVar) {
        this.a = i;
        this.b = bigInteger;
        this.c = zzhzfVar;
        this.d = zzhzeVar;
    }
}
