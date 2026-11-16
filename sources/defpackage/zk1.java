package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zk1 {
    public final String a;
    public final a33 b;
    public final Integer c;

    public abstract boolean a(boolean z, y33 y33Var);

    public boolean b(xk1 xk1Var) {
        return false;
    }

    public a33 c() {
        return this.b;
    }

    public String d() {
        return this.a;
    }

    public Integer e() {
        return this.c;
    }

    public zk1(String str, a33 a33Var, Integer num) {
        a33Var.getClass();
        this.a = str;
        this.b = a33Var;
        this.c = num;
    }

    public final void f(Throwable th) {
        c().b("Failed to apply consent to " + d(), th);
    }
}
