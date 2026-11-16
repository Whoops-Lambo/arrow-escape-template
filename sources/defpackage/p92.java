package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public abstract class p92 extends q92 {
    /* JADX WARN: Multi-variable type inference failed */
    public static l92 G(p8 p8Var, int i) {
        if (i < 0) {
            ak1.n(jc1.k(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return p8Var;
        }
        return p8Var instanceof se0 ? ((se0) p8Var).a(i) : new re0(p8Var, i, 0);
    }

    public static l92 M(l92 l92Var, int i) {
        if (i < 0) {
            ak1.n(jc1.k(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return jg0.a;
        }
        return l92Var instanceof se0 ? ((se0) l92Var).b(i) : new re0(l92Var, i, 1);
    }

    public static l92 F(Iterator it) {
        it.getClass();
        return new ix(new p8(it, 4));
    }

    public static fn0 H(l92 l92Var) {
        l92Var.getClass();
        return new fn0(l92Var, false, new w01(8));
    }

    public static Object I(l92 l92Var) {
        Iterator it = l92Var.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    public static l92 J(Object obj, wr0 wr0Var) {
        wr0Var.getClass();
        if (obj == null) {
            return jg0.a;
        }
        return new tt0(new sv1(obj, 2), wr0Var);
    }

    public static String K(String str, l92 l92Var) {
        l92Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (Object obj : l92Var) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            ek2.e(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static ar2 L(l92 l92Var, wr0 wr0Var) {
        l92Var.getClass();
        return new ar2(l92Var, wr0Var);
    }

    public static List N(l92 l92Var) {
        l92Var.getClass();
        Iterator it = l92Var.iterator();
        if (!it.hasNext()) {
            return gg0.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return eu.y(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static Set O(l92 l92Var) {
        Iterator it = l92Var.iterator();
        if (!it.hasNext()) {
            return kg0.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return kc2.x(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }
}
