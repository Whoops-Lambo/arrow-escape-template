package defpackage;

import com.google.android.gms.internal.base.zaaa;
import com.google.android.gms.internal.base.zau;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class lj3 extends zaaa {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ zaaa e;

    public lj3(zaaa zaaaVar, int i, int i2) {
        this.e = zaaaVar;
        this.c = i;
        this.d = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zau.a(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // com.google.android.gms.internal.base.zax
    public final Object[] h() {
        return this.e.h();
    }

    @Override // com.google.android.gms.internal.base.zax
    public final int i() {
        return this.e.i() + this.c;
    }

    @Override // com.google.android.gms.internal.base.zax
    public final int k() {
        return this.e.i() + this.c + this.d;
    }

    @Override // com.google.android.gms.internal.base.zaaa, java.util.List
    /* JADX INFO: renamed from: o */
    public final zaaa subList(int i, int i2) {
        zau.b(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
