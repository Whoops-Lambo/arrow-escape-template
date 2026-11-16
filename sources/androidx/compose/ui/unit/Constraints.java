package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import defpackage.ak1;
import defpackage.d;
import defpackage.e32;
import defpackage.jc1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Immutable
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/unit/Constraints;", "", "Companion", "value", "", "ui-unit_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class Constraints {
    public static final int[] b = {18, 20, 17, 15};
    public static final int[] c = {65535, 262143, 32767, 8191};
    public static final int[] d = {32767, 8191, 65535, 262143};
    public final long a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007R\u0014\u0010\u0016\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\nR\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\nR\u0014\u0010\u0018\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0007¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/unit/Constraints$Companion;", "", "", "FocusMask", "J", "", "HeightMask", "[I", "", "Infinity", "I", "MaxFocusBits", "MaxFocusHeight", "MaxFocusMask", "MaxFocusWidth", "MaxNonFocusBits", "MaxNonFocusMask", "MinFocusBits", "MinFocusHeight", "MinFocusMask", "MinFocusWidth", "MinHeightOffsets", "MinNonFocusBits", "MinNonFocusMask", "WidthMask", "ui-unit_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public static int a(int i) {
            if (i < 8191) {
                return 13;
            }
            if (i < 32767) {
                return 15;
            }
            if (i < 65535) {
                return 16;
            }
            if (i < 262143) {
                return 18;
            }
            d.r(jc1.k(i, "Can't represent a size of ", " in Constraints"));
            return 0;
        }

        public static long c(int i, int i2) {
            if (i >= 0 && i2 >= 0) {
                return b(i, i, i2, i2);
            }
            ak1.n(jc1.n("width(", i, ") and height(", i2, ") must be >= 0"));
            return 0L;
        }

        public static long d(int i) {
            if (i >= 0) {
                return b(0, Integer.MAX_VALUE, i, i);
            }
            ak1.n(jc1.k(i, "height(", ") must be >= 0"));
            return 0L;
        }

        public static long e(int i) {
            if (i >= 0) {
                return b(i, i, 0, Integer.MAX_VALUE);
            }
            ak1.n(jc1.k(i, "width(", ") must be >= 0"));
            return 0L;
        }

        public static long b(int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            int i7;
            if (i4 == Integer.MAX_VALUE) {
                i5 = i3;
            } else {
                i5 = i4;
            }
            int iA = a(i5);
            if (i2 == Integer.MAX_VALUE) {
                i6 = i;
            } else {
                i6 = i2;
            }
            int iA2 = a(i6);
            long j = 0;
            if (iA + iA2 <= 31) {
                if (iA2 != 13) {
                    if (iA2 != 18) {
                        if (iA2 != 15) {
                            if (iA2 != 16) {
                                e32.i("Should only have the provided constants.");
                                return 0L;
                            }
                        } else {
                            j = 2;
                        }
                    } else {
                        j = 1;
                    }
                } else {
                    j = 3;
                }
                int i8 = 0;
                if (i2 == Integer.MAX_VALUE) {
                    i7 = 0;
                } else {
                    i7 = i2 + 1;
                }
                if (i4 != Integer.MAX_VALUE) {
                    i8 = i4 + 1;
                }
                int i9 = Constraints.b[(int) j];
                return (((long) i7) << 33) | (((long) i) << 2) | j | (((long) i3) << i9) | (((long) i8) << (i9 + 31));
            }
            d.r(jc1.n("Can't represent a width of ", i6, " and height of ", i5, " in Constraints"));
            return 0L;
        }
    }

    public static long a(int i, long j, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = j(j);
        }
        if ((i5 & 2) != 0) {
            i2 = h(j);
        }
        if ((i5 & 4) != 0) {
            i3 = i(j);
        }
        if ((i5 & 8) != 0) {
            i4 = g(j);
        }
        if (i3 < 0 || i < 0) {
            ak1.n(jc1.n("minHeight(", i3, ") and minWidth(", i, ") must be >= 0"));
            return 0L;
        }
        if (i2 < i && i2 != Integer.MAX_VALUE) {
            d.k(") must be >= minWidth(", "maxWidth(", i2, i);
            return 0L;
        }
        if (i4 >= i3 || i4 == Integer.MAX_VALUE) {
            return Companion.b(i, i2, i3, i4);
        }
        d.k(") must be >= minHeight(", "maxHeight(", i4, i3);
        return 0L;
    }

    public static final boolean b(long j, long j2) {
        return j == j2;
    }

    public static final boolean c(long j) {
        int i = (int) (3 & j);
        return (((int) (j >> (b[i] + 31))) & d[i]) != 0;
    }

    public static final boolean d(long j) {
        return (((int) (j >> 33)) & c[(int) (3 & j)]) != 0;
    }

    public static final int g(long j) {
        int i = (int) (3 & j);
        int i2 = ((int) (j >> (b[i] + 31))) & d[i];
        if (i2 == 0) {
            return Integer.MAX_VALUE;
        }
        return i2 - 1;
    }

    public static final int h(long j) {
        int i = ((int) (j >> 33)) & c[(int) (3 & j)];
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i - 1;
    }

    public static final int i(long j) {
        int i = (int) (3 & j);
        return ((int) (j >> b[i])) & d[i];
    }

    public static final int j(long j) {
        return ((int) (j >> 2)) & c[(int) (3 & j)];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Constraints) {
            return this.a == ((Constraints) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return k(this.a);
    }

    public static final boolean e(long j) {
        if (g(j) == i(j)) {
            return true;
        }
        return false;
    }

    public static final boolean f(long j) {
        if (h(j) == j(j)) {
            return true;
        }
        return false;
    }

    public static String k(long j) {
        String strValueOf;
        int iH = h(j);
        String strValueOf2 = "Infinity";
        if (iH == Integer.MAX_VALUE) {
            strValueOf = "Infinity";
        } else {
            strValueOf = String.valueOf(iH);
        }
        int iG = g(j);
        if (iG != Integer.MAX_VALUE) {
            strValueOf2 = String.valueOf(iG);
        }
        StringBuilder sb = new StringBuilder("Constraints(minWidth = ");
        sb.append(j(j));
        sb.append(", maxWidth = ");
        sb.append(strValueOf);
        sb.append(", minHeight = ");
        sb.append(i(j));
        sb.append(", maxHeight = ");
        return jc1.q(sb, strValueOf2, ')');
    }
}
