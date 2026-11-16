package defpackage;

import com.google.android.gms.internal.p002firebaseauthapi.zzaq;
import com.google.android.gms.internal.p002firebaseauthapi.zzaz;
import com.google.android.gms.internal.p002firebaseauthapi.zzba;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class mw3 extends zzaq {
    public final transient av3 d;
    public final transient lw3 e;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzag, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.d.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzag
    public final int h(Object[] objArr) {
        return this.e.h(objArr);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaq, com.google.android.gms.internal.p002firebaseauthapi.zzag, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: k */
    public final zzba iterator() {
        return (zzaz) this.e.listIterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.f;
    }

    public mw3(av3 av3Var, lw3 lw3Var) {
        this.d = av3Var;
        this.e = lw3Var;
    }
}
