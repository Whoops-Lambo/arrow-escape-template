package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class w61 {
    public static final w61 a;
    public static final w61 b;
    public static final w61 c;
    public static final w61 d;
    public static final w61 e;
    public static final w61 f;
    public static final /* synthetic */ w61[] g;

    static {
        w61 w61Var = new w61("Unknown", 0);
        a = w61Var;
        w61 w61Var2 = new w61("Analysis", 1);
        b = w61Var2;
        w61 w61Var3 = new w61("AnrReport", 2);
        c = w61Var3;
        w61 w61Var4 = new w61("CrashReport", 3);
        d = w61Var4;
        w61 w61Var5 = new w61("CrashShield", 4);
        e = w61Var5;
        w61 w61Var6 = new w61("ThreadCheck", 5);
        f = w61Var6;
        g = new w61[]{w61Var, w61Var2, w61Var3, w61Var4, w61Var5, w61Var6};
    }

    public static w61 valueOf(String str) {
        return (w61) Enum.valueOf(w61.class, str);
    }

    public static w61[] values() {
        return (w61[]) g.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int i = v61.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return "Analysis";
        }
        if (i == 2) {
            return "AnrReport";
        }
        if (i == 3) {
            return "CrashReport";
        }
        if (i != 4) {
            return i != 5 ? "Unknown" : "ThreadCheck";
        }
        return "CrashShield";
    }
}
