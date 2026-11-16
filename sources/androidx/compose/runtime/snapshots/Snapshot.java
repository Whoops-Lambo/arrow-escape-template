package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.SnapshotThreadLocal;
import androidx.compose.runtime.internal.StabilityInferred;
import defpackage.e32;
import defpackage.sr0;
import defpackage.wr0;
import defpackage.zr0;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/snapshots/Snapshot;", "", "Companion", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "Landroidx/compose/runtime/snapshots/ReadonlySnapshot;", "Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;", "Landroidx/compose/runtime/snapshots/TransparentObserverSnapshot;", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class Snapshot {
    public SnapshotIdSet a;
    public int b;
    public boolean c;
    public int d;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/snapshots/Snapshot$Companion;", "", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public static Snapshot a() {
            return SnapshotKt.f((Snapshot) SnapshotKt.b.a(), null, false);
        }

        public static ObserverHandle c(zr0 zr0Var) {
            wr0 wr0Var = SnapshotKt.a;
            SnapshotKt.e(SnapshotKt$emptyLambda$1.i);
            synchronized (SnapshotKt.c) {
                SnapshotKt.g.add(zr0Var);
            }
            return new Snapshot$Companion$registerApplyObserver$2(zr0Var);
        }

        public static void d(wr0 wr0Var) {
            synchronized (SnapshotKt.c) {
                SnapshotKt.h.add(wr0Var);
            }
            SnapshotKt.e(SnapshotKt$advanceGlobalSnapshot$2.i);
        }

        public static void e() {
            boolean z;
            synchronized (SnapshotKt.c) {
                Set set = ((GlobalSnapshot) SnapshotKt.i.get()).g;
                z = false;
                if (set != null && (!set.isEmpty())) {
                    z = true;
                }
            }
            if (z) {
                SnapshotKt.e(SnapshotKt$advanceGlobalSnapshot$2.i);
            }
        }

        public static Object b(sr0 sr0Var, wr0 wr0Var) {
            MutableSnapshot mutableSnapshot;
            Snapshot transparentObserverMutableSnapshot;
            sr0Var.getClass();
            Snapshot snapshot = (Snapshot) SnapshotKt.b.a();
            if (snapshot != null && !(snapshot instanceof MutableSnapshot)) {
                transparentObserverMutableSnapshot = snapshot.r(wr0Var);
            } else {
                if (snapshot instanceof MutableSnapshot) {
                    mutableSnapshot = (MutableSnapshot) snapshot;
                } else {
                    mutableSnapshot = null;
                }
                transparentObserverMutableSnapshot = new TransparentObserverMutableSnapshot(mutableSnapshot, wr0Var, null, true, false);
            }
            try {
                Snapshot snapshotI = transparentObserverMutableSnapshot.i();
                try {
                    Object objInvoke = sr0Var.invoke();
                    Snapshot.o(snapshotI);
                    transparentObserverMutableSnapshot.c();
                    return objInvoke;
                } catch (Throwable th) {
                    Snapshot.o(snapshotI);
                    throw th;
                }
            } catch (Throwable th2) {
                transparentObserverMutableSnapshot.c();
                throw th2;
            }
        }

        public static MutableSnapshot f(wr0 wr0Var, wr0 wr0Var2) {
            MutableSnapshot mutableSnapshot;
            MutableSnapshot mutableSnapshotY;
            Snapshot snapshotH = SnapshotKt.h();
            if (snapshotH instanceof MutableSnapshot) {
                mutableSnapshot = (MutableSnapshot) snapshotH;
            } else {
                mutableSnapshot = null;
            }
            if (mutableSnapshot != null && (mutableSnapshotY = mutableSnapshot.y(wr0Var, wr0Var2)) != null) {
                return mutableSnapshotY;
            }
            e32.i("Cannot create a mutable snapshot of an read-only snapshot");
            return null;
        }
    }

    public void c() {
        this.c = true;
        synchronized (SnapshotKt.c) {
            int i = this.d;
            if (i >= 0) {
                SnapshotKt.n(i);
                this.d = -1;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract wr0 getE();

    public abstract boolean g();

    /* JADX INFO: renamed from: h */
    public abstract wr0 getF();

    public abstract void j(Snapshot snapshot);

    public abstract void k(Snapshot snapshot);

    public abstract void l();

    public abstract void m(StateObject stateObject);

    public abstract Snapshot r(wr0 wr0Var);

    public static void o(Snapshot snapshot) {
        SnapshotKt.b.b(snapshot);
    }

    public final void a() {
        synchronized (SnapshotKt.c) {
            b();
            n();
        }
    }

    public void b() {
        SnapshotKt.d = SnapshotKt.d.c(getB());
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public int getB() {
        return this.b;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public SnapshotIdSet getA() {
        return this.a;
    }

    public final Snapshot i() {
        SnapshotThreadLocal snapshotThreadLocal = SnapshotKt.b;
        Snapshot snapshot = (Snapshot) snapshotThreadLocal.a();
        snapshotThreadLocal.b(this);
        return snapshot;
    }

    public void n() {
        int i = this.d;
        if (i >= 0) {
            SnapshotKt.n(i);
            this.d = -1;
        }
    }

    public void p(int i) {
        this.b = i;
    }

    public Snapshot(int i, SnapshotIdSet snapshotIdSet) {
        int iA;
        int iA2;
        this.a = snapshotIdSet;
        this.b = i;
        if (i != 0) {
            SnapshotIdSet a = getA();
            wr0 wr0Var = SnapshotKt.a;
            a.getClass();
            int i2 = a.c;
            int[] iArr = a.d;
            if (iArr != null) {
                i = iArr[0];
            } else {
                long j = a.b;
                if (j != 0) {
                    iA2 = SnapshotIdSetKt.a(j);
                } else {
                    long j2 = a.a;
                    if (j2 != 0) {
                        i2 += 64;
                        iA2 = SnapshotIdSetKt.a(j2);
                    }
                }
                i = iA2 + i2;
            }
            synchronized (SnapshotKt.c) {
                iA = SnapshotKt.f.a(i);
            }
        } else {
            iA = -1;
        }
        this.d = iA;
    }

    public void q(SnapshotIdSet snapshotIdSet) {
        snapshotIdSet.getClass();
        this.a = snapshotIdSet;
    }
}
