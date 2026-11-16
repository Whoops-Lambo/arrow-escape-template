package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class sl2 implements dy, ez {
    public int a = Integer.MIN_VALUE;
    public final /* synthetic */ tl2 b;

    @Override // defpackage.ez
    public final ez getCallerFrame() {
        dy dyVar = ki2.a;
        int i = this.a;
        tl2 tl2Var = this.b;
        if (i == Integer.MIN_VALUE) {
            this.a = tl2Var.f;
        }
        int i2 = this.a;
        if (i2 < 0) {
            this.a = Integer.MIN_VALUE;
            dyVar = null;
        } else {
            try {
                dy dyVar2 = tl2Var.e[i2];
                if (dyVar2 != null) {
                    this.a = i2 - 1;
                    dyVar = dyVar2;
                }
            } catch (Throwable unused) {
            }
        }
        if (dyVar instanceof ez) {
            return (ez) dyVar;
        }
        return null;
    }

    @Override // defpackage.dy
    public final sy getContext() {
        tl2 tl2Var = this.b;
        dy[] dyVarArr = tl2Var.e;
        int i = tl2Var.f;
        dy dyVar = dyVarArr[i];
        if (dyVar != this && dyVar != null) {
            return dyVar.getContext();
        }
        int i2 = i - 1;
        while (i2 >= 0) {
            int i3 = i2 - 1;
            dy dyVar2 = dyVarArr[i2];
            if (dyVar2 != this && dyVar2 != null) {
                return dyVar2.getContext();
            }
            i2 = i3;
        }
        e32.i("Not started");
        return null;
    }

    @Override // defpackage.dy
    public final void resumeWith(Object obj) {
        boolean z = obj instanceof j52;
        tl2 tl2Var = this.b;
        if (!z) {
            tl2Var.e(false);
            return;
        }
        Throwable thB = k52.b(obj);
        thB.getClass();
        tl2Var.f(new j52(thB));
    }

    public sl2(tl2 tl2Var) {
        this.b = tl2Var;
    }
}
