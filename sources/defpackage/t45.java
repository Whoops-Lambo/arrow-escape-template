package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class t45 {
    public static final t45 a;
    public static final t45 b;
    public static final /* synthetic */ t45[] c;

    static {
        t45 t45Var = new t45("CONSENT", 0);
        a = t45Var;
        t45 t45Var2 = new t45("LEGITIMATE_INTEREST", 1);
        t45 t45Var3 = new t45("FLEXIBLE_CONSENT", 2);
        t45 t45Var4 = new t45("FLEXIBLE_LEGITIMATE_INTEREST", 3);
        b = t45Var4;
        c = new t45[]{t45Var, t45Var2, t45Var3, t45Var4};
    }

    public static t45[] values() {
        return (t45[]) c.clone();
    }
}
