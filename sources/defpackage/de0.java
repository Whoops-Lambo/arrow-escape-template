package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class de0 {
    public static final de0 a;
    public static final /* synthetic */ de0[] b;

    /* JADX INFO: Fake field, exist only in values array */
    de0 EF0;

    static {
        de0 de0Var = new de0("ALL", 0);
        de0 de0Var2 = new de0("SHORT", 1);
        a = de0Var2;
        b = new de0[]{de0Var, de0Var2};
    }

    public static de0 valueOf(String str) {
        return (de0) Enum.valueOf(de0.class, str);
    }

    public static de0[] values() {
        return (de0[]) b.clone();
    }
}
