package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import defpackage.d;
import defpackage.dt1;
import defpackage.du;
import defpackage.e32;
import defpackage.gg0;
import defpackage.wr0;
import defpackage.zr0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/snapshots/MutableSnapshot;", "Landroidx/compose/runtime/snapshots/Snapshot;", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class MutableSnapshot extends Snapshot {
    public final wr0 e;
    public final wr0 f;
    public Set g;
    public SnapshotIdSet h;
    public int[] i;
    public int j;
    public boolean k;

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean g() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void b() {
        SnapshotKt.d = SnapshotKt.d.c(getB()).a(this.h);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void c() {
        if (this.c) {
            return;
        }
        super.c();
        k(this);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: f, reason: from getter */
    public final wr0 getE() {
        return this.e;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: h, reason: from getter */
    public final wr0 getF() {
        return this.f;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void j(Snapshot snapshot) {
        this.j++;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void k(Snapshot snapshot) {
        int i = this.j;
        if (i <= 0) {
            d.r("Failed requirement.");
            return;
        }
        int i2 = i - 1;
        this.j = i2;
        if (i2 != 0 || this.k) {
            return;
        }
        Set g = getG();
        if (g != null) {
            if (this.k) {
                e32.i("Unsupported operation on a snapshot that has been applied");
                return;
            }
            x(null);
            int b = getB();
            Iterator it = g.iterator();
            while (it.hasNext()) {
                for (StateRecord stateRecordH = ((StateObject) it.next()).h(); stateRecordH != null; stateRecordH = stateRecordH.b) {
                    int i3 = stateRecordH.a;
                    if (i3 == b || du.U(this.h, Integer.valueOf(i3))) {
                        stateRecordH.a = 0;
                    }
                }
            }
        }
        a();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void l() {
        if (this.k || this.c) {
            return;
        }
        s();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void n() {
        int length = this.i.length;
        for (int i = 0; i < length; i++) {
            SnapshotKt.n(this.i[i]);
        }
        int i2 = this.d;
        if (i2 >= 0) {
            SnapshotKt.n(i2);
            this.d = -1;
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot r(wr0 wr0Var) {
        NestedReadonlySnapshot nestedReadonlySnapshot;
        if (this.c) {
            d.r("Cannot use a disposed snapshot");
            return null;
        }
        if (this.k && this.d < 0) {
            e32.i("Unsupported operation on a disposed or applied snapshot");
            return null;
        }
        int b = getB();
        w(getB());
        Object obj = SnapshotKt.c;
        synchronized (obj) {
            int i = SnapshotKt.e;
            SnapshotKt.e = i + 1;
            SnapshotKt.d = SnapshotKt.d.h(i);
            nestedReadonlySnapshot = new NestedReadonlySnapshot(i, SnapshotKt.d(getA(), b + 1, i), wr0Var, this);
        }
        if (this.k || this.c) {
            return nestedReadonlySnapshot;
        }
        int b2 = getB();
        synchronized (obj) {
            int i2 = SnapshotKt.e;
            SnapshotKt.e = i2 + 1;
            p(i2);
            SnapshotKt.d = SnapshotKt.d.h(getB());
        }
        q(SnapshotKt.d(getA(), b2 + 1, getB()));
        return nestedReadonlySnapshot;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public Set getG() {
        return this.g;
    }

    public final void w(int i) {
        synchronized (SnapshotKt.c) {
            this.h = this.h.h(i);
        }
    }

    public void x(HashSet hashSet) {
        this.g = hashSet;
    }

    public MutableSnapshot y(wr0 wr0Var, wr0 wr0Var2) {
        NestedMutableSnapshot nestedMutableSnapshot;
        if (this.c) {
            d.r("Cannot use a disposed snapshot");
            return null;
        }
        if (this.k && this.d < 0) {
            e32.i("Unsupported operation on a disposed or applied snapshot");
            return null;
        }
        w(getB());
        Object obj = SnapshotKt.c;
        synchronized (obj) {
            int i = SnapshotKt.e;
            SnapshotKt.e = i + 1;
            SnapshotKt.d = SnapshotKt.d.h(i);
            SnapshotIdSet a = getA();
            q(a.h(i));
            nestedMutableSnapshot = new NestedMutableSnapshot(i, SnapshotKt.d(a, getB() + 1, i), SnapshotKt.i(wr0Var, this.e, true), SnapshotKt.a(wr0Var2, this.f), this);
        }
        if (this.k || this.c) {
            return nestedMutableSnapshot;
        }
        int b = getB();
        synchronized (obj) {
            int i2 = SnapshotKt.e;
            SnapshotKt.e = i2 + 1;
            p(i2);
            SnapshotKt.d = SnapshotKt.d.h(getB());
        }
        q(SnapshotKt.d(getA(), b + 1, getB()));
        return nestedMutableSnapshot;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableSnapshot(int i, SnapshotIdSet snapshotIdSet, wr0 wr0Var, wr0 wr0Var2) {
        super(i, snapshotIdSet);
        snapshotIdSet.getClass();
        this.e = wr0Var;
        this.f = wr0Var2;
        this.h = SnapshotIdSet.e;
        this.i = new int[0];
        this.j = 1;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void m(StateObject stateObject) {
        stateObject.getClass();
        Set g = getG();
        HashSet hashSet = g;
        if (g == null) {
            HashSet hashSet2 = new HashSet();
            x(hashSet2);
            hashSet = hashSet2;
        }
        hashSet.add(stateObject);
    }

    public final void s() {
        w(getB());
        if (!this.k && !this.c) {
            int b = getB();
            synchronized (SnapshotKt.c) {
                int i = SnapshotKt.e;
                SnapshotKt.e = i + 1;
                p(i);
                SnapshotKt.d = SnapshotKt.d.h(getB());
            }
            q(SnapshotKt.d(getA(), b + 1, getB()));
        }
    }

    public SnapshotApplyResult t() {
        HashMap mapB;
        dt1 dt1Var;
        Set g = getG();
        if (g != null) {
            AtomicReference atomicReference = SnapshotKt.i;
            Object obj = atomicReference.get();
            obj.getClass();
            mapB = SnapshotKt.b((MutableSnapshot) obj, this, SnapshotKt.d.c(((GlobalSnapshot) atomicReference.get()).b));
        } else {
            mapB = null;
        }
        synchronized (SnapshotKt.c) {
            try {
                SnapshotKt.c(this);
                if (g != null && g.size() != 0) {
                    GlobalSnapshot globalSnapshot = (GlobalSnapshot) SnapshotKt.i.get();
                    SnapshotApplyResult snapshotApplyResultV = v(SnapshotKt.e, mapB, SnapshotKt.d.c(globalSnapshot.b));
                    if (!snapshotApplyResultV.equals(SnapshotApplyResult.Success.a)) {
                        return snapshotApplyResultV;
                    }
                    b();
                    SnapshotKt.o(globalSnapshot, SnapshotKt$emptyLambda$1.i);
                    Set set = globalSnapshot.g;
                    x(null);
                    globalSnapshot.g = null;
                    dt1Var = new dt1(du.B0(SnapshotKt.g), set);
                } else {
                    b();
                    GlobalSnapshot globalSnapshot2 = (GlobalSnapshot) SnapshotKt.i.get();
                    globalSnapshot2.getClass();
                    SnapshotKt.o(globalSnapshot2, SnapshotKt$emptyLambda$1.i);
                    Set set2 = globalSnapshot2.g;
                    if (set2 != null && !set2.isEmpty()) {
                        dt1Var = new dt1(du.B0(SnapshotKt.g), set2);
                    } else {
                        dt1Var = new dt1(gg0.a, null);
                    }
                }
                List list = (List) dt1Var.a;
                Set set3 = (Set) dt1Var.b;
                this.k = true;
                if (set3 != null && !set3.isEmpty()) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((zr0) list.get(i)).invoke(set3, this);
                    }
                }
                if (g != null && !g.isEmpty()) {
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((zr0) list.get(i2)).invoke(g, this);
                    }
                }
                synchronized (SnapshotKt.c) {
                    n();
                }
                return SnapshotApplyResult.Success.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final SnapshotApplyResult v(int i, HashMap map, SnapshotIdSet snapshotIdSet) {
        StateRecord stateRecordL;
        StateRecord stateRecordD;
        dt1 dt1Var;
        snapshotIdSet.getClass();
        SnapshotIdSet snapshotIdSetE = getA().h(getB()).e(this.h);
        Set<StateObject> g = getG();
        g.getClass();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (StateObject stateObject : g) {
            StateRecord stateRecordH = stateObject.h();
            StateRecord stateRecordL2 = SnapshotKt.l(stateRecordH, i, snapshotIdSet);
            if (stateRecordL2 != null && (stateRecordL = SnapshotKt.l(stateRecordH, getB(), snapshotIdSetE)) != null && !stateRecordL2.equals(stateRecordL)) {
                StateRecord stateRecordL3 = SnapshotKt.l(stateRecordH, getB(), getA());
                if (stateRecordL3 != null) {
                    if (map == null || (stateRecordD = (StateRecord) map.get(stateRecordL2)) == null) {
                        stateRecordD = stateObject.d(stateRecordL, stateRecordL2, stateRecordL3);
                    }
                    if (stateRecordD == null) {
                        return new SnapshotApplyResult.Failure();
                    }
                    if (!stateRecordD.equals(stateRecordL3)) {
                        if (stateRecordD.equals(stateRecordL2)) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(new dt1(stateObject, stateRecordL2.b()));
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(stateObject);
                        } else {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            if (!stateRecordD.equals(stateRecordL)) {
                                dt1Var = new dt1(stateObject, stateRecordD);
                            } else {
                                dt1Var = new dt1(stateObject, stateRecordL.b());
                            }
                            arrayList.add(dt1Var);
                        }
                    }
                } else {
                    e32.i("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
                    return null;
                }
            }
        }
        if (arrayList != null) {
            s();
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                dt1 dt1Var2 = (dt1) arrayList.get(i2);
                StateObject stateObject2 = (StateObject) dt1Var2.a;
                StateRecord stateRecord = (StateRecord) dt1Var2.b;
                stateRecord.a = getB();
                synchronized (SnapshotKt.c) {
                    stateRecord.b = stateObject2.h();
                    stateObject2.c(stateRecord);
                }
            }
        }
        if (arrayList2 != null) {
            g.removeAll(arrayList2);
        }
        return SnapshotApplyResult.Success.a;
    }
}
