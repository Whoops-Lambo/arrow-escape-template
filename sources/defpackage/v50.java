package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class v50 extends pu1 {
    public final List b;
    public final sy c;
    public Object d;
    public int e;

    @Override // defpackage.pu1
    public final Object a(Object obj, fy fyVar) {
        this.e = 0;
        obj.getClass();
        this.d = obj;
        return c(fyVar);
    }

    @Override // defpackage.pu1
    public final Object b() {
        return this.d;
    }

    @Override // defpackage.pu1
    public final Object c(dy dyVar) {
        int i = this.e;
        if (i < 0) {
            return this.d;
        }
        if (i < this.b.size()) {
            return e(dyVar);
        }
        this.e = -1;
        return this.d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(dy dyVar) {
        u50 u50Var;
        Object objInvoke;
        dz dzVar;
        if (dyVar instanceof u50) {
            u50Var = (u50) dyVar;
            int i = u50Var.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                u50Var.t = i - Integer.MIN_VALUE;
            } else {
                u50Var = new u50(this, dyVar);
            }
        } else {
            u50Var = new u50(this, dyVar);
        }
        Object obj = u50Var.r;
        int i2 = u50Var.t;
        if (i2 != 0 && i2 != 1) {
            e32.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        wz2.a0(obj);
        do {
            int i3 = this.e;
            if (i3 != -1) {
                List list = this.b;
                if (i3 >= list.size()) {
                    this.e = -1;
                } else {
                    as0 as0Var = (as0) list.get(i3);
                    this.e = i3 + 1;
                    Object obj2 = this.d;
                    u50Var.t = 1;
                    objInvoke = as0Var.invoke(this, obj2, u50Var);
                    dzVar = dz.a;
                }
            }
            return this.d;
        } while (objInvoke != dzVar);
        return dzVar;
    }

    @Override // defpackage.cz
    /* JADX INFO: renamed from: getCoroutineContext */
    public final sy getA() {
        return this.c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v50(Object obj, List list, Object obj2, sy syVar) {
        super(obj);
        obj.getClass();
        list.getClass();
        obj2.getClass();
        this.b = list;
        this.c = syVar;
        this.d = obj2;
    }

    @Override // defpackage.pu1
    public final Object d(dy dyVar, Object obj) {
        obj.getClass();
        this.d = obj;
        return c(dyVar);
    }
}
