package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class ho0 {
    public static final ho0 a;
    public static final /* synthetic */ ho0[] b;

    static {
        ho0 ho0Var = new ho0("LEFT", 0);
        a = ho0Var;
        b = new ho0[]{ho0Var, new ho0("CENTER", 1), new ho0("RIGHT", 2)};
    }

    public static ho0 valueOf(String str) {
        return (ho0) Enum.valueOf(ho0.class, str);
    }

    public static ho0[] values() {
        return (ho0[]) b.clone();
    }
}
