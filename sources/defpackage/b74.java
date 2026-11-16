package defpackage;

import com.google.android.gms.internal.fido.zzcc;
import com.google.android.gms.internal.fido.zzcf;
import com.google.android.gms.internal.fido.zzdc;
import com.ironsource.C4664b4;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class b74 extends zzcf {
    public final transient Object d;

    @Override // com.google.android.gms.internal.fido.zzby
    public final int a(Object[] objArr) {
        objArr[0] = this.d;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override // com.google.android.gms.internal.fido.zzcf, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // com.google.android.gms.internal.fido.zzby
    /* JADX INFO: renamed from: i */
    public final zzdc iterator() {
        return new b44(this.d);
    }

    @Override // com.google.android.gms.internal.fido.zzcf, com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new b44(this.d);
    }

    @Override // com.google.android.gms.internal.fido.zzcf
    public final zzcc r() {
        Object[] objArr = {this.d};
        for (int i = 0; i < 1; i++) {
            d14 d14Var = zzcc.b;
            if (objArr[i] == null) {
                d.w(pv1.k(i, "at index "));
                return null;
            }
        }
        return zzcc.r(1, objArr);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return pv1.n(C4664b4.j.d, this.d.toString(), C4664b4.j.e);
    }

    public b74(Object obj) {
        this.d = obj;
    }
}
