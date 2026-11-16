package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class xy1 {
    public static final xy1 a;
    public static final xy1 b;
    public static final xy1 c;
    public static final /* synthetic */ xy1[] d;

    static {
        xy1 xy1Var = new xy1("DEFAULT", 0);
        a = xy1Var;
        xy1 xy1Var2 = new xy1("VERY_LOW", 1);
        b = xy1Var2;
        xy1 xy1Var3 = new xy1("HIGHEST", 2);
        c = xy1Var3;
        d = new xy1[]{xy1Var, xy1Var2, xy1Var3};
    }

    public static xy1 valueOf(String str) {
        return (xy1) Enum.valueOf(xy1.class, str);
    }

    public static xy1[] values() {
        return (xy1[]) d.clone();
    }
}
