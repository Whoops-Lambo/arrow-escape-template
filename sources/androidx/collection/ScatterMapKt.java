package androidx.collection;

import defpackage.n8;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0004*\f\b\u0000\u0010\u0001\"\u00020\u00002\u00020\u0000*\f\b\u0000\u0010\u0002\"\u00020\u00002\u00020\u0000*\f\b\u0000\u0010\u0003\"\u00020\u00002\u00020\u0000¨\u0006\u0004"}, d2 = {"", "Bitmask", "Group", "StaticBitmask", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ScatterMapKt {
    public static final long[] a = {-9187201950435737345L, -1};

    static {
        long[] jArr;
        int iC = c(0);
        int iMax = iC > 0 ? Math.max(7, b(iC)) : 0;
        if (iMax == 0) {
            jArr = a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            n8.Z(jArr);
        }
        int i = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i] = (jArr[i] & (~j)) | j;
        Object[] objArr = new Object[iMax];
        Object[] objArr2 = new Object[iMax];
    }

    public static final int a(int i) {
        if (i == 7) {
            return 6;
        }
        return i - (i / 8);
    }

    public static final int c(int i) {
        if (i == 7) {
            return 8;
        }
        return ((i - 1) / 7) + i;
    }

    public static final int b(int i) {
        if (i > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i);
        }
        return 0;
    }
}
