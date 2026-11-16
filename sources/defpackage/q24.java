package defpackage;

import com.google.android.gms.internal.fido.zzcc;
import com.google.android.gms.internal.fido.zzcj;
import java.util.AbstractMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class q24 extends zzcc {
    public final /* synthetic */ w24 c;

    public q24(w24 w24Var) {
        this.c = w24Var;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzcj zzcjVar = this.c.d;
        return new AbstractMap.SimpleImmutableEntry(zzcjVar.c.f.get(i), zzcjVar.d.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.d.d.size();
    }
}
