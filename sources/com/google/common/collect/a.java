package com.google.common.collect;

import defpackage.so1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements so1 {
    public transient Collection a;
    public transient Set b;
    public transient Collection c;
    public transient Map d;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof so1) {
            return f().equals(((so1) obj).f());
        }
        return false;
    }

    public boolean a(Object obj) {
        Iterator it = f().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void b(String str, ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            get(str).addAll(arrayList);
        }
    }

    public final int hashCode() {
        return f().hashCode();
    }

    @Override // defpackage.so1
    public boolean remove(Object obj, Object obj2) {
        Collection collection = (Collection) f().get(obj);
        if (collection != null && collection.remove(obj2)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return f().toString();
    }
}
