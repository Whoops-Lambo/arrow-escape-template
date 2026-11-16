package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class jz implements rl {
    public final rl b;
    public final bk c;
    public long d;
    public long e;

    @Override // defpackage.rl
    public final void a(Throwable th) {
        this.b.a(th);
    }

    @Override // defpackage.rl
    public final Throwable b() {
        return this.b.b();
    }

    public final void d() {
        long j = this.e;
        long j2 = this.d;
        long j3 = this.c.c;
        this.e = (j2 - j3) + j;
        this.d = j3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.rl
    public final Object g(int i, fy fyVar) {
        iz izVar;
        if (fyVar instanceof iz) {
            izVar = (iz) fyVar;
            int i2 = izVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                izVar.t = i2 - Integer.MIN_VALUE;
            } else {
                izVar = new iz(this, fyVar);
            }
        } else {
            izVar = new iz(this, fyVar);
        }
        Object objG = izVar.r;
        int i3 = izVar.t;
        if (i3 == 0) {
            wz2.a0(objG);
            c();
            if (this.c.c >= i) {
                return Boolean.TRUE;
            }
            izVar.t = 1;
            objG = this.b.g(i, izVar);
            dz dzVar = dz.a;
            if (objG == dzVar) {
                return dzVar;
            }
        } else {
            if (i3 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(objG);
        }
        if (!((Boolean) objG).booleanValue()) {
            return Boolean.FALSE;
        }
        c();
        return Boolean.TRUE;
    }

    @Override // defpackage.rl
    public final boolean h() {
        return this.c.exhausted() && this.b.h();
    }

    public jz(rl rlVar) {
        rlVar.getClass();
        this.b = rlVar;
        this.c = new bk();
    }

    public final void c() {
        d();
        this.d += this.c.o(this.b.f());
    }

    @Override // defpackage.rl
    public final bk f() {
        c();
        return this.c;
    }
}
