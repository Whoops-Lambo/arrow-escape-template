package androidx.compose.runtime;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred
@InternalComposeApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/MovableContentStateReference;", "", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class MovableContentStateReference {
    public final MovableContent a;
    public final Object b;
    public final CompositionImpl c;
    public final SlotTable d;
    public final Anchor e;
    public final List f;
    public final PersistentMap g;

    public MovableContentStateReference(MovableContent movableContent, Object obj, CompositionImpl compositionImpl, SlotTable slotTable, Anchor anchor, List list, PersistentMap persistentMap) {
        movableContent.getClass();
        slotTable.getClass();
        persistentMap.getClass();
        this.a = movableContent;
        this.b = obj;
        this.c = compositionImpl;
        this.d = slotTable;
        this.e = anchor;
        this.f = list;
        this.g = persistentMap;
    }
}
