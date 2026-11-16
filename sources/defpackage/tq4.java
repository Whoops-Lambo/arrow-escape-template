package defpackage;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class tq4 implements Map.Entry {
    public final Object a;
    public int b;
    public final /* synthetic */ uq4 c;

    public final void a() {
        int i = this.b;
        Object obj = this.a;
        uq4 uq4Var = this.c;
        if (i != -1 && i < uq4Var.size()) {
            if (Objects.equals(obj, uq4Var.f()[this.b])) {
                return;
            }
        }
        this.b = uq4Var.q(obj);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (Objects.equals(getKey(), entry.getKey()) && Objects.equals(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        uq4 uq4Var = this.c;
        Map mapJ = uq4Var.j();
        if (mapJ != null) {
            return mapJ.get(this.a);
        }
        a();
        int i = this.b;
        if (i == -1) {
            return null;
        }
        return uq4Var.g()[i];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        uq4 uq4Var = this.c;
        Map mapJ = uq4Var.j();
        Object obj2 = this.a;
        if (mapJ != null) {
            return mapJ.put(obj2, obj);
        }
        a();
        int i = this.b;
        if (i == -1) {
            uq4Var.put(obj2, obj);
            return null;
        }
        Object obj3 = uq4Var.g()[i];
        uq4Var.g()[this.b] = obj;
        return obj3;
    }

    public tq4(uq4 uq4Var, int i) {
        Objects.requireNonNull(uq4Var);
        this.c = uq4Var;
        this.a = uq4Var.f()[i];
        this.b = i;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int iHashCode;
        Object key = getKey();
        Object value = getValue();
        int iHashCode2 = 0;
        if (key == null) {
            iHashCode = 0;
        } else {
            iHashCode = key.hashCode();
        }
        if (value != null) {
            iHashCode2 = value.hashCode();
        }
        return iHashCode ^ iHashCode2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(getKey());
        String strValueOf2 = String.valueOf(getValue());
        return jc1.o(strValueOf, "=", new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf2);
    }
}
