package com.moloco.sdk.internal.error.crash;

import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import android.os.Process;
import com.facebook.internal.j0;
import com.moloco.sdk.BuildConfig;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.error.crash.data.local.CrashReportDb;
import com.moloco.sdk.internal.error.crash.delivery.r;
import com.moloco.sdk.internal.publisher.k0;
import com.moloco.sdk.internal.services.b0;
import com.moloco.sdk.internal.services.m;
import com.moloco.sdk.internal.services.n;
import com.moloco.sdk.internal.services.q;
import com.moloco.sdk.internal.services.s;
import defpackage.az2;
import defpackage.dk2;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.n8;
import defpackage.sr0;
import defpackage.wr0;
import defpackage.wz2;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class j {
    public final Context a;
    public final com.facebook.ads.a b;
    public final com.moloco.sdk.internal.error.crash.data.b c;
    public final com.moloco.sdk.internal.error.crash.delivery.b d;
    public final r e;
    public final com.moloco.sdk.internal.services.config.a f;
    public final s g;
    public final q h;
    public final com.moloco.sdk.internal.services.g i;
    public final m j;
    public final com.moloco.sdk.internal.services.usertracker.c k;
    public final c l;
    public final sr0 m;
    public final String n;
    public final com.moloco.sdk.internal.error.crash.anr.g o;
    public final AtomicBoolean p;
    public final AtomicBoolean q;
    public volatile j0 r;

    public j(Context context, com.facebook.ads.a aVar, com.moloco.sdk.internal.error.crash.data.b bVar, com.moloco.sdk.internal.error.crash.delivery.b bVar2, r rVar, com.moloco.sdk.internal.services.config.a aVar2, s sVar, q qVar, com.moloco.sdk.internal.services.g gVar, m mVar, com.moloco.sdk.internal.services.usertracker.c cVar, c cVar2, com.moloco.sdk.internal.error.crash.anr.g gVar2) {
        g gVar3 = g.b;
        bVar.getClass();
        bVar2.getClass();
        rVar.getClass();
        aVar2.getClass();
        sVar.getClass();
        qVar.getClass();
        gVar.getClass();
        mVar.getClass();
        cVar.getClass();
        cVar2.getClass();
        this.a = context;
        this.b = aVar;
        this.c = bVar;
        this.d = bVar2;
        this.e = rVar;
        this.f = aVar2;
        this.g = sVar;
        this.h = qVar;
        this.i = gVar;
        this.j = mVar;
        this.k = cVar;
        this.l = cVar2;
        this.m = gVar3;
        this.n = BuildConfig.MOLOCO_CRASH_REPORTING_PROGUARD_UUID;
        this.o = gVar2;
        this.p = new AtomicBoolean(false);
        this.q = new AtomicBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b1 A[PHI: r6 r21
  0x00b1: PHI (r6v2 boolean) = (r6v5 boolean), (r6v5 boolean), (r6v5 boolean), (r6v5 boolean), (r6v5 boolean), (r6v6 boolean) binds: [B:40:0x00af, B:36:0x00a4, B:31:0x0097, B:27:0x008c, B:22:0x007f, B:17:0x0071] A[DONT_GENERATE, DONT_INLINE]
  0x00b1: PHI (r21v1 java.lang.String) = 
  (r21v4 java.lang.String)
  (r21v4 java.lang.String)
  (r21v4 java.lang.String)
  (r21v4 java.lang.String)
  (r21v4 java.lang.String)
  (r21v5 java.lang.String)
 binds: [B:40:0x00af, B:36:0x00a4, B:31:0x0097, B:27:0x008c, B:22:0x007f, B:17:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e1 A[Catch: all -> 0x00ee, TryCatch #0 {all -> 0x00ee, blocks: (B:49:0x00d7, B:51:0x00e1, B:54:0x00e7), top: B:61:0x00d7 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ee  */
    public final com.moloco.sdk.internal.error.crash.model.e a(String str, String str2) {
        String str3;
        boolean z;
        boolean z2;
        Object systemService;
        PowerManager powerManager;
        String str4;
        String str5;
        com.moloco.sdk.internal.services.r rVarA = this.g.a();
        b0 b0VarA = this.h.a();
        com.moloco.sdk.internal.services.f fVarA = this.i.a();
        String str6 = rVarA.b;
        String str7 = rVarA.a;
        String str8 = rVarA.c;
        String str9 = rVarA.d;
        Context context = this.a;
        String str10 = (context.getApplicationInfo().flags & 2) != 0 ? "debug" : "release";
        String str11 = b0VarA.b;
        String str12 = b0VarA.a;
        String[] strArr = Build.SUPPORTED_ABIS;
        String str13 = strArr != null ? (String) n8.e0(strArr) : null;
        if (str13 == null) {
            str13 = "";
        }
        String string = Locale.getDefault().toString();
        string.getClass();
        Integer numValueOf = Integer.valueOf(fVarA.a);
        Integer numValueOf2 = Integer.valueOf(fVarA.c);
        String str14 = Build.FINGERPRINT;
        String str15 = str13;
        try {
            if (str14 != null) {
                str3 = str6;
                z = false;
                if (dk2.O(str14, "generic", false)) {
                    z2 = true;
                }
                String str16 = Build.VERSION.RELEASE;
                String str17 = Build.DISPLAY;
                String str18 = str17 != null ? str17 : "";
                int i = b0VarA.e;
                String property = System.getProperty("java.vm.version");
                String country = Locale.getDefault().getCountry();
                country.getClass();
                systemService = context.getSystemService("power");
                if (systemService instanceof PowerManager) {
                    powerManager = (PowerManager) systemService;
                } else {
                    powerManager = null;
                }
                boolean z3 = (powerManager == null && powerManager.isPowerSaveMode()) ? true : z;
                return new com.moloco.sdk.internal.error.crash.model.e(this.n, str3, str7, str8, str9, str10, str11, str12, str15, string, numValueOf, numValueOf2, z2, str18, i, property, str, str2, country, String.valueOf(z3), String.valueOf(Process.myPid()));
            }
            str3 = str6;
            z = false;
            systemService = context.getSystemService("power");
            if (systemService instanceof PowerManager) {
                powerManager = (PowerManager) systemService;
            } else {
                powerManager = null;
            }
            if (powerManager == null) {
            }
        } catch (Throwable unused) {
        }
        if ((str14 == null || !dk2.O(str14, "emulator", z)) && (((str4 = Build.MODEL) == null || !dk2.O(str4, "Emulator", z)) && ((str4 == null || !dk2.O(str4, "sdk_gphone", z)) && (((str5 = Build.HARDWARE) == null || !dk2.O(str5, "ranchu", z)) && (str5 == null || !dk2.O(str5, "goldfish", z)))))) {
            z2 = z;
        } else {
            z2 = true;
        }
        String str19 = Build.VERSION.RELEASE;
        String str110 = Build.DISPLAY;
        if (str110 != null) {
        }
        int i2 = b0VarA.e;
        String property2 = System.getProperty("java.vm.version");
        String country2 = Locale.getDefault().getCountry();
        country2.getClass();
        return new com.moloco.sdk.internal.error.crash.model.e(this.n, str3, str7, str8, str9, str10, str11, str12, str15, string, numValueOf, numValueOf2, z2, str18, i2, property2, str, str2, country2, String.valueOf(z3), String.valueOf(Process.myPid()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(fy fyVar) {
        i iVar;
        if (fyVar instanceof i) {
            iVar = (i) fyVar;
            int i = iVar.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                iVar.u = i - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, fyVar);
            }
        } else {
            iVar = new i(this, fyVar);
        }
        Object obj = iVar.s;
        int i2 = iVar.u;
        az2 az2Var = az2.a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    j jVar = iVar.r;
                    wz2.a0(obj);
                    return az2Var;
                }
                if (i2 != 2) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j jVar2 = iVar.r;
                wz2.a0(obj);
                return az2Var;
            }
            wz2.a0(obj);
            com.moloco.sdk.internal.services.config.a aVar = this.f;
            aVar.getClass();
            LinkedHashMap linkedHashMap = aVar.b;
            if (!linkedHashMap.containsKey("CrashReportingInitScanDeliveryDisabled")) {
                boolean zContainsKey = linkedHashMap.containsKey("CrashReportingWmDeliveryDisabled");
                dz dzVar = dz.a;
                if (zContainsKey) {
                    r rVar = this.e;
                    iVar.r = this;
                    iVar.u = 1;
                    if (rVar.c("app_start_scan", iVar) == dzVar) {
                        return dzVar;
                    }
                } else {
                    com.moloco.sdk.internal.error.crash.delivery.b bVar = this.d;
                    iVar.r = this;
                    iVar.u = 2;
                    if (((com.moloco.sdk.internal.error.crash.delivery.i) bVar).a(iVar) == dzVar) {
                        return dzVar;
                    }
                }
            }
            return az2Var;
        } catch (Throwable th) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "CrashReportingService", "Pending crash report scan failed", th, false, 8, null);
            this.l.b("pending_scan");
            return az2Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final Object c(com.moloco.sdk.internal.configs.a aVar, fy fyVar) {
        h hVar;
        j jVar;
        String str;
        Object objA;
        final j jVar2 = this;
        com.moloco.sdk.internal.configs.a aVar2 = aVar;
        az2 az2Var = az2.a;
        if (fyVar instanceof h) {
            hVar = (h) fyVar;
            int i = hVar.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                hVar.w = i - Integer.MIN_VALUE;
            } else {
                hVar = new h(jVar2, fyVar);
            }
        } else {
            hVar = new h(jVar2, fyVar);
        }
        Object obj = hVar.u;
        dz dzVar = dz.a;
        int i2 = hVar.w;
        final int i3 = 0;
        final int i4 = 1;
        try {
            if (i2 == 0) {
                wz2.a0(obj);
                if (aVar2.a && !dk2.Z(aVar2.b) && jVar2.p.compareAndSet(false, true)) {
                    k0 k0VarA = ((n) jVar2.j).a();
                    com.moloco.sdk.internal.services.k kVar = k0VarA instanceof com.moloco.sdk.internal.services.k ? (com.moloco.sdk.internal.services.k) k0VarA : null;
                    str = kVar != null ? kVar.a : null;
                    com.moloco.sdk.internal.services.usertracker.c cVar = jVar2.k;
                    hVar.r = jVar2;
                    hVar.s = aVar2;
                    hVar.t = str;
                    hVar.w = 1;
                    objA = cVar.a(hVar);
                    if (objA == dzVar) {
                    }
                }
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j jVar3 = hVar.r;
                wz2.a0(obj);
                return az2Var;
            }
            String str2 = hVar.t;
            com.moloco.sdk.internal.configs.a aVar3 = hVar.s;
            jVar = hVar.r;
            try {
                wz2.a0(obj);
                str = str2;
                aVar2 = aVar3;
                jVar2 = jVar;
                objA = obj;
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                jVar.l.c(false);
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "CrashReportingService", "Crash reporting enable failed", th2, false, 8, null);
                jVar.p.set(false);
            }
            com.moloco.sdk.internal.error.crash.model.e eVarA = jVar2.a(str, (String) objA);
            CrashReportDb.a.a(jVar2.a);
            com.moloco.sdk.internal.error.crash.delivery.f.a = new wr0(jVar2) { // from class: com.moloco.sdk.internal.error.crash.e
                public final /* synthetic */ j b;

                {
                    this.b = jVar2;
                }

                @Override // defpackage.wr0
                public final Object invoke(Object obj2) {
                    int i5 = i3;
                    j jVar4 = this.b;
                    Context context = (Context) obj2;
                    switch (i5) {
                        case 0:
                            context.getClass();
                            return jVar4.e;
                        default:
                            context.getClass();
                            return jVar4.d;
                    }
                }
            };
            com.moloco.sdk.internal.error.crash.delivery.f.b = new wr0(jVar2) { // from class: com.moloco.sdk.internal.error.crash.e
                public final /* synthetic */ j b;

                {
                    this.b = jVar2;
                }

                @Override // defpackage.wr0
                public final Object invoke(Object obj2) {
                    int i5 = i4;
                    j jVar4 = this.b;
                    Context context = (Context) obj2;
                    switch (i5) {
                        case 0:
                            context.getClass();
                            return jVar4.e;
                        default:
                            context.getClass();
                            return jVar4.d;
                    }
                }
            };
            jVar2.r = new j0(6, aVar2.b, eVarA);
            jVar2.l.c(true);
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "CrashReportingService", "Crash reporting enabled — endpoint=".concat(aVar2.b), null, false, 12, null);
            jVar2.d(aVar2.b);
            hVar.r = jVar2;
            hVar.s = null;
            hVar.t = null;
            hVar.w = 2;
            return jVar2.b(hVar) == dzVar ? dzVar : az2Var;
        } catch (Throwable th3) {
            th = th3;
            jVar = jVar2;
        }
    }

    public final void d(String str) {
        com.moloco.sdk.internal.error.crash.anr.g gVar = this.o;
        if (gVar == null) {
            return;
        }
        try {
            j0 j0Var = this.r;
            if (j0Var == null) {
                return;
            }
            int iB = 0;
            try {
                iB = gVar.b((com.moloco.sdk.internal.error.crash.model.e) j0Var.b, str, new f(this, iB));
            } catch (Throwable th) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "AppExitInfoAnrReporter", "ANR scan failed", th, false, 8, null);
                gVar.e.b("anr_reporter");
            }
            if (iB > 0) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "CrashReportingService", "Persisted " + iB + " ANR report(s) from ApplicationExitInfo", null, false, 12, null);
            }
        } catch (Throwable th2) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "CrashReportingService", "ANR scan failed", th2, false, 8, null);
            this.l.b("anr_scan");
        }
    }
}
