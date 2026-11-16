package defpackage;

import com.google.android.gms.internal.measurement.zzwx;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class ru extends q71 {
    public final Executor f;
    public final /* synthetic */ su g;
    public final /* synthetic */ int h;
    public final /* synthetic */ su i;
    public final Object j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ru(su suVar, Callable callable) {
        this(suVar, gc0.a);
        this.h = 1;
        this.i = suVar;
        this.j = callable;
    }

    @Override // defpackage.q71
    public final void a(Throwable th) {
        su suVar = this.g;
        suVar.n = null;
        if (th instanceof ExecutionException) {
            suVar.n(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            suVar.cancel(false);
        } else {
            suVar.n(th);
        }
    }

    @Override // defpackage.q71
    public final void c(Object obj) {
        this.g.n = null;
        int i = this.h;
        su suVar = this.i;
        switch (i) {
            case 0:
                suVar.o((ListenableFuture) obj);
                break;
            default:
                suVar.m(obj);
                break;
        }
    }

    @Override // defpackage.q71
    public final boolean f() {
        return this.g.isDone();
    }

    @Override // defpackage.q71
    public final Object g() {
        int i = this.h;
        Object obj = this.j;
        switch (i) {
            case 0:
                return ((zzwx) obj).call();
            default:
                return ((Callable) obj).call();
        }
    }

    @Override // defpackage.q71
    public final String h() {
        int i = this.h;
        Object obj = this.j;
        switch (i) {
            case 0:
                return ((zzwx) obj).toString();
            default:
                return ((Callable) obj).toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ru(su suVar, zzwx zzwxVar, Executor executor) {
        this(suVar, executor);
        this.h = 0;
        this.i = suVar;
        this.j = zzwxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru(su suVar, Executor executor) {
        super(0);
        this.g = suVar;
        executor.getClass();
        this.f = executor;
    }
}
