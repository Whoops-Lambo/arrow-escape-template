package com.google.android.gms.internal.ads;

import defpackage.e32;
import defpackage.pv1;
import defpackage.q63;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzhrm extends zzhrp {
    public final int a;
    public final int b;
    public final zzhrl c;
    public final zzhrk d;

    @Override // com.google.android.gms.internal.ads.zzhgt
    public final boolean a() {
        return this.c != zzhrl.e;
    }

    public final int b() {
        zzhrl zzhrlVar = zzhrl.e;
        int i = this.b;
        zzhrl zzhrlVar2 = this.c;
        if (zzhrlVar2 == zzhrlVar) {
            return i;
        }
        if (zzhrlVar2 == zzhrl.b || zzhrlVar2 == zzhrl.c || zzhrlVar2 == zzhrl.d) {
            return i + 5;
        }
        e32.i("Unknown variant");
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhrm)) {
            return false;
        }
        zzhrm zzhrmVar = (zzhrm) obj;
        return zzhrmVar.a == this.a && zzhrmVar.b() == b() && zzhrmVar.c == this.c && zzhrmVar.d == this.d;
    }

    public final int hashCode() {
        return Objects.hash(zzhrm.class, Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        String strValueOf2 = String.valueOf(this.d);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int i = this.b;
        int length3 = String.valueOf(i).length();
        int i2 = this.a;
        StringBuilder sb = new StringBuilder(length + 38 + length2 + 2 + length3 + 16 + String.valueOf(i2).length() + 10);
        q63.y(sb, "HMAC Parameters (variant: ", strValueOf, ", hashType: ", strValueOf2);
        pv1.s(i, i2, ", ", "-byte tags, and ", sb);
        sb.append("-byte key)");
        return sb.toString();
    }

    public /* synthetic */ zzhrm(int i, int i2, zzhrl zzhrlVar, zzhrk zzhrkVar) {
        this.a = i;
        this.b = i2;
        this.c = zzhrlVar;
        this.d = zzhrkVar;
    }
}
