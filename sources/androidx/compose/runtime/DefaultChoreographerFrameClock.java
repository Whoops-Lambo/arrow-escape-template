package androidx.compose.runtime;

import android.view.Choreographer;
import defpackage.ba0;
import defpackage.fy;
import defpackage.h00;
import defpackage.j52;
import defpackage.kc2;
import defpackage.qb5;
import defpackage.qo;
import defpackage.qy;
import defpackage.ry;
import defpackage.sy;
import defpackage.tb5;
import defpackage.wg1;
import defpackage.wr0;
import defpackage.xc0;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/DefaultChoreographerFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class DefaultChoreographerFrameClock implements MonotonicFrameClock {
    public static final DefaultChoreographerFrameClock a = new DefaultChoreographerFrameClock();
    public static final Choreographer b;

    static {
        ba0 ba0Var = xc0.a;
        b = (Choreographer) tb5.y(wg1.a.f, new DefaultChoreographerFrameClock$choreographer$1(2, null));
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public final Object d(final wr0 wr0Var, fy fyVar) {
        final qo qoVar = new qo(1, kc2.q(fyVar));
        qoVar.s();
        Choreographer.FrameCallback frameCallback = new Choreographer.FrameCallback() { // from class: androidx.compose.runtime.DefaultChoreographerFrameClock$withFrameNanos$2$callback$1
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                Object j52Var;
                DefaultChoreographerFrameClock defaultChoreographerFrameClock = DefaultChoreographerFrameClock.a;
                try {
                    j52Var = wr0Var.invoke(Long.valueOf(j));
                } catch (Throwable th) {
                    j52Var = new j52(th);
                }
                qoVar.resumeWith(j52Var);
            }
        };
        b.postFrameCallback(frameCallback);
        qoVar.v(new DefaultChoreographerFrameClock$withFrameNanos$2$1(frameCallback));
        return qoVar.r();
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
