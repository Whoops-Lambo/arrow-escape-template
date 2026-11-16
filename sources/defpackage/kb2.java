package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class kb2 implements el0 {
    public final /* synthetic */ int a;
    public final r02 b;

    public /* synthetic */ kb2(r02 r02Var, int i) {
        this.a = i;
        this.b = r02Var;
    }

    @Override // defpackage.q02
    public final Object get() {
        int i = this.a;
        r02 r02Var = this.b;
        switch (i) {
            case 0:
                return new jb2((tb2) r02Var.get());
            default:
                return new cc2((ff2) r02Var.get());
        }
    }
}
