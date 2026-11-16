package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class m1 extends n1 implements RandomAccess {
    public final n1 a;
    public final int b;
    public final int c;

    @Override // java.util.List
    public final Object get(int i) {
        n1.Companion.getClass();
        j1.b(i, this.c);
        return this.a.get(this.b + i);
    }

    @Override // defpackage.i0
    /* JADX INFO: renamed from: getSize */
    public final int getC() {
        return this.c;
    }

    @Override // defpackage.n1, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList
    public final List subList(int i, int i2) {
        n1.Companion.getClass();
        j1.d(i, i2, this.c);
        int i3 = this.b;
        return new m1(this.a, i + i3, i3 + i2);
    }

    public m1(n1 n1Var, int i, int i2) {
        this.a = n1Var;
        this.b = i;
        j1 j1Var = n1.Companion;
        int size = n1Var.size();
        j1Var.getClass();
        j1.d(i, i2, size);
        this.c = i2 - i;
    }
}
