package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class e4 extends fy {
    public g4 r;
    public List s;
    public Object t;
    public /* synthetic */ Object u;
    public final /* synthetic */ g4 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(g4 g4Var, fy fyVar) {
        super(fyVar);
        this.v = g4Var;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.m(null, null, this);
    }
}
