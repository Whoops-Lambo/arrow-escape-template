package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class px1 {
    public final ArrayList a;
    public final boolean b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof px1)) {
            return false;
        }
        px1 px1Var = (px1) obj;
        return this.a.equals(px1Var.a) && this.b == px1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PredefinedUIServiceConsent(history=" + this.a + ", status=" + this.b + ")";
    }

    public px1(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }
}
