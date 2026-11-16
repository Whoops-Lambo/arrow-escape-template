package defpackage;

import com.google.android.gms.internal.p002firebaseauthapi.zzalo;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class jt3 implements Comparable, Map.Entry {
    public final zzalo a;
    public Object b;
    public final /* synthetic */ kt3 c;

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                zzalo zzaloVar = this.a;
                if (zzaloVar == null) {
                    zEquals = key == null;
                } else {
                    zEquals = zzaloVar.equals(key);
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
        zzalo zzaloVar = this.a;
        int iHashCode = zzaloVar == null ? 0 : zzaloVar.hashCode();
        Object obj = this.b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.a.compareTo(((jt3) obj).a);
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
        this.c.g();
        Object obj2 = this.b;
        this.b = obj;
        return obj2;
    }

    public final String toString() {
        return h50.i(String.valueOf(this.a), "=", String.valueOf(this.b));
    }

    public jt3(kt3 kt3Var, zzalo zzaloVar, Object obj) {
        this.c = kt3Var;
        this.a = zzaloVar;
        this.b = obj;
    }
}
