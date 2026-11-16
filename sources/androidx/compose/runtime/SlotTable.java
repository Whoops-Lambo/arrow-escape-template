package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import defpackage.bc1;
import defpackage.d;
import defpackage.e32;
import defpackage.s71;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/SlotTable;", "Landroidx/compose/runtime/tooling/CompositionData;", "", "Landroidx/compose/runtime/tooling/CompositionGroup;", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SlotTable implements CompositionData, Iterable<CompositionGroup>, bc1 {
    public int b;
    public int d;
    public int e;
    public boolean f;
    public int g;
    public int[] a = new int[0];
    public Object[] c = new Object[0];
    public ArrayList h = new ArrayList();

    public final int a(Anchor anchor) {
        if (this.f) {
            ComposerKt.c("Use active SlotWriter to determine anchor location instead");
            throw null;
        }
        if (anchor.a()) {
            return anchor.a;
        }
        d.r("Anchor refers to a group that was removed");
        return 0;
    }

    public final SlotReader c() {
        if (this.f) {
            e32.i("Cannot read while a writer is pending");
            return null;
        }
        this.e++;
        return new SlotReader(this);
    }

    public final SlotWriter d() {
        if (this.f) {
            ComposerKt.c("Cannot start a writer when another writer is pending");
            throw null;
        }
        if (this.e > 0) {
            ComposerKt.c("Cannot start a writer when a reader is pending");
            throw null;
        }
        this.f = true;
        this.g++;
        return new SlotWriter(this);
    }

    @Override // java.lang.Iterable
    public final Iterator<CompositionGroup> iterator() {
        return new GroupIterator(this, 0, this.b);
    }

    public final boolean e(Anchor anchor) {
        int iJ;
        anchor.getClass();
        if (anchor.a() && (iJ = SlotTableKt.j(this.h, anchor.a, this.b)) >= 0 && s71.b(this.h.get(iJ), anchor)) {
            return true;
        }
        return false;
    }
}
