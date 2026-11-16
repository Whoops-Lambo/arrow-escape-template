package androidx.compose.material;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/TextFieldDefaults;", "", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class TextFieldDefaults {
    public static final TextFieldDefaults a = new TextFieldDefaults();

    public final void a(boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, float f, float f2, Composer composer, int i, int i2) {
        int i3;
        Shape shape2;
        int i4;
        Shape shape3;
        float f3;
        float f4;
        float f5;
        Shape shape4;
        float f6;
        interactionSource.getClass();
        ComposerImpl composerImplT = composer.t(943754022);
        if ((i & 14) == 0) {
            i3 = (composerImplT.m(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            i3 |= composerImplT.m(z2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i3 |= composerImplT.l(interactionSource) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i3 |= composerImplT.l(textFieldColors) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            if ((i2 & 16) == 0) {
                shape2 = shape;
                int i5 = composerImplT.l(shape2) ? 16384 : 8192;
                i3 |= i5;
            } else {
                shape2 = shape;
            }
            i3 |= i5;
        } else {
            shape2 = shape;
        }
        if ((458752 & i) == 0) {
            i3 |= 65536;
        }
        if ((3670016 & i) == 0) {
            i3 |= 524288;
        }
        if ((29360128 & i) == 0) {
            i3 |= composerImplT.l(this) ? 8388608 : 4194304;
        }
        if ((23967451 & i3) == 4793490 && composerImplT.b()) {
            composerImplT.h();
            f5 = f2;
            shape4 = shape2;
            f6 = f;
        } else {
            composerImplT.r0();
            if ((i & 1) == 0 || composerImplT.X()) {
                if ((i2 & 16) != 0) {
                    shape2 = MaterialTheme.b(composerImplT).a;
                    i3 &= -57345;
                }
                Shape shape5 = shape2;
                i4 = i3 & (-4128769);
                shape3 = shape5;
                f3 = 2.0f;
                f4 = 1.0f;
            } else {
                composerImplT.h();
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                Shape shape6 = shape2;
                i4 = i3 & (-4128769);
                shape3 = shape6;
                f3 = f;
                f4 = f2;
            }
            composerImplT.S();
            BoxKt.a(BorderKt.a((BorderStroke) TextFieldDefaultsKt.a(z, z2, interactionSource, textFieldColors, f3, f4, composerImplT, i4 & 8190).getA(), shape3), composerImplT, 0);
            f5 = f4;
            shape4 = shape3;
            f6 = f3;
        }
        RecomposeScopeImpl recomposeScopeImplT = composerImplT.T();
        if (recomposeScopeImplT == null) {
            return;
        }
        recomposeScopeImplT.d = new TextFieldDefaults$BorderBox$1(this, z, z2, interactionSource, textFieldColors, shape4, f6, f5, i, i2);
    }
}
