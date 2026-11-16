package androidx.compose.foundation.selection;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.Clickable_androidKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.state.ToggleableState;
import defpackage.as0;
import defpackage.rc1;
import defpackage.sr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class ToggleableKt$toggleableImpl$1 extends rc1 implements as0 {
    public final /* synthetic */ sr0 i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ MutableInteractionSource k;
    public final /* synthetic */ Indication l;
    public final /* synthetic */ Role m;
    public final /* synthetic */ ToggleableState n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToggleableKt$toggleableImpl$1(sr0 sr0Var, boolean z, MutableInteractionSource mutableInteractionSource, Indication indication, Role role, ToggleableState toggleableState) {
        super(3);
        this.i = sr0Var;
        this.j = z;
        this.k = mutableInteractionSource;
        this.l = indication;
        this.m = role;
        this.n = toggleableState;
    }

    @Override // defpackage.as0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Modifier modifier = (Modifier) obj;
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        modifier.getClass();
        composer.B(2121285826);
        composer.B(-492369756);
        Object objC = composer.C();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.a;
        if (objC == composer$Companion$Empty$1) {
            objC = SnapshotStateKt.c(null, StructuralEqualityPolicy.a);
            composer.x(objC);
        }
        composer.J();
        MutableState mutableState = (MutableState) objC;
        Role role = this.m;
        ToggleableState toggleableState = this.n;
        boolean z = this.j;
        sr0 sr0Var = this.i;
        ToggleableKt$toggleableImpl$1$semantics$1 toggleableKt$toggleableImpl$1$semantics$1 = new ToggleableKt$toggleableImpl$1$semantics$1(role, toggleableState, z, sr0Var);
        Modifier.Companion companion = Modifier.Companion.a;
        Modifier modifierA = SemanticsModifierKt.a(companion, true, toggleableKt$toggleableImpl$1$semantics$1);
        MutableState mutableStateI = SnapshotStateKt.i(sr0Var, composer);
        composer.B(-2134919160);
        MutableInteractionSource mutableInteractionSource = this.k;
        if (z) {
            ClickableKt.a(mutableInteractionSource, mutableState, composer, 48);
        }
        composer.J();
        sr0 sr0VarA = Clickable_androidKt.a(composer);
        composer.B(-492369756);
        Object objC2 = composer.C();
        if (objC2 == composer$Companion$Empty$1) {
            objC2 = SnapshotStateKt.c(Boolean.TRUE, StructuralEqualityPolicy.a);
            composer.x(objC2);
        }
        composer.J();
        final MutableState mutableState2 = (MutableState) objC2;
        MutableState mutableStateI2 = SnapshotStateKt.i(new ToggleableKt$toggleableImpl$1$delayPressInteraction$1(mutableState2, sr0VarA), composer);
        Modifier modifierB = SuspendingPointerInputFilterKt.b(companion, mutableInteractionSource, Boolean.valueOf(z), new ToggleableKt$toggleableImpl$1$gestures$1(this.j, this.k, mutableState, mutableStateI2, mutableStateI, null));
        composer.B(-492369756);
        Object objC3 = composer.C();
        if (objC3 == composer$Companion$Empty$1) {
            objC3 = new ModifierLocalConsumer() { // from class: androidx.compose.foundation.selection.ToggleableKt$toggleableImpl$1$1$1
                @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
                public final void s0(ModifierLocalReadScope modifierLocalReadScope) {
                    mutableState2.setValue(modifierLocalReadScope.a(ScrollableKt.b));
                }
            };
            composer.x(objC3);
        }
        composer.J();
        Modifier modifierN = FocusableKt.c(mutableInteractionSource, HoverableKt.a(mutableInteractionSource, IndicationKt.a(modifier.N((Modifier) objC3).N(modifierA), mutableInteractionSource, this.l), z), z).N(modifierB);
        composer.J();
        return modifierN;
    }
}
