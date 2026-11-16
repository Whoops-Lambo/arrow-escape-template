package io.p071bidmachine.rendering.model;

import defpackage.jc1;
import defpackage.n30;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class s0 {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final String d;
    public final String e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return this.a.equals(s0Var.a) && this.b.equals(s0Var.b) && this.c.equals(s0Var.c) && this.d.equals(s0Var.d) && this.e.equals(s0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + n30.c((this.c.hashCode() + n30.c(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PrivacySheetParams(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", actions=");
        sb.append(this.c);
        sb.append(", footerTitle=");
        sb.append(this.d);
        sb.append(", footerText=");
        return jc1.q(sb, this.e, ')');
    }

    public s0(String str, String str2, String str3, String str4, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = str3;
        this.e = str4;
    }
}
