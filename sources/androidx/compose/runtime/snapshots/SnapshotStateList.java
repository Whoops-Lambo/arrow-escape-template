package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.d;
import defpackage.dc1;
import defpackage.rc1;
import defpackage.s71;
import defpackage.wr0;
import defpackage.wx;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Stable
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Landroidx/compose/runtime/snapshots/StateObject;", "StateListStateRecord", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SnapshotStateList<T> implements List<T>, StateObject, dc1 {
    public StateListStateRecord a = new StateListStateRecord(SmallPersistentVector.b);

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/snapshots/StateRecord;", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class StateListStateRecord<T> extends StateRecord {
        public PersistentList c;
        public int d;

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final StateRecord b() {
            return new StateListStateRecord(this.c);
        }

        public StateListStateRecord(PersistentList persistentList) {
            persistentList.getClass();
            this.c = persistentList;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final void a(StateRecord stateRecord) {
            stateRecord.getClass();
            synchronized (SnapshotStateListKt.a) {
                this.c = ((StateListStateRecord) stateRecord).c;
                this.d = ((StateListStateRecord) stateRecord).d;
            }
        }

        public final void c(PersistentList persistentList) {
            persistentList.getClass();
            this.c = persistentList;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.SnapshotStateList$addAll$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "it", "", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    final class AnonymousClass1 extends rc1 implements wr0 {
        public final /* synthetic */ int i;
        public final /* synthetic */ Collection j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, Collection collection) {
            super(1);
            this.i = i;
            this.j = collection;
        }

        @Override // defpackage.wr0
        public final Object invoke(Object obj) {
            List list = (List) obj;
            list.getClass();
            return Boolean.valueOf(list.addAll(this.i, this.j));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.SnapshotStateList$retainAll$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "it", "", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    final class C16211 extends rc1 implements wr0 {
        public final /* synthetic */ Collection i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16211(Collection collection) {
            super(1);
            this.i = collection;
        }

        @Override // defpackage.wr0
        public final Object invoke(Object obj) {
            List list = (List) obj;
            list.getClass();
            return Boolean.valueOf(list.retainAll(this.i));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        PersistentList persistentList;
        boolean z;
        Snapshot snapshotH;
        do {
            Object obj2 = SnapshotStateListKt.a;
            synchronized (obj2) {
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.g(this.a, SnapshotKt.h());
                i = stateListStateRecord.d;
                persistentList = stateListStateRecord.c;
            }
            persistentList.getClass();
            PersistentList persistentListAdd = persistentList.add(obj);
            z = false;
            if (persistentListAdd.equals(persistentList)) {
                return false;
            }
            synchronized (obj2) {
                StateListStateRecord stateListStateRecord2 = this.a;
                synchronized (SnapshotKt.c) {
                    snapshotH = SnapshotKt.h();
                    StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.p(stateListStateRecord2, this, snapshotH);
                    int i2 = stateListStateRecord3.d;
                    if (i2 == i) {
                        stateListStateRecord3.c = persistentListAdd;
                        stateListStateRecord3.d = i2 + 1;
                        z = true;
                    }
                }
                SnapshotKt.k(snapshotH, this);
            }
        } while (!z);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        Snapshot snapshotH;
        synchronized (SnapshotStateListKt.a) {
            StateListStateRecord stateListStateRecord = this.a;
            synchronized (SnapshotKt.c) {
                snapshotH = SnapshotKt.h();
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.p(stateListStateRecord, this, snapshotH);
                stateListStateRecord2.c(SmallPersistentVector.b);
                stateListStateRecord2.d++;
            }
            SnapshotKt.k(snapshotH, this);
        }
    }

    public final int e() {
        return ((StateListStateRecord) SnapshotKt.g(this.a, SnapshotKt.h())).d;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final StateRecord h() {
        return this.a;
    }

    public final StateListStateRecord k() {
        StateListStateRecord stateListStateRecord = this.a;
        wr0 wr0Var = SnapshotKt.a;
        stateListStateRecord.getClass();
        return (StateListStateRecord) SnapshotKt.m(stateListStateRecord, this, SnapshotKt.h());
    }

    public final boolean l(wr0 wr0Var) {
        int i;
        PersistentList persistentList;
        Object objInvoke;
        Snapshot snapshotH;
        boolean z;
        do {
            Object obj = SnapshotStateListKt.a;
            synchronized (obj) {
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.g(this.a, SnapshotKt.h());
                i = stateListStateRecord.d;
                persistentList = stateListStateRecord.c;
            }
            persistentList.getClass();
            PersistentVectorBuilder persistentVectorBuilderBuilder = persistentList.builder();
            objInvoke = wr0Var.invoke(persistentVectorBuilderBuilder);
            PersistentList persistentListK = persistentVectorBuilderBuilder.k();
            if (s71.b(persistentListK, persistentList)) {
                break;
            }
            synchronized (obj) {
                StateListStateRecord stateListStateRecord2 = this.a;
                synchronized (SnapshotKt.c) {
                    snapshotH = SnapshotKt.h();
                    StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.p(stateListStateRecord2, this, snapshotH);
                    if (stateListStateRecord3.d == i) {
                        stateListStateRecord3.c(persistentListK);
                        z = true;
                        stateListStateRecord3.d++;
                    } else {
                        z = false;
                    }
                }
                SnapshotKt.k(snapshotH, this);
            }
        } while (!z);
        return ((Boolean) objInvoke).booleanValue();
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new StateListIterator(this, 0);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i >= 0 && i <= i2 && i2 <= size()) {
            return new SubList(this, i, i2);
        }
        d.r("Failed requirement.");
        return null;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        PersistentList persistentList;
        boolean z;
        Snapshot snapshotH;
        collection.getClass();
        do {
            Object obj = SnapshotStateListKt.a;
            synchronized (obj) {
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.g(this.a, SnapshotKt.h());
                i = stateListStateRecord.d;
                persistentList = stateListStateRecord.c;
            }
            persistentList.getClass();
            PersistentList persistentListAddAll = persistentList.addAll(collection);
            z = false;
            if (s71.b(persistentListAddAll, persistentList)) {
                return false;
            }
            synchronized (obj) {
                StateListStateRecord stateListStateRecord2 = this.a;
                synchronized (SnapshotKt.c) {
                    snapshotH = SnapshotKt.h();
                    StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.p(stateListStateRecord2, this, snapshotH);
                    if (stateListStateRecord3.d == i) {
                        stateListStateRecord3.c(persistentListAddAll);
                        stateListStateRecord3.d++;
                        z = true;
                    }
                }
                SnapshotKt.k(snapshotH, this);
            }
        } while (!z);
        return true;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final void c(StateRecord stateRecord) {
        stateRecord.getClass();
        stateRecord.b = this.a;
        this.a = (StateListStateRecord) stateRecord;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return k().c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        return k().c.containsAll(collection);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return k().c.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return k().c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return k().c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return k().c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        PersistentList persistentList;
        Snapshot snapshotH;
        boolean z;
        Object obj = get(i);
        do {
            Object obj2 = SnapshotStateListKt.a;
            synchronized (obj2) {
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.g(this.a, SnapshotKt.h());
                i2 = stateListStateRecord.d;
                persistentList = stateListStateRecord.c;
            }
            persistentList.getClass();
            PersistentList persistentListN = persistentList.N(i);
            if (s71.b(persistentListN, persistentList)) {
                break;
            }
            synchronized (obj2) {
                StateListStateRecord stateListStateRecord2 = this.a;
                synchronized (SnapshotKt.c) {
                    snapshotH = SnapshotKt.h();
                    StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.p(stateListStateRecord2, this, snapshotH);
                    if (stateListStateRecord3.d == i2) {
                        stateListStateRecord3.c(persistentListN);
                        z = true;
                        stateListStateRecord3.d++;
                    } else {
                        z = false;
                    }
                }
                SnapshotKt.k(snapshotH, this);
            }
        } while (!z);
        return obj;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        PersistentList persistentList;
        boolean z;
        Snapshot snapshotH;
        collection.getClass();
        do {
            Object obj = SnapshotStateListKt.a;
            synchronized (obj) {
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.g(this.a, SnapshotKt.h());
                i = stateListStateRecord.d;
                persistentList = stateListStateRecord.c;
            }
            persistentList.getClass();
            PersistentList persistentListRemoveAll = persistentList.removeAll(collection);
            z = false;
            if (s71.b(persistentListRemoveAll, persistentList)) {
                return false;
            }
            synchronized (obj) {
                StateListStateRecord stateListStateRecord2 = this.a;
                synchronized (SnapshotKt.c) {
                    snapshotH = SnapshotKt.h();
                    StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.p(stateListStateRecord2, this, snapshotH);
                    if (stateListStateRecord3.d == i) {
                        stateListStateRecord3.c(persistentListRemoveAll);
                        stateListStateRecord3.d++;
                        z = true;
                    }
                }
                SnapshotKt.k(snapshotH, this);
            }
        } while (!z);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        return l(new C16211(collection));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        PersistentList persistentList;
        Snapshot snapshotH;
        boolean z;
        Object obj2 = get(i);
        do {
            Object obj3 = SnapshotStateListKt.a;
            synchronized (obj3) {
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.g(this.a, SnapshotKt.h());
                i2 = stateListStateRecord.d;
                persistentList = stateListStateRecord.c;
            }
            persistentList.getClass();
            PersistentList persistentList2 = persistentList.set(i, obj);
            if (persistentList2.equals(persistentList)) {
                break;
            }
            synchronized (obj3) {
                StateListStateRecord stateListStateRecord2 = this.a;
                synchronized (SnapshotKt.c) {
                    snapshotH = SnapshotKt.h();
                    StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.p(stateListStateRecord2, this, snapshotH);
                    int i3 = stateListStateRecord3.d;
                    if (i3 == i2) {
                        stateListStateRecord3.c = persistentList2;
                        stateListStateRecord3.d = i3 + 1;
                        z = true;
                    } else {
                        z = false;
                    }
                }
                SnapshotKt.k(snapshotH, this);
            }
        } while (!z);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return k().c.size();
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return wx.s(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new StateListIterator(this, i);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return wx.r(this);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0049 */
    @Override // java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void add(int r8, java.lang.Object r9) {
        /*
            r7 = this;
        L0:
            java.lang.Object r0 = androidx.compose.runtime.snapshots.SnapshotStateListKt.a
            monitor-enter(r0)
            androidx.compose.runtime.snapshots.SnapshotStateList$StateListStateRecord r1 = r7.a     // Catch: java.lang.Throwable -> L4f
            androidx.compose.runtime.snapshots.Snapshot r2 = androidx.compose.runtime.snapshots.SnapshotKt.h()     // Catch: java.lang.Throwable -> L4f
            androidx.compose.runtime.snapshots.StateRecord r1 = androidx.compose.runtime.snapshots.SnapshotKt.g(r1, r2)     // Catch: java.lang.Throwable -> L4f
            androidx.compose.runtime.snapshots.SnapshotStateList$StateListStateRecord r1 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) r1     // Catch: java.lang.Throwable -> L4f
            int r2 = r1.d     // Catch: java.lang.Throwable -> L4f
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList r1 = r1.c     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r0)
            r1.getClass()
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList r3 = r1.add(r8, r9)
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L22
            goto L48
        L22:
            monitor-enter(r0)
            androidx.compose.runtime.snapshots.SnapshotStateList$StateListStateRecord r1 = r7.a     // Catch: java.lang.Throwable -> L49
            java.lang.Object r4 = androidx.compose.runtime.snapshots.SnapshotKt.c     // Catch: java.lang.Throwable -> L49
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L49
            androidx.compose.runtime.snapshots.Snapshot r5 = androidx.compose.runtime.snapshots.SnapshotKt.h()     // Catch: java.lang.Throwable -> L3e
            androidx.compose.runtime.snapshots.StateRecord r1 = androidx.compose.runtime.snapshots.SnapshotKt.p(r1, r7, r5)     // Catch: java.lang.Throwable -> L3e
            androidx.compose.runtime.snapshots.SnapshotStateList$StateListStateRecord r1 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) r1     // Catch: java.lang.Throwable -> L3e
            int r6 = r1.d     // Catch: java.lang.Throwable -> L3e
            if (r6 != r2) goto L40
            r1.c = r3     // Catch: java.lang.Throwable -> L3e
            int r6 = r6 + 1
            r1.d = r6     // Catch: java.lang.Throwable -> L3e
            r1 = 1
            goto L41
        L3e:
            r7 = move-exception
            goto L4b
        L40:
            r1 = 0
        L41:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L49
            androidx.compose.runtime.snapshots.SnapshotKt.k(r5, r7)     // Catch: java.lang.Throwable -> L49
            monitor-exit(r0)
            if (r1 == 0) goto L0
        L48:
            return
        L49:
            r7 = move-exception
            goto L4d
        L4b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L49
            throw r7     // Catch: java.lang.Throwable -> L49
        L4d:
            monitor-exit(r0)
            throw r7
        L4f:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateList.add(int, java.lang.Object):void");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        return l(new AnonymousClass1(i, collection));
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        PersistentList persistentList;
        boolean z;
        Snapshot snapshotH;
        do {
            Object obj2 = SnapshotStateListKt.a;
            synchronized (obj2) {
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.g(this.a, SnapshotKt.h());
                i = stateListStateRecord.d;
                persistentList = stateListStateRecord.c;
            }
            persistentList.getClass();
            PersistentList persistentListRemove = persistentList.remove(obj);
            z = false;
            if (s71.b(persistentListRemove, persistentList)) {
                return false;
            }
            synchronized (obj2) {
                StateListStateRecord stateListStateRecord2 = this.a;
                synchronized (SnapshotKt.c) {
                    snapshotH = SnapshotKt.h();
                    StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.p(stateListStateRecord2, this, snapshotH);
                    if (stateListStateRecord3.d == i) {
                        stateListStateRecord3.c(persistentListRemove);
                        stateListStateRecord3.d++;
                        z = true;
                    }
                }
                SnapshotKt.k(snapshotH, this);
            }
        } while (!z);
        return true;
    }
}
