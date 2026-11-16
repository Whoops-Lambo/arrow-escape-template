package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class d33 {
    public static final d33 a;
    public static final d33 b;
    public static final d33 c;
    public static final d33 d;
    public static final /* synthetic */ d33[] e;

    static {
        d33 d33Var = new d33("NONE", 0);
        a = d33Var;
        d33 d33Var2 = new d33("ERROR", 1);
        b = d33Var2;
        d33 d33Var3 = new d33("WARNING", 2);
        c = d33Var3;
        d33 d33Var4 = new d33("DEBUG", 3);
        d = d33Var4;
        e = new d33[]{d33Var, d33Var2, d33Var3, d33Var4};
    }

    public static d33 valueOf(String str) {
        return (d33) Enum.valueOf(d33.class, str);
    }

    public static d33[] values() {
        return (d33[]) e.clone();
    }
}
