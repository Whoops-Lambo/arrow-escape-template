package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class y32 extends d31 {
    public static final y32 e = new y32(new Object[0], 0);
    public final transient Object[] c;
    public final transient int d;

    @Override // defpackage.u21
    public final int n() {
        return 0;
    }

    @Override // defpackage.u21
    public final boolean o() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        fs1.i(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.d31, defpackage.u21
    public final int h(int i, Object[] objArr) {
        Object[] objArr2 = this.c;
        int i2 = this.d;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.u21
    public final Object[] i() {
        return this.c;
    }

    @Override // defpackage.u21
    public final int k() {
        return this.d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    public y32(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.d31, defpackage.u21
    public Object writeReplace() {
        return super.writeReplace();
    }
}
