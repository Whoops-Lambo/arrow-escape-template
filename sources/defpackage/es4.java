package defpackage;

import com.google.android.gms.internal.ads.zzgzb;
import com.google.android.gms.internal.ads.zzgzl;
import com.google.android.gms.internal.ads.zzhbp;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class es4 extends zzgzl {
    public final transient js4 d;
    public final transient is4 e;

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final boolean o() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    /* JADX INFO: renamed from: d */
    public final zzhbp iterator() {
        return this.e.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl, com.google.android.gms.internal.ads.zzgyx, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.e.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl, com.google.android.gms.internal.ads.zzgyx
    public final zzgzb n() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final int r(Object[] objArr, int i) {
        return this.e.r(objArr, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.c;
    }

    public es4(js4 js4Var, is4 is4Var) {
        this.d = js4Var;
        this.e = is4Var;
    }
}
