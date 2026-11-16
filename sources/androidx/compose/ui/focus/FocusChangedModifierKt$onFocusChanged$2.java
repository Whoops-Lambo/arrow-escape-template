package androidx.compose.ui.focus;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.platform.InspectableValueKt;
import defpackage.as0;
import defpackage.az2;
import defpackage.rc1;
import defpackage.s71;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class FocusChangedModifierKt$onFocusChanged$2 extends rc1 implements as0 {
    public final /* synthetic */ wr0 i;

    /* JADX INFO: renamed from: androidx.compose.ui.focus.FocusChangedModifierKt$onFocusChanged$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    final class AnonymousClass1 extends rc1 implements wr0 {
        public final /* synthetic */ MutableState i;
        public final /* synthetic */ wr0 j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MutableState mutableState, wr0 wr0Var) {
            super(1);
            this.i = mutableState;
            this.j = wr0Var;
        }

        @Override // defpackage.wr0
        public final Object invoke(Object obj) {
            FocusState focusState = (FocusState) obj;
            focusState.getClass();
            MutableState mutableState = this.i;
            if (!s71.b(mutableState.getA(), focusState)) {
                mutableState.setValue(focusState);
                this.j.invoke(focusState);
            }
            return az2.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusChangedModifierKt$onFocusChanged$2(wr0 wr0Var) {
        super(3);
        this.i = wr0Var;
    }

    @Override // defpackage.as0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        ((Modifier) obj).getClass();
        composer.B(-1741761824);
        composer.B(-492369756);
        Object objC = composer.C();
        if (objC == Composer.Companion.a) {
            objC = SnapshotStateKt.c(null, StructuralEqualityPolicy.a);
            composer.x(objC);
        }
        composer.J();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1((MutableState) objC, this.i);
        ProvidableModifierLocal providableModifierLocal = FocusEventModifierKt.a;
        Modifier modifierA = ComposedModifierKt.a(Modifier.Companion.a, InspectableValueKt.a(), new FocusEventModifierKt$onFocusEvent$2(anonymousClass1));
        composer.J();
        return modifierA;
    }
}
