package defpackage;

import java.util.Map;
import java.util.Set;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class iy0 {
    public static final fa a;
    public static final Set b;

    static {
        ss2 ss2VarB;
        vr vrVarA = p32.a(Map.class);
        try {
            KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
            ss2VarB = p32.b(p32.g(companion.invariant(p32.e(hy0.class, companion.getSTAR())), companion.invariant(p32.d(Object.class))));
        } catch (Throwable unused) {
            ss2VarB = null;
        }
        a = new fa("EngineCapabilities", new ns2(vrVarA, ss2VarB));
        b = kc2.x(u01.a);
    }
}
