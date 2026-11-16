package com.google.android.gms.internal.play_billing;

import com.ironsource.G5;
import defpackage.b24;
import defpackage.h24;
import defpackage.p24;
import defpackage.pv1;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class zzbz implements Map, Serializable {
    public transient zzca a;
    public transient zzca b;
    public transient zzbt c;

    public abstract p24 d();

    public abstract b24 f();

    public abstract h24 g();

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        zzbt zzbtVarD = this.c;
        if (zzbtVarD == null) {
            zzbtVarD = d();
            this.c = zzbtVarD;
        }
        return zzbtVarD.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        zzca zzcaVar = this.a;
        if (zzcaVar != null) {
            return zzcaVar;
        }
        b24 b24VarF = f();
        this.a = b24VarF;
        return b24VarF;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public final int hashCode() {
        zzca zzcaVarF = this.a;
        if (zzcaVarF == null) {
            zzcaVarF = f();
            this.a = zzcaVarF;
        }
        Iterator it = zzcaVarF.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        zzca zzcaVar = this.b;
        if (zzcaVar != null) {
            return zzcaVar;
        }
        h24 h24VarG = g();
        this.b = h24VarG;
        return h24VarG;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Collection values() {
        zzbt zzbtVar = this.c;
        if (zzbtVar != null) {
            return zzbtVar;
        }
        p24 p24VarD = d();
        this.c = p24VarD;
        return p24VarD;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        int size = size();
        if (size >= 0) {
            StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
            sb.append('{');
            boolean z = true;
            for (Map.Entry entry : entrySet()) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(entry.getKey());
                sb.append(G5.U);
                sb.append(entry.getValue());
                z = false;
            }
            sb.append('}');
            return sb.toString();
        }
        defpackage.d.r(pv1.k(size, "size cannot be negative but was: "));
        return null;
    }
}
