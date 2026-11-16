package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class du extends iu {
    public static /* synthetic */ void f0(Iterable iterable, StringBuilder sb, String str, w01 w01Var, int i) {
        if ((i & 64) != 0) {
            w01Var = null;
        }
        e0(iterable, sb, str, "", "", "...", w01Var);
    }

    public static String g0(Iterable iterable, String str, String str2, String str3, wr0 wr0Var, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            wr0Var = null;
        }
        iterable.getClass();
        StringBuilder sb = new StringBuilder();
        e0(iterable, sb, str4, str5, str6, "...", wr0Var);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList n0(zq zqVar, zq zqVar2) {
        if (zqVar instanceof Collection) {
            return o0(zqVar2, (Collection) zqVar);
        }
        ArrayList arrayList = new ArrayList();
        iu.N(zqVar, arrayList);
        iu.N(zqVar2, arrayList);
        return arrayList;
    }

    public static long[] A0(Collection collection) {
        collection.getClass();
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public static ArrayList B0(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static final List C0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        w0(iterable, arrayList);
        return arrayList;
    }

    public static Set D0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        w0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set E0(Iterable iterable) {
        Object next;
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(rh1.U(collection.size()));
                    w0(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = collection.iterator().next();
                }
                return kc2.x(next);
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            w0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    return linkedHashSet2;
                }
                return kc2.x(linkedHashSet2.iterator().next());
            }
        }
        return kg0.a;
    }

    public static ArrayList F0(Iterable iterable, int i, int i2) {
        String strK;
        Iterator itT;
        int i3;
        iterable.getClass();
        if (i > 0 && i2 > 0) {
            if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
                List list = (List) iterable;
                int size = list.size();
                int i4 = size / i2;
                if (size % i2 == 0) {
                    i3 = 0;
                } else {
                    i3 = 1;
                }
                ArrayList arrayList = new ArrayList(i4 + i3);
                int i5 = 0;
                while (i5 >= 0 && i5 < size) {
                    int i6 = size - i5;
                    if (i <= i6) {
                        i6 = i;
                    }
                    ArrayList arrayList2 = new ArrayList(i6);
                    for (int i7 = 0; i7 < i6; i7++) {
                        arrayList2.add(list.get(i7 + i5));
                    }
                    arrayList.add(arrayList2);
                    i5 += i2;
                }
                return arrayList;
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = iterable.iterator();
            it.getClass();
            if (!it.hasNext()) {
                itT = fg0.a;
            } else {
                itT = at.t(new qg2(i, i2, it, null));
            }
            while (itT.hasNext()) {
                arrayList3.add((List) itT.next());
            }
            return arrayList3;
        }
        if (i != i2) {
            strK = jc1.n("Both size ", i, " and step ", i2, " must be greater than zero.");
        } else {
            strK = jc1.k(i, "size ", " must be greater than zero.");
        }
        ak1.n(strK);
        return null;
    }

    public static p8 T(Iterable iterable) {
        iterable.getClass();
        return new p8(iterable, 1);
    }

    public static boolean U(Iterable iterable, Object obj) {
        int iIndexOf;
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (iterable instanceof List) {
            iIndexOf = ((List) iterable).indexOf(obj);
        } else {
            int i = 0;
            for (Object obj2 : iterable) {
                if (i >= 0) {
                    if (s71.b(obj, obj2)) {
                        iIndexOf = i;
                    } else {
                        i++;
                    }
                } else {
                    eu.G();
                    throw null;
                }
            }
            iIndexOf = -1;
        }
        if (iIndexOf < 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int V(j71 j71Var) {
        j71Var.getClass();
        if (j71Var instanceof Collection) {
            return ((Collection) j71Var).size();
        }
        i71 i71VarC = j71Var.iterator();
        int i = 0;
        while (i71VarC.d) {
            i71VarC.next();
            i++;
            if (i < 0) {
                eu.F();
                throw null;
            }
        }
        return i;
    }

    public static List W(Iterable iterable, int i) {
        ArrayList arrayList;
        Object objH0;
        iterable.getClass();
        if (i >= 0) {
            if (i == 0) {
                return z0(iterable);
            }
            if (iterable instanceof Collection) {
                int size = ((Collection) iterable).size() - i;
                if (size <= 0) {
                    return gg0.a;
                }
                if (size == 1) {
                    if (iterable instanceof List) {
                        objH0 = h0((List) iterable);
                    } else {
                        Iterator it = iterable.iterator();
                        if (it.hasNext()) {
                            Object next = it.next();
                            while (it.hasNext()) {
                                next = it.next();
                            }
                            objH0 = next;
                        } else {
                            vq2.s("Collection is empty.");
                            return null;
                        }
                    }
                    return eu.y(objH0);
                }
                arrayList = new ArrayList(size);
                if (iterable instanceof List) {
                    if (iterable instanceof RandomAccess) {
                        List list = (List) iterable;
                        int size2 = list.size();
                        while (i < size2) {
                            arrayList.add(list.get(i));
                            i++;
                        }
                    } else {
                        ListIterator listIterator = ((List) iterable).listIterator(i);
                        while (listIterator.hasNext()) {
                            arrayList.add(listIterator.next());
                        }
                    }
                    return arrayList;
                }
            } else {
                arrayList = new ArrayList();
            }
            int i2 = 0;
            for (Object obj : iterable) {
                if (i2 >= i) {
                    arrayList.add(obj);
                } else {
                    i2++;
                }
            }
            return eu.D(arrayList);
        }
        ak1.n(jc1.k(i, "Requested element count ", " is less than zero."));
        return null;
    }

    public static List X(List list) {
        list.getClass();
        List list2 = list;
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return t0(list2, size);
    }

    public static ArrayList Y(Iterable iterable) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object Z(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return a0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        vq2.s("Collection is empty.");
        return null;
    }

    public static Object a0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        vq2.s("List is empty.");
        return null;
    }

    public static Object b0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    public static Object c0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object d0(int i, List list) {
        list.getClass();
        if (i >= 0 && i < list.size()) {
            return list.get(i);
        }
        return null;
    }

    public static final void e0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, wr0 wr0Var) {
        iterable.getClass();
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            ek2.e(sb, obj, wr0Var);
        }
        sb.append(charSequence3);
    }

    public static Object h0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return pv1.i(1, list);
        }
        vq2.s("List is empty.");
        return null;
    }

    public static Object i0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return pv1.i(1, list);
    }

    public static Comparable j0(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Float k0(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static Float l0(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static ArrayList m0(Iterable iterable, Object obj) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList(eu.f(iterable, 10));
        boolean z = false;
        for (Object obj2 : iterable) {
            boolean z2 = true;
            if (!z && s71.b(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static ArrayList o0(Iterable iterable, Collection collection) {
        collection.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection2.size() + collection.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        iu.N(iterable, arrayList2);
        return arrayList2;
    }

    public static ArrayList p0(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static List q0(ArrayList arrayList) {
        arrayList.getClass();
        if (arrayList.size() <= 1) {
            return z0(arrayList);
        }
        List listC0 = C0(arrayList);
        Collections.reverse(listC0);
        return listC0;
    }

    public static List r0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return z0(iterable);
            }
            Object[] array = collection.toArray(new Comparable[0]);
            Comparable[] comparableArr = (Comparable[]) array;
            comparableArr.getClass();
            if (comparableArr.length > 1) {
                Arrays.sort(comparableArr);
            }
            array.getClass();
            List listAsList = Arrays.asList(array);
            listAsList.getClass();
            return listAsList;
        }
        List listC0 = C0(iterable);
        hu.L(listC0);
        return listC0;
    }

    public static List s0(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        comparator.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return z0(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            array.getClass();
            if (array.length > 1) {
                Arrays.sort(array, comparator);
            }
            List listAsList = Arrays.asList(array);
            listAsList.getClass();
            return listAsList;
        }
        List listC0 = C0(iterable);
        hu.M(listC0, comparator);
        return listC0;
    }

    public static List t0(Iterable iterable, int i) {
        iterable.getClass();
        if (i >= 0) {
            if (i == 0) {
                return gg0.a;
            }
            if (iterable instanceof Collection) {
                if (i >= ((Collection) iterable).size()) {
                    return z0(iterable);
                }
                if (i == 1) {
                    return eu.y(Z(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i);
            Iterator it = iterable.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                arrayList.add(it.next());
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return eu.D(arrayList);
        }
        ak1.n(jc1.k(i, "Requested element count ", " is less than zero."));
        return null;
    }

    public static List u0(int i, List list) {
        list.getClass();
        if (i >= 0) {
            if (i == 0) {
                return gg0.a;
            }
            int size = list.size();
            if (i >= size) {
                return z0(list);
            }
            if (i == 1) {
                return eu.y(h0(list));
            }
            ArrayList arrayList = new ArrayList(i);
            if (list instanceof RandomAccess) {
                for (int i2 = size - i; i2 < size; i2++) {
                    arrayList.add(list.get(i2));
                }
            } else {
                ListIterator listIterator = list.listIterator(size - i);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
            }
            return arrayList;
        }
        ak1.n(jc1.k(i, "Requested element count ", " is less than zero."));
        return null;
    }

    public static byte[] v0(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            bArr[i] = ((Number) obj).byteValue();
            i++;
        }
        return bArr;
    }

    public static final void w0(Iterable iterable, AbstractCollection abstractCollection) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static HashSet x0(Iterable iterable) {
        iterable.getClass();
        HashSet hashSet = new HashSet(rh1.U(eu.f(iterable, 12)));
        w0(iterable, hashSet);
        return hashSet;
    }

    public static int[] y0(Collection collection) {
        collection.getClass();
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static List z0(Iterable iterable) {
        Object next;
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return new ArrayList(collection);
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = collection.iterator().next();
                }
                return eu.y(next);
            }
            return gg0.a;
        }
        return eu.D(C0(iterable));
    }
}
