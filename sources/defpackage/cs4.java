package defpackage;

import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzgzb;
import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class cs4 extends zzgzb {
    public final /* synthetic */ ds4 c;

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final boolean o() {
        return true;
    }

    public cs4(ds4 ds4Var) {
        this.c = ds4Var;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        ds4 ds4Var = this.c;
        zzgvz.i(i, ds4Var.f);
        Object[] objArr = ds4Var.e;
        int i2 = i + i;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.f;
    }
}
