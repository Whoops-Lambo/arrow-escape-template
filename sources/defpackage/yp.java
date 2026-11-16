package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class yp implements ms0 {
    public final sy a;
    public final int b;
    public final ck c;

    public String b() {
        return null;
    }

    public abstract Object c(lz1 lz1Var, dy dyVar);

    public abstract yp e(sy syVar, int i, ck ckVar);

    public bp0 g() {
        return null;
    }

    public c32 h(cz czVar) {
        int i = this.b;
        if (i == -3) {
            i = -2;
        }
        zr0 g9Var = new g9(this, null, 1);
        kz1 kz1Var = new kz1(ep0.w(czVar, this.a), rd1.a(i, 4, this.c));
        kz1Var.c0(fz.c, kz1Var, g9Var);
        return kz1Var;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    @Override // defpackage.ms0
    public final bp0 a(sy syVar, int i, ck ckVar) {
        sy syVar2 = this.a;
        sy syVarPlus = syVar.plus(syVar2);
        ck ckVar2 = ck.a;
        ck ckVar3 = this.c;
        int i2 = this.b;
        if (ckVar == ckVar2) {
            if (i2 != -3) {
                if (i == -3) {
                    i = i2;
                } else if (i2 != -2) {
                    if (i == -2) {
                        i = i2;
                    } else {
                        i += i2;
                        if (i < 0) {
                            i = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            ckVar = ckVar3;
        }
        return (s71.b(syVarPlus, syVar2) && i == i2 && ckVar == ckVar3) ? this : e(syVarPlus, i, ckVar);
    }

    @Override // defpackage.bp0
    public Object collect(cp0 cp0Var, dy dyVar) {
        Object objJ = kc2.j(new xp(cp0Var, this, (dy) null, 0), dyVar);
        return objJ == dz.a ? objJ : az2.a;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strB = b();
        if (strB != null) {
            arrayList.add(strB);
        }
        cg0 cg0Var = cg0.a;
        sy syVar = this.a;
        if (syVar != cg0Var) {
            arrayList.add("context=" + syVar);
        }
        int i = this.b;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        ck ckVar = ck.a;
        ck ckVar2 = this.c;
        if (ckVar2 != ckVar) {
            arrayList.add("onBufferOverflow=" + ckVar2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return jc1.q(sb, du.g0(arrayList, ", ", null, null, null, 62), ']');
    }

    public yp(sy syVar, int i, ck ckVar) {
        this.a = syVar;
        this.b = i;
        this.c = ckVar;
    }
}
