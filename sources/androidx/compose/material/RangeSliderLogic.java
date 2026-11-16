package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/RangeSliderLogic;", "", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class RangeSliderLogic {
    public final MutableInteractionSource a;
    public final MutableInteractionSource b;
    public final State c;
    public final State d;
    public final MutableState e;

    public RangeSliderLogic(MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, State state, State state2, MutableState mutableState) {
        mutableInteractionSource.getClass();
        mutableInteractionSource2.getClass();
        state.getClass();
        state2.getClass();
        this.a = mutableInteractionSource;
        this.b = mutableInteractionSource2;
        this.c = state;
        this.d = state2;
        this.e = mutableState;
    }
}
