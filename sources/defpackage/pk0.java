package defpackage;

import com.google.protobuf.h0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class pk0 {
    public static final h0 a = new h0();
    public static final ok0 b;

    static {
        ok0 ok0Var = null;
        try {
            ok0Var = (ok0) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = ok0Var;
    }
}
