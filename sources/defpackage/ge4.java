package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class ge4 {
    public static final zd4 a = new zd4();
    public static final zd4 b;

    static {
        zd4 zd4Var = null;
        try {
            zd4Var = (zd4) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = zd4Var;
    }
}
