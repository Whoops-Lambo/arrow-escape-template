package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zt2 {
    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fu2 fu2Var = (fu2) it.next();
            String str = fu2Var.a;
            if (str != null && !dk2.Z(str)) {
                arrayList.add(new jx2(str));
            }
            av2 av2Var = fu2Var.d;
            if (av2Var != null) {
                arrayList.add(av2Var);
            }
            arrayList.addAll(fu2Var.b);
            ru2 ru2Var = fu2Var.c;
            if (ru2Var != null) {
                arrayList.add(ru2Var);
            }
        }
        return arrayList;
    }
}
