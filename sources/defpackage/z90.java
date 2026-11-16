package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class z90 {
    public static final fa a;
    public static final xf1 b;

    static {
        ss2 ss2VarD;
        vr vrVarA = p32.a(az2.class);
        try {
            ss2VarD = p32.d(az2.class);
        } catch (Throwable unused) {
            ss2VarD = null;
        }
        a = new fa("ValidateMark", new ns2(vrVarA, ss2VarD));
        b = zf1.b("io.ktor.client.plugins.DefaultResponseValidation");
    }
}
