package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import com.unity3d.services.UnityAdsConstants;
import defpackage.rd1;
import defpackage.zr0;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation-layout_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class RowColumnImplKt {
    public static final int a(List list, zr0 zr0Var, zr0 zr0Var2, int i, int i2, LayoutOrientation layoutOrientation, LayoutOrientation layoutOrientation2) {
        int i3 = 0;
        if (layoutOrientation == layoutOrientation2) {
            int size = list.size();
            float f = 0.0f;
            int iMax = 0;
            int i4 = 0;
            while (i3 < size) {
                IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list.get(i3);
                Object objA = intrinsicMeasurable.a();
                float fB = b(objA instanceof RowColumnParentData ? (RowColumnParentData) objA : null);
                int iIntValue = ((Number) zr0Var.invoke(intrinsicMeasurable, Integer.valueOf(i))).intValue();
                if (fB == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    i4 += iIntValue;
                } else if (fB > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f += fB;
                    iMax = Math.max(iMax, rd1.p(iIntValue / fB));
                }
                i3++;
            }
            return ((list.size() - 1) * i2) + rd1.p(iMax * f) + i4;
        }
        int iMin = Math.min((list.size() - 1) * i2, i);
        int size2 = list.size();
        float f2 = 0.0f;
        int iMax2 = 0;
        for (int i5 = 0; i5 < size2; i5++) {
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) list.get(i5);
            Object objA2 = intrinsicMeasurable2.a();
            float fB2 = b(objA2 instanceof RowColumnParentData ? (RowColumnParentData) objA2 : null);
            if (fB2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                int iMin2 = Math.min(((Number) zr0Var2.invoke(intrinsicMeasurable2, Integer.MAX_VALUE)).intValue(), i - iMin);
                iMin += iMin2;
                iMax2 = Math.max(iMax2, ((Number) zr0Var.invoke(intrinsicMeasurable2, Integer.valueOf(iMin2))).intValue());
            } else if (fB2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f2 += fB2;
            }
        }
        int iP = f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : rd1.p(Math.max(i - iMin, 0) / f2);
        int size3 = list.size();
        while (i3 < size3) {
            IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) list.get(i3);
            Object objA3 = intrinsicMeasurable3.a();
            float fB3 = b(objA3 instanceof RowColumnParentData ? (RowColumnParentData) objA3 : null);
            if (fB3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                iMax2 = Math.max(iMax2, ((Number) zr0Var.invoke(intrinsicMeasurable3, Integer.valueOf(iP != Integer.MAX_VALUE ? rd1.p(iP * fB3) : Integer.MAX_VALUE))).intValue());
            }
            i3++;
        }
        return iMax2;
    }

    public static final float b(RowColumnParentData rowColumnParentData) {
        return rowColumnParentData != null ? rowColumnParentData.a : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }
}
