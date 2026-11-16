package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class xm {
    public static final xm a;
    public static final /* synthetic */ xm[] b;

    static {
        xm xmVar = new xm("US_CA_ONLY", 0);
        a = xmVar;
        b = new xm[]{xmVar, new xm("US", 1), new xm("ALL", 2)};
    }

    public static xm valueOf(String str) {
        return (xm) Enum.valueOf(xm.class, str);
    }

    public static xm[] values() {
        return (xm[]) b.clone();
    }
}
