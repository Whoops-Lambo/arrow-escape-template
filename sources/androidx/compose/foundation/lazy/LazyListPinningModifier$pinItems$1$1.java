package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.PinnableParent;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/lazy/LazyListPinningModifier$pinItems$1$1", "Landroidx/compose/foundation/lazy/layout/PinnableParent$PinnedItemsHandle;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LazyListPinningModifier$pinItems$1$1 implements PinnableParent.PinnedItemsHandle {
    public final PinnableParent.PinnedItemsHandle a;
    public final LazyListBeyondBoundsInfo.Interval b;
    public final /* synthetic */ LazyListPinningModifier c;
    public final /* synthetic */ LazyListBeyondBoundsInfo d;

    @Override // androidx.compose.foundation.lazy.layout.PinnableParent.PinnedItemsHandle
    public final void a() {
        this.b.getClass();
        throw null;
    }

    public LazyListPinningModifier$pinItems$1$1(LazyListPinningModifier lazyListPinningModifier, LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo) {
        PinnableParent.PinnedItemsHandle pinnedItemsHandleB;
        this.c = lazyListPinningModifier;
        this.d = lazyListBeyondBoundsInfo;
        PinnableParent pinnableParent = lazyListPinningModifier.a;
        if (pinnableParent != null) {
            pinnedItemsHandleB = pinnableParent.b();
        } else {
            pinnedItemsHandleB = null;
        }
        this.a = pinnedItemsHandleB;
        throw null;
    }
}
