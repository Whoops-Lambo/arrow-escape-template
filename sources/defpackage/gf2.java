package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class gf2 {
    public static final gf2 a;
    public static final gf2 b;
    public static final gf2 c;
    public static final /* synthetic */ gf2[] d;

    static {
        gf2 gf2Var = new gf2("START", 0);
        a = gf2Var;
        gf2 gf2Var2 = new gf2("STOP", 1);
        b = gf2Var2;
        gf2 gf2Var3 = new gf2("STOP_AND_RESET_REPLAY_CACHE", 2);
        c = gf2Var3;
        d = new gf2[]{gf2Var, gf2Var2, gf2Var3};
    }

    public static gf2 valueOf(String str) {
        return (gf2) Enum.valueOf(gf2.class, str);
    }

    public static gf2[] values() {
        return (gf2[]) d.clone();
    }
}
