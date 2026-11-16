package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class a42 extends q31 {
    public final transient i31 d;
    public final transient Object[] e;
    public final transient int f;

    @Override // defpackage.u21
    public final boolean o() {
        return true;
    }

    @Override // defpackage.q31
    public final d31 A() {
        return new z32(this);
    }

    @Override // defpackage.u21, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f;
    }

    public a42(i31 i31Var, Object[] objArr, int i) {
        this.d = i31Var;
        this.e = objArr;
        this.f = i;
    }

    @Override // defpackage.u21
    public final int h(int i, Object[] objArr) {
        return d().h(i, objArr);
    }

    @Override // defpackage.u21
    /* JADX INFO: renamed from: r */
    public final d03 iterator() {
        return d().listIterator(0);
    }

    @Override // defpackage.q31, defpackage.u21
    public Object writeReplace() {
        return super.writeReplace();
    }
}
