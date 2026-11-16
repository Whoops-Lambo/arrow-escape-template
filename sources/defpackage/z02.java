package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class z02 {
    /* JADX WARN: Multi-variable type inference failed */
    public static LinkedHashMap a(e12 e12Var) {
        Object next;
        String string;
        Map map;
        e12Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = e12Var.b.entrySet().iterator();
        int iMax = 0;
        while (true) {
            Object next2 = null;
            if (!it.hasNext()) {
                break;
            }
            TreeSet treeSet = ((hh2) ((Map.Entry) it.next()).getValue()).a;
            treeSet.getClass();
            if (treeSet instanceof List) {
                List list = (List) treeSet;
                if (!list.isEmpty()) {
                    next2 = pv1.i(1, list);
                }
            } else {
                Iterator it2 = treeSet.iterator();
                if (it2.hasNext()) {
                    next2 = it2.next();
                    while (it2.hasNext()) {
                        next2 = it2.next();
                    }
                }
            }
            Integer num = (Integer) ((Comparable) next2);
            if (num != null) {
                iMax = Math.max(num.intValue(), iMax);
            }
        }
        it0 it0Var = e12Var.d;
        i71 it3 = new j71(1, (it0Var == null || (map = it0Var.f) == null) ? 11 : map.size(), 1).iterator();
        while (it3.d) {
            int iNextInt = it3.nextInt();
            j71 j71Var = new j71(1, iMax, 1);
            ArrayList arrayList = new ArrayList();
            i71 it4 = j71Var.iterator();
            while (it4.d) {
                ArrayList arrayListB = e12Var.b(Integer.valueOf(it4.nextInt()));
                int size = arrayListB.size();
                g52 g52VarB = null;
                int i = 0;
                while (i < size) {
                    Object obj = arrayListB.get(i);
                    i++;
                    d12 d12Var = (d12) obj;
                    Integer num2 = d12Var.a;
                    if (num2 != null && num2.intValue() == iNextInt && (g52VarB == null || g52VarB.ordinal() > d12Var.b().ordinal())) {
                        g52VarB = d12Var.b();
                    }
                }
                if (g52VarB != null) {
                    arrayList.add(g52VarB);
                }
            }
            Iterator it5 = arrayList.iterator();
            if (it5.hasNext()) {
                next = it5.next();
                if (it5.hasNext()) {
                    int i2 = -((g52) next).a;
                    do {
                        Object next3 = it5.next();
                        int i3 = -((g52) next3).a;
                        if (i2 < i3) {
                            next = next3;
                            i2 = i3;
                        }
                    } while (it5.hasNext());
                }
            } else {
                next = null;
            }
            g52 g52Var = (g52) next;
            Integer numValueOf = Integer.valueOf(iNextInt);
            if (g52Var == null) {
                string = "";
            } else {
                StringBuilder sb = new StringBuilder();
                for (int i4 = 0; i4 < iMax; i4++) {
                    sb.append(g52Var.a);
                }
                string = sb.toString();
            }
            linkedHashMap.put(numValueOf, string);
        }
        return linkedHashMap;
    }
}
