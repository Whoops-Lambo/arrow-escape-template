package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class lq1 {
    public static final lq1 a;
    public static final /* synthetic */ lq1[] b;

    static {
        lq1 lq1Var = new lq1("WORLD", 0);
        a = lq1Var;
        b = new lq1[]{lq1Var, new lq1("EU", 1)};
    }

    public static lq1 valueOf(String str) {
        return (lq1) Enum.valueOf(lq1.class, str);
    }

    public static lq1[] values() {
        return (lq1[]) b.clone();
    }
}
