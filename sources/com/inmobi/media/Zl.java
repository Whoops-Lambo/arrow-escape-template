package com.inmobi.media;

import defpackage.n30;
import defpackage.s71;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class Zl {
    public final String a;
    public final String b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Zl)) {
            return false;
        }
        Zl zl = (Zl) obj;
        return s71.b(this.a, zl.a) && s71.b(this.b, zl.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return n30.n("TableInfo(tableName=", this.a, ", tableSchema=", this.b, ")");
    }

    public Zl(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }
}
