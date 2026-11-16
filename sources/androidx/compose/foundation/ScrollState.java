package androidx.compose.foundation;

import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import defpackage.az2;
import defpackage.dz;
import defpackage.fy;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ScrollState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "Companion", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ScrollState implements ScrollableState {
    public static final SaverKt$Saver$1 f = SaverKt.a(ScrollState$Companion$Saver$1.i, ScrollState$Companion$Saver$2.i);
    public final ParcelableSnapshotMutableState a;
    public float d;
    public final MutableInteractionSource b = InteractionSourceKt.a();
    public final ParcelableSnapshotMutableState c = SnapshotStateKt.c(Integer.MAX_VALUE, SnapshotStateKt.k());
    public final ScrollableState e = ScrollableStateKt.a(new ScrollState$scrollableState$1(this));

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/ScrollState$Companion;", "", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final float a(float f2) {
        return this.e.a(f2);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean b() {
        return this.e.b();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final Object c(MutatePriority mutatePriority, zr0 zr0Var, fy fyVar) {
        Object objC = this.e.c(mutatePriority, zr0Var, fyVar);
        return objC == dz.a ? objC : az2.a;
    }

    public final int d() {
        return ((Number) this.a.getA()).intValue();
    }

    public ScrollState(int i) {
        this.a = SnapshotStateKt.c(Integer.valueOf(i), SnapshotStateKt.k());
    }
}
