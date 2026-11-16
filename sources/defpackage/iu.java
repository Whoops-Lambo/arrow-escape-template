package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class iu extends hu {
    public static void N(Iterable iterable, Collection collection) {
        collection.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static void O(Collection collection, Object[] objArr) {
        collection.getClass();
        objArr.getClass();
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        collection.addAll(listAsList);
    }

    public static final boolean P(Collection collection, wr0 wr0Var, boolean z) {
        Iterator it = collection.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (((Boolean) wr0Var.invoke(it.next())).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static void Q(List list, wr0 wr0Var) {
        int size;
        list.getClass();
        wr0Var.getClass();
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof bc1) && !(list instanceof cc1)) {
                os2.C(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            try {
                P(list, wr0Var, true);
                return;
            } catch (ClassCastException e) {
                s71.y(e, os2.class.getName());
                throw e;
            }
        }
        int size2 = list.size() - 1;
        int i = 0;
        if (size2 >= 0) {
            int i2 = 0;
            while (true) {
                Object obj = list.get(i);
                if (!((Boolean) wr0Var.invoke(obj)).booleanValue()) {
                    if (i2 != i) {
                        list.set(i2, obj);
                    }
                    i2++;
                }
                if (i == size2) {
                    break;
                } else {
                    i++;
                }
            }
            i = i2;
        }
        if (i >= list.size() || i > (size = list.size() - 1)) {
            return;
        }
        while (true) {
            list.remove(size);
            if (size != i) {
                size--;
            } else {
                return;
            }
        }
    }

    public static Object R(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static void S(ArrayList arrayList) {
        arrayList.getClass();
        if (!arrayList.isEmpty()) {
            arrayList.remove(arrayList.size() - 1);
        } else {
            vq2.s("List is empty.");
        }
    }
}
