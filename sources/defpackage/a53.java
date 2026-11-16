package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class a53 implements Iterable, bc1 {
    public int a;
    public int b;
    public final LinkedHashSet c = new LinkedHashSet();

    public final boolean c(int i) {
        return this.c.contains(Integer.valueOf(i));
    }

    public final void clear() {
        this.c.clear();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        obj.getClass();
        a53 a53Var = (a53) obj;
        return this.c.containsAll(a53Var.c) && this.b == a53Var.b && this.a == a53Var.a;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new k1(this);
    }

    public final void k(List list) {
        Set setE0 = du.E0(list);
        LinkedHashSet linkedHashSet = this.c;
        linkedHashSet.removeAll(setE0);
        this.a = 0;
        Integer num = (Integer) du.j0(linkedHashSet);
        this.b = num != null ? num.intValue() : 0;
    }

    public final void d(int i) {
        e(eu.y(Integer.valueOf(i)));
    }

    public final void e(List list) {
        int iIntValue;
        list.getClass();
        LinkedHashSet linkedHashSet = this.c;
        linkedHashSet.addAll(list);
        this.a = 0;
        Integer num = (Integer) du.j0(linkedHashSet);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        this.b = iIntValue;
        this.a = 0;
    }

    public final void h(int i) {
        k(eu.y(Integer.valueOf(i)));
    }
}
