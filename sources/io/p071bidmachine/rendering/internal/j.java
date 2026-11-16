package io.p071bidmachine.rendering.internal;

import defpackage.n8;
import io.p071bidmachine.rendering.internal.event.g;
import io.p071bidmachine.rendering.model.q;
import io.p071bidmachine.rendering.model.y;
import io.p071bidmachine.rendering.utils.d;
import io.p071bidmachine.rendering.utils.taskmanager.b;
import io.p071bidmachine.util.c;
import io.p071bidmachine.util.m;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class j implements e, e0, d0, a, f0, h, g, w {
    public final g a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public volatile boolean c = true;

    public void a(long j, long j2, float f) {
    }

    public void b(Integer num) {
    }

    public void c(Integer num) {
    }

    public void g(boolean z) {
    }

    public void l() {
    }

    public abstract String m();

    public void n() {
    }

    public void pause() {
    }

    public void play() {
    }

    public void a(String str) {
    }

    public void c() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void h() {
        CopyOnWriteArrayList<i> copyOnWriteArrayList = this.b;
        for (i iVar : copyOnWriteArrayList) {
            iVar.a = Math.max(iVar.b - System.currentTimeMillis(), 0L);
            d.a.getClass();
            try {
                if (iVar instanceof c) {
                    ((c) iVar).a(true);
                }
            } catch (Throwable unused) {
            }
            b.a.removeCallbacks(iVar);
        }
        copyOnWriteArrayList.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j() {
        for (i iVar : this.b) {
            long j = iVar.a;
            if (j > 0) {
                d.a.getClass();
                try {
                    if (iVar instanceof c) {
                        ((c) iVar).a(false);
                    }
                } catch (Throwable unused) {
                }
                b.a.postDelayed(iVar, j);
            } else {
                d.a(iVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k() {
        for (i iVar : this.b) {
            iVar.a = Math.max(iVar.b - System.currentTimeMillis(), 0L);
            d.a.getClass();
            try {
                if (iVar instanceof c) {
                    ((c) iVar).a(true);
                }
            } catch (Throwable unused) {
            }
            b.a.removeCallbacks(iVar);
        }
    }

    public j(g gVar) {
        this.a = gVar;
    }

    public void f(m mVar, q qVar) {
        this.a.b(y.OnClickResolved, mVar, n8.b0(new Object[]{mVar, qVar}));
    }
}
