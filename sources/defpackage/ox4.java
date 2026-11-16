package defpackage;

import com.google.android.gms.internal.games_v2.zzfu;
import com.google.android.gms.internal.games_v2.zzhd;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class ox4 extends zzhd {
    public final transient Object[] c;
    public final transient int d;
    public final transient int e;

    @Override // java.util.List
    public final Object get(int i) {
        zzfu.a(i, this.e);
        Object obj = this.c[i + i + this.d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }

    public ox4(Object[] objArr, int i, int i2) {
        this.c = objArr;
        this.d = i;
        this.e = i2;
    }
}
