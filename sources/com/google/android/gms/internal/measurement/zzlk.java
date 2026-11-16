package com.google.android.gms.internal.measurement;

import android.content.Context;
import defpackage.a25;
import defpackage.d25;
import defpackage.lo1;
import defpackage.ol2;
import defpackage.os1;
import defpackage.uu;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzlk {
    public static final Object j = new Object();
    public static final AtomicReference k = new AtomicReference();
    public static volatile zzlk l = null;
    public static final ol2 m = uu.F(a25.b);
    public final zzol a = new zzol();
    public final Context b;
    public final ol2 c;
    public final ol2 d;
    public final ol2 e;
    public final ol2 f;
    public final zzrf g;
    public final ol2 h;
    public final zzqe i;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    public interface zza {
        os1 zza();
    }

    public static void b() {
        synchronized (g.a) {
        }
        if (k.get() == null && g.b == null) {
            g.b = new f(null);
        }
    }

    public final lo1 a() {
        return (lo1) this.c.get();
    }

    public zzlk(Context context, ol2 ol2Var, ol2 ol2Var2, ol2 ol2Var3, ol2 ol2Var4, ol2 ol2Var5) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        ol2Var.getClass();
        ol2Var2.getClass();
        ol2Var3.getClass();
        ol2Var4.getClass();
        ol2Var5.getClass();
        ol2 ol2VarF = uu.F(ol2Var);
        ol2 ol2VarF2 = uu.F(ol2Var2);
        ol2 ol2VarF3 = uu.F(new d25(ol2Var3, 0));
        ol2 ol2VarF4 = uu.F(ol2Var4);
        ol2 ol2VarF5 = uu.F(ol2Var5);
        this.b = applicationContext;
        this.c = ol2VarF;
        this.d = ol2VarF2;
        this.e = ol2VarF3;
        this.f = ol2VarF4;
        this.g = new zzrf(applicationContext, ol2VarF, ol2VarF4, ol2VarF2);
        this.h = ol2VarF5;
        this.i = new zzqe(applicationContext, ol2VarF, ol2VarF3, ol2VarF2);
    }
}
