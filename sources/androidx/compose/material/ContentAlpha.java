package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/ContentAlpha;", "", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ContentAlpha {
    public static float a(float f, float f2, Composer composer) {
        composer.B(-1528360391);
        long j = ((Color) composer.v(ContentColorKt.a)).a;
        if (!MaterialTheme.a(composer).g() ? ColorKt.f(j) >= 0.5d : ColorKt.f(j) <= 0.5d) {
            f = f2;
        }
        composer.J();
        return f;
    }

    public static float b(Composer composer) {
        composer.B(621183615);
        float fA = a(0.38f, 0.38f, composer);
        composer.J();
        return fA;
    }

    public static float c(Composer composer) {
        composer.B(629162431);
        float fA = a(1.0f, 0.87f, composer);
        composer.J();
        return fA;
    }

    public static float d(Composer composer) {
        composer.B(1999054879);
        float fA = a(0.74f, 0.6f, composer);
        composer.J();
        return fA;
    }
}
