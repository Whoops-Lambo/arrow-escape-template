package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class tl2 extends pu1 {
    public final List b;
    public final sl2 c;
    public Object d;
    public final dy[] e;
    public int f;
    public int g;

    @Override // defpackage.pu1
    public final Object a(Object obj, fy fyVar) {
        this.g = 0;
        if (this.b.size() == 0) {
            return obj;
        }
        obj.getClass();
        this.d = obj;
        if (this.f < 0) {
            return c(fyVar);
        }
        e32.i("Already started");
        return null;
    }

    @Override // defpackage.pu1
    public final Object b() {
        return this.d;
    }

    @Override // defpackage.pu1
    public final Object c(dy dyVar) {
        Object obj;
        int i = this.g;
        int size = this.b.size();
        dz dzVar = dz.a;
        if (i == size) {
            obj = this.d;
        } else {
            dy dyVarQ = kc2.q(dyVar);
            int i2 = this.f + 1;
            this.f = i2;
            dy[] dyVarArr = this.e;
            dyVarArr[i2] = dyVarQ;
            if (e(true)) {
                int i3 = this.f;
                if (i3 < 0) {
                    e32.i("No more continuations to resume");
                    return null;
                }
                this.f = i3 - 1;
                dyVarArr[i3] = null;
                obj = this.d;
            } else {
                obj = dzVar;
            }
        }
        if (obj == dzVar) {
            dyVar.getClass();
        }
        return obj;
    }

    public final boolean e(boolean z) {
        as0 as0Var;
        Object obj;
        sl2 sl2Var;
        do {
            int i = this.g;
            List list = this.b;
            if (i == list.size()) {
                if (z) {
                    return true;
                }
                f(this.d);
                return false;
            }
            this.g = i + 1;
            as0Var = (as0) list.get(i);
            try {
                obj = this.d;
                sl2Var = this.c;
                as0Var.getClass();
                obj.getClass();
                sl2Var.getClass();
                os2.j(3, as0Var);
            } catch (Throwable th) {
                f(new j52(th));
                return false;
            }
        } while (as0Var.invoke(this, obj, sl2Var) != dz.a);
        return false;
    }

    public final void f(Object obj) {
        int i = this.f;
        if (i < 0) {
            e32.i("No more continuations to resume");
            return;
        }
        dy[] dyVarArr = this.e;
        dy dyVar = dyVarArr[i];
        dyVar.getClass();
        int i2 = this.f;
        this.f = i2 - 1;
        dyVarArr[i2] = null;
        if (!(obj instanceof j52)) {
            dyVar.resumeWith(obj);
            return;
        }
        Throwable thB = k52.b(obj);
        thB.getClass();
        try {
            thB.getCause();
        } catch (Throwable unused) {
        }
        dyVar.resumeWith(new j52(thB));
    }

    @Override // defpackage.cz
    /* JADX INFO: renamed from: getCoroutineContext */
    public final sy getA() {
        return this.c.getContext();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl2(Object obj, Object obj2, List list) {
        super(obj2);
        obj.getClass();
        obj2.getClass();
        list.getClass();
        this.b = list;
        this.c = new sl2(this);
        this.d = obj;
        this.e = new dy[list.size()];
        this.f = -1;
    }

    @Override // defpackage.pu1
    public final Object d(dy dyVar, Object obj) {
        obj.getClass();
        this.d = obj;
        return c(dyVar);
    }
}
