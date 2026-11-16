package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class eo extends zp {
    public final zr0 f;

    public eo(zr0 zr0Var, sy syVar, int i, ck ckVar) {
        super(zr0Var, syVar, i, ckVar, 0);
        this.f = zr0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.zp, defpackage.yp
    public final Object c(lz1 lz1Var, dy dyVar) {
        co coVar;
        if (dyVar instanceof co) {
            coVar = (co) dyVar;
            int i = coVar.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                coVar.u = i - Integer.MIN_VALUE;
            } else {
                coVar = new co(this, (fy) dyVar);
            }
        } else {
            coVar = new co(this, (fy) dyVar);
        }
        Object obj = coVar.s;
        int i2 = coVar.u;
        if (i2 == 0) {
            wz2.a0(obj);
            coVar.r = lz1Var;
            coVar.u = 1;
            Object objC = super.c(lz1Var, coVar);
            Object obj2 = dz.a;
            if (objC == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lz1Var = coVar.r;
            wz2.a0(obj);
        }
        if (((kz1) lz1Var).d.w()) {
            return az2.a;
        }
        e32.i("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
        return null;
    }

    @Override // defpackage.zp, defpackage.yp
    public final yp e(sy syVar, int i, ck ckVar) {
        return new eo(this.f, syVar, i, ckVar);
    }
}
