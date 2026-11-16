package androidx.compose.material;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/ButtonElevation;", "", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface ButtonElevation {
    AnimationState a(boolean z, MutableInteractionSource mutableInteractionSource, Composer composer, int i);
}
