package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class cw0 extends uy implements ab0 {
    public final Handler c;
    public final String d;
    public final boolean e;
    public final cw0 f;

    @Override // defpackage.uy
    public final uy T(int i) {
        uu.g(1);
        return this;
    }

    @Override // defpackage.ab0
    public final void G(long j, qo qoVar) {
        tk0 tk0Var = new tk0(14, qoVar, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.c.postDelayed(tk0Var, j)) {
            qoVar.v(new kp(3, this, tk0Var));
        } else {
            U(qoVar.e, tk0Var);
        }
    }

    @Override // defpackage.uy
    public final void L(sy syVar, Runnable runnable) {
        if (this.c.post(runnable)) {
            return;
        }
        U(syVar, runnable);
    }

    @Override // defpackage.uy
    public final boolean R(sy syVar) {
        return (this.e && s71.b(Looper.myLooper(), this.c.getLooper())) ? false : true;
    }

    public final void U(sy syVar, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        c91 c91Var = (c91) syVar.get(nl0.i);
        if (c91Var != null) {
            c91Var.cancel(cancellationException);
        }
        ba0 ba0Var = xc0.a;
        y80.c.L(syVar, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cw0)) {
            return false;
        }
        cw0 cw0Var = (cw0) obj;
        return cw0Var.c == this.c && cw0Var.e == this.e;
    }

    public final int hashCode() {
        return (this.e ? 1231 : 1237) ^ System.identityHashCode(this.c);
    }

    @Override // defpackage.uy
    public final String toString() {
        cw0 cw0Var;
        String str;
        ba0 ba0Var = xc0.a;
        cw0 cw0Var2 = wg1.a;
        if (this == cw0Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                cw0Var = cw0Var2.f;
            } catch (UnsupportedOperationException unused) {
                cw0Var = null;
            }
            str = this == cw0Var ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.d;
        if (string == null) {
            string = this.c.toString();
        }
        return this.e ? n30.m(string, ".immediate") : string;
    }

    public cw0(Handler handler, String str, boolean z) {
        cw0 cw0Var;
        this.c = handler;
        this.d = str;
        this.e = z;
        if (z) {
            cw0Var = this;
        } else {
            cw0Var = new cw0(handler, str, true);
        }
        this.f = cw0Var;
    }

    @Override // defpackage.ab0
    public final ad0 g(long j, gq2 gq2Var, sy syVar) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.c.postDelayed(gq2Var, j)) {
            return new bw0(0, this, gq2Var);
        }
        U(syVar, gq2Var);
        return dr1.a;
    }

    public cw0(Handler handler) {
        this(handler, null, false);
    }
}
