package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class co0 extends fy {
    public Map r;
    public Iterator s;
    public ac2 t;
    public Map u;
    public Object v;
    public /* synthetic */ Object w;
    public final /* synthetic */ do0 x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co0(do0 do0Var, fy fyVar) {
        super(fyVar);
        this.x = do0Var;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.b(this);
    }
}
