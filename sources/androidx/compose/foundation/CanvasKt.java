package androidx.compose.foundation;

import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class CanvasKt {
    public static final void a(Modifier modifier, wr0 wr0Var, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        modifier.getClass();
        wr0Var.getClass();
        ComposerImpl composerImplT = composer.t(-932836462);
        if ((i & 14) == 0) {
            if (composerImplT.l(modifier)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (composerImplT.l(wr0Var)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && composerImplT.b()) {
            composerImplT.h();
        } else {
            SpacerKt.a(composerImplT, DrawModifierKt.a(modifier, wr0Var));
        }
        RecomposeScopeImpl recomposeScopeImplT = composerImplT.T();
        if (recomposeScopeImplT == null) {
            return;
        }
        recomposeScopeImplT.d = new CanvasKt$Canvas$1(modifier, wr0Var, i);
    }
}
