package androidx.compose.ui.semantics;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import defpackage.as0;
import defpackage.rc1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class SemanticsModifierKt$clearAndSetSemantics$2 extends rc1 implements as0 {
    @Override // defpackage.as0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        ((Modifier) obj).getClass();
        composer.B(1495908050);
        composer.B(-492369756);
        Object objC = composer.C();
        if (objC == Composer.Companion.a) {
            objC = Integer.valueOf(SemanticsModifierCore.c.addAndGet(1));
            composer.x(objC);
        }
        composer.J();
        SemanticsModifierCore semanticsModifierCore = new SemanticsModifierCore(((Number) objC).intValue(), false, true, null);
        composer.J();
        return semanticsModifierCore;
    }
}
