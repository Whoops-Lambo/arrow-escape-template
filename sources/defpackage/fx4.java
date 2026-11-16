package defpackage;

import com.google.android.gms.internal.games_v2.zzfu;
import com.google.android.gms.internal.games_v2.zzhd;
import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class fx4 extends zzhd {
    public final /* synthetic */ hx4 c;

    public fx4(hx4 hx4Var) {
        this.c = hx4Var;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        hx4 hx4Var = this.c;
        zzfu.a(i, hx4Var.e);
        Object[] objArr = hx4Var.d;
        int i2 = i + i;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.e;
    }
}
