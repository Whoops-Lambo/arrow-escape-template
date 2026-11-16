package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class VectorComposeKt {
    public static final void b(List list, int i, String str, Brush brush, float f, Brush brush2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7, Composer composer, int i4) {
        list.getClass();
        ComposerImpl composerImplT = composer.t(-1478270750);
        composerImplT.B(1886828752);
        if (!(composerImplT.a instanceof VectorApplier)) {
            ComposablesKt.a();
            throw null;
        }
        composerImplT.t0();
        if (composerImplT.K) {
            composerImplT.E(new VectorComposeKt$Path9cdaXJ4$$inlined$ComposeNode$1());
        } else {
            composerImplT.d();
        }
        Updater.a(VectorComposeKt$Path$2$1.i, composerImplT, str);
        Updater.a(VectorComposeKt$Path$2$2.i, composerImplT, list);
        Updater.a(VectorComposeKt$Path$2$3.i, composerImplT, new PathFillType(i));
        Updater.a(VectorComposeKt$Path$2$4.i, composerImplT, brush);
        Updater.a(VectorComposeKt$Path$2$5.i, composerImplT, Float.valueOf(f));
        Updater.a(VectorComposeKt$Path$2$6.i, composerImplT, brush2);
        Updater.a(VectorComposeKt$Path$2$7.i, composerImplT, Float.valueOf(f2));
        Updater.a(VectorComposeKt$Path$2$8.i, composerImplT, Float.valueOf(f3));
        Updater.a(VectorComposeKt$Path$2$9.i, composerImplT, new StrokeJoin(i3));
        Updater.a(VectorComposeKt$Path$2$10.i, composerImplT, new StrokeCap(i2));
        Updater.a(VectorComposeKt$Path$2$11.i, composerImplT, Float.valueOf(f4));
        Updater.a(VectorComposeKt$Path$2$12.i, composerImplT, Float.valueOf(f5));
        Updater.a(VectorComposeKt$Path$2$13.i, composerImplT, Float.valueOf(f6));
        Updater.a(VectorComposeKt$Path$2$14.i, composerImplT, Float.valueOf(f7));
        composerImplT.R(true);
        composerImplT.R(false);
        RecomposeScopeImpl recomposeScopeImplT = composerImplT.T();
        if (recomposeScopeImplT == null) {
            return;
        }
        recomposeScopeImplT.d = new VectorComposeKt$Path$3(list, i, str, brush, f, brush2, f2, f3, i2, i3, f4, f5, f6, f7, i4);
    }

    public static final void a(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        ComposerImpl composerImplT = composer.t(-213417674);
        composerImplT.l(str);
        composerImplT.n(f);
        composerImplT.n(f2);
        composerImplT.n(f3);
        composerImplT.n(f4);
        composerImplT.n(f5);
        composerImplT.n(f6);
        composerImplT.n(f7);
        composerImplT.r0();
        if ((i & 1) != 0 && !composerImplT.X()) {
            composerImplT.h();
        }
        composerImplT.S();
        composerImplT.B(-548224868);
        if (composerImplT.a instanceof VectorApplier) {
            composerImplT.t0();
            if (composerImplT.K) {
                composerImplT.E(VectorComposeKt$Group$1.i);
            } else {
                composerImplT.d();
            }
            Updater.a(VectorComposeKt$Group$2$1.i, composerImplT, str);
            Updater.a(VectorComposeKt$Group$2$2.i, composerImplT, Float.valueOf(f));
            Updater.a(VectorComposeKt$Group$2$3.i, composerImplT, Float.valueOf(f2));
            Updater.a(VectorComposeKt$Group$2$4.i, composerImplT, Float.valueOf(f3));
            Updater.a(VectorComposeKt$Group$2$5.i, composerImplT, Float.valueOf(f4));
            Updater.a(VectorComposeKt$Group$2$6.i, composerImplT, Float.valueOf(f5));
            Updater.a(VectorComposeKt$Group$2$7.i, composerImplT, Float.valueOf(f6));
            Updater.a(VectorComposeKt$Group$2$8.i, composerImplT, Float.valueOf(f7));
            Updater.a(VectorComposeKt$Group$2$9.i, composerImplT, list);
            composerImplT.B(-983907633);
            composableLambdaImpl.invoke(composerImplT, 6);
            composerImplT.R(false);
            composerImplT.R(true);
            composerImplT.R(false);
            RecomposeScopeImpl recomposeScopeImplT = composerImplT.T();
            if (recomposeScopeImplT == null) {
                return;
            }
            recomposeScopeImplT.d = new VectorComposeKt$Group$4(str, f, f2, f3, f4, f5, f6, f7, list, composableLambdaImpl, i);
            return;
        }
        ComposablesKt.a();
        throw null;
    }
}
