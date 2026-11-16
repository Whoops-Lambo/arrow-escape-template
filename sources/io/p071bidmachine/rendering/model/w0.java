package io.p071bidmachine.rendering.model;

import defpackage.jc1;
import defpackage.n30;
import defpackage.nj;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class w0 {
    public final String a;
    public final int b;
    public final v0 c;
    public final boolean d;
    public final String e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return this.a.equals(w0Var.a) && this.b == w0Var.b && this.c == w0Var.c && this.d == w0Var.d && this.e.equals(w0Var.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final int hashCode() {
        int iD = jc1.d(this.b, this.a.hashCode() * 31, 31);
        v0 v0Var = this.c;
        int iHashCode = (iD + (v0Var == null ? 0 : v0Var.hashCode())) * 31;
        boolean z = this.d;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return n30.c((iHashCode + r2) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScriptConfig(scriptId=");
        sb.append(this.a);
        sb.append(", priority=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", forMainFrameOnly=");
        sb.append(this.d);
        sb.append(", source=");
        return nj.q(sb, this.e, ", messageHandler=null)");
    }

    public w0(String str, int i, v0 v0Var, boolean z, String str2) {
        this.a = str;
        this.b = i;
        this.c = v0Var;
        this.d = z;
        this.e = str2;
    }
}
