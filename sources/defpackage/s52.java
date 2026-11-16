package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class s52 extends f1 {
    public int c;
    public int d;
    public final /* synthetic */ t52 e;

    @Override // defpackage.f1
    public final void a() {
        int i = this.c;
        if (i == 0) {
            this.a = 2;
            return;
        }
        t52 t52Var = this.e;
        Object[] objArr = t52Var.a;
        int i2 = this.d;
        this.b = objArr[i2];
        this.a = 1;
        this.d = (i2 + 1) % t52Var.b;
        this.c = i - 1;
    }

    public s52(t52 t52Var) {
        this.e = t52Var;
        this.c = t52Var.size();
        this.d = t52Var.c;
    }
}
