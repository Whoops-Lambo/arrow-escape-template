package com.google.android.gms.internal.ads;

import defpackage.h50;
import defpackage.n30;
import defpackage.rl3;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhik extends zzhhq {
    public final int a;
    public final int b;
    public final zzhij c;

    @Override // com.google.android.gms.internal.ads.zzhgt
    public final boolean a() {
        return this.c != zzhij.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhik)) {
            return false;
        }
        zzhik zzhikVar = (zzhik) obj;
        return zzhikVar.a == this.a && zzhikVar.b == this.b && zzhikVar.c == this.c;
    }

    public final int hashCode() {
        return Objects.hash(zzhik.class, Integer.valueOf(this.a), Integer.valueOf(this.b), 16, this.c);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        int length = strValueOf.length();
        int i = this.b;
        int length2 = String.valueOf(i).length();
        int length3 = String.valueOf(16).length();
        int i2 = this.a;
        StringBuilder sb = new StringBuilder(h50.d(rl3.v(length, 30, length2, 10, length3), 15, String.valueOf(i2).length(), 10));
        n30.t(i, "AesEax Parameters (variant: ", strValueOf, ", ", sb);
        return rl3.k(sb, "-byte IV, 16-byte tag, and ", i2, "-byte key)");
    }

    public /* synthetic */ zzhik(int i, int i2, zzhij zzhijVar) {
        this.a = i;
        this.b = i2;
        this.c = zzhijVar;
    }
}
