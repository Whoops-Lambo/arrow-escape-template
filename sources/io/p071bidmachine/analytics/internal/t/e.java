package io.p071bidmachine.analytics.internal.t;

import defpackage.e80;
import defpackage.j52;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class e {
    private static final a d = new a(null);
    private final int a;
    private final Map b;
    private final Object c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {
        public /* synthetic */ a(e80 e80Var) {
            this();
        }

        private a() {
        }
    }

    public final InputStream a(String str) {
        Object j52Var;
        synchronized (this.c) {
            try {
                g gVar = (g) this.b.remove(str);
                j52Var = new ByteArrayInputStream(gVar != null ? h.a(gVar) : null);
            } catch (Throwable th) {
                j52Var = new j52(th);
            }
        }
        return (InputStream) (j52Var instanceof j52 ? null : j52Var);
    }

    public final String b(String str) {
        Object j52Var;
        Long lA;
        synchronized (this.c) {
            try {
                g gVar = (g) this.b.get(str);
                j52Var = (gVar == null || (lA = gVar.a()) == null) ? null : lA.toString();
            } catch (Throwable th) {
                j52Var = new j52(th);
            }
        }
        return (String) (j52Var instanceof j52 ? null : j52Var);
    }

    public e(int i) {
        this.a = i;
        this.b = new LinkedHashMap();
        this.c = new Object();
    }

    public /* synthetic */ e(int i, int i2, e80 e80Var) {
        this((i2 & 1) != 0 ? 2097152 : i);
    }

    public final void a(String str, String str2) {
        synchronized (this.c) {
            try {
                Map map = this.b;
                Object objA = map.get(str);
                if (objA == null) {
                    objA = a();
                    map.put(str, objA);
                }
                ((g) objA).a(str2);
            } catch (Throwable unused) {
            }
        }
    }

    private final g a() {
        int i = this.a;
        return new g(i / 2, i);
    }
}
