package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class TransformGestureDetectorKt {
    public static final long b(PointerEvent pointerEvent, boolean z) {
        long jF = Offset.b;
        List list = pointerEvent.a;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            PointerInputChange pointerInputChange = (PointerInputChange) list.get(i2);
            if (pointerInputChange.d && pointerInputChange.g) {
                jF = Offset.f(jF, z ? pointerInputChange.c : pointerInputChange.f);
                i++;
            }
        }
        if (i == 0) {
            return Offset.d;
        }
        float f = i;
        return OffsetKt.a(Offset.c(jF) / f, Offset.d(jF) / f);
    }

    public static final float d(PointerEvent pointerEvent) {
        List list = pointerEvent.a;
        int size = list.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i >= size) {
                break;
            }
            PointerInputChange pointerInputChange = (PointerInputChange) list.get(i);
            if (!pointerInputChange.g || !pointerInputChange.d) {
                i3 = 0;
            }
            i2 += i3;
            i++;
        }
        if (i2 >= 2) {
            long jB = b(pointerEvent, true);
            long jB2 = b(pointerEvent, false);
            int size2 = list.size();
            float f = 0.0f;
            float f2 = 0.0f;
            for (int i4 = 0; i4 < size2; i4++) {
                PointerInputChange pointerInputChange2 = (PointerInputChange) list.get(i4);
                if (pointerInputChange2.d && pointerInputChange2.g) {
                    long j = pointerInputChange2.c;
                    long jE = Offset.e(pointerInputChange2.f, jB2);
                    long jE2 = Offset.e(j, jB);
                    float fA = a(jE2) - a(jE);
                    float fB = Offset.b(Offset.f(jE2, jE)) / 2.0f;
                    if (fA > 180.0f) {
                        fA -= 360.0f;
                    } else if (fA < -180.0f) {
                        fA += 360.0f;
                    }
                    f2 += fA * fB;
                    f += fB;
                }
            }
            if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return f2 / f;
            }
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public static final float a(long j) {
        if (Offset.c(j) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && Offset.d(j) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return ((-((float) Math.atan2(Offset.c(j), Offset.d(j)))) * 180.0f) / 3.1415927f;
    }

    public static final float c(PointerEvent pointerEvent, boolean z) {
        long j;
        long jB = b(pointerEvent, z);
        boolean zA = Offset.a(jB, Offset.d);
        float fB = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (zA) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        List list = pointerEvent.a;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            PointerInputChange pointerInputChange = (PointerInputChange) list.get(i2);
            if (pointerInputChange.d && pointerInputChange.g) {
                if (z) {
                    j = pointerInputChange.c;
                } else {
                    j = pointerInputChange.f;
                }
                i++;
                fB = Offset.b(Offset.e(j, jB)) + fB;
            }
        }
        return fB / i;
    }
}
