package defpackage;

import kotlinx.serialization.json.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class rb1 extends e52 implements as0 {
    public int r;
    public /* synthetic */ b60 s;
    public final /* synthetic */ tb1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb1(tb1 tb1Var, dy dyVar) {
        super(3, dyVar);
        this.t = tb1Var;
    }

    @Override // defpackage.as0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        rb1 rb1Var = new rb1(this.t, (dy) obj3);
        rb1Var.s = (b60) obj;
        return rb1Var.invokeSuspend(az2.a);
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        tb1 tb1Var = this.t;
        g1 g1Var = (g1) tb1Var.c;
        int i = this.r;
        if (i == 0) {
            wz2.a0(obj);
            b60 b60Var = this.s;
            byte bW = g1Var.w();
            if (bW == 1) {
                return tb1Var.d(true);
            }
            if (bW == 0) {
                return tb1Var.d(false);
            }
            if (bW != 6) {
                if (bW == 8) {
                    return tb1Var.c();
                }
                g1.q(g1Var, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.r = 1;
            obj = tb1.a(tb1Var, b60Var, this);
            dz dzVar = dz.a;
            if (obj == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(obj);
        }
        return (b) obj;
    }
}
