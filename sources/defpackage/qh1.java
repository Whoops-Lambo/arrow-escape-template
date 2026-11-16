package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public abstract class qh1 extends rh1 {
    public static Map Y(dt1... dt1VarArr) {
        if (dt1VarArr.length <= 0) {
            return hg0.a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(rh1.U(dt1VarArr.length));
        d0(linkedHashMap, dt1VarArr);
        return linkedHashMap;
    }

    public static final void d0(HashMap map, dt1[] dt1VarArr) {
        for (dt1 dt1Var : dt1VarArr) {
            map.put(dt1Var.a, dt1Var.b);
        }
    }

    public static HashMap W(dt1... dt1VarArr) {
        HashMap map = new HashMap(rh1.U(dt1VarArr.length));
        d0(map, dt1VarArr);
        return map;
    }

    public static LinkedHashMap X(dt1... dt1VarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(rh1.U(dt1VarArr.length));
        d0(linkedHashMap, dt1VarArr);
        return linkedHashMap;
    }

    public static LinkedHashMap Z(dt1... dt1VarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(rh1.U(dt1VarArr.length));
        d0(linkedHashMap, dt1VarArr);
        return linkedHashMap;
    }

    public static Map c0(Map map, dt1 dt1Var) {
        Object obj = dt1Var.b;
        Object obj2 = dt1Var.a;
        map.getClass();
        if (map.isEmpty()) {
            Map mapSingletonMap = Collections.singletonMap(obj2, obj);
            mapSingletonMap.getClass();
            return mapSingletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(obj2, obj);
        return linkedHashMap;
    }

    public static Map f0(l92 l92Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = l92Var.iterator();
        while (it.hasNext()) {
            dt1 dt1Var = (dt1) it.next();
            linkedHashMap.put(dt1Var.a, dt1Var.b);
        }
        return a0(linkedHashMap);
    }

    public static Object V(Object obj, Map map) {
        map.getClass();
        return ep0.s(obj, map);
    }

    public static final Map a0(LinkedHashMap linkedHashMap) {
        int size = linkedHashMap.size();
        if (size != 0) {
            if (size != 1) {
                return linkedHashMap;
            }
            Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
            Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
            mapSingletonMap.getClass();
            return mapSingletonMap;
        }
        return hg0.a;
    }

    public static LinkedHashMap b0(Map map, Map map2) {
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static List e0(Map map) {
        map.getClass();
        int size = map.size();
        gg0 gg0Var = gg0.a;
        if (size == 0) {
            return gg0Var;
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return gg0Var;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return eu.y(new dt1(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new dt1(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new dt1(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    public static Map g0(ArrayList arrayList) {
        int size = arrayList.size();
        if (size != 0) {
            int i = 0;
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(rh1.U(arrayList.size()));
                int size2 = arrayList.size();
                while (i < size2) {
                    Object obj = arrayList.get(i);
                    i++;
                    dt1 dt1Var = (dt1) obj;
                    linkedHashMap.put(dt1Var.a, dt1Var.b);
                }
                return linkedHashMap;
            }
            dt1 dt1Var2 = (dt1) arrayList.get(0);
            dt1Var2.getClass();
            Map mapSingletonMap = Collections.singletonMap(dt1Var2.a, dt1Var2.b);
            mapSingletonMap.getClass();
            return mapSingletonMap;
        }
        return hg0.a;
    }

    public static Map h0(Map map) {
        map.getClass();
        int size = map.size();
        if (size != 0) {
            if (size != 1) {
                return new LinkedHashMap(map);
            }
            Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
            Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
            mapSingletonMap.getClass();
            return mapSingletonMap;
        }
        return hg0.a;
    }

    public static LinkedHashMap i0(Map map) {
        map.getClass();
        return new LinkedHashMap(map);
    }
}
