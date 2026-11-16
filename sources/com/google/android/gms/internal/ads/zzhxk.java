package com.google.android.gms.internal.ads;

import defpackage.q63;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzhxk extends zziac {
    public final zzhxi a;
    public final zzhxg b;
    public final zzhxh c;
    public final zzhxj d;

    @Override // com.google.android.gms.internal.ads.zzhgt
    public final boolean a() {
        return this.d != zzhxj.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhxk)) {
            return false;
        }
        zzhxk zzhxkVar = (zzhxk) obj;
        return zzhxkVar.a == this.a && zzhxkVar.b == this.b && zzhxkVar.c == this.c && zzhxkVar.d == this.d;
    }

    public final int hashCode() {
        return Objects.hash(zzhxk.class, this.a, this.b, this.c, this.d);
    }

    public final String toString() {
        String str = this.d.a;
        int length = str.length();
        String str2 = this.c.a;
        int length2 = str2.length();
        String str3 = this.a.a;
        int length3 = str3.length();
        String str4 = this.b.a;
        StringBuilder sb = new StringBuilder(length + 39 + length2 + 12 + length3 + 9 + str4.length() + 1);
        q63.y(sb, "ECDSA Parameters (variant: ", str, ", hashType: ", str2);
        q63.y(sb, ", encoding: ", str3, ", curve: ", str4);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ zzhxk(zzhxi zzhxiVar, zzhxg zzhxgVar, zzhxh zzhxhVar, zzhxj zzhxjVar) {
        this.a = zzhxiVar;
        this.b = zzhxgVar;
        this.c = zzhxhVar;
        this.d = zzhxjVar;
    }
}
