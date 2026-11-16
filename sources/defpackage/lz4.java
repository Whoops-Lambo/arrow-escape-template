package defpackage;

import com.google.android.gms.internal.ads.zzigq;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class lz4 implements Map.Entry, Comparable {
    public final zzigq a;
    public Object b;
    public final /* synthetic */ mz4 c;

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                zzigq zzigqVar = this.a;
                if (zzigqVar == null) {
                    zEquals = key == null;
                } else {
                    zEquals = zzigqVar.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.b;
                    Object value = entry.getValue();
                    if (obj2 == null) {
                        zEquals2 = value == null;
                    } else {
                        zEquals2 = obj2.equals(value);
                    }
                    if (zEquals2) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        zzigq zzigqVar = this.a;
        int iHashCode = zzigqVar == null ? 0 : zzigqVar.hashCode();
        Object obj = this.b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.a.compareTo(((lz4) obj).a);
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.c.f();
        Object obj2 = this.b;
        this.b = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        return jc1.o(strValueOf, "=", new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf2);
    }

    public lz4(mz4 mz4Var, zzigq zzigqVar, Object obj) {
        this.c = mz4Var;
        this.a = zzigqVar;
        this.b = obj;
    }
}
