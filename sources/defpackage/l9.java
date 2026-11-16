package defpackage;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Constraints;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class l9 implements cp0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cp0 b;

    public /* synthetic */ l9(cp0 cp0Var, int i) {
        this.a = i;
        this.b = cp0Var;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005a  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:70:0x0101  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // defpackage.cp0
    public final Object emit(Object obj, dy dyVar) {
        k9 k9Var;
        so soVar;
        kx kxVar;
        oq0 oq0Var;
        int i = this.a;
        u12 dc0Var = ec0.s;
        az2 az2Var = az2.a;
        cp0 cp0Var = this.b;
        dz dzVar = dz.a;
        ng2 ng2Var = null;
        switch (i) {
            case 0:
                if (dyVar instanceof k9) {
                    k9Var = (k9) dyVar;
                    int i2 = k9Var.s;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        k9Var.s = i2 - Integer.MIN_VALUE;
                    } else {
                        k9Var = new k9(this, dyVar);
                    }
                } else {
                    k9Var = new k9(this, dyVar);
                }
                Object obj2 = k9Var.r;
                int i3 = k9Var.s;
                if (i3 != 0) {
                    if (i3 == 1) {
                        wz2.a0(obj2);
                        return az2Var;
                    }
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wz2.a0(obj2);
                long j = ((Size) obj).a;
                if (j == Size.c) {
                    ng2Var = ng2.c;
                } else if (Size.d(j) >= 0.5d && Size.b(j) >= 0.5d) {
                    float fD = Size.d(j);
                    u12 dc0Var2 = (Float.isInfinite(fD) || Float.isNaN(fD)) ? dc0Var : new dc0(rd1.p(Size.d(j)));
                    float fB = Size.b(j);
                    if (!Float.isInfinite(fB) && !Float.isNaN(fB)) {
                        dc0Var = new dc0(rd1.p(Size.b(j)));
                    }
                    ng2Var = new ng2(dc0Var2, dc0Var);
                }
                if (ng2Var == null) {
                    return az2Var;
                }
                k9Var.s = 1;
                return cp0Var.emit(ng2Var, k9Var) == dzVar ? dzVar : az2Var;
            case 1:
                if (dyVar instanceof so) {
                    soVar = (so) dyVar;
                    int i4 = soVar.t;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        soVar.t = i4 - Integer.MIN_VALUE;
                    } else {
                        soVar = new so(this, dyVar);
                    }
                } else {
                    soVar = new so(this, dyVar);
                }
                Object obj3 = soVar.r;
                int i5 = soVar.t;
                if (i5 == 0) {
                    wz2.a0(obj3);
                    u12.h(soVar.getContext());
                    soVar.t = 1;
                    return cp0Var.emit(obj, soVar) == dzVar ? dzVar : az2Var;
                }
                if (i5 == 1) {
                    wz2.a0(obj3);
                    return az2Var;
                }
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                if (dyVar instanceof kx) {
                    kxVar = (kx) dyVar;
                    int i6 = kxVar.s;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        kxVar.s = i6 - Integer.MIN_VALUE;
                    } else {
                        kxVar = new kx(this, dyVar);
                    }
                } else {
                    kxVar = new kx(this, dyVar);
                }
                Object obj4 = kxVar.r;
                int i7 = kxVar.s;
                if (i7 != 0) {
                    if (i7 == 1) {
                        wz2.a0(obj4);
                        return az2Var;
                    }
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wz2.a0(obj4);
                long j2 = ((Constraints) obj).a;
                if (Constraints.h(j2) != 0 && Constraints.g(j2) != 0) {
                    u12 dc0Var3 = Constraints.d(j2) ? new dc0(Constraints.h(j2)) : dc0Var;
                    if (Constraints.c(j2)) {
                        dc0Var = new dc0(Constraints.g(j2));
                    }
                    ng2Var = new ng2(dc0Var3, dc0Var);
                }
                if (ng2Var == null) {
                    return az2Var;
                }
                kxVar.s = 1;
                return cp0Var.emit(ng2Var, kxVar) == dzVar ? dzVar : az2Var;
            default:
                if (dyVar instanceof oq0) {
                    oq0Var = (oq0) dyVar;
                    int i8 = oq0Var.s;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        oq0Var.s = i8 - Integer.MIN_VALUE;
                    } else {
                        oq0Var = new oq0(this, dyVar);
                    }
                } else {
                    oq0Var = new oq0(this, dyVar);
                }
                Object obj5 = oq0Var.r;
                int i9 = oq0Var.s;
                if (i9 != 0) {
                    if (i9 == 1) {
                        wz2.a0(obj5);
                        return az2Var;
                    }
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wz2.a0(obj5);
                if (obj == null) {
                    return az2Var;
                }
                oq0Var.s = 1;
                return cp0Var.emit(obj, oq0Var) == dzVar ? dzVar : az2Var;
        }
    }
}
