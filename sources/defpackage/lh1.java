package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class lh1 {
    public static final kh1 a;
    public static final kh1 b;

    static {
        kh1 kh1Var = null;
        try {
            kh1Var = (kh1) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = kh1Var;
        b = new kh1();
    }
}
