package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class y33 {
    public static final y33 a;
    public static final y33 b;
    public static final y33 c;
    public static final /* synthetic */ y33[] d;

    static {
        y33 y33Var = new y33("DEFAULT", 0);
        a = y33Var;
        y33 y33Var2 = new y33("CCPA", 1);
        b = y33Var2;
        y33 y33Var3 = new y33("TCF", 2);
        c = y33Var3;
        d = new y33[]{y33Var, y33Var2, y33Var3};
    }

    public static y33 valueOf(String str) {
        return (y33) Enum.valueOf(y33.class, str);
    }

    public static y33[] values() {
        return (y33[]) d.clone();
    }
}
