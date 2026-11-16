package androidx.compose.material;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.state.ToggleableState;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/CheckboxColors;", "", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface CheckboxColors {
    State a(boolean z, ToggleableState toggleableState, Composer composer);

    AnimationState b(ToggleableState toggleableState, Composer composer);

    State c(boolean z, ToggleableState toggleableState, Composer composer);
}
