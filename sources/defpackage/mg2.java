package defpackage;

import com.ironsource.C4664b4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class mg2 extends q31 {
    public final transient Object d;

    @Override // defpackage.u21
    public final boolean o() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // defpackage.u21, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override // defpackage.q31, defpackage.u21
    public final d31 d() {
        return d31.E(this.d);
    }

    @Override // defpackage.u21
    public final int h(int i, Object[] objArr) {
        objArr[i] = this.d;
        return i + 1;
    }

    @Override // defpackage.q31, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // defpackage.u21
    /* JADX INFO: renamed from: r */
    public final d03 iterator() {
        return new q81(this.d);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return C4664b4.j.d + this.d.toString() + ']';
    }

    public mg2(Object obj) {
        obj.getClass();
        this.d = obj;
    }

    @Override // defpackage.q31, defpackage.u21
    public Object writeReplace() {
        return super.writeReplace();
    }
}
