package defpackage;

import com.google.android.gms.internal.fido.zzfi;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class kg4 extends AbstractSet {
    public final int a = -1;
    public final /* synthetic */ ql3 b;

    public kg4(ql3 ql3Var) {
        this.b = ql3Var;
    }

    public final int c() {
        if (this.a == -1) {
            return 0;
        }
        return this.b.c[0];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        ql3 ql3Var = this.b;
        Object[] objArr = ql3Var.b;
        int iC = c();
        int[] iArr = ql3Var.c;
        int i = this.a;
        return Arrays.binarySearch(objArr, iC, iArr[i + 1], obj, i == -1 ? ql3.h : zzfi.a) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new ml3(this, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.b.c[this.a + 1] - c();
    }
}
