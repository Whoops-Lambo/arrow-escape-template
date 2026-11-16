package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class n83 {
    public static final xl1 a;
    public static final /* synthetic */ n83[] b;
    public static final /* synthetic */ kh0 c;

    /* JADX INFO: Fake field, exist only in values array */
    n83 EF5;

    static {
        n83[] n83VarArr = {new n83("MONDAY", 0), new n83("TUESDAY", 1), new n83("WEDNESDAY", 2), new n83("THURSDAY", 3), new n83("FRIDAY", 4), new n83("SATURDAY", 5), new n83("SUNDAY", 6)};
        b = n83VarArr;
        c = new kh0(n83VarArr);
        a = new xl1(16);
    }

    public static n83 valueOf(String str) {
        return (n83) Enum.valueOf(n83.class, str);
    }

    public static n83[] values() {
        return (n83[]) b.clone();
    }
}
