package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class fy1 extends rc1 implements wr0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ ls j;
    public final /* synthetic */ Map.Entry k;
    public final /* synthetic */ Map.Entry l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fy1(ls lsVar, Map.Entry entry, Map.Entry entry2, int i) {
        super(1);
        this.i = i;
        this.j = lsVar;
        this.k = entry;
        this.l = entry2;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        int i = this.i;
        az2 az2Var = az2.a;
        Map.Entry entry = this.l;
        Map.Entry entry2 = this.k;
        ls lsVar = this.j;
        switch (i) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                String str = (String) entry2.getKey();
                String str2 = (String) entry.getKey();
                List list = (List) ((LinkedHashMap) lsVar.b).get(str);
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        lsVar.K((String) it.next(), str2, zBooleanValue);
                    }
                }
                break;
            default:
                ls.f(lsVar, (String) entry2.getKey(), (String) entry.getKey(), ((Boolean) obj).booleanValue());
                break;
        }
        return az2Var;
    }
}
