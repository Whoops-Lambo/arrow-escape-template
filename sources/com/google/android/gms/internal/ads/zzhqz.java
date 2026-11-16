package com.google.android.gms.internal.ads;

import defpackage.e32;
import defpackage.n30;
import defpackage.rl3;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzhqz extends zzhrp {
    public final int a;
    public final int b;
    public final zzhqy c;

    @Override // com.google.android.gms.internal.ads.zzhgt
    public final boolean a() {
        return this.c != zzhqy.e;
    }

    public final int b() {
        zzhqy zzhqyVar = zzhqy.e;
        int i = this.b;
        zzhqy zzhqyVar2 = this.c;
        if (zzhqyVar2 == zzhqyVar) {
            return i;
        }
        if (zzhqyVar2 == zzhqy.b || zzhqyVar2 == zzhqy.c || zzhqyVar2 == zzhqy.d) {
            return i + 5;
        }
        e32.i("Unknown variant");
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhqz)) {
            return false;
        }
        zzhqz zzhqzVar = (zzhqz) obj;
        return zzhqzVar.a == this.a && zzhqzVar.b() == b() && zzhqzVar.c == this.c;
    }

    public final int hashCode() {
        return Objects.hash(zzhqz.class, Integer.valueOf(this.a), Integer.valueOf(this.b), this.c);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        int length = strValueOf.length();
        int i = this.b;
        int length2 = String.valueOf(i).length();
        int i2 = this.a;
        StringBuilder sb = new StringBuilder(rl3.v(length, 32, length2, 16, String.valueOf(i2).length()) + 10);
        n30.t(i, "AES-CMAC Parameters (variant: ", strValueOf, ", ", sb);
        return rl3.k(sb, "-byte tags, and ", i2, "-byte key)");
    }

    public /* synthetic */ zzhqz(int i, int i2, zzhqy zzhqyVar) {
        this.a = i;
        this.b = i2;
        this.c = zzhqyVar;
    }
}
