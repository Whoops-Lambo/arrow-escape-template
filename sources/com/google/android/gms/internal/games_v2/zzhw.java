package com.google.android.gms.internal.games_v2;

import defpackage.co4;
import defpackage.d;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzhw implements Serializable {
    public static final zzhw c = new zzhw(co4.c, co4.b);
    public final co4 a;
    public final co4 b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhw)) {
            return false;
        }
        zzhw zzhwVar = (zzhw) obj;
        return this.a.equals(zzhwVar.a) && this.b.equals(zzhwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(16);
        this.a.a(sb);
        sb.append("..");
        this.b.b(sb);
        return sb.toString();
    }

    public zzhw(co4 co4Var, co4 co4Var2) {
        this.a = co4Var;
        this.b = co4Var2;
        if (co4Var.c(co4Var2) <= 0 && co4Var != co4.b && co4Var2 != co4.c) {
            return;
        }
        StringBuilder sb = new StringBuilder(16);
        co4Var.a(sb);
        sb.append("..");
        co4Var2.b(sb);
        d.r("Invalid range: ".concat(sb.toString()));
        throw null;
    }
}
