package defpackage;

import com.google.android.gms.internal.games_v2.zzfu;
import com.google.android.gms.internal.games_v2.zzhd;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class fs4 extends zzhd {
    public final transient zzhd c;

    @Override // com.google.android.gms.internal.games_v2.zzhd, com.google.android.gms.internal.games_v2.zzgy, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.c.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzhd zzhdVar = this.c;
        zzfu.a(i, zzhdVar.size());
        return zzhdVar.get((zzhdVar.size() - 1) - i);
    }

    @Override // com.google.android.gms.internal.games_v2.zzhd, java.util.List
    public final int indexOf(Object obj) {
        zzhd zzhdVar = this.c;
        int iLastIndexOf = zzhdVar.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (zzhdVar.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.games_v2.zzhd, java.util.List
    public final int lastIndexOf(Object obj) {
        zzhd zzhdVar = this.c;
        int iIndexOf = zzhdVar.indexOf(obj);
        if (iIndexOf >= 0) {
            return (zzhdVar.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.games_v2.zzhd
    public final zzhd o() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.games_v2.zzhd, java.util.List
    /* JADX INFO: renamed from: r */
    public final zzhd subList(int i, int i2) {
        zzhd zzhdVar = this.c;
        zzfu.c(i, i2, zzhdVar.size());
        return zzhdVar.subList(zzhdVar.size() - i2, zzhdVar.size() - i).o();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }

    public fs4(zzhd zzhdVar) {
        this.c = zzhdVar;
    }
}
