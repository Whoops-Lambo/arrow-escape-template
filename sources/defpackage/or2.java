package defpackage;

import java.util.AbstractMap;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class or2 {
    public final TreeMap a = new TreeMap();

    public final Map a() {
        return new mr2(this, this.a.values());
    }

    public final Map.Entry b(Long l) {
        Map.Entry entryFloorEntry = this.a.floorEntry(new v30(l));
        if (entryFloorEntry == null) {
            return null;
        }
        z12 z12Var = ((nr2) entryFloorEntry.getValue()).a;
        z12Var.getClass();
        if (!z12Var.a.f(l) || z12Var.b.f(l)) {
            return null;
        }
        return (Map.Entry) entryFloorEntry.getValue();
    }

    public final void c(z12 z12Var, Object obj) {
        w30 w30Var = z12Var.a;
        w30 w30Var2 = z12Var.b;
        boolean zEquals = w30Var.equals(w30Var2);
        w30 w30Var3 = z12Var.a;
        if (zEquals) {
            return;
        }
        obj.getClass();
        boolean zEquals2 = w30Var3.equals(w30Var2);
        TreeMap treeMap = this.a;
        if (!zEquals2) {
            Map.Entry entryLowerEntry = treeMap.lowerEntry(w30Var3);
            if (entryLowerEntry != null) {
                z12 z12Var2 = ((nr2) entryLowerEntry.getValue()).a;
                w30 w30Var4 = z12Var2.b;
                w30 w30Var5 = z12Var2.b;
                if (w30Var4.compareTo(w30Var3) > 0) {
                    if (w30Var5.compareTo(w30Var2) > 0) {
                        d(w30Var2, w30Var5, ((nr2) entryLowerEntry.getValue()).b);
                    }
                    d(z12Var2.a, w30Var3, ((nr2) entryLowerEntry.getValue()).b);
                }
            }
            Map.Entry entryLowerEntry2 = treeMap.lowerEntry(w30Var2);
            if (entryLowerEntry2 != null) {
                nr2 nr2Var = (nr2) entryLowerEntry2.getValue();
                if (nr2Var.a.b.compareTo(w30Var2) > 0) {
                    d(w30Var2, nr2Var.a.b, ((nr2) entryLowerEntry2.getValue()).b);
                }
            }
            treeMap.subMap(w30Var3, w30Var2).clear();
        }
        treeMap.put(w30Var3, new nr2(z12Var, obj));
    }

    public final void d(w30 w30Var, w30 w30Var2, Object obj) {
        this.a.put(w30Var, new nr2(new z12(w30Var, w30Var2), obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof or2)) {
            return false;
        }
        return ((AbstractMap) a()).equals(((or2) obj).a());
    }

    public final String toString() {
        return this.a.values().toString();
    }

    public final int hashCode() {
        return ((AbstractMap) a()).hashCode();
    }
}
