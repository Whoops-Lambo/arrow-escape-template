package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class hx3 {
    public static final hx3 a;
    public static final hx3 b;
    public static final hx3 c;
    public static final hx3 d;
    public static final /* synthetic */ hx3[] e;

    static {
        hx3 hx3Var = new hx3("UNINITIALIZED", 0);
        a = hx3Var;
        hx3 hx3Var2 = new hx3("AUTHENTICATING", 1);
        b = hx3Var2;
        hx3 hx3Var3 = new hx3("AUTHENTICATED", 2);
        c = hx3Var3;
        hx3 hx3Var4 = new hx3("AUTHENTICATION_FAILED", 3);
        d = hx3Var4;
        e = new hx3[]{hx3Var, hx3Var2, hx3Var3, hx3Var4};
    }

    public static hx3[] values() {
        return (hx3[]) e.clone();
    }
}
