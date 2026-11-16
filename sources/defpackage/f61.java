package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class f61 {
    public static final f61 a;
    public static final f61 b;
    public static final /* synthetic */ f61[] c;

    static {
        f61 f61Var = new f61("FIRST_LAYER", 0);
        a = f61Var;
        f61 f61Var2 = new f61("NONE", 1);
        b = f61Var2;
        c = new f61[]{f61Var, f61Var2};
    }

    public static f61 valueOf(String str) {
        return (f61) Enum.valueOf(f61.class, str);
    }

    public static f61[] values() {
        return (f61[]) c.clone();
    }
}
