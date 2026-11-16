package defpackage;

import com.google.android.gms.internal.consent_sdk.zzdw;
import com.google.android.gms.internal.consent_sdk.zzeb;
import com.ironsource.C4664b4;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class pb4 extends zzdw {
    public final transient Object c;

    @Override // com.google.android.gms.internal.consent_sdk.zzds
    public final void a(Object[] objArr) {
        objArr[0] = this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.c.equals(obj);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdw, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds
    /* JADX INFO: renamed from: i */
    public final zzeb iterator() {
        return new xa4(this.c);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdw, com.google.android.gms.internal.consent_sdk.zzds, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new xa4(this.c);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return pv1.n(C4664b4.j.d, this.c.toString(), C4664b4.j.e);
    }

    public pb4(Object obj) {
        this.c = obj;
    }
}
