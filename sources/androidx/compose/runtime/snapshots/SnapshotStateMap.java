package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import defpackage.fc1;
import defpackage.s71;
import defpackage.wr0;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Stable
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "K", "V", "", "Landroidx/compose/runtime/snapshots/StateObject;", "StateMapStateRecord", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SnapshotStateMap<K, V> implements Map<K, V>, StateObject, fc1 {
    public StateMapStateRecord a = new StateMapStateRecord(PersistentHashMap.c);
    public final Set b = new SnapshotMapEntrySet(this);
    public final Set c = new SnapshotMapKeySet(this);
    public final Collection d = new SnapshotMapValueSet(this);

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord;", "K", "V", "Landroidx/compose/runtime/snapshots/StateRecord;", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class StateMapStateRecord<K, V> extends StateRecord {
        public PersistentMap c;
        public int d;

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final StateRecord b() {
            return new StateMapStateRecord(this.c);
        }

        public StateMapStateRecord(PersistentMap persistentMap) {
            persistentMap.getClass();
            this.c = persistentMap;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final void a(StateRecord stateRecord) {
            stateRecord.getClass();
            StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) stateRecord;
            synchronized (SnapshotStateMapKt.a) {
                this.c = stateMapStateRecord.c;
                this.d = stateMapStateRecord.d;
            }
        }

        public final void c(PersistentMap persistentMap) {
            persistentMap.getClass();
            this.c = persistentMap;
        }
    }

    public final StateMapStateRecord a() {
        StateMapStateRecord stateMapStateRecord = this.a;
        wr0 wr0Var = SnapshotKt.a;
        stateMapStateRecord.getClass();
        return (StateMapStateRecord) SnapshotKt.m(stateMapStateRecord, this, SnapshotKt.h());
    }

    @Override // java.util.Map
    public final void clear() {
        Snapshot snapshotH;
        StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.g(this.a, SnapshotKt.h());
        PersistentHashMap persistentHashMap = PersistentHashMap.c;
        if (persistentHashMap != stateMapStateRecord.c) {
            synchronized (SnapshotStateMapKt.a) {
                StateMapStateRecord stateMapStateRecord2 = this.a;
                synchronized (SnapshotKt.c) {
                    snapshotH = SnapshotKt.h();
                    StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) SnapshotKt.p(stateMapStateRecord2, this, snapshotH);
                    stateMapStateRecord3.c(persistentHashMap);
                    stateMapStateRecord3.d++;
                }
                SnapshotKt.k(snapshotH, this);
            }
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.b;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final StateRecord h() {
        return this.a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.c;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        PersistentMap persistentMap;
        int i;
        V vPut;
        Snapshot snapshotH;
        boolean z;
        do {
            Object obj3 = SnapshotStateMapKt.a;
            synchronized (obj3) {
                StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.g(this.a, SnapshotKt.h());
                persistentMap = stateMapStateRecord.c;
                i = stateMapStateRecord.d;
            }
            persistentMap.getClass();
            PersistentMap.Builder builder = persistentMap.builder();
            vPut = builder.put(obj, obj2);
            PersistentMap persistentMapBuild = builder.build();
            if (s71.b(persistentMapBuild, persistentMap)) {
                break;
            }
            synchronized (obj3) {
                StateMapStateRecord stateMapStateRecord2 = this.a;
                synchronized (SnapshotKt.c) {
                    snapshotH = SnapshotKt.h();
                    StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) SnapshotKt.p(stateMapStateRecord2, this, snapshotH);
                    if (stateMapStateRecord3.d == i) {
                        stateMapStateRecord3.c(persistentMapBuild);
                        z = true;
                        stateMapStateRecord3.d++;
                    } else {
                        z = false;
                    }
                }
                SnapshotKt.k(snapshotH, this);
            }
        } while (!z);
        return vPut;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        PersistentMap persistentMap;
        int i;
        V vRemove;
        Snapshot snapshotH;
        boolean z;
        do {
            Object obj2 = SnapshotStateMapKt.a;
            synchronized (obj2) {
                StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.g(this.a, SnapshotKt.h());
                persistentMap = stateMapStateRecord.c;
                i = stateMapStateRecord.d;
            }
            persistentMap.getClass();
            PersistentMap.Builder builder = persistentMap.builder();
            vRemove = builder.remove(obj);
            PersistentMap persistentMapBuild = builder.build();
            if (s71.b(persistentMapBuild, persistentMap)) {
                break;
            }
            synchronized (obj2) {
                StateMapStateRecord stateMapStateRecord2 = this.a;
                synchronized (SnapshotKt.c) {
                    snapshotH = SnapshotKt.h();
                    StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) SnapshotKt.p(stateMapStateRecord2, this, snapshotH);
                    if (stateMapStateRecord3.d == i) {
                        stateMapStateRecord3.c(persistentMapBuild);
                        z = true;
                        stateMapStateRecord3.d++;
                    } else {
                        z = false;
                    }
                }
                SnapshotKt.k(snapshotH, this);
            }
        } while (!z);
        return vRemove;
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.d;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final void c(StateRecord stateRecord) {
        stateRecord.getClass();
        this.a = (StateMapStateRecord) stateRecord;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return a().c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return a().c.containsValue(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return a().c.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return a().c.isEmpty();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0054 */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void putAll(java.util.Map r8) {
        /*
            r7 = this;
            r8.getClass()
        L3:
            java.lang.Object r0 = androidx.compose.runtime.snapshots.SnapshotStateMapKt.a
            monitor-enter(r0)
            androidx.compose.runtime.snapshots.SnapshotStateMap$StateMapStateRecord r1 = r7.a     // Catch: java.lang.Throwable -> L5b
            androidx.compose.runtime.snapshots.Snapshot r2 = androidx.compose.runtime.snapshots.SnapshotKt.h()     // Catch: java.lang.Throwable -> L5b
            androidx.compose.runtime.snapshots.StateRecord r1 = androidx.compose.runtime.snapshots.SnapshotKt.g(r1, r2)     // Catch: java.lang.Throwable -> L5b
            androidx.compose.runtime.snapshots.SnapshotStateMap$StateMapStateRecord r1 = (androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) r1     // Catch: java.lang.Throwable -> L5b
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap r2 = r1.c     // Catch: java.lang.Throwable -> L5b
            int r1 = r1.d     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r0)
            r2.getClass()
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap$Builder r3 = r2.builder()
            r3.putAll(r8)
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap r3 = r3.build()
            boolean r2 = defpackage.s71.b(r3, r2)
            if (r2 != 0) goto L5a
            monitor-enter(r0)
            androidx.compose.runtime.snapshots.SnapshotStateMap$StateMapStateRecord r2 = r7.a     // Catch: java.lang.Throwable -> L54
            java.lang.Object r4 = androidx.compose.runtime.snapshots.SnapshotKt.c     // Catch: java.lang.Throwable -> L54
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L54
            androidx.compose.runtime.snapshots.Snapshot r5 = androidx.compose.runtime.snapshots.SnapshotKt.h()     // Catch: java.lang.Throwable -> L49
            androidx.compose.runtime.snapshots.StateRecord r2 = androidx.compose.runtime.snapshots.SnapshotKt.p(r2, r7, r5)     // Catch: java.lang.Throwable -> L49
            androidx.compose.runtime.snapshots.SnapshotStateMap$StateMapStateRecord r2 = (androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) r2     // Catch: java.lang.Throwable -> L49
            int r6 = r2.d     // Catch: java.lang.Throwable -> L49
            if (r6 != r1) goto L4b
            r2.c(r3)     // Catch: java.lang.Throwable -> L49
            int r1 = r2.d     // Catch: java.lang.Throwable -> L49
            r3 = 1
            int r1 = r1 + r3
            r2.d = r1     // Catch: java.lang.Throwable -> L49
            goto L4c
        L49:
            r7 = move-exception
            goto L56
        L4b:
            r3 = 0
        L4c:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L54
            androidx.compose.runtime.snapshots.SnapshotKt.k(r5, r7)     // Catch: java.lang.Throwable -> L54
            monitor-exit(r0)
            if (r3 == 0) goto L3
            goto L5a
        L54:
            r7 = move-exception
            goto L58
        L56:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L54
            throw r7     // Catch: java.lang.Throwable -> L54
        L58:
            monitor-exit(r0)
            throw r7
        L5a:
            return
        L5b:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateMap.putAll(java.util.Map):void");
    }

    @Override // java.util.Map
    public final int size() {
        return a().c.size();
    }
}
