package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class kt0 {
    public static final kt0 a;
    public static final kt0 b;
    public static final /* synthetic */ kt0[] c;

    static {
        kt0 kt0Var = new kt0("SEND", 0);
        a = kt0Var;
        kt0 kt0Var2 = new kt0("ASKFOR", 1);
        b = kt0Var2;
        c = new kt0[]{kt0Var, kt0Var2, new kt0("TURN", 2), new kt0("INVITE", 3)};
    }

    public static kt0 valueOf(String str) {
        return (kt0) Enum.valueOf(kt0.class, str);
    }

    public static kt0[] values() {
        return (kt0[]) c.clone();
    }
}
