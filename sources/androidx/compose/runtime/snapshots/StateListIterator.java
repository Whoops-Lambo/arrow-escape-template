package androidx.compose.runtime.snapshots;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.bc1;
import defpackage.d;
import java.util.ListIterator;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/snapshots/StateListIterator;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class StateListIterator<T> implements ListIterator<T>, bc1 {
    public final SnapshotStateList a;
    public int b;
    public int c;

    public final void a() {
        if (this.a.e() == this.c) {
            return;
        }
        d.o();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.size() - 1;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b >= 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b + 1;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b;
    }

    public StateListIterator(SnapshotStateList snapshotStateList, int i) {
        this.a = snapshotStateList;
        this.b = i - 1;
        this.c = snapshotStateList.e();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i = this.b + 1;
        SnapshotStateList snapshotStateList = this.a;
        snapshotStateList.add(i, obj);
        this.b++;
        this.c = snapshotStateList.e();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        int i = this.b + 1;
        SnapshotStateList snapshotStateList = this.a;
        SnapshotStateListKt.a(i, snapshotStateList.size());
        Object obj = snapshotStateList.get(i);
        this.b = i;
        return obj;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        int i = this.b;
        SnapshotStateList snapshotStateList = this.a;
        SnapshotStateListKt.a(i, snapshotStateList.size());
        Object obj = snapshotStateList.get(this.b);
        this.b--;
        return obj;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.b;
        SnapshotStateList snapshotStateList = this.a;
        snapshotStateList.remove(i);
        this.b--;
        this.c = snapshotStateList.e();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i = this.b;
        SnapshotStateList snapshotStateList = this.a;
        snapshotStateList.set(i, obj);
        this.c = snapshotStateList.e();
    }
}
