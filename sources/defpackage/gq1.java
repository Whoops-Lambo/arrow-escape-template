package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class gq1 extends ss1 implements Serializable {
    public static final gq1 a = new gq1();

    private Object readResolve() {
        return a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    @Override // defpackage.ss1
    public final ss1 d() {
        return n52.a;
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
