package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class d22 implements rl {
    public final p61 b;
    public final sy c;
    public ts d;
    public final bk e;
    public final e91 f;
    public final sy g;

    @Override // defpackage.rl
    public final void a(Throwable th) {
        if (this.d != null) {
            return;
        }
        String message = th.getMessage();
        if (message == null) {
            message = "Channel was cancelled";
        }
        u12.d(message, th, this.f);
        this.b.close();
        String message2 = th.getMessage();
        this.d = new ts(new IOException(message2 != null ? message2 : "Channel was cancelled", th));
    }

    @Override // defpackage.rl
    public final Throwable b() {
        ts tsVar = this.d;
        if (tsVar != null) {
            return tsVar.a(ss.b);
        }
        return null;
    }

    @Override // defpackage.rl
    public final bk f() {
        return this.e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.rl
    public final Object g(int i, fy fyVar) throws Throwable {
        c22 c22Var;
        if (fyVar instanceof c22) {
            c22Var = (c22) fyVar;
            int i2 = c22Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c22Var.u = i2 - Integer.MIN_VALUE;
            } else {
                c22Var = new c22(this, fyVar);
            }
        } else {
            c22Var = new c22(this, fyVar);
        }
        Object obj = c22Var.s;
        int i3 = c22Var.u;
        dy dyVar = null;
        if (i3 == 0) {
            wz2.a0(obj);
            if (this.d != null) {
                return Boolean.TRUE;
            }
            i9 i9Var = new i9(this, i, dyVar, 3);
            c22Var.r = i;
            c22Var.u = 1;
            Object objE = tb5.E(this.g, i9Var, c22Var);
            dz dzVar = dz.a;
            if (objE == dzVar) {
                return dzVar;
            }
        } else {
            if (i3 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = c22Var.r;
            wz2.a0(obj);
        }
        return Boolean.valueOf(this.e.c >= ((long) i));
    }

    @Override // defpackage.rl
    public final boolean h() {
        return this.d != null && this.e.exhausted();
    }

    public d22(p61 p61Var, sy syVar) {
        syVar.getClass();
        this.b = p61Var;
        this.c = syVar;
        this.e = new bk();
        e91 e91Var = new e91((c91) syVar.get(nl0.i));
        this.f = e91Var;
        this.g = syVar.plus(e91Var).plus(new yy("RawSourceChannel"));
    }
}
