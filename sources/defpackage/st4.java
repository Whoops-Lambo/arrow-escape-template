package defpackage;

import com.google.android.gms.internal.ads.zzhcz;
import com.google.android.gms.internal.ads.zzhfm;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class st4 extends zzhfm implements ListenableFuture {
    public static final Object d = new Object();
    public static final ld1 e = new ld1(2, zzhcz.class);
    public static final boolean f;
    public static final ns1 g;
    public volatile Object a;
    public volatile it4 b;
    public volatile rt4 c;

    public final void d(rt4 rt4Var) {
        rt4Var.a = null;
        while (true) {
            rt4 rt4Var2 = this.c;
            if (rt4Var2 != rt4.c) {
                rt4 rt4Var3 = null;
                while (rt4Var2 != null) {
                    rt4 rt4Var4 = rt4Var2.b;
                    if (rt4Var2.a != null) {
                        rt4Var3 = rt4Var2;
                    } else if (rt4Var3 != null) {
                        rt4Var3.b = rt4Var4;
                        if (rt4Var3.a == null) {
                        }
                    } else if (!g.J(this, rt4Var2, rt4Var4)) {
                    }
                    rt4Var2 = rt4Var4;
                }
                return;
            }
            return;
        }
    }

    static {
        boolean z;
        ns1 mt4Var;
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
                mt4Var = new qt4();
            } catch (Error | Exception e2) {
                try {
                    mt4Var = new lt4();
                } catch (Error | Exception e3) {
                    th3 = e3;
                    mt4Var = new mt4();
                }
                th = th3;
                th2 = e2;
            }
        } else {
            try {
                mt4Var = new lt4();
            } catch (NoClassDefFoundError unused2) {
                mt4Var = new mt4();
            }
        }
        th = null;
        th2 = null;
        g = mt4Var;
        if (th != null) {
            ld1 ld1Var = e;
            Logger loggerB = ld1Var.b();
            Level level = Level.SEVERE;
            loggerB.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            ld1Var.b().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }
}
