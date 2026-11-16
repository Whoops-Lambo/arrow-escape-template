package androidx.compose.runtime;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateRecord;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.dt1;
import defpackage.kg0;
import defpackage.sr0;
import defpackage.wr0;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/snapshots/StateObject;", "Landroidx/compose/runtime/DerivedState;", "ResultRecord", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class DerivedSnapshotState<T> implements StateObject, DerivedState<T> {
    public final sr0 a;
    public ResultRecord b = new ResultRecord();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/snapshots/StateRecord;", "Companion", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class ResultRecord<T> extends StateRecord {
        public static final Object f = new Object();
        public HashSet c;
        public Object d = f;
        public int e;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord$Companion;", "", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion {
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final StateRecord b() {
            return new ResultRecord();
        }

        public final int c(DerivedState derivedState, Snapshot snapshot) {
            HashSet<StateObject> hashSet;
            synchronized (SnapshotKt.c) {
                hashSet = this.c;
            }
            int iIdentityHashCode = 7;
            if (hashSet == null) {
                return 7;
            }
            List list = (PersistentList) SnapshotStateKt__DerivedStateKt.a.a();
            if (list == null) {
                list = SmallPersistentVector.b;
            }
            int size = list.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                ((wr0) ((dt1) list.get(i2)).a).invoke(derivedState);
            }
            try {
                for (StateObject stateObject : hashSet) {
                    StateRecord stateRecordM = SnapshotKt.m(stateObject.h(), stateObject, snapshot);
                    iIdentityHashCode = (((iIdentityHashCode * 31) + System.identityHashCode(stateRecordM)) * 31) + stateRecordM.a;
                }
                int size2 = list.size();
                while (i < size2) {
                    ((wr0) ((dt1) list.get(i)).b).invoke(derivedState);
                    i++;
                }
                return iIdentityHashCode;
            } catch (Throwable th) {
                int size3 = list.size();
                while (i < size3) {
                    ((wr0) ((dt1) list.get(i)).b).invoke(derivedState);
                    i++;
                }
                throw th;
            }
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final void a(StateRecord stateRecord) {
            stateRecord.getClass();
            ResultRecord resultRecord = (ResultRecord) stateRecord;
            this.c = resultRecord.c;
            this.d = resultRecord.d;
            this.e = resultRecord.e;
        }
    }

    @Override // androidx.compose.runtime.DerivedState
    public final Object e() {
        return g((ResultRecord) SnapshotKt.g(this.b, SnapshotKt.h()), SnapshotKt.h(), this.a).d;
    }

    @Override // androidx.compose.runtime.DerivedState
    public final Set f() {
        HashSet hashSet = g((ResultRecord) SnapshotKt.g(this.b, SnapshotKt.h()), SnapshotKt.h(), this.a).c;
        return hashSet != null ? hashSet : kg0.a;
    }

    public final ResultRecord g(ResultRecord resultRecord, Snapshot snapshot, sr0 sr0Var) {
        ResultRecord resultRecord2;
        if (resultRecord.d != ResultRecord.f && resultRecord.e == resultRecord.c(this, snapshot)) {
            return resultRecord;
        }
        Boolean bool = (Boolean) SnapshotStateKt__DerivedStateKt.b.a();
        int i = 0;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        HashSet hashSet = new HashSet();
        List list = (PersistentList) SnapshotStateKt__DerivedStateKt.a.a();
        if (list == null) {
            list = SmallPersistentVector.b;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((wr0) ((dt1) list.get(i2)).a).invoke(this);
        }
        if (!zBooleanValue) {
            try {
                SnapshotStateKt__DerivedStateKt.b.b(Boolean.TRUE);
            } catch (Throwable th) {
                int size2 = list.size();
                while (i < size2) {
                    ((wr0) ((dt1) list.get(i)).b).invoke(this);
                    i++;
                }
                throw th;
            }
        }
        Object objB = Snapshot.Companion.b(sr0Var, new DerivedSnapshotState$currentRecord$result$1$result$1(this, hashSet));
        if (!zBooleanValue) {
            SnapshotStateKt__DerivedStateKt.b.b(Boolean.FALSE);
        }
        int size3 = list.size();
        while (i < size3) {
            ((wr0) ((dt1) list.get(i)).b).invoke(this);
            i++;
        }
        synchronized (SnapshotKt.c) {
            Snapshot snapshotH = SnapshotKt.h();
            ResultRecord resultRecord3 = this.b;
            resultRecord3.getClass();
            StateRecord stateRecordJ = SnapshotKt.j(resultRecord3, this);
            stateRecordJ.a(resultRecord3);
            stateRecordJ.a = snapshotH.getB();
            resultRecord2 = (ResultRecord) stateRecordJ;
            resultRecord2.c = hashSet;
            resultRecord2.e = resultRecord2.c(this, snapshotH);
            resultRecord2.d = objB;
        }
        if (!zBooleanValue) {
            SnapshotKt.h().l();
        }
        return resultRecord2;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final StateRecord h() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        ResultRecord resultRecord = (ResultRecord) SnapshotKt.g(this.b, SnapshotKt.h());
        sb.append((resultRecord.d == ResultRecord.f || resultRecord.e != resultRecord.c(this, SnapshotKt.h())) ? "<Not calculated>" : String.valueOf(resultRecord.d));
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }

    public DerivedSnapshotState(sr0 sr0Var) {
        this.a = sr0Var;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final void c(StateRecord stateRecord) {
        stateRecord.getClass();
        this.b = (ResultRecord) stateRecord;
    }

    @Override // androidx.compose.runtime.State
    /* JADX INFO: renamed from: getValue */
    public final Object getA() {
        wr0 g = SnapshotKt.h().getE();
        if (g != null) {
            g.invoke(this);
        }
        return e();
    }
}
