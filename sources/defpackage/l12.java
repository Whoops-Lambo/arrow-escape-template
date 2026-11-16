package defpackage;

import com.singular.sdk.internal.UserDetailsUtils;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class l12 {
    public final Class a;
    public final Class b;

    public static l12 a(Class cls) {
        return new l12(k12.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l12.class != obj.getClass()) {
            return false;
        }
        l12 l12Var = (l12) obj;
        if (this.b.equals(l12Var.b)) {
            return this.a.equals(l12Var.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.b;
        Class cls2 = this.a;
        if (cls2 == k12.class) {
            return cls.getName();
        }
        return UserDetailsUtils.UserDetailsLiterals.AT + cls2.getName() + " " + cls.getName();
    }

    public l12(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }
}
