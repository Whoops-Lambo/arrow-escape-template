package androidx.compose.ui.input.key;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.platform.InspectableValueKt;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class KeyInputModifierKt {
    public static final ProvidableModifierLocal a = new ProvidableModifierLocal(KeyInputModifierKt$ModifierLocalKeyInput$1.i);

    public static final Modifier a(Modifier modifier, wr0 wr0Var) {
        modifier.getClass();
        InspectableValueKt.a();
        return InspectableValueKt.b(modifier, new KeyInputModifier(wr0Var, null));
    }
}
