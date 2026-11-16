package defpackage;

import com.google.android.gms.internal.ads.zzgwq;
import com.google.android.gms.internal.ads.zzhdn;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class wu4 extends q71 {
    public final /* synthetic */ int f = 0;
    public final /* synthetic */ xu4 g;
    public final Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wu4(xu4 xu4Var, Callable callable) {
        super(1);
        this.g = xu4Var;
        callable.getClass();
        this.h = callable;
    }

    @Override // defpackage.q71
    public final Object j() {
        int i = this.f;
        Object obj = this.h;
        switch (i) {
            case 0:
                zzhdn zzhdnVar = (zzhdn) obj;
                ListenableFuture listenableFutureMo1395zza = zzhdnVar.mo1395zza();
                if (listenableFutureMo1395zza != null) {
                    return listenableFutureMo1395zza;
                }
                d.w(zzgwq.a("AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzhdnVar));
                return null;
            default:
                return ((Callable) obj).call();
        }
    }

    @Override // defpackage.q71
    public final String n() {
        switch (this.f) {
            case 0:
                return ((zzhdn) this.h).toString();
            default:
                return ((Callable) this.h).toString();
        }
    }

    @Override // defpackage.q71
    public final boolean o() {
        switch (this.f) {
            case 0:
                break;
        }
        return this.g.isDone();
    }

    @Override // defpackage.q71
    public final void q(Object obj) {
        switch (this.f) {
            case 0:
                this.g.n((ListenableFuture) obj);
                break;
            default:
                this.g.e(obj);
                break;
        }
    }

    @Override // defpackage.q71
    public final void r(Throwable th) {
        int i = this.f;
        xu4 xu4Var = this.g;
        switch (i) {
            case 0:
                xu4Var.f(th);
                break;
            default:
                xu4Var.f(th);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wu4(xu4 xu4Var, zzhdn zzhdnVar) {
        super(1);
        this.g = xu4Var;
        this.h = zzhdnVar;
    }
}
