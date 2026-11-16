package androidx.compose.ui.focus;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class FocusModifierKt {
    public static final ProvidableModifierLocal a = new ProvidableModifierLocal(FocusModifierKt$ModifierLocalParentFocusModifier$1.i);
    public static final Modifier b = new FocusModifierKt$ResetFocusModifierLocals$1().N(new FocusModifierKt$ResetFocusModifierLocals$2()).N(new FocusModifierKt$ResetFocusModifierLocals$3());

    public static final Modifier a(Modifier modifier) {
        modifier.getClass();
        return ComposedModifierKt.a(modifier, InspectableValueKt.a(), FocusModifierKt$focusTarget$2.i);
    }
}
