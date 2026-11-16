package defpackage;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class a implements GenericArrayType, Serializable {
    public final Type a;

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && uu.r(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return uu.O(this.a) + "[]";
    }

    public a(Type type) {
        this.a = uu.e(type);
    }
}
