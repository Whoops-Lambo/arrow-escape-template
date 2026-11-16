package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import defpackage.az2;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.h00;
import defpackage.kc2;
import defpackage.qb5;
import defpackage.qo;
import defpackage.qy;
import defpackage.ry;
import defpackage.sy;
import defpackage.wr0;
import defpackage.wz2;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/PausableMonotonicFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class PausableMonotonicFrameClock implements MonotonicFrameClock {
    public final MonotonicFrameClock a;
    public final Latch b = new Latch();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.runtime.MonotonicFrameClock
    public final Object d(wr0 wr0Var, fy fyVar) {
        PausableMonotonicFrameClock$withFrameNanos$1 pausableMonotonicFrameClock$withFrameNanos$1;
        boolean z;
        Object objR;
        if (fyVar instanceof PausableMonotonicFrameClock$withFrameNanos$1) {
            pausableMonotonicFrameClock$withFrameNanos$1 = (PausableMonotonicFrameClock$withFrameNanos$1) fyVar;
            int i = pausableMonotonicFrameClock$withFrameNanos$1.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                pausableMonotonicFrameClock$withFrameNanos$1.v = i - Integer.MIN_VALUE;
            } else {
                pausableMonotonicFrameClock$withFrameNanos$1 = new PausableMonotonicFrameClock$withFrameNanos$1(this, fyVar);
            }
        } else {
            pausableMonotonicFrameClock$withFrameNanos$1 = new PausableMonotonicFrameClock$withFrameNanos$1(this, fyVar);
        }
        Object obj = pausableMonotonicFrameClock$withFrameNanos$1.t;
        dz dzVar = dz.a;
        int i2 = pausableMonotonicFrameClock$withFrameNanos$1.v;
        if (i2 == 0) {
            wz2.a0(obj);
            Latch latch = this.b;
            pausableMonotonicFrameClock$withFrameNanos$1.r = this;
            pausableMonotonicFrameClock$withFrameNanos$1.s = wr0Var;
            pausableMonotonicFrameClock$withFrameNanos$1.v = 1;
            synchronized (latch.a) {
                z = latch.d;
            }
            if (z) {
                objR = az2.a;
            } else {
                qo qoVar = new qo(1, kc2.q(pausableMonotonicFrameClock$withFrameNanos$1));
                qoVar.s();
                synchronized (latch.a) {
                    latch.b.add(qoVar);
                }
                qoVar.v(new Latch$await$2$2(latch, qoVar));
                objR = qoVar.r();
                if (objR != dzVar) {
                    objR = az2.a;
                }
            }
            if (objR != dzVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                wz2.a0(obj);
                return obj;
            }
            e32.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        wr0Var = pausableMonotonicFrameClock$withFrameNanos$1.s;
        this = pausableMonotonicFrameClock$withFrameNanos$1.r;
        wz2.a0(obj);
        MonotonicFrameClock monotonicFrameClock = this.a;
        pausableMonotonicFrameClock$withFrameNanos$1.r = null;
        pausableMonotonicFrameClock$withFrameNanos$1.s = null;
        pausableMonotonicFrameClock$withFrameNanos$1.v = 2;
        Object objD = monotonicFrameClock.d(wr0Var, pausableMonotonicFrameClock$withFrameNanos$1);
        return objD == dzVar ? dzVar : objD;
    }

    public PausableMonotonicFrameClock(MonotonicFrameClock monotonicFrameClock) {
        this.a = monotonicFrameClock;
    }

    @Override // defpackage.sy
    public final Object fold(Object obj, zr0 zr0Var) {
        return zr0Var.invoke(obj, this);
    }

    @Override // defpackage.sy
    public final qy get(ry ryVar) {
        ryVar.getClass();
        return qb5.h(this, ryVar);
    }

    @Override // defpackage.sy
    public final sy minusKey(ry ryVar) {
        ryVar.getClass();
        return qb5.k(this, ryVar);
    }

    @Override // defpackage.sy
    public final sy plus(sy syVar) {
        syVar.getClass();
        return h00.o(this, syVar);
    }
}
