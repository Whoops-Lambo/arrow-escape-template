package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class fp0 extends fy {
    public /* synthetic */ Object r;
    public int s;
    public final /* synthetic */ gp0 t;
    public cp0 u;
    public Iterator v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fp0(gp0 gp0Var, dy dyVar) {
        super(dyVar);
        this.t = gp0Var;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return this.t.collect(null, this);
    }
}
