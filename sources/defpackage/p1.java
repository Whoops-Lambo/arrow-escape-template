package defpackage;

import java.io.ObjectStreamException;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class p1 implements xf1, Serializable {
    @Override // defpackage.xf1
    public final void f(Throwable th) {
        a(4);
    }

    @Override // defpackage.xf1
    public final void h(String str) {
        a(5);
    }

    public final void a(int i) {
        mi0 mi0Var = (mi0) this;
        fl2 fl2Var = new fl2();
        System.currentTimeMillis();
        fl2Var.a = i;
        fl2Var.b = mi0Var.b;
        Thread.currentThread().getName();
        mi0Var.c.add(fl2Var);
    }

    public Object readResolve() throws ObjectStreamException {
        return zf1.b(((mi0) this).a);
    }
}
