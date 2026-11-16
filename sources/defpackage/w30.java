package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class w30 implements Comparable, Serializable {
    public final Comparable a;

    public abstract void b(StringBuilder sb);

    public abstract void c(StringBuilder sb);

    public abstract boolean f(Comparable comparable);

    public abstract int hashCode();

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(w30 w30Var) {
        if (w30Var == u30.b) {
            return 1;
        }
        if (w30Var == t30.b) {
            return -1;
        }
        Comparable comparable = w30Var.a;
        z12 z12Var = z12.c;
        int iCompareTo = this.a.compareTo(comparable);
        return iCompareTo != 0 ? iCompareTo : Boolean.compare(false, false);
    }

    public Comparable d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w30) {
            try {
                if (compareTo((w30) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public w30(Comparable comparable) {
        this.a = comparable;
    }
}
