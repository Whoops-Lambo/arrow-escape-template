package defpackage;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class z32 extends d31 {
    public final /* synthetic */ a42 c;

    @Override // defpackage.u21
    public final boolean o() {
        return true;
    }

    public z32(a42 a42Var) {
        this.c = a42Var;
    }

    @Override // java.util.List
    public final Object get(int i) {
        a42 a42Var = this.c;
        fs1.i(i, a42Var.f);
        Object[] objArr = a42Var.e;
        int i2 = i * 2;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.f;
    }

    @Override // defpackage.d31, defpackage.u21
    public Object writeReplace() {
        return super.writeReplace();
    }
}
