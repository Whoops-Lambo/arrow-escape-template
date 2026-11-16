package defpackage;

import com.ironsource.C4887nc;
import com.safedk.android.a.g;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class vy0 {
    public static final vy0 b;
    public static final vy0 c;
    public static final vy0 d;
    public static final vy0 e;
    public static final List f;
    public final String a;

    static {
        vy0 vy0Var = new vy0(C4887nc.a);
        b = vy0Var;
        vy0 vy0Var2 = new vy0("POST");
        c = vy0Var2;
        vy0 vy0Var3 = new vy0(g.f);
        vy0 vy0Var4 = new vy0("PATCH");
        vy0 vy0Var5 = new vy0("DELETE");
        vy0 vy0Var6 = new vy0("HEAD");
        d = vy0Var6;
        vy0 vy0Var7 = new vy0("OPTIONS");
        e = vy0Var7;
        f = eu.z(vy0Var, vy0Var2, vy0Var3, vy0Var4, vy0Var5, vy0Var6, vy0Var7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vy0) && this.a.equals(((vy0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }

    public vy0(String str) {
        this.a = str;
    }
}
