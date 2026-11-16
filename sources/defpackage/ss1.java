package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class ss1 implements Comparator {
    public static ss1 a(Comparator comparator) {
        return comparator instanceof ss1 ? (ss1) comparator : new bv(comparator);
    }

    public ss1 d() {
        return new o52(this);
    }
}
