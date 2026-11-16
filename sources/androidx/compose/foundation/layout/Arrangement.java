package androidx.compose.foundation.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import defpackage.h50;
import defpackage.rd1;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement;", "", "Absolute", "Horizontal", "HorizontalOrVertical", "SpacedAligned", "Vertical", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class Arrangement {
    public static final Arrangement$Start$1 a = new Arrangement$Start$1();
    public static final Arrangement$End$1 b = new Arrangement$End$1();
    public static final Arrangement$Top$1 c = new Arrangement$Top$1();
    public static final Arrangement$Bottom$1 d = new Arrangement$Bottom$1();
    public static final Arrangement$Center$1 e = new Arrangement$Center$1();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$Absolute;", "", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Absolute {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    @Stable
    public interface Horizontal {

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class DefaultImpls {
        }

        default float a() {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        void b(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u00012\u00020\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    @Stable
    public interface HorizontalOrVertical extends Horizontal, Vertical {

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class DefaultImpls {
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        default float a() {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Immutable
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;", "Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class SpacedAligned implements HorizontalOrVertical {
        public final zr0 a = Arrangement$spacedBy$1.i;

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        public final float a() {
            return 8.0f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SpacedAligned) && Dp.a(8.0f, 8.0f);
        }

        public final int hashCode() {
            return Arrangement$spacedBy$1.i.hashCode() + (((Float.hashCode(8.0f) * 31) + 1) * 31);
        }

        public final String toString() {
            StringBuilder sbQ = h50.q("", "Arrangement#spacedAligned(");
            sbQ.append((Object) Dp.b(8.0f));
            sbQ.append(", ");
            sbQ.append(Arrangement$spacedBy$1.i);
            sbQ.append(')');
            return sbQ.toString();
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public final void b(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            int i2;
            int i3;
            density.getClass();
            iArr.getClass();
            layoutDirection.getClass();
            iArr2.getClass();
            if (iArr.length != 0) {
                int iMo1roundToPx0680j_4 = density.mo1roundToPx0680j_4(8.0f);
                if (layoutDirection == LayoutDirection.b) {
                    int length = iArr.length - 1;
                    i2 = 0;
                    i3 = 0;
                    while (-1 < length) {
                        int i4 = iArr[length];
                        int iMin = Math.min(i2, i - i4);
                        iArr2[length] = iMin;
                        int iMin2 = Math.min(iMo1roundToPx0680j_4, (i - iMin) - i4);
                        int i5 = iArr2[length] + i4 + iMin2;
                        length--;
                        i3 = iMin2;
                        i2 = i5;
                    }
                } else {
                    int length2 = iArr.length;
                    i2 = 0;
                    i3 = 0;
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < length2) {
                        int i8 = iArr[i6];
                        int iMin3 = Math.min(i2, i - i8);
                        iArr2[i7] = iMin3;
                        int iMin4 = Math.min(iMo1roundToPx0680j_4, (i - iMin3) - i8);
                        int i9 = iArr2[i7] + i8 + iMin4;
                        i6++;
                        i3 = iMin4;
                        i2 = i9;
                        i7++;
                    }
                }
                int i10 = i2 - i3;
                if (i10 < i) {
                    int iIntValue = ((Number) Arrangement$spacedBy$1.i.invoke(Integer.valueOf(i - i10), layoutDirection)).intValue();
                    int length3 = iArr2.length;
                    for (int i11 = 0; i11 < length3; i11++) {
                        iArr2[i11] = iArr2[i11] + iIntValue;
                    }
                }
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public final void c(Density density, int i, int[] iArr, int[] iArr2) {
            density.getClass();
            iArr.getClass();
            iArr2.getClass();
            b(density, i, iArr, LayoutDirection.a, iArr2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$Vertical;", "", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    @Stable
    public interface Vertical {

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class DefaultImpls {
        }

        default float a() {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        void c(Density density, int i, int[] iArr, int[] iArr2);
    }

    public static void a(int i, int[] iArr, int[] iArr2, boolean z) {
        iArr.getClass();
        iArr2.getClass();
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float f = (i - i3) / 2.0f;
        if (!z) {
            int length = iArr.length;
            int i5 = 0;
            while (i2 < length) {
                int i6 = iArr[i2];
                iArr2[i5] = rd1.p(f);
                f += i6;
                i2++;
                i5++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i7 = iArr[length2];
                iArr2[length2] = rd1.p(f);
                f += i7;
            } else {
                return;
            }
        }
    }

    public static void b(int[] iArr, int[] iArr2, boolean z) {
        iArr.getClass();
        iArr2.getClass();
        int i = 0;
        if (!z) {
            int length = iArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i < length) {
                int i4 = iArr[i];
                iArr2[i2] = i3;
                i3 += i4;
                i++;
                i2++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i5 = iArr[length2];
                iArr2[length2] = i;
                i += i5;
            } else {
                return;
            }
        }
    }

    public static void c(int i, int[] iArr, int[] iArr2, boolean z) {
        iArr.getClass();
        iArr2.getClass();
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        int i5 = i - i3;
        if (!z) {
            int length = iArr.length;
            int i6 = 0;
            while (i2 < length) {
                int i7 = iArr[i2];
                iArr2[i6] = i5;
                i5 += i7;
                i2++;
                i6++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i8 = iArr[length2];
                iArr2[length2] = i5;
                i5 += i8;
            } else {
                return;
            }
        }
    }

    public static void d(int i, int[] iArr, int[] iArr2, boolean z) {
        float length;
        iArr.getClass();
        iArr2.getClass();
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        if (iArr.length == 0) {
            length = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else {
            length = (i - i3) / iArr.length;
        }
        float f = length / 2.0f;
        if (!z) {
            int length2 = iArr.length;
            int i5 = 0;
            while (i2 < length2) {
                int i6 = iArr[i2];
                iArr2[i5] = rd1.p(f);
                f += i6 + length;
                i2++;
                i5++;
            }
            return;
        }
        int length3 = iArr.length;
        while (true) {
            length3--;
            if (-1 < length3) {
                int i7 = iArr[length3];
                iArr2[length3] = rd1.p(f);
                f += i7 + length;
            } else {
                return;
            }
        }
    }

    public static void e(int i, int[] iArr, int[] iArr2, boolean z) {
        float length;
        iArr.getClass();
        iArr2.getClass();
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        int length2 = iArr.length;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (length2 > 1) {
            length = (i - i3) / (iArr.length - 1);
        } else {
            length = 0.0f;
        }
        if (!z) {
            int length3 = iArr.length;
            int i5 = 0;
            while (i2 < length3) {
                int i6 = iArr[i2];
                iArr2[i5] = rd1.p(f);
                f += i6 + length;
                i2++;
                i5++;
            }
            return;
        }
        for (int length4 = iArr.length - 1; -1 < length4; length4--) {
            int i7 = iArr[length4];
            iArr2[length4] = rd1.p(f);
            f += i7 + length;
        }
    }

    public static void f(int i, int[] iArr, int[] iArr2, boolean z) {
        iArr.getClass();
        iArr2.getClass();
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float length = (i - i3) / (iArr.length + 1);
        if (!z) {
            int length2 = iArr.length;
            float f = length;
            int i5 = 0;
            while (i2 < length2) {
                int i6 = iArr[i2];
                iArr2[i5] = rd1.p(f);
                f += i6 + length;
                i2++;
                i5++;
            }
            return;
        }
        float f2 = length;
        for (int length3 = iArr.length - 1; -1 < length3; length3--) {
            int i7 = iArr[length3];
            iArr2[length3] = rd1.p(f2);
            f2 += i7 + length;
        }
    }
}
