package androidx.datastore.core;

import defpackage.az2;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.gv;
import defpackage.pp1;
import defpackage.wz2;
import kotlin.Metadata;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/datastore/core/RunOnce;", "", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class RunOnce {
    public final pp1 a = new pp1();
    public final gv b = new gv();

    public abstract Object a(fy fyVar);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(fy fyVar) throws Throwable {
        RunOnce$runIfNeeded$1 runOnce$runIfNeeded$1;
        pp1 pp1Var;
        Mutex mutex;
        Throwable th;
        Mutex mutex2;
        RunOnce runOnce;
        if (fyVar instanceof RunOnce$runIfNeeded$1) {
            runOnce$runIfNeeded$1 = (RunOnce$runIfNeeded$1) fyVar;
            int i = runOnce$runIfNeeded$1.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                runOnce$runIfNeeded$1.v = i - Integer.MIN_VALUE;
            } else {
                runOnce$runIfNeeded$1 = new RunOnce$runIfNeeded$1(this, fyVar);
            }
        } else {
            runOnce$runIfNeeded$1 = new RunOnce$runIfNeeded$1(this, fyVar);
        }
        Object obj = runOnce$runIfNeeded$1.t;
        int i2 = runOnce$runIfNeeded$1.v;
        az2 az2Var = az2.a;
        dz dzVar = dz.a;
        try {
            if (i2 == 0) {
                wz2.a0(obj);
                if (this.b.isCompleted()) {
                    return az2Var;
                }
                runOnce$runIfNeeded$1.r = this;
                pp1Var = this.a;
                runOnce$runIfNeeded$1.s = pp1Var;
                runOnce$runIfNeeded$1.v = 1;
                if (pp1Var.e(runOnce$runIfNeeded$1) != dzVar) {
                }
                mutex = pp1Var;
                return dzVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mutex2 = runOnce$runIfNeeded$1.s;
                runOnce = runOnce$runIfNeeded$1.r;
                try {
                    wz2.a0(obj);
                    mutex2 = mutex2;
                    runOnce.b.M(az2Var);
                    ((pp1) mutex2).g(null);
                    return az2Var;
                } catch (Throwable th2) {
                    th = th2;
                    ((pp1) mutex2).g(null);
                    throw th;
                }
            }
            Mutex mutex3 = runOnce$runIfNeeded$1.s;
            RunOnce runOnce2 = runOnce$runIfNeeded$1.r;
            wz2.a0(obj);
            mutex = mutex3;
            this = runOnce2;
            mutex = pp1Var;
            if (this.b.isCompleted()) {
                ((pp1) mutex).g(null);
                return az2Var;
            }
            runOnce$runIfNeeded$1.r = this;
            runOnce$runIfNeeded$1.s = mutex;
            runOnce$runIfNeeded$1.v = 2;
            if (this.a(runOnce$runIfNeeded$1) != dzVar) {
                runOnce = this;
                mutex2 = mutex;
                runOnce.b.M(az2Var);
                ((pp1) mutex2).g(null);
                return az2Var;
            }
            mutex = pp1Var;
            return dzVar;
        } catch (Throwable th3) {
            Mutex mutex4 = mutex;
            th = th3;
            mutex2 = mutex4;
            ((pp1) mutex2).g(null);
            throw th;
        }
    }
}
