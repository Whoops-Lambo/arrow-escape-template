package androidx.compose.runtime;

import androidx.media3.common.C;
import defpackage.d;
import defpackage.s71;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"runtime_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class SlotTableKt {
    public static final boolean a(int i, int[] iArr) {
        return (iArr[(i * 5) + 1] & C.BUFFER_FLAG_NOT_DEPENDED_ON) != 0;
    }

    public static final boolean b(int i, int[] iArr) {
        return (iArr[(i * 5) + 1] & 268435456) != 0;
    }

    public static final boolean c(int i, int[] iArr) {
        return (iArr[(i * 5) + 1] & 536870912) != 0;
    }

    public static final boolean d(int i, int[] iArr) {
        return (iArr[(i * 5) + 1] & 1073741824) != 0;
    }

    public static final int f(int i, int[] iArr) {
        return iArr[(i * 5) + 1] & 67108863;
    }

    public static final int g(int i, int[] iArr) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 4];
        int i4 = 1;
        switch (iArr[i2 + 1] >> 28) {
            case 0:
                i4 = 0;
                break;
            case 1:
            case 2:
            case 4:
                break;
            case 3:
            case 5:
            case 6:
                i4 = 2;
                break;
            default:
                i4 = 3;
                break;
        }
        return i4 + i3;
    }

    public static final void h(int i, int i2, int[] iArr) {
        if (i2 >= 0) {
            iArr[(i * 5) + 3] = i2;
        } else {
            d.r("Failed requirement.");
        }
    }

    public static final void i(int i, int i2, int[] iArr) {
        if (i2 < 0 || i2 >= 67108863) {
            d.r("Failed requirement.");
        } else {
            int i3 = (i * 5) + 1;
            iArr[i3] = i2 | (iArr[i3] & (-67108864));
        }
    }

    public static final int e(ArrayList arrayList, int i, int i2) {
        int iJ = j(arrayList, i, i2);
        if (iJ >= 0) {
            return iJ;
        }
        return -(iJ + 1);
    }

    public static final int j(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((Anchor) arrayList.get(i4)).a;
            if (i5 < 0) {
                i5 += i2;
            }
            int iH = s71.h(i5, i);
            if (iH < 0) {
                i3 = i4 + 1;
            } else if (iH > 0) {
                size = i4 - 1;
            } else {
                return i4;
            }
        }
        return -(i3 + 1);
    }
}
