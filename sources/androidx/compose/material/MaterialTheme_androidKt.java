package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class MaterialTheme_androidKt {
    public static final void a(zr0 zr0Var, Composer composer, int i) {
        int i2;
        int i3;
        zr0Var.getClass();
        ComposerImpl composerImplT = composer.t(-1322912246);
        if ((i & 14) == 0) {
            if (composerImplT.l(zr0Var)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerImplT.b()) {
            composerImplT.h();
        } else {
            zr0Var.invoke(composerImplT, Integer.valueOf(i2 & 14));
        }
        RecomposeScopeImpl recomposeScopeImplT = composerImplT.T();
        if (recomposeScopeImplT == null) {
            return;
        }
        recomposeScopeImplT.d = new MaterialTheme_androidKt$PlatformMaterialTheme$1(zr0Var, i);
    }
}
