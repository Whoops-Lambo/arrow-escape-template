package io.p071bidmachine.analytics.internal.t;

import defpackage.du;
import defpackage.j52;
import io.p071bidmachine.analytics.internal.I.g;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class f {
    private Object a = new j52(new NullPointerException());
    private final String b = "amF2YS5sYW5nLlByb2Nlc3NCdWlsZGVy";
    private final String c = "c3RhcnQ=";
    private final String d = "Z2V0SW5wdXRTdHJlYW0=";
    private final String e = "ZGVzdHJveQ==";

    /* JADX WARN: Code duplicated, block: B:15:0x0056  */
    public final InputStream a(List list) {
        Object j52Var;
        Object objInvoke;
        try {
            Class<?> cls = Class.forName(g.a(this.b));
            j52Var = cls.getMethod(g.a(this.c), null).invoke(cls.getConstructor(List.class).newInstance(du.z0(list)), null);
        } catch (Throwable th) {
            j52Var = new j52(th);
        }
        this.a = j52Var;
        if (!(j52Var instanceof j52)) {
            if (j52Var != null) {
                try {
                    Method method = j52Var.getClass().getMethod(g.a(this.d), null);
                    if (method != null) {
                        objInvoke = method.invoke(j52Var, null);
                    } else {
                        objInvoke = null;
                    }
                    j52Var = (InputStream) objInvoke;
                } catch (Throwable th2) {
                    j52Var = new j52(th2);
                }
            } else {
                objInvoke = null;
                j52Var = (InputStream) objInvoke;
            }
        }
        return (InputStream) (j52Var instanceof j52 ? null : j52Var);
    }

    public final void a() {
        Object obj = this.a;
        if ((obj instanceof j52) || obj == null) {
            return;
        }
        try {
            Method method = obj.getClass().getMethod(g.a(this.e), null);
            if (method != null) {
                method.invoke(obj, null);
            }
        } catch (Throwable unused) {
        }
    }
}
