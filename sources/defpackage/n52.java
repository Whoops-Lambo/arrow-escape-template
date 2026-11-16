package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class n52 extends ss1 implements Serializable {
    public static final n52 a = new n52();

    private Object readResolve() {
        return a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    @Override // defpackage.ss1
    public final ss1 d() {
        return gq1.a;
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
