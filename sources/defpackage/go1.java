package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class go1 {
    public static final xl1 a;
    public static final /* synthetic */ go1[] b;
    public static final /* synthetic */ kh0 c;

    /* JADX INFO: Fake field, exist only in values array */
    go1 EF5;

    static {
        go1[] go1VarArr = {new go1("JANUARY", 0), new go1("FEBRUARY", 1), new go1("MARCH", 2), new go1("APRIL", 3), new go1("MAY", 4), new go1("JUNE", 5), new go1("JULY", 6), new go1("AUGUST", 7), new go1("SEPTEMBER", 8), new go1("OCTOBER", 9), new go1("NOVEMBER", 10), new go1("DECEMBER", 11)};
        b = go1VarArr;
        c = new kh0(go1VarArr);
        a = new xl1(14);
    }

    public static go1 valueOf(String str) {
        return (go1) Enum.valueOf(go1.class, str);
    }

    public static go1[] values() {
        return (go1[]) b.clone();
    }
}
