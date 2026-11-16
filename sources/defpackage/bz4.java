package defpackage;

import com.google.android.gms.internal.games_v2.zzhk;
import com.google.android.gms.internal.games_v2.zzil;
import com.ironsource.C4664b4;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class bz4 extends zzhk {
    public final transient Object c;

    @Override // com.google.android.gms.internal.games_v2.zzgy
    public final int n(Object[] objArr) {
        objArr[0] = this.c;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // com.google.android.gms.internal.games_v2.zzgy, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.c.equals(obj);
    }

    @Override // com.google.android.gms.internal.games_v2.zzgy
    /* JADX INFO: renamed from: d */
    public final zzil iterator() {
        return new zv4(this.c);
    }

    @Override // com.google.android.gms.internal.games_v2.zzhk, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // com.google.android.gms.internal.games_v2.zzhk, com.google.android.gms.internal.games_v2.zzgy, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new zv4(this.c);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String string = this.c.toString();
        return jc1.o(C4664b4.j.d, string, new StringBuilder(String.valueOf(string).length() + 2), C4664b4.j.e);
    }

    public bz4(Object obj) {
        this.c = obj;
    }
}
