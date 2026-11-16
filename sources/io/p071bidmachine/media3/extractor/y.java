package io.p071bidmachine.media3.extractor;

import com.ironsource.C4664b4;
import defpackage.nj;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class y {
    public final a0 a;
    public final a0 b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y.class == obj.getClass()) {
            y yVar = (y) obj;
            if (this.a.equals(yVar.a) && this.b.equals(yVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder(C4664b4.j.d);
        a0 a0Var = this.a;
        sb.append(a0Var);
        a0 a0Var2 = this.b;
        if (a0Var.equals(a0Var2)) {
            str = "";
        } else {
            str = ", " + a0Var2;
        }
        return nj.q(sb, str, C4664b4.j.e);
    }

    public y(a0 a0Var, a0 a0Var2) {
        this.a = a0Var;
        this.b = a0Var2;
    }
}
