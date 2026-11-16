package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class qr2 extends q71 {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ rr2 g;
    public final Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qr2(rr2 rr2Var, Callable callable) {
        super(0);
        this.g = rr2Var;
        callable.getClass();
        this.h = callable;
    }

    @Override // defpackage.q71
    public final void a(Throwable th) {
        int i = this.f;
        rr2 rr2Var = this.g;
        switch (i) {
            case 0:
                rr2Var.n(th);
                break;
            default:
                rr2Var.n(th);
                break;
        }
    }

    @Override // defpackage.q71
    public final void c(Object obj) {
        int i = this.f;
        rr2 rr2Var = this.g;
        switch (i) {
            case 0:
                rr2Var.o((ListenableFuture) obj);
                break;
            default:
                rr2Var.m(obj);
                break;
        }
    }

    @Override // defpackage.q71
    public final boolean f() {
        int i = this.f;
        rr2 rr2Var = this.g;
        switch (i) {
            case 0:
                break;
        }
        return rr2Var.isDone();
    }

    @Override // defpackage.q71
    public final Object g() {
        int i = this.f;
        Object obj = this.h;
        switch (i) {
            case 0:
                v8 v8Var = (v8) obj;
                ListenableFuture listenableFutureCall = v8Var.call();
                fs1.j(listenableFutureCall, v8Var, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s");
                return listenableFutureCall;
            default:
                return ((Callable) obj).call();
        }
    }

    @Override // defpackage.q71
    public final String h() {
        switch (this.f) {
            case 0:
                return ((v8) this.h).toString();
            default:
                return ((Callable) this.h).toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qr2(rr2 rr2Var, v8 v8Var) {
        super(0);
        this.g = rr2Var;
        this.h = v8Var;
    }
}
