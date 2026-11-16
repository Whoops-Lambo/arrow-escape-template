package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class ub2 implements el0 {
    public final /* synthetic */ int a;
    public final r02 b;
    public final r02 c;

    public /* synthetic */ ub2(r02 r02Var, r02 r02Var2, int i) {
        this.a = i;
        this.b = r02Var;
        this.c = r02Var2;
    }

    @Override // defpackage.q02
    public final Object get() {
        int i = this.a;
        r02 r02Var = this.c;
        r02 r02Var2 = this.b;
        switch (i) {
            case 0:
                return new tb2((yp2) r02Var2.get(), (n43) r02Var.get());
            default:
                return new ec2((gd2) r02Var2.get(), (gd2) r02Var.get());
        }
    }
}
