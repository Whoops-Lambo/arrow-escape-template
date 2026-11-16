package androidx.compose.foundation.interaction;

import androidx.compose.runtime.Stable;
import defpackage.fy;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/interaction/MutableInteractionSource;", "Landroidx/compose/foundation/interaction/InteractionSource;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface MutableInteractionSource extends InteractionSource {
    Object a(Interaction interaction, fy fyVar);

    boolean b(Interaction interaction);
}
