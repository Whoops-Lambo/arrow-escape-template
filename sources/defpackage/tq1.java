package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class tq1 {
    public static final sq1 a;
    public static final sq1 b;

    static {
        sq1 sq1Var = null;
        try {
            sq1Var = (sq1) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = sq1Var;
        b = new sq1();
    }
}
