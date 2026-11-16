package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class me1 implements Map.Entry {
    public me1 a;
    public me1 b;
    public me1 c;
    public me1 d;
    public me1 e;
    public final Object f;
    public Object g;
    public int h;

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.g;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.g;
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
        return this.g;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.g;
        this.g = obj;
        return obj2;
    }

    public final String toString() {
        return this.f + "=" + this.g;
    }

    public me1(me1 me1Var, Object obj, me1 me1Var2, me1 me1Var3) {
        this.a = me1Var;
        this.f = obj;
        this.h = 1;
        this.d = me1Var2;
        this.e = me1Var3;
        me1Var3.d = this;
        me1Var2.e = this;
    }

    public me1() {
        this.f = null;
        this.e = this;
        this.d = this;
    }
}
