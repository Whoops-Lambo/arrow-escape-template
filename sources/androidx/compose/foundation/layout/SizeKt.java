package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.DpSize;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation-layout_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class SizeKt {
    public static final FillModifier a;
    public static final FillModifier b;
    public static final FillModifier c;
    public static final WrapContentModifier d;
    public static final WrapContentModifier e;

    static {
        SizeKt$createFillWidthModifier$1 sizeKt$createFillWidthModifier$1 = new SizeKt$createFillWidthModifier$1(1);
        Direction direction = Direction.b;
        a = new FillModifier(direction, sizeKt$createFillWidthModifier$1);
        SizeKt$createFillHeightModifier$1 sizeKt$createFillHeightModifier$1 = new SizeKt$createFillHeightModifier$1(1);
        Direction direction2 = Direction.a;
        b = new FillModifier(direction2, sizeKt$createFillHeightModifier$1);
        c = new FillModifier(Direction.c, new SizeKt$createFillSizeModifier$1(1));
        BiasAlignment.Horizontal horizontal = Alignment.Companion.m;
        new WrapContentModifier(direction, new SizeKt$createWrapContentWidthModifier$1(horizontal), horizontal, new SizeKt$createWrapContentWidthModifier$2(horizontal));
        BiasAlignment.Horizontal horizontal2 = Alignment.Companion.l;
        new WrapContentModifier(direction, new SizeKt$createWrapContentWidthModifier$1(horizontal2), horizontal2, new SizeKt$createWrapContentWidthModifier$2(horizontal2));
        BiasAlignment.Vertical vertical = Alignment.Companion.k;
        new WrapContentModifier(direction2, new SizeKt$createWrapContentHeightModifier$1(vertical), vertical, new SizeKt$createWrapContentHeightModifier$2(vertical));
        BiasAlignment.Vertical vertical2 = Alignment.Companion.j;
        new WrapContentModifier(direction2, new SizeKt$createWrapContentHeightModifier$1(vertical2), vertical2, new SizeKt$createWrapContentHeightModifier$2(vertical2));
        d = a(Alignment.Companion.e);
        e = a(Alignment.Companion.a);
    }

    public static final WrapContentModifier a(Alignment alignment) {
        return new WrapContentModifier(Direction.c, new SizeKt$createWrapContentSizeModifier$1(alignment), alignment, new SizeKt$createWrapContentSizeModifier$2(alignment));
    }

    public static Modifier g(Modifier modifier, float f, float f2, int i) {
        float f3 = (i & 1) != 0 ? Float.NaN : f;
        float f4 = (i & 2) != 0 ? Float.NaN : f2;
        modifier.getClass();
        return modifier.N(new SizeModifier(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, true, InspectableValueKt.a(), 5));
    }

    public static /* synthetic */ Modifier m(Modifier modifier, float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = Float.NaN;
        }
        if ((i & 2) != 0) {
            f2 = Float.NaN;
        }
        if ((i & 4) != 0) {
            f3 = Float.NaN;
        }
        if ((i & 8) != 0) {
            f4 = Float.NaN;
        }
        return l(modifier, f, f2, f3, f4);
    }

    public static Modifier o(Modifier modifier, float f, float f2, int i) {
        float f3 = (i & 1) != 0 ? Float.NaN : f;
        float f4 = (i & 2) != 0 ? Float.NaN : f2;
        modifier.getClass();
        return modifier.N(new SizeModifier(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true, InspectableValueKt.a(), 10));
    }

    public static final Modifier b(Modifier modifier, float f, float f2) {
        modifier.getClass();
        return modifier.N(new UnspecifiedConstraintsModifier(f, f2, InspectableValueKt.a()));
    }

    public static Modifier d(Modifier modifier) {
        modifier.getClass();
        return modifier.N(c);
    }

    public static Modifier e(Modifier modifier) {
        modifier.getClass();
        return modifier.N(a);
    }

    public static final Modifier f(Modifier modifier, float f) {
        modifier.getClass();
        return modifier.N(new SizeModifier(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, true, InspectableValueKt.a(), 5));
    }

    public static final Modifier h(Modifier modifier, float f) {
        modifier.getClass();
        return modifier.N(new SizeModifier(f, f, f, f, false, InspectableValueKt.a()));
    }

    public static final Modifier i(Modifier modifier, float f) {
        modifier.getClass();
        return modifier.N(new SizeModifier(f, f, f, f, true, InspectableValueKt.a()));
    }

    public static final Modifier j(Modifier modifier, long j) {
        modifier.getClass();
        return k(modifier, DpSize.b(j), DpSize.a(j));
    }

    public static final Modifier k(Modifier modifier, float f, float f2) {
        modifier.getClass();
        return modifier.N(new SizeModifier(f, f2, f, f2, true, InspectableValueKt.a()));
    }

    public static final Modifier l(Modifier modifier, float f, float f2, float f3, float f4) {
        modifier.getClass();
        return modifier.N(new SizeModifier(f, f2, f3, f4, true, InspectableValueKt.a()));
    }

    public static final Modifier n(Modifier modifier, float f) {
        modifier.getClass();
        return modifier.N(new SizeModifier(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true, InspectableValueKt.a(), 10));
    }

    public static Modifier p(Modifier modifier, BiasAlignment biasAlignment) {
        WrapContentModifier wrapContentModifierA;
        modifier.getClass();
        if (biasAlignment.equals(Alignment.Companion.e)) {
            wrapContentModifierA = d;
        } else if (biasAlignment.equals(Alignment.Companion.a)) {
            wrapContentModifierA = e;
        } else {
            wrapContentModifierA = a(biasAlignment);
        }
        return modifier.N(wrapContentModifierA);
    }
}
