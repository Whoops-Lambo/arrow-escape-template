package androidx.compose.foundation;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import defpackage.as0;
import defpackage.h50;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class FocusedBoundsKt$onFocusedBoundsChanged$2 extends rc1 implements as0 {
    public final /* synthetic */ wr0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusedBoundsKt$onFocusedBoundsChanged$2(wr0 wr0Var) {
        super(3);
        this.i = wr0Var;
    }

    @Override // defpackage.as0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        h50.w((Number) obj3, (Modifier) obj, composer, 1176407768);
        composer.B(1157296644);
        wr0 wr0Var = this.i;
        boolean zL = composer.l(wr0Var);
        Object objC = composer.C();
        if (zL || objC == Composer.Companion.a) {
            objC = new FocusedBoundsObserverModifier(wr0Var);
            composer.x(objC);
        }
        composer.J();
        FocusedBoundsObserverModifier focusedBoundsObserverModifier = (FocusedBoundsObserverModifier) objC;
        composer.J();
        return focusedBoundsObserverModifier;
    }
}
