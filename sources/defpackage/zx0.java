package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.io.Closeable;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zx0 implements cz, Closeable {
    public static final /* synthetic */ AtomicIntegerFieldUpdater l = AtomicIntegerFieldUpdater.newUpdater(zx0.class, "closed");
    public final b6 a;
    public final boolean b;
    public final e91 c;

    @NotNull
    private volatile /* synthetic */ int closed = 0;
    public final sy d;
    public final fz0 e;
    public final fz0 f;
    public final fz0 g;
    public final fz0 h;
    public final vw i;
    public final v7 j;
    public final cy0 k;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(lz0 lz0Var, fy fyVar) {
        yx0 yx0Var;
        if (fyVar instanceof yx0) {
            yx0Var = (yx0) fyVar;
            int i = yx0Var.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                yx0Var.t = i - Integer.MIN_VALUE;
            } else {
                yx0Var = new yx0(this, fyVar);
            }
        } else {
            yx0Var = new yx0(this, fyVar);
        }
        Object objA = yx0Var.r;
        int i2 = yx0Var.t;
        if (i2 == 0) {
            wz2.a0(objA);
            this.j.r(ak.a);
            Object obj = lz0Var.d;
            yx0Var.t = 1;
            objA = this.e.a(lz0Var, obj, yx0Var);
            dz dzVar = dz.a;
            if (objA == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(objA);
        }
        objA.getClass();
        return (by0) objA;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Exception {
        boolean zIsTerminated;
        if (l.compareAndSet(this, 0, 1)) {
            vw vwVar = (vw) this.i.b(ny0.a);
            for (fa faVar : du.z0(vwVar.c().keySet())) {
                faVar.getClass();
                Object objB = vwVar.b(faVar);
                if (objB instanceof AutoCloseable) {
                    AutoCloseable autoCloseable = (AutoCloseable) objB;
                    if (autoCloseable instanceof AutoCloseable) {
                        autoCloseable.close();
                    } else if (autoCloseable instanceof ExecutorService) {
                        ExecutorService executorService = (ExecutorService) autoCloseable;
                        if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                            executorService.shutdown();
                            boolean z = false;
                            while (!zIsTerminated) {
                                try {
                                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                } catch (InterruptedException unused) {
                                    if (!z) {
                                        executorService.shutdownNow();
                                        z = true;
                                    }
                                }
                            }
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                        }
                    } else if (autoCloseable instanceof TypedArray) {
                        ((TypedArray) autoCloseable).recycle();
                    } else if (autoCloseable instanceof MediaMetadataRetriever) {
                        ((MediaMetadataRetriever) autoCloseable).release();
                    } else {
                        if (!(autoCloseable instanceof MediaDrm)) {
                            e32.a();
                            return;
                        }
                        ((MediaDrm) autoCloseable).release();
                    }
                }
            }
            this.c.a0();
            if (this.b) {
                this.a.close();
            }
        }
    }

    @Override // defpackage.cz
    /* JADX INFO: renamed from: getCoroutineContext */
    public final sy getA() {
        return this.d;
    }

    public final String toString() {
        return "HttpClient[" + this.a + ']';
    }

    public zx0(b6 b6Var, cy0 cy0Var) {
        this.a = b6Var;
        e91 e91Var = new e91((c91) b6Var.getA().get(nl0.i));
        this.c = e91Var;
        this.d = b6Var.getA().plus(e91Var);
        this.e = new fz0(1);
        int i = 2;
        this.f = new fz0(2);
        fz0 fz0Var = new fz0(3);
        this.g = fz0Var;
        this.h = new fz0(0);
        this.i = new vw();
        int i2 = 23;
        this.j = new v7(23);
        cy0 cy0Var2 = new cy0();
        this.k = cy0Var2;
        if (this.b) {
            e91Var.invokeOnCompletion(new xx0(this));
        }
        dy dyVar = null;
        fz0Var.f(fz0.w, new ey0(this, b6Var, null));
        fz0Var.f(fz0.x, new s4(this, dyVar, 5));
        int i3 = 24;
        cy0Var2.a(oz0.b, new l6(i3));
        cy0Var2.a(lj.c, new l6(i3));
        cy0Var2.a(nd0.d, new l6(i3));
        if (cy0Var.f) {
            cy0Var2.c.put("DefaultTransformers", new l6(i2));
        }
        cy0Var2.a(q01.b, new l6(i3));
        ls lsVar = wx0.b;
        cy0Var2.a(lsVar, new l6(i3));
        if (cy0Var.e) {
            cy0Var2.a(jz0.d, new l6(i3));
        }
        cy0Var2.e = cy0Var.e;
        cy0Var2.f = cy0Var.f;
        cy0Var2.a.putAll(cy0Var.a);
        cy0Var2.b.putAll(cy0Var.b);
        cy0Var2.c.putAll(cy0Var.c);
        if (cy0Var.f) {
            cy0Var2.a(dz0.b, new l6(i3));
        }
        fa faVar = z90.a;
        cy0Var2.a(lsVar, new l6(cy0Var2, 10));
        Iterator it = cy0Var2.a.values().iterator();
        while (it.hasNext()) {
            ((wr0) it.next()).invoke(this);
        }
        Iterator it2 = cy0Var2.c.values().iterator();
        while (it2.hasNext()) {
            ((wr0) it2.next()).invoke(this);
        }
        this.f.f(fz0.o, new sa0(this, dyVar, i));
        this.b = true;
    }
}
