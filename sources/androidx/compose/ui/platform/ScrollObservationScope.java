package androidx.compose.ui.platform;

import androidx.compose.ui.node.OwnerScope;
import androidx.compose.ui.semantics.ScrollAxisRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/ScrollObservationScope;", "Landroidx/compose/ui/node/OwnerScope;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ScrollObservationScope implements OwnerScope {
    public final int a;
    public final List b;
    public Float c;
    public Float d;
    public ScrollAxisRange e;
    public ScrollAxisRange f;

    @Override // androidx.compose.ui.node.OwnerScope
    public final boolean isValid() {
        return this.b.contains(this);
    }

    public ScrollObservationScope(int i, ArrayList arrayList) {
        arrayList.getClass();
        this.a = i;
        this.b = arrayList;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }
}
