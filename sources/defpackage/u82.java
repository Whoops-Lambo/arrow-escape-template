package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class u82 {
    public static mn2 a(mn2 mn2Var) throws nn2, sg0 {
        mn2Var.getClass();
        it0 it0Var = mn2Var.b;
        if (it0Var != null) {
            if (it0Var.k) {
                String upperCase = it0Var.m.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                mn2Var.j = upperCase;
                Integer num = it0Var.d;
                if (num != null) {
                    mn2Var.h(new yj2(num.intValue()));
                }
                try {
                    return (mn2) ((zr0) v82.a.get(mn2Var.g - 1)).invoke(mn2Var, it0Var);
                } catch (Throwable unused) {
                    throw new sg0(pv1.k(mn2Var.g, "Invalid version "));
                }
            }
            throw new sg0("Unable to encode TCModel tcModel.gvl.readyPromise is not resolved");
        }
        throw new sg0("Unable to encode TCModel without a GVL");
    }
}
