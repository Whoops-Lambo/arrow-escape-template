package androidx.compose.ui;

import androidx.compose.runtime.Composer;
import defpackage.as0;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class ComposedModifierKt {
    public static final as0 a = null;
    public static final as0 b = null;

    public static final Modifier a(Modifier modifier, wr0 wr0Var, as0 as0Var) {
        modifier.getClass();
        return modifier.N(new ComposedModifier(wr0Var, as0Var));
    }

    public static final Modifier c(Composer composer, Modifier modifier) {
        composer.getClass();
        modifier.getClass();
        if (modifier.r()) {
            return modifier;
        }
        composer.B(1219399079);
        Modifier modifier2 = (Modifier) modifier.m(Modifier.Companion.a, new ComposedModifierKt$materialize$result$1(composer));
        composer.J();
        return modifier2;
    }
}
