package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class p72 {
    public static final p72 a;
    public static final p72 b;
    public static final p72 c;
    public static final /* synthetic */ p72[] d;

    static {
        p72 p72Var = new p72("NETWORK_UNMETERED", 0);
        a = p72Var;
        p72 p72Var2 = new p72("DEVICE_IDLE", 1);
        b = p72Var2;
        p72 p72Var3 = new p72("DEVICE_CHARGING", 2);
        c = p72Var3;
        d = new p72[]{p72Var, p72Var2, p72Var3};
    }

    public static p72 valueOf(String str) {
        return (p72) Enum.valueOf(p72.class, str);
    }

    public static p72[] values() {
        return (p72[]) d.clone();
    }
}
