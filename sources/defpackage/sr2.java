package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class sr2 {
    public static final sr2 a;
    public static final sr2 b;
    public static final sr2 c;
    public static final sr2 d;
    public static final /* synthetic */ sr2[] e;

    static {
        sr2 sr2Var = new sr2("SUCCESSFUL", 0);
        a = sr2Var;
        sr2 sr2Var2 = new sr2("REREGISTER", 1);
        b = sr2Var2;
        sr2 sr2Var3 = new sr2("CANCELLED", 2);
        c = sr2Var3;
        sr2 sr2Var4 = new sr2("ALREADY_SELECTED", 3);
        d = sr2Var4;
        e = new sr2[]{sr2Var, sr2Var2, sr2Var3, sr2Var4};
    }

    public static sr2 valueOf(String str) {
        return (sr2) Enum.valueOf(sr2.class, str);
    }

    public static sr2[] values() {
        return (sr2[]) e.clone();
    }
}
