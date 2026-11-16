package defpackage;

import com.google.android.gms.internal.nearby.zzsq;
import com.google.android.gms.internal.nearby.zzss;
import com.google.android.gms.internal.nearby.zzsu;
import com.google.android.gms.internal.nearby.zzsy;
import com.ironsource.C4664b4;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class j85 extends zzss {
    public final transient Object c;

    @Override // com.google.android.gms.internal.nearby.zzsn
    public final void a(Object[] objArr) {
        objArr[0] = this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.c.equals(obj);
    }

    @Override // com.google.android.gms.internal.nearby.zzss, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // com.google.android.gms.internal.nearby.zzss, com.google.android.gms.internal.nearby.zzsn
    public final zzsq i() {
        x75 x75Var = zzsq.b;
        Object[] objArr = {this.c};
        zzsu.a(1, objArr);
        return zzsq.t(1, objArr);
    }

    @Override // com.google.android.gms.internal.nearby.zzss, com.google.android.gms.internal.nearby.zzsn, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new e85(this.c);
    }

    @Override // com.google.android.gms.internal.nearby.zzsn
    /* JADX INFO: renamed from: k */
    public final zzsy iterator() {
        return new e85(this.c);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return C4664b4.j.d + this.c.toString() + ']';
    }

    public j85(Object obj) {
        this.c = obj;
    }
}
