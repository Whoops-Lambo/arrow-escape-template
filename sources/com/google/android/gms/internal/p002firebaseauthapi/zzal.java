package com.google.android.gms.internal.p002firebaseauthapi;

import com.ironsource.G5;
import defpackage.d;
import defpackage.lw3;
import defpackage.mw3;
import defpackage.pv1;
import defpackage.zv3;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzal<K, V> implements Serializable, Map<K, V> {
    public transient zzaq a;
    public transient zzaq b;
    public transient zzag c;

    public abstract lw3 d();

    public abstract zv3 f();

    public abstract mw3 g();

    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final /* synthetic */ Set entrySet() {
        zzaq zzaqVar = this.a;
        if (zzaqVar != null) {
            return zzaqVar;
        }
        zv3 zv3VarF = f();
        this.a = zv3VarF;
        return zv3VarF;
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
    public final /* synthetic */ Set keySet() {
        zzaq zzaqVar = this.b;
        if (zzaqVar != null) {
            return zzaqVar;
        }
        mw3 mw3VarG = g();
        this.b = mw3VarG;
        return mw3VarG;
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
    public final /* synthetic */ Collection values() {
        zzag zzagVar = this.c;
        if (zzagVar != null) {
            return zzagVar;
        }
        lw3 lw3VarD = d();
        this.c = lw3VarD;
        return lw3VarD;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return ((zzag) values()).contains(obj);
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
    public final int hashCode() {
        int iHashCode;
        int i = 0;
        for (Object obj : (zzaq) entrySet()) {
            if (obj != null) {
                iHashCode = obj.hashCode();
            } else {
                iHashCode = 0;
            }
            i = ~(~(i + iHashCode));
        }
        return i;
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
            StringBuilder sb = new StringBuilder((int) Math.min(((long) size) << 3, 1073741824L));
            sb.append('{');
            boolean z = true;
            for (Map.Entry<K, V> entry : entrySet()) {
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
        d.r(pv1.k(size, "size cannot be negative but was: "));
        return null;
    }
}
