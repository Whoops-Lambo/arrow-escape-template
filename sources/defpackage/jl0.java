package defpackage;

import com.ironsource.C4943qe;
import com.ironsource.C4978se;
import com.ironsource.Fe;
import kotlinx.serialization.json.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class jl0 implements wr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m32 b;

    public /* synthetic */ jl0(m32 m32Var, int i) {
        this.a = i;
        this.b = m32Var;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        int i = this.a;
        m32 m32Var = this.b;
        switch (i) {
            case 0:
                return Fe.a(m32Var, (C4943qe) obj);
            case 1:
                return Fe.a(m32Var, (C4978se) obj);
            default:
                b bVar = (b) obj;
                bVar.getClass();
                m32Var.a = bVar;
                return az2.a;
        }
    }
}
