package defpackage;

import com.google.android.gms.internal.measurement.zzabe;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class pl3 extends AbstractSet {
    public final int a;
    public final /* synthetic */ ql3 b;

    public final int c() {
        int i = this.a;
        if (i == -1) {
            return 0;
        }
        return this.b.c[i];
    }

    public pl3(ql3 ql3Var, int i) {
        this.b = ql3Var;
        this.a = i;
    }

    public final int d() {
        return this.b.c[this.a + 1];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new ml3(this, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        zm zmVar;
        int iC = c();
        int iD = d();
        if (this.a == -1) {
            zmVar = ql3.g;
        } else {
            zmVar = zzabe.b;
        }
        if (Arrays.binarySearch(this.b.b, iC, iD, obj, zmVar) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return d() - c();
    }
}
