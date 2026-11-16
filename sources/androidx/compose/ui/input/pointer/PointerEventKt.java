package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class PointerEventKt {
    public static final long g(PointerInputChange pointerInputChange, boolean z) {
        return (z || !pointerInputChange.b()) ? Offset.e(pointerInputChange.c, pointerInputChange.f) : Offset.b;
    }

    public static final boolean a(PointerInputChange pointerInputChange) {
        pointerInputChange.getClass();
        if (!pointerInputChange.b() && !pointerInputChange.g && pointerInputChange.d) {
            return true;
        }
        return false;
    }

    public static final boolean b(PointerInputChange pointerInputChange) {
        pointerInputChange.getClass();
        if (!pointerInputChange.g && pointerInputChange.d) {
            return true;
        }
        return false;
    }

    public static final boolean c(PointerInputChange pointerInputChange) {
        pointerInputChange.getClass();
        if (!pointerInputChange.b() && pointerInputChange.g && !pointerInputChange.d) {
            return true;
        }
        return false;
    }

    public static final boolean d(PointerInputChange pointerInputChange) {
        pointerInputChange.getClass();
        if (pointerInputChange.g && !pointerInputChange.d) {
            return true;
        }
        return false;
    }

    public static final boolean e(PointerInputChange pointerInputChange, long j) {
        pointerInputChange.getClass();
        long j2 = pointerInputChange.c;
        float fC = Offset.c(j2);
        float fD = Offset.d(j2);
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (fC >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fC <= i && fD >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fD <= i2) {
            return false;
        }
        return true;
    }

    public static final boolean f(PointerInputChange pointerInputChange, long j, long j2) {
        pointerInputChange.getClass();
        if (pointerInputChange.h == 1) {
            long j3 = pointerInputChange.c;
            float fC = Offset.c(j3);
            float fD = Offset.d(j3);
            float f = -Size.d(j2);
            float fD2 = Size.d(j2) + ((int) (j >> 32));
            float f2 = -Size.b(j2);
            float fB = Size.b(j2) + ((int) (j & 4294967295L));
            if (fC < f || fC > fD2 || fD < f2 || fD > fB) {
                return true;
            }
            return false;
        }
        return e(pointerInputChange, j);
    }
}
