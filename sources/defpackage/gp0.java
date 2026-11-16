package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class gp0 implements bp0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    public gp0(List list) {
        this.b = list;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    @Override // defpackage.bp0
    public final Object collect(cp0 cp0Var, dy dyVar) {
        fp0 fp0Var;
        Iterator it;
        cp0 cp0Var2;
        int i = this.a;
        az2 az2Var = az2.a;
        dz dzVar = dz.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                if (dyVar instanceof fp0) {
                    fp0Var = (fp0) dyVar;
                    int i2 = fp0Var.s;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        fp0Var.s = i2 - Integer.MIN_VALUE;
                    } else {
                        fp0Var = new fp0(this, dyVar);
                    }
                } else {
                    fp0Var = new fp0(this, dyVar);
                }
                Object obj2 = fp0Var.r;
                int i3 = fp0Var.s;
                if (i3 == 0) {
                    wz2.a0(obj2);
                    it = ((List) obj).iterator();
                    cp0Var2 = cp0Var;
                } else {
                    if (i3 != 1) {
                        e32.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = fp0Var.v;
                    cp0 cp0Var3 = fp0Var.u;
                    wz2.a0(obj2);
                    cp0Var2 = cp0Var3;
                }
                while (it.hasNext()) {
                    Object next = it.next();
                    fp0Var.u = cp0Var2;
                    fp0Var.v = it;
                    fp0Var.s = 1;
                    if (cp0Var2.emit(next, fp0Var) == dzVar) {
                        return dzVar;
                    }
                }
                return az2Var;
            default:
                Object objEmit = cp0Var.emit(obj, dyVar);
                return objEmit == dzVar ? objEmit : az2Var;
        }
    }

    public gp0(Object obj) {
        this.b = obj;
    }
}
