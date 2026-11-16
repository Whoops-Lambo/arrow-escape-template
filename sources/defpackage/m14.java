package defpackage;

import com.google.android.gms.internal.fido.zzbm;
import com.google.android.gms.internal.fido.zzcc;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class m14 extends zzcc {
    public final transient zzcc c;

    @Override // com.google.android.gms.internal.fido.zzcc, com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.c.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzcc zzccVar = this.c;
        zzbm.a(i, zzccVar.size());
        return zzccVar.get((zzccVar.size() - 1) - i);
    }

    @Override // com.google.android.gms.internal.fido.zzcc, java.util.List
    public final int indexOf(Object obj) {
        zzcc zzccVar = this.c;
        int iLastIndexOf = zzccVar.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (zzccVar.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.fido.zzcc, java.util.List
    public final int lastIndexOf(Object obj) {
        zzcc zzccVar = this.c;
        int iIndexOf = zzccVar.indexOf(obj);
        if (iIndexOf >= 0) {
            return (zzccVar.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.fido.zzcc
    public final zzcc n() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.fido.zzcc, java.util.List
    /* JADX INFO: renamed from: o */
    public final zzcc subList(int i, int i2) {
        zzcc zzccVar = this.c;
        zzbm.b(i, i2, zzccVar.size());
        return zzccVar.subList(zzccVar.size() - i2, zzccVar.size() - i).n();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }

    public m14(zzcc zzccVar) {
        this.c = zzccVar;
    }
}
