package androidx.compose.ui.unit;

import defpackage.ak1;
import defpackage.d;
import defpackage.jc1;
import defpackage.tb5;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-unit_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class ConstraintsKt {
    public static final long a(int i, int i2, int i3, int i4) {
        if (i2 < i) {
            d.k(") must be >= than minWidth(", "maxWidth(", i2, i);
            return 0L;
        }
        if (i4 < i3) {
            d.k(") must be >= than minHeight(", "maxHeight(", i4, i3);
            return 0L;
        }
        if (i >= 0 && i3 >= 0) {
            return Constraints.Companion.b(i, i2, i3, i4);
        }
        ak1.n(jc1.n("minWidth(", i, ") and minHeight(", i3, ") must be >= 0"));
        return 0L;
    }

    public static /* synthetic */ long b(int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i3 & 8) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return a(0, i, 0, i2);
    }

    public static final long c(long j, long j2) {
        return IntSizeKt.a(tb5.g((int) (j2 >> 32), Constraints.j(j), Constraints.h(j)), tb5.g((int) (j2 & 4294967295L), Constraints.i(j), Constraints.g(j)));
    }

    public static /* synthetic */ long i(int i, int i2, int i3, long j) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return h(i, i2, j);
    }

    public static final long d(long j, long j2) {
        return a(tb5.g(Constraints.j(j2), Constraints.j(j), Constraints.h(j)), tb5.g(Constraints.h(j2), Constraints.j(j), Constraints.h(j)), tb5.g(Constraints.i(j2), Constraints.i(j), Constraints.g(j)), tb5.g(Constraints.g(j2), Constraints.i(j), Constraints.g(j)));
    }

    public static final int e(int i, long j) {
        return tb5.g(i, Constraints.i(j), Constraints.g(j));
    }

    public static final int f(int i, long j) {
        return tb5.g(i, Constraints.j(j), Constraints.h(j));
    }

    public static final boolean g(long j, long j2) {
        int iJ = Constraints.j(j);
        int iH = Constraints.h(j);
        int i = (int) (j2 >> 32);
        if (iJ <= i && i <= iH) {
            int i2 = Constraints.i(j);
            int iG = Constraints.g(j);
            int i3 = (int) (j2 & 4294967295L);
            if (i2 <= i3 && i3 <= iG) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final long h(int i, int i2, long j) {
        int iJ = Constraints.j(j) + i;
        int i3 = 0;
        if (iJ < 0) {
            iJ = 0;
        }
        int iH = Constraints.h(j);
        if (iH != Integer.MAX_VALUE && (iH = iH + i) < 0) {
            iH = 0;
        }
        int i4 = Constraints.i(j) + i2;
        if (i4 < 0) {
            i4 = 0;
        }
        int iG = Constraints.g(j);
        if (iG == Integer.MAX_VALUE || (iG = iG + i2) >= 0) {
            i3 = iG;
        }
        return a(iJ, iH, i4, i3);
    }
}
