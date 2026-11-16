package androidx.compose.material.ripple;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/ripple/DebugRippleTheme;", "Landroidx/compose/material/ripple/RippleTheme;", "material-ripple_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class DebugRippleTheme implements RippleTheme {
    public static final DebugRippleTheme a = new DebugRippleTheme();

    @Override // androidx.compose.material.ripple.RippleTheme
    public final long a(Composer composer) {
        composer.B(2042140174);
        long j = Color.b;
        ColorKt.f(j);
        composer.J();
        return j;
    }

    @Override // androidx.compose.material.ripple.RippleTheme
    public final RippleAlpha b(Composer composer) {
        RippleAlpha rippleAlpha;
        composer.B(-1629816343);
        if (ColorKt.f(Color.b) > 0.5d) {
            rippleAlpha = RippleThemeKt.b;
        } else {
            rippleAlpha = RippleThemeKt.c;
        }
        composer.J();
        return rippleAlpha;
    }
}
