package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class k52 implements Serializable {
    public final Object a;

    public static final /* synthetic */ k52 a(Object obj) {
        return new k52(obj);
    }

    public static final Throwable b(Object obj) {
        if (obj instanceof j52) {
            return ((j52) obj).a;
        }
        return null;
    }

    public static final boolean c(Object obj) {
        return !(obj instanceof j52);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k52) {
            return s71.b(this.a, ((k52) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof j52) {
            return ((j52) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public /* synthetic */ k52(Object obj) {
        this.a = obj;
    }
}
