package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class co4 implements Comparable, Serializable {
    public static final co4 b = new co4(0);
    public static final co4 c = new co4(1);
    public final /* synthetic */ int a;

    public /* synthetic */ co4(int i) {
        this.a = i;
    }

    public final void a(StringBuilder sb) {
        switch (this.a) {
            case 0:
                throw new AssertionError();
            default:
                sb.append("(-∞");
                return;
        }
    }

    public final void b(StringBuilder sb) {
        switch (this.a) {
            case 0:
                sb.append("+∞)");
                return;
            default:
                throw new AssertionError();
        }
    }

    public final int c(co4 co4Var) {
        switch (this.a) {
            case 0:
                return co4Var == this ? 0 : 1;
            default:
                return co4Var == this ? 0 : -1;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        switch (this.a) {
            case 0:
                return ((co4) obj) == this ? 0 : 1;
            default:
                return ((co4) obj) == this ? 0 : -1;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof co4) {
            try {
                if (c((co4) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public final int hashCode() {
        switch (this.a) {
            case 0:
                break;
        }
        return System.identityHashCode(this);
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "+∞";
            default:
                return "-∞";
        }
    }
}
