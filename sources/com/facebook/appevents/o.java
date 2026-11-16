package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.d0;
import com.facebook.internal.f0;
import com.facebook.internal.k0;
import com.facebook.internal.v0;
import defpackage.dt1;
import defpackage.eu;
import defpackage.f41;
import defpackage.fj2;
import defpackage.gg;
import defpackage.i41;
import defpackage.ij;
import defpackage.j02;
import defpackage.j92;
import defpackage.k3;
import defpackage.lz;
import defpackage.m93;
import defpackage.ng1;
import defpackage.u31;
import defpackage.u43;
import defpackage.zg;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class o {
    public static final String c;
    public static ScheduledThreadPoolExecutor d;
    public static final Object e;
    public static volatile String f;
    public static boolean g;
    public static final m93 h;
    public final String a;
    public final b b;

    static {
        String canonicalName = o.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.AppEventsLoggerImpl";
        }
        c = canonicalName;
        e = new Object();
        h = new m93(27);
    }

    public static final String a() {
        if (lz.a.contains(o.class)) {
            return null;
        }
        try {
            return f;
        } catch (Throwable th) {
            lz.a(o.class, th);
            return null;
        }
    }

    public static final ScheduledThreadPoolExecutor b() {
        if (lz.a.contains(o.class)) {
            return null;
        }
        try {
            return d;
        } catch (Throwable th) {
            lz.a(o.class, th);
            return null;
        }
    }

    public static final Object c() {
        if (lz.a.contains(o.class)) {
            return null;
        }
        try {
            return e;
        } catch (Throwable th) {
            lz.a(o.class, th);
            return null;
        }
    }

    public static void g(o oVar, String str, Double d2, Bundle bundle, boolean z, UUID uuid) {
        if (lz.a.contains(o.class)) {
            return;
        }
        try {
            oVar.f(str, d2, bundle, z, uuid, null);
        } catch (Throwable th) {
            lz.a(o.class, th);
        }
    }

    public final void d(String str, double d2, Bundle bundle) {
        o oVar;
        if (lz.a.contains(this)) {
            return;
        }
        try {
            oVar = this;
            try {
                g(oVar, str, Double.valueOf(d2), bundle, false, k3.b());
            } catch (Throwable th) {
                th = th;
                lz.a(oVar, th);
            }
        } catch (Throwable th2) {
            th = th2;
            oVar = this;
        }
    }

    public final void e(String str, Bundle bundle) {
        o oVar;
        if (lz.a.contains(this)) {
            return;
        }
        try {
            oVar = this;
            try {
                g(oVar, str, null, bundle, false, k3.b());
            } catch (Throwable th) {
                th = th;
                lz.a(oVar, th);
            }
        } catch (Throwable th2) {
            th = th2;
            oVar = this;
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x011a  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void f(String str, Double d2, Bundle bundle, boolean z, UUID uuid, w wVar) {
        w wVar2;
        Bundle bundle2;
        boolean zContains;
        Double dValueOf;
        String string;
        if (lz.a.contains(this) || str == null) {
            return;
        }
        try {
            if (str.length() == 0) {
                return;
            }
            if (!z && gg.c() && (str.equals("fb_mobile_purchase") || str.equals("Subscribe") || str.equals("StartTrial"))) {
                Log.w(c, "You are logging purchase events while auto-logging of in-app purchase is enabled in the SDK. Make sure you don't log duplicate events");
                if ((com.facebook.internal.b0.b(com.facebook.internal.z.AndroidManualImplicitPurchaseDedupe) && str.equals("fb_mobile_purchase")) || (com.facebook.internal.b0.b(com.facebook.internal.z.AndroidManualImplicitSubsDedupe) && (str.equals("Subscribe") || str.equals("StartTrial")))) {
                    List list = f41.a;
                    Currency currency = null;
                    if (d2 == null) {
                        f0 appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(com.facebook.a0.b());
                        Iterator it = (((appSettingsWithoutQuery != null ? appSettingsWithoutQuery.x : null) == null || appSettingsWithoutQuery.x.isEmpty()) ? f41.b : appSettingsWithoutQuery.x).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                dValueOf = null;
                                break;
                            }
                            String str2 = (String) it.next();
                            if (bundle != null) {
                                try {
                                    dValueOf = Double.valueOf(bundle.getDouble(str2));
                                    break;
                                } catch (Exception unused) {
                                    continue;
                                }
                            }
                        }
                    } else {
                        dValueOf = d2;
                    }
                    List list2 = f41.a;
                    f0 appSettingsWithoutQuery2 = FetchedAppSettingsManager.getAppSettingsWithoutQuery(com.facebook.a0.b());
                    for (String str3 : ((appSettingsWithoutQuery2 != null ? appSettingsWithoutQuery2.w : null) == null || appSettingsWithoutQuery2.w.isEmpty()) ? f41.a : appSettingsWithoutQuery2.w) {
                        if (bundle != null) {
                            try {
                                string = bundle.getString(str3);
                            } catch (Exception unused2) {
                                continue;
                            }
                        } else {
                            string = currency;
                        }
                        if (string != 0 && string.length() != 0) {
                            currency = Currency.getInstance(string);
                            break;
                        }
                    }
                    if (dValueOf == null || currency == null) {
                        wVar2 = wVar;
                        bundle2 = bundle;
                    } else {
                        dt1 dt1VarA = f41.a(i41.c(eu.y(new u31(str, dValueOf.doubleValue(), currency)), System.currentTimeMillis(), false, eu.y(new dt1(bundle, wVar))), bundle, wVar);
                        bundle2 = (Bundle) dt1VarA.a;
                        wVar2 = (w) dt1VarA.b;
                    }
                } else {
                    wVar2 = wVar;
                    bundle2 = bundle;
                }
            } else {
                wVar2 = wVar;
                bundle2 = bundle;
            }
            if (d0.b("app_events_killswitch", com.facebook.a0.b(), false)) {
                n nVar = k0.c;
                synchronized (com.facebook.a0.b) {
                }
                return;
            }
            ij ijVar = ij.a;
            if (lz.a.contains(ij.class)) {
                zContains = false;
            } else {
                try {
                    if (ij.b) {
                        zContains = ij.c.contains(str);
                    }
                } catch (Throwable th) {
                    lz.a(ij.class, th);
                }
                zContains = false;
            }
            if (zContains) {
                return;
            }
            dt1 dt1VarJ = n.j(bundle2, wVar2, z);
            Bundle bundle3 = (Bundle) dt1VarJ.a;
            w wVar3 = (w) dt1VarJ.b;
            try {
                if (!j02.a.c(bundle3)) {
                    j92.b(bundle3, str);
                }
                zg.a(bundle3);
                ng1.r(bundle3, str);
                fj2.c(bundle3);
                j02.b(bundle3);
                u43.f(bundle3, str);
                n.h(new f(this.a, str, d2, bundle3, z, k3.k == 0, uuid, wVar3), this.b);
            } catch (com.facebook.u e2) {
                n nVar2 = k0.c;
                e2.toString();
                synchronized (com.facebook.a0.b) {
                }
            } catch (JSONException e3) {
                n nVar3 = k0.c;
                e3.toString();
                synchronized (com.facebook.a0.b) {
                }
            }
        } catch (Throwable th2) {
            lz.a(this, th2);
        }
    }

    public final void h(Bundle bundle, String str) {
        o oVar;
        if (lz.a.contains(this)) {
            return;
        }
        try {
            oVar = this;
            try {
                g(oVar, str, null, bundle, true, k3.b());
            } catch (Throwable th) {
                th = th;
                lz.a(oVar, th);
            }
        } catch (Throwable th2) {
            th = th2;
            oVar = this;
        }
    }

    public final void i(BigDecimal bigDecimal, Currency currency, Bundle bundle, boolean z, w wVar) {
        Throwable th;
        o oVar;
        if (lz.a.contains(this)) {
            return;
        }
        try {
            if (currency == null) {
                n nVar = k0.c;
                synchronized (com.facebook.a0.b) {
                }
                return;
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            try {
                bundle2.putString("fb_currency", currency.getCurrencyCode());
                oVar = this;
                try {
                    oVar.f("fb_mobile_purchase", Double.valueOf(bigDecimal.doubleValue()), bundle2, z, k3.b(), wVar);
                    try {
                        if (n.n() != 2) {
                            j.c(6);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        lz.a(oVar, th);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    lz.a(oVar, th);
                }
            } catch (Throwable th4) {
                th = th4;
                oVar = this;
            }
        } catch (Throwable th5) {
            th = th5;
            oVar = this;
        }
    }

    public o(String str, String str2) {
        v0.U();
        this.a = str;
        Date date = AccessToken.l;
        AccessToken accessTokenP = h.p();
        if (accessTokenP != null && !accessTokenP.b() && (str2 == null || str2.equals(accessTokenP.h))) {
            this.b = new b(accessTokenP.e, com.facebook.a0.b());
        } else {
            if (str2 == null) {
                v0.N(com.facebook.a0.a(), "context");
                str2 = com.facebook.a0.b();
            }
            this.b = new b(null, str2);
        }
        n.q();
    }

    public o(Context context, String str) {
        this(v0.n(context), str);
    }
}
