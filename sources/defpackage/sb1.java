package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class sb1 extends fy {
    public b60 r;
    public tb1 s;
    public LinkedHashMap t;
    public String u;
    public /* synthetic */ Object v;
    public final /* synthetic */ tb1 w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb1(tb1 tb1Var, ph phVar) {
        super(phVar);
        this.w = tb1Var;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return tb1.a(this.w, null, this);
    }
}
