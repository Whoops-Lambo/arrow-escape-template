package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class ColorsKt {
    public static final StaticProvidableCompositionLocal a = new StaticProvidableCompositionLocal(ColorsKt$LocalColors$1.i);

    public static Colors c(int i, long j, long j2, long j3) {
        long jC = (i & 1) != 0 ? ColorKt.c(4284612846L) : j;
        long jC2 = (i & 2) != 0 ? ColorKt.c(4281794739L) : j2;
        long jC3 = (i & 4) != 0 ? ColorKt.c(4278442694L) : j3;
        long jC4 = ColorKt.c(4278290310L);
        long j4 = Color.d;
        long jC5 = ColorKt.c(4289724448L);
        long j5 = Color.b;
        return new Colors(jC, jC2, jC3, jC4, j4, j4, jC5, j4, j5, j5, j5, j4, true);
    }

    public static final long a(Colors colors, long j) {
        colors.getClass();
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = colors.i;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = colors.h;
        if (Color.c(j, colors.d())) {
            return ((Color) parcelableSnapshotMutableState2.getA()).a;
        }
        if (Color.c(j, ((Color) colors.b.getA()).a)) {
            return ((Color) parcelableSnapshotMutableState2.getA()).a;
        }
        if (Color.c(j, colors.e())) {
            return ((Color) parcelableSnapshotMutableState.getA()).a;
        }
        if (Color.c(j, ((Color) colors.d.getA()).a)) {
            return ((Color) parcelableSnapshotMutableState.getA()).a;
        }
        if (Color.c(j, colors.a())) {
            return ((Color) colors.j.getA()).a;
        }
        if (Color.c(j, colors.f())) {
            return colors.c();
        }
        if (Color.c(j, colors.b())) {
            return ((Color) colors.l.getA()).a;
        }
        return Color.i;
    }

    public static final long b(long j, Composer composer) {
        long jA = a(MaterialTheme.a(composer), j);
        if (jA != Color.i) {
            return jA;
        }
        return ((Color) composer.v(ContentColorKt.a)).a;
    }
}
