package androidx.compose.ui.input.rotary;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.focus.FocusAwareInputModifier;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.platform.InspectableValueKt;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class RotaryInputModifierKt {
    public static final ProvidableModifierLocal a = new ProvidableModifierLocal(RotaryInputModifierKt$ModifierLocalRotaryScrollParent$1.i);

    public static final Modifier a(wr0 wr0Var) {
        InspectableValueKt.a();
        return InspectableValueKt.b(Modifier.Companion.a, new FocusAwareInputModifier(new RotaryInputModifierKt$focusAwareCallback$1(wr0Var)));
    }
}
