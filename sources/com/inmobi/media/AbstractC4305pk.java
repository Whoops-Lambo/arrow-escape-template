package com.inmobi.media;

import android.content.Context;
import android.os.SystemClock;
import com.inmobi.media.AbstractC4305pk;
import defpackage.dk2;
import defpackage.wr0;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: com.inmobi.media.pk, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC4305pk {
    public static byte c;
    public static boolean d;
    public static byte f;
    public static final AtomicBoolean a = new AtomicBoolean(false);
    public static final AtomicLong b = new AtomicLong(-1);
    public static final ArrayList e = new ArrayList();
    public static volatile C4135ji g = new C4135ji(null, false);

    public static void a(Context context, long j, long j2, C4277ok c4277ok, wr0 wr0Var) {
        if (d) {
            AbstractC4333qk.a(j2, c4277ok.d);
            Short sh = c4277ok.d;
            if (sh != null && sh.shortValue() == 2424) {
                Short sh2 = c4277ok.d;
                Ta ta = Ta.a;
                Ta.a(context, "PreInitCompleted", Long.valueOf(j2), sh2);
                d = false;
                return;
            }
            if (c4277ok.c) {
                Context context2 = AbstractC4221mk.a;
                if (j > 0) {
                    AbstractC4221mk.e.compareAndSet(0L, j);
                }
            }
            Context context3 = AbstractC4221mk.a;
            context.getClass();
            AbstractC4221mk.a = context.getApplicationContext();
            if (AbstractC4221mk.c() || AbstractC4221mk.j == 1) {
                Ta ta2 = Ta.a;
                Ta.a(context, "PreInitCompleted", Long.valueOf(j2), (short) 2421);
                d = false;
                return;
            }
            Short sh3 = c4277ok.d;
            if (sh3 != null) {
                Ta ta3 = Ta.a;
                Ta.a(context, "PreInitCompleted", Long.valueOf(j2), sh3);
                d = false;
                return;
            }
            String str = c4277ok.a;
            if (str == null) {
                Ta ta4 = Ta.a;
                Ta.a(context, "PreInitCompleted", Long.valueOf(j2), (short) 2420);
                d = false;
            } else {
                d = false;
                c = (byte) 1;
                AtomicLong atomicLong = b;
                atomicLong.set(SystemClock.elapsedRealtime());
                atomicLong.get();
                wr0Var.invoke(str);
            }
        }
    }

    public static final void b(final Context context, long j, final long j2, final wr0 wr0Var) {
        final C4277ok c4277okA = a(context);
        g = new C4135ji(c4277okA.a, c4277okA.b);
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
        AbstractC3889am.a(new Runnable() { // from class: zf3
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC4305pk.b(context, j2, jElapsedRealtime, c4277okA, wr0Var);
            }
        });
    }

    public static final void b(Context context, long j, long j2, C4277ok c4277ok, wr0 wr0Var) {
        a(context, j, j2, c4277ok, wr0Var);
    }

    public static Long a() {
        long j = b.get();
        if (j < 0) {
            return null;
        }
        return Long.valueOf(SystemClock.elapsedRealtime() - j);
    }

    public static C4277ok a(Context context) {
        String string;
        Short sh;
        try {
            boolean zA = AbstractC4416tk.a(context);
            context.getClass();
            Context applicationContext = context.getApplicationContext();
            ConcurrentHashMap concurrentHashMap = Db.b;
            boolean z = applicationContext.getSharedPreferences(Cb.a("sdk_pre_init_config"), 0).getBoolean("enabled", false);
            boolean zB = AbstractC4416tk.b(context);
            Context context2 = AbstractC4221mk.a;
            String string2 = Cb.a(context, "coppa_store").a.getString("im_accid", null);
            if (string2 == null || (string = dk2.y0(string2).toString()) == null || string.length() <= 0) {
                string = null;
            }
            if (zA) {
                sh = (short) 2423;
            } else if (!z) {
                sh = (short) 2424;
            } else {
                sh = string == null ? (short) 2420 : null;
            }
            return new C4277ok(string, zA, zB, sh);
        } catch (Exception e2) {
            e2.getMessage();
            return new C4277ok(null, false, false, (short) 2422);
        }
    }

    public static boolean a(Context context, long j, long j2, wr0 wr0Var) {
        context.getClass();
        wr0Var.getClass();
        if (c == 0 && !AbstractC4221mk.c() && AbstractC4221mk.j != 1) {
            d = true;
            AbstractC4221mk.h.submit(new defpackage.ya(context, j2, j, wr0Var));
            return true;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j2;
        Ta ta = Ta.a;
        Ta.a(context, "PreInitCompleted", Long.valueOf(jElapsedRealtime), (short) 2421);
        return false;
    }
}
