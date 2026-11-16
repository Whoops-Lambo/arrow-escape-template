package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class mm2 {
    public static final mm2 a;
    public static final /* synthetic */ mm2[] b;

    /* JADX INFO: Fake field, exist only in values array */
    mm2 EF0;

    static {
        mm2 mm2Var = new mm2("GLOBAL", 0);
        mm2 mm2Var2 = new mm2("SERVICE", 1);
        a = mm2Var2;
        b = new mm2[]{mm2Var, mm2Var2};
    }

    public static mm2 valueOf(String str) {
        return (mm2) Enum.valueOf(mm2.class, str);
    }

    public static mm2[] values() {
        return (mm2[]) b.clone();
    }
}
