package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class e53 extends rc1 implements zr0 {
    public final /* synthetic */ m32 i;
    public final /* synthetic */ h32 j;
    public final /* synthetic */ a53 k;
    public final /* synthetic */ k32 l;
    public final /* synthetic */ int m;
    public final /* synthetic */ m32 n;
    public final /* synthetic */ ArrayList o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e53(m32 m32Var, h32 h32Var, a53 a53Var, k32 k32Var, int i, m32 m32Var2, ArrayList arrayList) {
        super(2);
        this.i = m32Var;
        this.j = h32Var;
        this.k = a53Var;
        this.l = k32Var;
        this.m = i;
        this.n = m32Var2;
        this.o = arrayList;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int iIntValue = ((Number) obj2).intValue();
        m32 m32Var = this.i;
        Object obj3 = m32Var.a;
        qj.Companion.getClass();
        m32Var.a = obj3 + pj.a(zBooleanValue);
        a53 a53Var = this.k;
        int i = a53Var.b;
        k32 k32Var = this.l;
        boolean z = i > 45 && k32Var.a < this.m;
        this.j.a = z;
        if (z && zBooleanValue) {
            boolean zC = a53Var.c(iIntValue + 1);
            m32 m32Var2 = this.n;
            Object obj4 = m32Var2.a;
            if (!zC) {
                ((List) obj4).add(Integer.valueOf(iIntValue));
                k32Var.a += 16;
                this.o.add(du.B0((Collection) m32Var2.a));
                ((List) m32Var2.a).clear();
                m32Var2.a = new ArrayList();
            } else if (((List) obj4).size() == 0) {
                ((List) m32Var2.a).add(Integer.valueOf(iIntValue));
                k32Var.a += 17;
            }
        }
        return az2.a;
    }
}
