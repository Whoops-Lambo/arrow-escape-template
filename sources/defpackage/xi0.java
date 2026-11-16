package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class xi0 {
    public static final xi0 a;
    public static final xi0 b;
    public static final xi0 c;
    public static final /* synthetic */ xi0[] d;

    static {
        xi0 xi0Var = new xi0("NOT_RUN", 0);
        a = xi0Var;
        xi0 xi0Var2 = new xi0("CANCELLED", 1);
        b = xi0Var2;
        xi0 xi0Var3 = new xi0("STARTED", 2);
        c = xi0Var3;
        d = new xi0[]{xi0Var, xi0Var2, xi0Var3};
    }

    public static xi0 valueOf(String str) {
        return (xi0) Enum.valueOf(xi0.class, str);
    }

    public static xi0[] values() {
        return (xi0[]) d.clone();
    }
}
