package defpackage;

import java.util.Collection;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class l31 extends u21 {
    public final e31 b;

    @Override // defpackage.u21, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            this.b.getClass();
            Collection collection = (Collection) d42.g.get(key);
            if (collection != null && collection.contains(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.u21
    /* JADX INFO: renamed from: r */
    public final d03 iterator() {
        e31 e31Var = this.b;
        e31Var.getClass();
        return new j31(e31Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        this.b.getClass();
        return 0;
    }

    public l31(e31 e31Var) {
        this.b = e31Var;
    }

    @Override // defpackage.u21
    public Object writeReplace() {
        return super.writeReplace();
    }
}
