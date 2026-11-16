package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class ck2 implements ak2 {
    public final Map c;

    @Override // defpackage.ak2
    public final boolean a() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ak2)) {
            return false;
        }
        ak2 ak2Var = (ak2) obj;
        if (true != ak2Var.a()) {
            return false;
        }
        return d().equals(ak2Var.d());
    }

    @Override // defpackage.ak2
    public final void b(zr0 zr0Var) {
        for (Map.Entry entry : this.c.entrySet()) {
            zr0Var.invoke((String) entry.getKey(), (List) entry.getValue());
        }
    }

    @Override // defpackage.ak2
    public final Set d() {
        Set setEntrySet = this.c.entrySet();
        setEntrySet.getClass();
        Set setUnmodifiableSet = Collections.unmodifiableSet(setEntrySet);
        setUnmodifiableSet.getClass();
        return setUnmodifiableSet;
    }

    @Override // defpackage.ak2
    public final String get(String str) {
        List list = (List) this.c.get(str);
        if (list != null) {
            return (String) du.c0(list);
        }
        return null;
    }

    @Override // defpackage.ak2
    public final boolean isEmpty() {
        return this.c.isEmpty();
    }

    public ck2(Map map) {
        map.getClass();
        dp dpVar = new dp();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add((String) list.get(i));
            }
            dpVar.put(str, arrayList);
        }
        this.c = dpVar;
    }

    public final int hashCode() {
        Set setD = d();
        return setD.hashCode() + (Boolean.hashCode(true) * 961);
    }
}
