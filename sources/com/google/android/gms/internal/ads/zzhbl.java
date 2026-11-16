package com.google.android.gms.internal.ads;

import defpackage.jc2;
import defpackage.ns4;
import defpackage.os4;
import defpackage.ps4;
import defpackage.sp4;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzhbl {
    public static ns4 a(Set set, zzgzl zzgzlVar) {
        zzgvz.h(set, "set1");
        zzgvz.h(zzgzlVar, "set2");
        return new ns4(set, zzgzlVar);
    }

    public static os4 b(Set set, zzgwa zzgwaVar) {
        if (set instanceof SortedSet) {
            Set set2 = (SortedSet) set;
            if (!(set2 instanceof os4)) {
                return new ps4(set2, zzgwaVar);
            }
            os4 os4Var = (os4) set2;
            zzgwa zzgwaVar2 = os4Var.b;
            zzgwaVar2.getClass();
            return new ps4((SortedSet) os4Var.a, new sp4(Arrays.asList(zzgwaVar2, zzgwaVar)));
        }
        if (!(set instanceof os4)) {
            set.getClass();
            return new os4(set, zzgwaVar);
        }
        os4 os4Var2 = (os4) set;
        zzgwa zzgwaVar3 = os4Var2.b;
        zzgwaVar3.getClass();
        return new os4(os4Var2.a, new sp4(Arrays.asList(zzgwaVar3, zzgwaVar)));
    }

    public static boolean d(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            return set.size() == set2.size() && set.containsAll(set2);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static int c(Set set) {
        int iHashCode;
        int i = 0;
        for (Object obj : set) {
            if (obj != null) {
                iHashCode = obj.hashCode();
            } else {
                iHashCode = 0;
            }
            i += iHashCode;
        }
        return i;
    }

    public static boolean e(jc2 jc2Var, Collection collection) {
        collection.getClass();
        if (collection instanceof zzhas) {
            collection = ((zzhas) collection).zza();
        }
        boolean zRemove = false;
        if ((collection instanceof Set) && collection.size() > jc2Var.size()) {
            Iterator<E> it = jc2Var.iterator();
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    zRemove = true;
                }
            }
            return zRemove;
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            zRemove |= jc2Var.remove(it2.next());
        }
        return zRemove;
    }
}
