package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class ok extends ss1 implements Serializable {
    public final gs0 a;
    public final ss1 b;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        gs0 gs0Var = this.a;
        return this.b.compare(gs0Var.apply(obj), gs0Var.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ok)) {
            return false;
        }
        ok okVar = (ok) obj;
        return this.a.equals(okVar.a) && this.b.equals(okVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return this.b + ".onResultOf(" + this.a + ")";
    }

    public ok(gs0 gs0Var, ss1 ss1Var) {
        this.a = gs0Var;
        this.b = ss1Var;
    }
}
