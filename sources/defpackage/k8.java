package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class k8 {
    public static final int a;

    static {
        Object j52Var;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            j52Var = property != null ? kk2.M(property) : null;
        } catch (Throwable th) {
            j52Var = new j52(th);
        }
        Integer num = (Integer) (j52Var instanceof j52 ? null : j52Var);
        a = num != null ? num.intValue() : 2097152;
    }
}
