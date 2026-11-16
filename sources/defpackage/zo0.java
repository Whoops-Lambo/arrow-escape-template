package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zo0 extends sy1 {
    public static final zo0 c = new zo0(ap0.a);

    @Override // defpackage.sy1
    public final Object j() {
        return new float[0];
    }

    @Override // defpackage.j0
    public final int d(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        return fArr.length;
    }

    @Override // defpackage.bu, defpackage.j0
    public final void f(hw hwVar, int i, Object obj) {
        yo0 yo0Var = (yo0) obj;
        yo0Var.getClass();
        float fW = hwVar.w(this.b, i);
        yo0Var.b(yo0Var.d() + 1);
        float[] fArr = yo0Var.a;
        int i2 = yo0Var.b;
        yo0Var.b = i2 + 1;
        fArr[i2] = fW;
    }

    @Override // defpackage.j0
    public final Object g(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        yo0 yo0Var = new yo0();
        yo0Var.a = fArr;
        yo0Var.b = fArr.length;
        yo0Var.b(10);
        return yo0Var;
    }

    @Override // defpackage.sy1
    public final void k(iw iwVar, Object obj, int i) {
        float[] fArr = (float[]) obj;
        iwVar.getClass();
        fArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            iwVar.D(this.b, i2, fArr[i2]);
        }
    }
}
