package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class aq extends yp {
    public final bp0 d;

    public abstract Object i(cp0 cp0Var, dy dyVar);

    @Override // defpackage.yp
    public final Object c(lz1 lz1Var, dy dyVar) {
        Object objI = i(new i92(lz1Var), dyVar);
        return objI == dz.a ? objI : az2.a;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0073 A[RETURN] */
    @Override // defpackage.yp, defpackage.bp0
    public final Object collect(cp0 cp0Var, dy dyVar) {
        Object objCollect;
        int i = this.b;
        dz dzVar = dz.a;
        if (i == -3) {
            sy context = dyVar.getContext();
            Boolean bool = Boolean.FALSE;
            q8 q8Var = new q8(5);
            sy syVar = this.a;
            sy syVarPlus = !((Boolean) syVar.fold(bool, q8Var)).booleanValue() ? context.plus(syVar) : ep0.r(context, syVar, false);
            if (s71.b(syVarPlus, context)) {
                Object objI = i(cp0Var, dyVar);
                if (objI == dzVar) {
                    return objI;
                }
            } else {
                h42 h42Var = h42.c;
                if (s71.b(syVarPlus.get(h42Var), context.get(h42Var))) {
                    sy context2 = dyVar.getContext();
                    if (!(cp0Var instanceof i92) && !(cp0Var instanceof fr1)) {
                        cp0Var = new up0(cp0Var, context2);
                    }
                    Object objG = s71.G(syVarPlus, cp0Var, ep0.H(syVarPlus), new g9(this, null, 2), dyVar);
                    if (objG == dzVar) {
                        return objG;
                    }
                } else {
                    objCollect = super.collect(cp0Var, dyVar);
                    if (objCollect == dzVar) {
                        return objCollect;
                    }
                }
            }
        } else {
            objCollect = super.collect(cp0Var, dyVar);
            if (objCollect == dzVar) {
                return objCollect;
            }
        }
        return az2.a;
    }

    @Override // defpackage.yp
    public final String toString() {
        return this.d + " -> " + super.toString();
    }

    public aq(int i, ck ckVar, sy syVar, bp0 bp0Var) {
        super(syVar, i, ckVar);
        this.d = bp0Var;
    }
}
