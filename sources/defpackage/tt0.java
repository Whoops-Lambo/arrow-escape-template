package defpackage;

import com.unity3d.services.core.network.domain.CleanupDirectory$invoke$$inlined$sortedBy$1;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class tt0 implements l92 {
    public final /* synthetic */ int a = 2;
    public final Object b;
    public final Object c;

    public tt0(l92 l92Var, wr0 wr0Var) {
        wr0Var.getClass();
        this.b = l92Var;
        this.c = wr0Var;
    }

    @Override // defpackage.l92
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new st0(this);
            case 1:
                p8 p8Var = (p8) this.b;
                ArrayList arrayList = new ArrayList();
                Iterator it = ((Iterable) p8Var.b).iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                hu.M(arrayList, (CleanupDirectory$invoke$$inlined$sortedBy$1) this.c);
                return arrayList.iterator();
            default:
                return new en0(this);
        }
    }

    public tt0(sr0 sr0Var, wr0 wr0Var) {
        wr0Var.getClass();
        this.b = sr0Var;
        this.c = wr0Var;
    }

    public tt0(p8 p8Var, CleanupDirectory$invoke$$inlined$sortedBy$1 cleanupDirectory$invoke$$inlined$sortedBy$1) {
        this.b = p8Var;
        this.c = cleanupDirectory$invoke$$inlined$sortedBy$1;
    }
}
