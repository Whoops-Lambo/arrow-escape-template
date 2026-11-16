package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class js1 {
    public static final js1 a;
    public static final /* synthetic */ js1[] b;

    /* JADX INFO: Fake field, exist only in values array */
    js1 EF0;

    static {
        js1 js1Var = new js1("SKIP", 0);
        js1 js1Var2 = new js1("TERMINATE", 1);
        a = js1Var2;
        b = new js1[]{js1Var, js1Var2};
    }

    public static js1 valueOf(String str) {
        return (js1) Enum.valueOf(js1.class, str);
    }

    public static js1[] values() {
        return (js1[]) b.clone();
    }
}
