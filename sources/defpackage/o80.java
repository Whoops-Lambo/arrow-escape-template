package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class o80 {
    public static final ab0 a;

    static {
        String property;
        cw0 cw0Var;
        ab0 ab0Var;
        int i = fm2.a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            ba0 ba0Var = xc0.a;
            cw0Var = wg1.a;
            cw0 cw0Var2 = cw0Var.f;
            if (cw0Var == null) {
                ab0Var = cw0Var;
                ab0Var = n80.j;
            }
        } else {
            ab0Var = n80.j;
        }
        ab0Var = cw0Var;
        a = ab0Var;
    }
}
