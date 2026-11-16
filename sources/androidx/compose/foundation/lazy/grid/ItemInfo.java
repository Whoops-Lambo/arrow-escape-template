package androidx.compose.foundation.lazy.grid;

import androidx.compose.ui.unit.IntOffset;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/grid/ItemInfo;", "", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class ItemInfo {
    public int a;
    public int b;
    public long c = IntOffset.b;
    public final ArrayList d = new ArrayList();

    public ItemInfo(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
