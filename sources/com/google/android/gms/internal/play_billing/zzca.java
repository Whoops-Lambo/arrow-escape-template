package com.google.android.gms.internal.play_billing;

import defpackage.g04;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class zzca extends zzbt implements Set {
    public transient zzbw b;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt
    public zzbw i() {
        zzbw zzbwVar = this.b;
        if (zzbwVar != null) {
            return zzbwVar;
        }
        zzbw zzbwVarR = r();
        this.b = zzbwVarR;
        return zzbwVarR;
    }

    public zzbw r() {
        Object[] array = toArray(zzbt.a);
        g04 g04Var = zzbw.b;
        return zzbw.t(array.length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int iHashCode;
        int i = 0;
        for (Object obj : this) {
            if (obj != null) {
                iHashCode = obj.hashCode();
            } else {
                iHashCode = 0;
            }
            i += iHashCode;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
