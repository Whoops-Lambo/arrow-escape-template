package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/TextFieldColors;", "", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface TextFieldColors {
    State b(boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i);

    MutableState c(boolean z, Composer composer);

    MutableState d(boolean z, boolean z2, Composer composer);

    MutableState e(boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i);

    MutableState g(boolean z, boolean z2, Composer composer);
}
