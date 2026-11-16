package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation-layout_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class PaddingKt {
    public static PaddingValuesImpl a(float f, int i) {
        float f2 = (i & 1) != 0 ? 0.0f : 4.0f;
        float f3 = (i & 4) != 0 ? 0.0f : 4.0f;
        if ((i & 8) != 0) {
            f = 0.0f;
        }
        return new PaddingValuesImpl(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, f);
    }

    public static Modifier g(Modifier modifier, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return f(modifier, f, f2);
    }

    public static Modifier h(Modifier modifier, float f, float f2, float f3, float f4, int i) {
        float f5 = (i & 1) != 0 ? 0.0f : f;
        float f6 = (i & 2) != 0 ? 0.0f : f2;
        float f7 = (i & 4) != 0 ? 0.0f : f3;
        float f8 = (i & 8) != 0 ? 0.0f : f4;
        modifier.getClass();
        return modifier.N(new PaddingModifier(f5, f6, f7, f8, InspectableValueKt.a()));
    }

    public static final float b(PaddingValues paddingValues, LayoutDirection layoutDirection) {
        paddingValues.getClass();
        layoutDirection.getClass();
        if (layoutDirection == LayoutDirection.a) {
            return paddingValues.c(layoutDirection);
        }
        return paddingValues.b(layoutDirection);
    }

    public static final float c(PaddingValues paddingValues, LayoutDirection layoutDirection) {
        paddingValues.getClass();
        layoutDirection.getClass();
        if (layoutDirection == LayoutDirection.a) {
            return paddingValues.b(layoutDirection);
        }
        return paddingValues.c(layoutDirection);
    }

    public static final Modifier d(Modifier modifier, PaddingValues paddingValues) {
        modifier.getClass();
        paddingValues.getClass();
        return modifier.N(new PaddingValuesModifier(paddingValues, InspectableValueKt.a()));
    }

    public static final Modifier e(Modifier modifier, float f) {
        modifier.getClass();
        return modifier.N(new PaddingModifier(f, f, f, f, InspectableValueKt.a()));
    }

    public static final Modifier f(Modifier modifier, float f, float f2) {
        modifier.getClass();
        return modifier.N(new PaddingModifier(f, f2, f, f2, InspectableValueKt.a()));
    }
}
