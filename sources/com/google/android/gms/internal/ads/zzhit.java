package com.google.android.gms.internal.ads;

import defpackage.h50;
import defpackage.n30;
import defpackage.rl3;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhit extends zzhhq {
    public final int a;
    public final zzhis b;

    @Override // com.google.android.gms.internal.ads.zzhgt
    public final boolean a() {
        return this.b != zzhis.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhit)) {
            return false;
        }
        zzhit zzhitVar = (zzhit) obj;
        return zzhitVar.a == this.a && zzhitVar.b == this.b;
    }

    public final int hashCode() {
        return Objects.hash(zzhit.class, Integer.valueOf(this.a), 12, 16, this.b);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.b);
        int length = strValueOf.length();
        int length2 = String.valueOf(12).length();
        int length3 = String.valueOf(16).length();
        int i = this.a;
        StringBuilder sb = new StringBuilder(h50.d(rl3.v(length, 30, length2, 10, length3), 15, String.valueOf(i).length(), 10));
        n30.t(i, "AesGcm Parameters (variant: ", strValueOf, ", 12-byte IV, 16-byte tag, and ", sb);
        sb.append("-byte key)");
        return sb.toString();
    }

    public /* synthetic */ zzhit(int i, zzhis zzhisVar) {
        this.a = i;
        this.b = zzhisVar;
    }
}
