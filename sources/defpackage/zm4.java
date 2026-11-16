package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zm4 {
    public static final zm4 a;
    public static final zm4 b;
    public static final zm4 c;
    public static final zm4 d;
    public static final zm4 e;
    public static final zm4 f;
    public static final /* synthetic */ zm4[] g;

    static {
        zm4 zm4Var = new zm4("RESULT_UNKNOWN", 0);
        a = zm4Var;
        zm4 zm4Var2 = new zm4("RESULT_NOOP_LOCAL_PROGRAM_STILL_VALID", 1);
        b = zm4Var2;
        zm4 zm4Var3 = new zm4("RESULT_UPDATED", 2);
        c = zm4Var3;
        zm4 zm4Var4 = new zm4("RESULT_NOOP_NO_NEW_PROGRAM", 3);
        d = zm4Var4;
        zm4 zm4Var5 = new zm4("RESULT_FAILURE_INVALID_RESPONSE", 4);
        e = zm4Var5;
        zm4 zm4Var6 = new zm4("RESULT_FAILURE_FETCHER_HTTP_RUNTIME_EXCEPTION", 5);
        f = zm4Var6;
        g = new zm4[]{zm4Var, zm4Var2, zm4Var3, zm4Var4, zm4Var5, zm4Var6};
    }

    public static zm4[] values() {
        return (zm4[]) g.clone();
    }
}
