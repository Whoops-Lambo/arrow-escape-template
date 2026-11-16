package defpackage;

import com.google.android.gms.internal.games_v2.zzhd;
import com.google.android.gms.internal.games_v2.zzhk;
import com.google.android.gms.internal.games_v2.zzil;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class hx4 extends zzhk {
    public final transient rx4 c;
    public final transient Object[] d;
    public final transient int e;

    @Override // com.google.android.gms.internal.games_v2.zzgy, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        return value != null && value.equals(this.c.get(key));
    }

    @Override // com.google.android.gms.internal.games_v2.zzhk
    public final zzhd r() {
        return new fx4(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.e;
    }

    public hx4(rx4 rx4Var, Object[] objArr, int i) {
        this.c = rx4Var;
        this.d = objArr;
        this.e = i;
    }

    @Override // com.google.android.gms.internal.games_v2.zzgy
    /* JADX INFO: renamed from: d */
    public final zzil iterator() {
        return o().listIterator(0);
    }

    @Override // com.google.android.gms.internal.games_v2.zzhk, com.google.android.gms.internal.games_v2.zzgy, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return o().listIterator(0);
    }

    @Override // com.google.android.gms.internal.games_v2.zzgy
    public final int n(Object[] objArr) {
        return o().n(objArr);
    }
}
