package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class s7 {
    public static final s7 a;
    public static final s7 b;
    public static final /* synthetic */ s7[] c;

    static {
        s7 s7Var = new s7("MOBILE_INSTALL_EVENT", 0);
        a = s7Var;
        s7 s7Var2 = new s7("CUSTOM_APP_EVENTS", 1);
        b = s7Var2;
        c = new s7[]{s7Var, s7Var2};
    }

    public static s7 valueOf(String str) {
        return (s7) Enum.valueOf(s7.class, str);
    }

    public static s7[] values() {
        return (s7[]) c.clone();
    }
}
