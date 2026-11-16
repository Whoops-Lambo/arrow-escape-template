package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class l02 {
    public static final l02 a;
    public static final /* synthetic */ l02[] b;

    static {
        l02 l02Var = new l02("DEFAULT", 0);
        a = l02Var;
        b = new l02[]{l02Var, new l02("SIGNED", 1), new l02("FIXED", 2)};
    }

    public static l02 valueOf(String str) {
        return (l02) Enum.valueOf(l02.class, str);
    }

    public static l02[] values() {
        return (l02[]) b.clone();
    }
}
