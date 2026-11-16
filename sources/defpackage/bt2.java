package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class bt2 {
    public static final bt2 a;
    public static final bt2 b;
    public static final bt2 c;
    public static final bt2 d;
    public static final /* synthetic */ bt2[] e;

    static {
        bt2 bt2Var = new bt2("NONE", 0);
        a = bt2Var;
        bt2 bt2Var2 = new bt2("BOTTOM_SHEET", 1);
        b = bt2Var2;
        bt2 bt2Var3 = new bt2("FULL_SCREEN_SAFE_AREA", 2);
        c = bt2Var3;
        bt2 bt2Var4 = new bt2("POPUP_BOTTOM", 3);
        d = bt2Var4;
        e = new bt2[]{bt2Var, bt2Var2, bt2Var3, bt2Var4};
    }

    public static bt2 valueOf(String str) {
        return (bt2) Enum.valueOf(bt2.class, str);
    }

    public static bt2[] values() {
        return (bt2[]) e.clone();
    }
}
