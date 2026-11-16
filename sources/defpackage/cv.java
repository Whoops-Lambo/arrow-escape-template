package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class cv extends ev {
    @Override // defpackage.ev
    public final int f() {
        return 0;
    }

    public static ev g(int i) {
        if (i < 0) {
            return ev.b;
        }
        return i > 0 ? ev.c : ev.a;
    }

    @Override // defpackage.ev
    public final ev a(int i, int i2) {
        return g(Integer.compare(i, i2));
    }

    @Override // defpackage.ev
    public final ev b(long j, long j2) {
        return g(Long.compare(j, j2));
    }

    @Override // defpackage.ev
    public final ev c(Object obj, Object obj2, Comparator comparator) {
        return g(comparator.compare(obj, obj2));
    }

    @Override // defpackage.ev
    public final ev d(boolean z, boolean z2) {
        return g(Boolean.compare(z, z2));
    }

    @Override // defpackage.ev
    public final ev e(boolean z, boolean z2) {
        return g(Boolean.compare(z2, z));
    }
}
