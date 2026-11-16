package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class wx4 implements Map.Entry {
    public wx4 a;
    public wx4 b;
    public wx4 c;
    public wx4 d;
    public wx4 e;
    public final Object f;
    public final boolean g;
    public Object h;
    public int i;

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.h;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.h;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.h;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.g) {
            d.w("value == null");
            return null;
        }
        Object obj2 = this.h;
        this.h = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f);
        String strValueOf2 = String.valueOf(this.h);
        return jc1.o(strValueOf, "=", new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf2);
    }

    public wx4(boolean z, wx4 wx4Var, Object obj, wx4 wx4Var2, wx4 wx4Var3) {
        this.a = wx4Var;
        this.f = obj;
        this.g = z;
        this.i = 1;
        this.d = wx4Var2;
        this.e = wx4Var3;
        wx4Var3.d = this;
        wx4Var2.e = this;
    }

    public wx4(boolean z) {
        this.f = null;
        this.g = z;
        this.e = this;
        this.d = this;
    }
}
