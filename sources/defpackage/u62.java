package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class u62 extends fy implements cp0 {
    public final cp0 r;
    public final sy s;
    public final int t;
    public sy u;
    public dy v;

    @Override // defpackage.ph
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    public u62(cp0 cp0Var, sy syVar) {
        super(jv.c, cg0.a);
        this.r = cp0Var;
        this.s = syVar;
        this.t = ((Number) syVar.fold(0, new q8(20))).intValue();
    }

    @Override // defpackage.ph, defpackage.ez
    public final ez getCallerFrame() {
        dy dyVar = this.v;
        if (dyVar instanceof ez) {
            return (ez) dyVar;
        }
        return null;
    }

    @Override // defpackage.fy, defpackage.dy
    public final sy getContext() {
        sy syVar = this.u;
        return syVar == null ? cg0.a : syVar;
    }

    public final Object b(dy dyVar, Object obj) {
        sy context = dyVar.getContext();
        u12.h(context);
        sy syVar = this.u;
        if (syVar != context) {
            if (!(syVar instanceof ce0)) {
                if (((Number) context.fold(0, new x62(this, 0))).intValue() == this.t) {
                    this.u = context;
                } else {
                    throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.s + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
                }
            } else {
                throw new IllegalStateException(ek2.r("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((ce0) syVar).b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
        }
        this.v = dyVar;
        as0 as0Var = w62.a;
        cp0 cp0Var = this.r;
        cp0Var.getClass();
        Object objInvoke = as0Var.invoke(cp0Var, obj, this);
        if (!s71.b(objInvoke, dz.a)) {
            this.v = null;
        }
        return objInvoke;
    }

    @Override // defpackage.cp0
    public final Object emit(Object obj, dy dyVar) {
        try {
            Object objB = b(dyVar, obj);
            if (objB == dz.a) {
                return objB;
            }
            return az2.a;
        } catch (Throwable th) {
            this.u = new ce0(dyVar.getContext(), th);
            throw th;
        }
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        Throwable thB = k52.b(obj);
        if (thB != null) {
            this.u = new ce0(getContext(), thB);
        }
        dy dyVar = this.v;
        if (dyVar != null) {
            dyVar.resumeWith(obj);
        }
        return dz.a;
    }
}
