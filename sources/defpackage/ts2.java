package defpackage;

import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class ts2 {
    public final Class a;
    public final Type b;
    public final int c;

    public final boolean equals(Object obj) {
        if (obj instanceof ts2) {
            return uu.r(this.b, ((ts2) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return uu.O(this.b);
    }

    public ts2(Type type) {
        type.getClass();
        Type typeE = uu.e(type);
        this.b = typeE;
        this.a = uu.x(typeE);
        this.c = typeE.hashCode();
    }
}
