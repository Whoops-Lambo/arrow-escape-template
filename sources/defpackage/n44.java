package defpackage;

import com.google.android.gms.internal.play_billing.zzcm;
import com.google.android.gms.internal.play_billing.zzdc;
import com.google.android.gms.internal.play_billing.zzdi;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class n44 extends zzdi implements zzdc {
    public static final Object d = new Object();
    public static final ld1 e = new ld1(1, zzcm.class);
    public static final boolean f;
    public static final uu g;
    public volatile Object a;
    public volatile a44 b;
    public volatile m44 c;

    public final void c(m44 m44Var) {
        m44Var.a = null;
        while (true) {
            m44 m44Var2 = this.c;
            if (m44Var2 != m44.c) {
                m44 m44Var3 = null;
                while (m44Var2 != null) {
                    m44 m44Var4 = m44Var2.b;
                    if (m44Var2.a != null) {
                        m44Var3 = m44Var2;
                    } else if (m44Var3 != null) {
                        m44Var3.b = m44Var4;
                        if (m44Var3.a == null) {
                        }
                    } else if (!g.W(this, m44Var2, m44Var4)) {
                    }
                    m44Var2 = m44Var4;
                }
                return;
            }
            return;
        }
    }

    static {
        boolean z;
        uu k44Var;
        Throwable th;
        Throwable th2;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f = z;
        String property = System.getProperty("java.runtime.name", "");
        Throwable th3 = null;
        if (property == null || property.contains("Android")) {
            try {
                k44Var = new l44();
            } catch (Error | Exception e2) {
                try {
                    k44Var = new j44();
                } catch (Error | Exception e3) {
                    th3 = e3;
                    k44Var = new k44();
                }
                th = th3;
                th2 = e2;
            }
        } else {
            try {
                k44Var = new j44();
            } catch (NoClassDefFoundError unused2) {
                k44Var = new k44();
            }
        }
        th = null;
        th2 = null;
        g = k44Var;
        if (th != null) {
            ld1 ld1Var = e;
            Logger loggerB = ld1Var.b();
            Level level = Level.SEVERE;
            loggerB.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            ld1Var.b().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }
}
