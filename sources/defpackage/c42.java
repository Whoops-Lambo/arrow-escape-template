package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class c42 extends d31 {
    public final transient Object[] c;
    public final transient int d;
    public final transient int e;

    @Override // defpackage.u21
    public final boolean o() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        fs1.i(i, this.e);
        Object obj = this.c[(i * 2) + this.d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }

    public c42(Object[] objArr, int i, int i2) {
        this.c = objArr;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.d31, defpackage.u21
    public Object writeReplace() {
        return super.writeReplace();
    }
}
