package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class ac2 {
    public static final ac2 a;
    public static final ac2 b;
    public static final /* synthetic */ ac2[] c;

    static {
        ac2 ac2Var = new ac2("CRASHLYTICS", 0);
        a = ac2Var;
        ac2 ac2Var2 = new ac2("PERFORMANCE", 1);
        b = ac2Var2;
        c = new ac2[]{ac2Var, ac2Var2, new ac2("MATT_SAYS_HI", 2)};
    }

    public static ac2 valueOf(String str) {
        return (ac2) Enum.valueOf(ac2.class, str);
    }

    public static ac2[] values() {
        return (ac2[]) c.clone();
    }
}
