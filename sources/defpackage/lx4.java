package defpackage;

import com.google.android.gms.internal.games_v2.zzhk;
import com.google.android.gms.internal.games_v2.zzil;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class lx4 extends zzhk {
    public final transient rx4 c;
    public final transient ox4 d;

    @Override // com.google.android.gms.internal.games_v2.zzgy, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.c.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.games_v2.zzgy
    /* JADX INFO: renamed from: d */
    public final zzil iterator() {
        return this.d.listIterator(0);
    }

    @Override // com.google.android.gms.internal.games_v2.zzhk, com.google.android.gms.internal.games_v2.zzgy, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.d.listIterator(0);
    }

    @Override // com.google.android.gms.internal.games_v2.zzgy
    public final int n(Object[] objArr) {
        return this.d.n(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.c.f;
    }

    public lx4(rx4 rx4Var, ox4 ox4Var) {
        this.c = rx4Var;
        this.d = ox4Var;
    }
}
