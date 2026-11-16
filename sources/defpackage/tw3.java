package defpackage;

import com.google.android.gms.internal.p002firebaseauthapi.zzaq;
import com.google.android.gms.internal.p002firebaseauthapi.zzba;
import com.ironsource.C4664b4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class tw3 extends zzaq {
    public final transient String d = "global";

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzag
    public final int h(Object[] objArr) {
        objArr[0] = this.d;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzag, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaq, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaq, com.google.android.gms.internal.p002firebaseauthapi.zzag, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: k */
    public final zzba iterator() {
        return new ju3(this.d);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return pv1.n(C4664b4.j.d, this.d.toString(), C4664b4.j.e);
    }
}
