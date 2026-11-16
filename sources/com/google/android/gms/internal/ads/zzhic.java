package com.google.android.gms.internal.ads;

import defpackage.pv1;
import defpackage.q63;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhic extends zzhhq {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final zzhib e;
    public final zzhia f;

    @Override // com.google.android.gms.internal.ads.zzhgt
    public final boolean a() {
        return this.e != zzhib.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhic)) {
            return false;
        }
        zzhic zzhicVar = (zzhic) obj;
        return zzhicVar.a == this.a && zzhicVar.b == this.b && zzhicVar.c == this.c && zzhicVar.d == this.d && zzhicVar.e == this.e && zzhicVar.f == this.f;
    }

    public final int hashCode() {
        return Objects.hash(zzhic.class, Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), this.e, this.f);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.e);
        String strValueOf2 = String.valueOf(this.f);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int i = this.c;
        int length3 = String.valueOf(i).length();
        int i2 = this.d;
        int length4 = String.valueOf(i2).length();
        int i3 = this.a;
        int length5 = String.valueOf(i3).length();
        int i4 = this.b;
        StringBuilder sb = new StringBuilder(length + 48 + length2 + 2 + length3 + 14 + length4 + 16 + length5 + 19 + String.valueOf(i4).length() + 15);
        q63.y(sb, "AesCtrHmacAead Parameters (variant: ", strValueOf, ", hashType: ", strValueOf2);
        pv1.s(i, i2, ", ", "-byte IV, and ", sb);
        pv1.s(i3, i4, "-byte tags, and ", "-byte AES key, and ", sb);
        sb.append("-byte HMAC key)");
        return sb.toString();
    }

    public /* synthetic */ zzhic(int i, int i2, int i3, int i4, zzhib zzhibVar, zzhia zzhiaVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = zzhibVar;
        this.f = zzhiaVar;
    }
}
