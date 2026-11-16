package androidx.compose.ui.platform;

import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.internal.StabilityInferred;
import defpackage.fy;
import defpackage.h00;
import defpackage.h42;
import defpackage.j52;
import defpackage.kc2;
import defpackage.qb5;
import defpackage.qo;
import defpackage.qy;
import defpackage.ry;
import defpackage.s71;
import defpackage.sy;
import defpackage.wr0;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidUiFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AndroidUiFrameClock implements MonotonicFrameClock {
    public final Choreographer a;

    public AndroidUiFrameClock(Choreographer choreographer) {
        this.a = choreographer;
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public final Object d(final wr0 wr0Var, fy fyVar) {
        AndroidUiDispatcher androidUiDispatcher;
        qy qyVar = fyVar.getContext().get(h42.c);
        if (qyVar instanceof AndroidUiDispatcher) {
            androidUiDispatcher = (AndroidUiDispatcher) qyVar;
        } else {
            androidUiDispatcher = null;
        }
        final qo qoVar = new qo(1, kc2.q(fyVar));
        qoVar.s();
        Choreographer.FrameCallback frameCallback = new Choreographer.FrameCallback(this, wr0Var) { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$callback$1
            public final /* synthetic */ wr0 b;

            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                Object j52Var;
                try {
                    j52Var = this.b.invoke(Long.valueOf(j));
                } catch (Throwable th) {
                    j52Var = new j52(th);
                }
                this.a.resumeWith(j52Var);
            }

            {
                this.b = wr0Var;
            }
        };
        if (androidUiDispatcher != null && s71.b(androidUiDispatcher.c, this.a)) {
            synchronized (androidUiDispatcher.e) {
                androidUiDispatcher.g.add(frameCallback);
                if (!androidUiDispatcher.j) {
                    androidUiDispatcher.j = true;
                    androidUiDispatcher.c.postFrameCallback(androidUiDispatcher.k);
                }
            }
            qoVar.v(new AndroidUiFrameClock$withFrameNanos$2$1(androidUiDispatcher, frameCallback));
        } else {
            this.a.postFrameCallback(frameCallback);
            qoVar.v(new AndroidUiFrameClock$withFrameNanos$2$2(this, frameCallback));
        }
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
