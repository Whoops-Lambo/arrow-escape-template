package defpackage;

import com.google.android.gms.internal.common.zzam;
import com.google.android.gms.internal.common.zzs;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class hr3 extends zzam {
    public final transient zzam c;

    @Override // com.google.android.gms.internal.common.zzam, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.c.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzam zzamVar = this.c;
        zzs.a(i, zzamVar.size());
        return zzamVar.get((zzamVar.size() - 1) - i);
    }

    @Override // com.google.android.gms.internal.common.zzam, java.util.List
    public final int indexOf(Object obj) {
        zzam zzamVar = this.c;
        int iLastIndexOf = zzamVar.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (zzamVar.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.common.zzam, java.util.List
    public final int lastIndexOf(Object obj) {
        zzam zzamVar = this.c;
        int iIndexOf = zzamVar.indexOf(obj);
        if (iIndexOf >= 0) {
            return (zzamVar.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.common.zzah
    public final boolean o() {
        return this.c.o();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }

    @Override // com.google.android.gms.internal.common.zzam
    public final zzam t() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.common.zzam, java.util.List
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final zzam subList(int i, int i2) {
        zzam zzamVar = this.c;
        zzs.c(i, i2, zzamVar.size());
        return zzamVar.subList(zzamVar.size() - i2, zzamVar.size() - i).t();
    }

    public hr3(zzam zzamVar) {
        this.c = zzamVar;
    }
}
