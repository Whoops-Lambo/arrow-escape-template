package androidx.compose.foundation.selection;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.state.ToggleableState;
import defpackage.sr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class ToggleableKt {
    public static final Modifier a(Modifier modifier, ToggleableState toggleableState, boolean z, Role role, MutableInteractionSource mutableInteractionSource, Indication indication, sr0 sr0Var) {
        return ComposedModifierKt.a(modifier, InspectableValueKt.a(), new ToggleableKt$toggleableImpl$1(sr0Var, z, mutableInteractionSource, indication, role, toggleableState));
    }
}
