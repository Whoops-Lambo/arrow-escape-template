package defpackage;

import android.util.Log;
import androidx.datastore.core.DataStore;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class rc2 {
    public final sy a;
    public final yp2 b;
    public final DataStore c;
    public final AtomicReference d;

    public final eb2 a() throws Throwable {
        AtomicReference atomicReference = this.d;
        if (atomicReference.get() == null) {
            Object objY = tb5.y(cg0.a, new pc2(this, null, 1));
            while (!atomicReference.compareAndSet(null, objY) && atomicReference.get() == null) {
            }
        }
        Object obj = atomicReference.get();
        obj.getClass();
        return (eb2) obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(eb2 eb2Var, fy fyVar) {
        qc2 qc2Var;
        if (fyVar instanceof qc2) {
            qc2Var = (qc2) fyVar;
            int i = qc2Var.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                qc2Var.t = i - Integer.MIN_VALUE;
            } else {
                qc2Var = new qc2(this, fyVar);
            }
        } else {
            qc2Var = new qc2(this, fyVar);
        }
        Object obj = qc2Var.r;
        int i2 = qc2Var.t;
        dy dyVar = null;
        try {
            if (i2 == 0) {
                wz2.a0(obj);
                DataStore dataStore = this.c;
                ni niVar = new ni(eb2Var, dyVar, 4);
                qc2Var.t = 1;
                Object objA = dataStore.a(niVar, qc2Var);
                dz dzVar = dz.a;
                if (objA == dzVar) {
                    return dzVar;
                }
            } else {
                if (i2 != 1) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wz2.a0(obj);
            }
        } catch (IOException e) {
            Log.w("FirebaseSessions", "Failed to update config values: " + e);
        }
        return az2.a;
    }

    public rc2(sy syVar, yp2 yp2Var, DataStore dataStore) {
        syVar.getClass();
        yp2Var.getClass();
        dataStore.getClass();
        this.a = syVar;
        this.b = yp2Var;
        this.c = dataStore;
        this.d = new AtomicReference();
        tb5.t(kc2.a(syVar), null, null, new pc2(this, null, 0), 3);
    }

    public final boolean b() {
        Long l = a().e;
        Integer num = a().d;
        if (l != null && num != null) {
            this.b.getClass();
            if (yp2.a().c - l.longValue() < num.intValue()) {
                return false;
            }
            return true;
        }
        return true;
    }
}
