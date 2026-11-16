package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class wd extends f00 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f00) {
            if (this.a == ((wd) ((f00) obj)).a) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return nj.l(this.a, "}", new StringBuilder("ProfilingTrigger{trigger="));
    }

    public wd(int i) {
        this.a = i;
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }
}
