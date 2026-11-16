package defpackage;

import com.google.android.gms.internal.play_billing.zzbw;
import com.google.android.gms.internal.play_billing.zzca;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class h24 extends zzca {
    public final transient x24 c;
    public final transient p24 d;

    @Override // com.google.android.gms.internal.play_billing.zzbt
    public final int a(Object[] objArr) {
        return this.d.a(objArr);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.c.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzca, com.google.android.gms.internal.play_billing.zzbt
    public final zzbw i() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.play_billing.zzca, com.google.android.gms.internal.play_billing.zzbt, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.d.listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt
    /* JADX INFO: renamed from: k */
    public final g04 iterator() {
        return this.d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.c.f;
    }

    public h24(x24 x24Var, p24 p24Var) {
        this.c = x24Var;
        this.d = p24Var;
    }
}
