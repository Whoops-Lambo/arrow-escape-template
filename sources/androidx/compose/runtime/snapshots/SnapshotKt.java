package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.SnapshotThreadLocal;
import defpackage.du;
import defpackage.e32;
import defpackage.wr0;
import defpackage.zr0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"runtime_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class SnapshotKt {
    public static final wr0 a = null;
    public static final SnapshotThreadLocal b = new SnapshotThreadLocal();
    public static final Object c = new Object();
    public static SnapshotIdSet d;
    public static int e;
    public static final SnapshotDoubleIndexHeap f;
    public static final ArrayList g;
    public static final ArrayList h;
    public static final AtomicReference i;

    public static final StateRecord l(StateRecord stateRecord, int i2, SnapshotIdSet snapshotIdSet) {
        StateRecord stateRecord2 = null;
        while (stateRecord != null) {
            int i3 = stateRecord.a;
            if (i3 != 0 && i3 <= i2 && !snapshotIdSet.d(i3) && (stateRecord2 == null || stateRecord2.a < stateRecord.a)) {
                stateRecord2 = stateRecord;
            }
            stateRecord = stateRecord.b;
        }
        if (stateRecord2 != null) {
            return stateRecord2;
        }
        return null;
    }

    static {
        SnapshotIdSet snapshotIdSet = SnapshotIdSet.e;
        d = snapshotIdSet;
        e = 1;
        SnapshotDoubleIndexHeap snapshotDoubleIndexHeap = new SnapshotDoubleIndexHeap();
        snapshotDoubleIndexHeap.b = new int[16];
        snapshotDoubleIndexHeap.c = new int[16];
        int[] iArr = new int[16];
        int i2 = 0;
        while (i2 < 16) {
            int i3 = i2 + 1;
            iArr[i2] = i3;
            i2 = i3;
        }
        snapshotDoubleIndexHeap.d = iArr;
        f = snapshotDoubleIndexHeap;
        g = new ArrayList();
        h = new ArrayList();
        int i4 = e;
        e = i4 + 1;
        GlobalSnapshot globalSnapshot = new GlobalSnapshot(i4, snapshotIdSet);
        d = d.h(globalSnapshot.b);
        AtomicReference atomicReference = new AtomicReference(globalSnapshot);
        i = atomicReference;
        Object obj = atomicReference.get();
        obj.getClass();
    }

    public static final wr0 a(wr0 wr0Var, wr0 wr0Var2) {
        if (wr0Var == null || wr0Var2 == null || wr0Var.equals(wr0Var2)) {
            return wr0Var == null ? wr0Var2 : wr0Var;
        }
        return new SnapshotKt$mergedWriteObserver$1(wr0Var, wr0Var2);
    }

    public static final void c(Snapshot snapshot) {
        if (d.d(snapshot.getB())) {
            return;
        }
        e32.i("Snapshot is not open");
    }

    public static final Object e(wr0 wr0Var) {
        Object objO;
        ArrayList arrayListB0;
        GlobalSnapshot globalSnapshot = (GlobalSnapshot) i.get();
        Object obj = c;
        synchronized (obj) {
            globalSnapshot.getClass();
            objO = o(globalSnapshot, wr0Var);
        }
        Set set = globalSnapshot.g;
        if (set != null) {
            synchronized (obj) {
                arrayListB0 = du.B0(g);
            }
            int size = arrayListB0.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((zr0) arrayListB0.get(i2)).invoke(set, globalSnapshot);
            }
        }
        return objO;
    }

    public static final Snapshot f(Snapshot snapshot, wr0 wr0Var, boolean z) {
        boolean z2 = snapshot instanceof MutableSnapshot;
        if (z2 || snapshot == null) {
            return new TransparentObserverMutableSnapshot(z2 ? (MutableSnapshot) snapshot : null, wr0Var, null, false, z);
        }
        return new TransparentObserverSnapshot(snapshot, wr0Var, z);
    }

    public static final Snapshot h() {
        Snapshot snapshot = (Snapshot) b.a();
        if (snapshot != null) {
            return snapshot;
        }
        Object obj = i.get();
        obj.getClass();
        return (Snapshot) obj;
    }

    public static final wr0 i(wr0 wr0Var, wr0 wr0Var2, boolean z) {
        if (!z) {
            wr0Var2 = null;
        }
        if (wr0Var == null || wr0Var2 == null || wr0Var.equals(wr0Var2)) {
            return wr0Var == null ? wr0Var2 : wr0Var;
        }
        return new SnapshotKt$mergedReadObserver$1(wr0Var, wr0Var2);
    }

    public static final void n(int i2) {
        int i3;
        SnapshotDoubleIndexHeap snapshotDoubleIndexHeap = f;
        int i4 = snapshotDoubleIndexHeap.d[i2];
        snapshotDoubleIndexHeap.b(i4, snapshotDoubleIndexHeap.a - 1);
        snapshotDoubleIndexHeap.a--;
        int[] iArr = snapshotDoubleIndexHeap.b;
        int i5 = iArr[i4];
        int i6 = i4;
        while (i6 > 0) {
            int i7 = ((i6 + 1) >> 1) - 1;
            if (iArr[i7] <= i5) {
                break;
            }
            snapshotDoubleIndexHeap.b(i7, i6);
            i6 = i7;
        }
        int[] iArr2 = snapshotDoubleIndexHeap.b;
        int i8 = snapshotDoubleIndexHeap.a >> 1;
        while (i4 < i8) {
            int i9 = (i4 + 1) << 1;
            int i10 = i9 - 1;
            if (i9 < snapshotDoubleIndexHeap.a && (i3 = iArr2[i9]) < iArr2[i10]) {
                if (i3 >= iArr2[i4]) {
                    break;
                }
                snapshotDoubleIndexHeap.b(i9, i4);
                i4 = i9;
            } else {
                if (iArr2[i10] >= iArr2[i4]) {
                    break;
                }
                snapshotDoubleIndexHeap.b(i10, i4);
                i4 = i10;
            }
        }
        snapshotDoubleIndexHeap.d[i2] = snapshotDoubleIndexHeap.e;
        snapshotDoubleIndexHeap.e = i2;
    }

    public static final Object o(GlobalSnapshot globalSnapshot, wr0 wr0Var) {
        Object objInvoke = wr0Var.invoke(d.c(globalSnapshot.b));
        synchronized (c) {
            int i2 = e;
            e = i2 + 1;
            SnapshotIdSet snapshotIdSetC = d.c(globalSnapshot.b);
            d = snapshotIdSetC;
            i.set(new GlobalSnapshot(i2, snapshotIdSetC));
            globalSnapshot.c();
            d = d.h(i2);
        }
        return objInvoke;
    }

    public static final HashMap b(MutableSnapshot mutableSnapshot, MutableSnapshot mutableSnapshot2, SnapshotIdSet snapshotIdSet) {
        StateRecord stateRecordL;
        Set<StateObject> setU = mutableSnapshot2.getG();
        int b2 = mutableSnapshot.getB();
        if (setU != null) {
            SnapshotIdSet snapshotIdSetE = mutableSnapshot2.getA().h(mutableSnapshot2.getB()).e(mutableSnapshot2.h);
            HashMap map = null;
            for (StateObject stateObject : setU) {
                StateRecord stateRecordH = stateObject.h();
                StateRecord stateRecordL2 = l(stateRecordH, b2, snapshotIdSet);
                if (stateRecordL2 != null && (stateRecordL = l(stateRecordH, b2, snapshotIdSetE)) != null && !stateRecordL2.equals(stateRecordL)) {
                    StateRecord stateRecordL3 = l(stateRecordH, mutableSnapshot2.getB(), mutableSnapshot2.getA());
                    if (stateRecordL3 != null) {
                        StateRecord stateRecordD = stateObject.d(stateRecordL, stateRecordL2, stateRecordL3);
                        if (stateRecordD != null) {
                            if (map == null) {
                                map = new HashMap();
                            }
                            map.put(stateRecordL2, stateRecordD);
                            map = map;
                        }
                    } else {
                        e32.i("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
                        return null;
                    }
                }
            }
            return map;
        }
        return null;
    }

    public static final SnapshotIdSet d(SnapshotIdSet snapshotIdSet, int i2, int i3) {
        snapshotIdSet.getClass();
        while (i2 < i3) {
            snapshotIdSet = snapshotIdSet.h(i2);
            i2++;
        }
        return snapshotIdSet;
    }

    public static final StateRecord g(StateRecord stateRecord, Snapshot snapshot) {
        stateRecord.getClass();
        StateRecord stateRecordL = l(stateRecord, snapshot.getB(), snapshot.getA());
        if (stateRecordL != null) {
            return stateRecordL;
        }
        e32.i("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
        return null;
    }

    public static final StateRecord j(StateRecord stateRecord, StateObject stateObject) {
        stateRecord.getClass();
        stateObject.getClass();
        int i2 = e;
        SnapshotDoubleIndexHeap snapshotDoubleIndexHeap = f;
        if (snapshotDoubleIndexHeap.a > 0) {
            i2 = snapshotDoubleIndexHeap.b[0];
        }
        int i3 = i2 - 1;
        StateRecord stateRecord2 = null;
        StateRecord stateRecord3 = null;
        for (StateRecord stateRecordH = stateObject.h(); stateRecordH != null; stateRecordH = stateRecordH.b) {
            int i4 = stateRecordH.a;
            if (i4 != 0) {
                if (i4 != 0 && i4 <= i3 && !SnapshotIdSet.e.d(i4)) {
                    if (stateRecord3 == null) {
                        stateRecord3 = stateRecordH;
                    } else {
                        if (stateRecordH.a >= stateRecord3.a) {
                            stateRecord2 = stateRecord3;
                            break;
                        }
                        break;
                    }
                }
            }
            stateRecord2 = stateRecordH;
            break;
        }
        if (stateRecord2 != null) {
            stateRecord2.a = Integer.MAX_VALUE;
            return stateRecord2;
        }
        StateRecord stateRecordB = stateRecord.b();
        stateRecordB.a = Integer.MAX_VALUE;
        stateRecordB.b = stateObject.h();
        stateObject.c(stateRecordB);
        return stateRecordB;
    }

    public static final void k(Snapshot snapshot, StateObject stateObject) {
        stateObject.getClass();
        wr0 wr0VarH = snapshot.getF();
        if (wr0VarH != null) {
            wr0VarH.invoke(stateObject);
        }
    }

    public static final StateRecord m(StateRecord stateRecord, StateObject stateObject, Snapshot snapshot) {
        stateRecord.getClass();
        wr0 wr0VarF = snapshot.getG();
        if (wr0VarF != null) {
            wr0VarF.invoke(stateObject);
        }
        StateRecord stateRecordL = l(stateRecord, snapshot.getB(), snapshot.getA());
        if (stateRecordL != null) {
            return stateRecordL;
        }
        e32.i("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
        return null;
    }

    public static final StateRecord p(StateRecord stateRecord, StateObject stateObject, Snapshot snapshot) {
        stateRecord.getClass();
        stateObject.getClass();
        if (snapshot.g()) {
            snapshot.m(stateObject);
        }
        StateRecord stateRecordL = l(stateRecord, snapshot.getB(), snapshot.getA());
        if (stateRecordL != null) {
            if (stateRecordL.a == snapshot.getB()) {
                return stateRecordL;
            }
            StateRecord stateRecordJ = j(stateRecordL, stateObject);
            stateRecordJ.a(stateRecordL);
            stateRecordJ.a = snapshot.getB();
            snapshot.m(stateObject);
            return stateRecordJ;
        }
        e32.i("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
        return null;
    }
}
