package androidx.compose.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.focus.FocusRequesterModifier;
import androidx.compose.ui.focus.FocusRequesterModifierLocal;
import defpackage.as0;
import defpackage.rc1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/focus/FocusRequesterModifierLocal;", "mod", "Landroidx/compose/ui/focus/FocusRequesterModifier;", "invoke", "(Landroidx/compose/ui/focus/FocusRequesterModifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/focus/FocusRequesterModifierLocal;"}, k = 3, mv = {1, 6, 0}, xi = 48)
public final class ComposedModifierKt$WrapFocusRequesterModifier$1 extends rc1 implements as0 {
    public static final ComposedModifierKt$WrapFocusRequesterModifier$1 i = new ComposedModifierKt$WrapFocusRequesterModifier$1(3);

    @Override // defpackage.as0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FocusRequesterModifier focusRequesterModifier = (FocusRequesterModifier) obj;
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        focusRequesterModifier.getClass();
        composer.B(945678692);
        composer.B(1157296644);
        boolean zL = composer.l(focusRequesterModifier);
        Object objC = composer.C();
        if (zL || objC == Composer.Companion.a) {
            objC = new FocusRequesterModifierLocal(focusRequesterModifier.x());
            composer.x(objC);
        }
        composer.J();
        FocusRequesterModifierLocal focusRequesterModifierLocal = (FocusRequesterModifierLocal) objC;
        composer.J();
        return focusRequesterModifierLocal;
    }
}
