package com.vungle.ads.internal;

import android.os.Build;
import com.safedk.android.analytics.events.CrashEvent;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.g5;
import defpackage.h5;
import defpackage.x3;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/AnalyticsClient;", "", "<init>", "()V", "Laz2;", CrashEvent.e, "com/vungle/ads/internal/v", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class AnalyticsClient {
    public static VungleApiClient e;
    public static com.vungle.ads.internal.executor.j f;
    public static boolean g;

    @NotNull
    public static final AnalyticsClient INSTANCE = new AnalyticsClient();
    public static final LinkedBlockingQueue a = new LinkedBlockingQueue();
    public static final LinkedBlockingQueue b = new LinkedBlockingQueue();
    public static final LinkedBlockingQueue c = new LinkedBlockingQueue();
    public static final LinkedBlockingQueue d = new LinkedBlockingQueue();
    public static int h = 2;
    public static boolean i = true;
    public static final AtomicBoolean j = new AtomicBoolean(false);

    private final synchronized void report() {
        VungleApiClient vungleApiClient;
        VungleApiClient vungleApiClient2;
        try {
            if (h != 1) {
                LinkedBlockingQueue linkedBlockingQueue = a;
                if (linkedBlockingQueue.size() > 0) {
                    boolean z = com.vungle.ads.internal.util.u.a;
                    StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Sending ");
                    sbA.append(linkedBlockingQueue.size());
                    sbA.append(" errors");
                    com.vungle.ads.internal.util.t.a("AnalyticsClient", sbA.toString());
                    LinkedBlockingQueue linkedBlockingQueue2 = new LinkedBlockingQueue();
                    linkedBlockingQueue.drainTo(linkedBlockingQueue2);
                    if (!linkedBlockingQueue2.isEmpty() && (vungleApiClient2 = e) != null) {
                        vungleApiClient2.a(linkedBlockingQueue2, new w(linkedBlockingQueue2));
                    }
                }
            }
            if (g) {
                LinkedBlockingQueue linkedBlockingQueue3 = b;
                if (linkedBlockingQueue3.size() > 0) {
                    boolean z2 = com.vungle.ads.internal.util.u.a;
                    StringBuilder sbA2 = com.iab.omid.library.vungle.internal.l.a("Sending ");
                    sbA2.append(linkedBlockingQueue3.size());
                    sbA2.append(" metrics");
                    com.vungle.ads.internal.util.t.a("AnalyticsClient", sbA2.toString());
                    LinkedBlockingQueue linkedBlockingQueue4 = new LinkedBlockingQueue();
                    linkedBlockingQueue3.drainTo(linkedBlockingQueue4);
                    if (!linkedBlockingQueue4.isEmpty() && (vungleApiClient = e) != null) {
                        vungleApiClient.a(linkedBlockingQueue4, new x(linkedBlockingQueue4));
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(Sdk.SDKMetric.SDKMetricType sDKMetricType, long j2, com.vungle.ads.internal.util.s sVar, String str) {
        Sdk.SDKMetric.SDKMetricType sDKMetricType2;
        long j3;
        com.vungle.ads.internal.util.s sVar2;
        String str2;
        sDKMetricType.getClass();
        try {
            com.vungle.ads.internal.executor.j jVar = f;
            if (jVar == null) {
                d.put(a(sDKMetricType, j2, sVar, str));
                return;
            }
            sDKMetricType2 = sDKMetricType;
            j3 = j2;
            sVar2 = sVar;
            str2 = str;
            try {
                jVar.execute(new g5(0, j3, sDKMetricType2, sVar2, str2));
            } catch (Exception e2) {
                e = e2;
                boolean z = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.a("AnalyticsClient", "Cannot logMetric " + sDKMetricType2 + ", " + j3 + ", " + sVar2 + ", " + str2, e);
            }
        } catch (Exception e3) {
            e = e3;
            sDKMetricType2 = sDKMetricType;
            j3 = j2;
            sVar2 = sVar;
            str2 = str;
        }
    }

    private AnalyticsClient() {
    }

    public static Sdk.SDKError.Builder a(Sdk.SDKError.Reason reason, String str, com.vungle.ads.internal.util.s sVar) {
        String str2;
        String strK;
        String strG;
        String strH;
        String strC;
        String strL;
        String strD;
        long j2;
        String string;
        String strI;
        Long lA;
        Boolean boolB;
        Boolean boolF;
        String strE;
        h hVarD;
        Sdk.SDKError.Builder builderNewBuilder = Sdk.SDKError.newBuilder();
        String str3 = Build.MANUFACTURER;
        if ("Amazon".equals(str3)) {
            str2 = "amazon";
        } else {
            str2 = "android";
        }
        Sdk.SDKError.Builder at = builderNewBuilder.setOs(str2).setOsVersion(String.valueOf(Build.VERSION.SDK_INT)).setMake(str3).setModel(Build.MODEL).setReason(reason).setMessage(str).setAt(System.currentTimeMillis());
        String str4 = "";
        if (sVar == null || (strK = sVar.k()) == null) {
            strK = "";
        }
        Sdk.SDKError.Builder placementReferenceId = at.setPlacementReferenceId(strK);
        if (sVar == null || (strG = sVar.g()) == null) {
            strG = "";
        }
        Sdk.SDKError.Builder creativeId = placementReferenceId.setCreativeId(strG);
        if (sVar == null || (strH = sVar.h()) == null) {
            strH = "";
        }
        Sdk.SDKError.Builder eventId = creativeId.setEventId(strH);
        if (sVar == null || (strC = sVar.c()) == null) {
            strC = "";
        }
        Sdk.SDKError.Builder adSource = eventId.setAdSource(strC);
        if (sVar == null || (strL = sVar.l()) == null) {
            strL = "";
        }
        Sdk.SDKError.Builder vmVersion = adSource.setVmVersion(strL);
        if (sVar == null || (strD = sVar.j()) == null) {
            strD = com.vungle.ads.internal.network.f0.d();
        }
        Sdk.SDKError.Builder mediationName = vmVersion.setMediationName(strD);
        com.vungle.ads.internal.util.d dVar = com.vungle.ads.internal.util.d.f;
        if (com.vungle.ads.internal.util.a.a()) {
            j2 = 0;
        } else {
            j2 = 2;
        }
        Sdk.SDKError.Builder appState = mediationName.setAppState(j2);
        if (sVar == null || (hVarD = sVar.d()) == null || (string = hVarD.toString()) == null) {
            string = "";
        }
        Sdk.SDKError.Builder adState = appState.setAdState(string);
        if (sVar == null || (strI = sVar.i()) == null) {
            strI = "";
        }
        Sdk.SDKError.Builder experiments = adState.setExperiments(strI);
        if (sVar != null && (strE = sVar.e()) != null) {
            str4 = strE;
        }
        Sdk.SDKError.Builder adapterAdFormat = experiments.setAdapterAdFormat(str4);
        if (sVar != null && (boolF = sVar.f()) != null) {
            adapterAdFormat.setIsAdoEnabled(boolF.booleanValue());
        }
        if (sVar != null && (boolB = sVar.b()) != null) {
            adapterAdFormat.setIsAdPodding(boolB.booleanValue());
        }
        if (sVar != null && (lA = sVar.a()) != null) {
            adapterAdFormat.setAdLoadType(lA.longValue());
        }
        adapterAdFormat.getClass();
        return adapterAdFormat;
    }

    public static final void b(Sdk.SDKMetric.SDKMetricType sDKMetricType, long j2, com.vungle.ads.internal.util.s sVar, String str) {
        sDKMetricType.getClass();
        AnalyticsClient analyticsClient = INSTANCE;
        synchronized (analyticsClient) {
            if (g) {
                try {
                    Sdk.SDKMetric.Builder builderA = a(sDKMetricType, j2, sVar, str);
                    LinkedBlockingQueue linkedBlockingQueue = b;
                    linkedBlockingQueue.put(builderA);
                    boolean z = com.vungle.ads.internal.util.u.a;
                    com.vungle.ads.internal.util.t.a("AnalyticsClient", new z(sDKMetricType, j2, sVar, builderA));
                    if (linkedBlockingQueue.size() >= 20) {
                        analyticsClient.report();
                    }
                } catch (Exception e2) {
                    boolean z2 = com.vungle.ads.internal.util.u.a;
                    com.vungle.ads.internal.util.t.a("AnalyticsClient", "Cannot logMetrics", e2);
                }
            }
        }
    }

    public static final void b(Sdk.SDKError.Reason reason, String str, com.vungle.ads.internal.util.s sVar) {
        reason.getClass();
        str.getClass();
        AnalyticsClient analyticsClient = INSTANCE;
        synchronized (analyticsClient) {
            if (h != 1) {
                try {
                    Sdk.SDKError.Builder builderA = a(reason, str, sVar);
                    LinkedBlockingQueue linkedBlockingQueue = a;
                    linkedBlockingQueue.put(builderA);
                    boolean z = com.vungle.ads.internal.util.u.a;
                    com.vungle.ads.internal.util.t.a("AnalyticsClient", new y(reason, str, builderA));
                    if (linkedBlockingQueue.size() >= 20) {
                        analyticsClient.report();
                    }
                } catch (Exception e2) {
                    boolean z2 = com.vungle.ads.internal.util.u.a;
                    com.vungle.ads.internal.util.t.a("AnalyticsClient", "Cannot logError", e2);
                }
            }
        }
    }

    public final synchronized void c(Sdk.SDKError.Reason reason, String str, com.vungle.ads.internal.util.s sVar) {
        reason.getClass();
        str.getClass();
        try {
            com.vungle.ads.internal.executor.j jVar = f;
            if (jVar == null) {
                c.put(a(reason, str, sVar));
            } else {
                jVar.execute(new x3(2, reason, str, sVar));
            }
        } catch (Exception e2) {
            boolean z = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a("AnalyticsClient", "Cannot logError " + reason + ", " + str + ", " + sVar, e2);
        }
    }

    public final synchronized void a(VungleApiClient vungleApiClient, com.vungle.ads.internal.executor.j jVar, int i2, boolean z) {
        try {
            vungleApiClient.getClass();
            jVar.getClass();
            h = s.a(i2);
            g = z;
            if (i2 == t.a(3)) {
                boolean z2 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.u.a = true;
            } else if (i2 == t.a(2) || i2 == t.a(1)) {
                boolean z3 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.u.a = false;
            }
            e = vungleApiClient;
            if (j.getAndSet(true)) {
                boolean z4 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.a("AnalyticsClient", "AnalyticsClient already initialized");
                return;
            }
            f = jVar;
            try {
                LinkedBlockingQueue linkedBlockingQueue = c;
                if (!linkedBlockingQueue.isEmpty()) {
                    linkedBlockingQueue.drainTo(a);
                }
            } catch (Exception e2) {
                boolean z5 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.a("AnalyticsClient", "Failed to add pendingErrors to errors queue.", e2);
            }
            try {
                LinkedBlockingQueue linkedBlockingQueue2 = d;
                if (!linkedBlockingQueue2.isEmpty()) {
                    linkedBlockingQueue2.drainTo(b);
                }
            } catch (Exception e3) {
                boolean z6 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.a("AnalyticsClient", "Failed to add pendingMetrics to metrics queue.", e3);
            }
            if (i) {
                Executors.newSingleThreadScheduledExecutor().scheduleWithFixedDelay(new h5(jVar, 0), 5000L, 5000L, TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static final void a(com.vungle.ads.internal.executor.j jVar) {
        jVar.getClass();
        jVar.execute(new defpackage.u(4));
    }

    public static final void a() {
        INSTANCE.report();
    }

    public static void a(AnalyticsClient analyticsClient, o1 o1Var, com.vungle.ads.internal.util.s sVar) throws Throwable {
        analyticsClient.a(o1Var, sVar, o1Var.b);
    }

    public static /* synthetic */ void a(AnalyticsClient analyticsClient, Sdk.SDKMetric.SDKMetricType sDKMetricType, long j2, com.vungle.ads.internal.util.s sVar, String str, int i2) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        analyticsClient.c(sDKMetricType, j2, (i2 & 4) != 0 ? null : sVar, (i2 & 8) != 0 ? null : str);
    }

    public static Sdk.SDKMetric.Builder a(Sdk.SDKMetric.SDKMetricType sDKMetricType, long j2, com.vungle.ads.internal.util.s sVar, String str) {
        String strK;
        String strG;
        String strH;
        String strD;
        String strC;
        String strL;
        String string;
        String strI;
        Long lA;
        Boolean boolB;
        Boolean boolF;
        String strE;
        h hVarD;
        Sdk.SDKMetric.Builder value = Sdk.SDKMetric.newBuilder().setType(sDKMetricType).setValue(j2);
        String str2 = Build.MANUFACTURER;
        Sdk.SDKMetric.Builder osVersion = value.setMake(str2).setModel(Build.MODEL).setOs("Amazon".equals(str2) ? "amazon" : "android").setOsVersion(String.valueOf(Build.VERSION.SDK_INT));
        String str3 = "";
        if (sVar == null || (strK = sVar.k()) == null) {
            strK = "";
        }
        Sdk.SDKMetric.Builder placementReferenceId = osVersion.setPlacementReferenceId(strK);
        if (sVar == null || (strG = sVar.g()) == null) {
            strG = "";
        }
        Sdk.SDKMetric.Builder creativeId = placementReferenceId.setCreativeId(strG);
        if (sVar == null || (strH = sVar.h()) == null) {
            strH = "";
        }
        Sdk.SDKMetric.Builder eventId = creativeId.setEventId(strH);
        if (str == null) {
            str = "";
        }
        Sdk.SDKMetric.Builder meta = eventId.setMeta(str);
        if (sVar == null || (strD = sVar.j()) == null) {
            strD = com.vungle.ads.internal.network.f0.d();
        }
        Sdk.SDKMetric.Builder mediationName = meta.setMediationName(strD);
        if (sVar == null || (strC = sVar.c()) == null) {
            strC = "";
        }
        Sdk.SDKMetric.Builder adSource = mediationName.setAdSource(strC);
        if (sVar == null || (strL = sVar.l()) == null) {
            strL = "";
        }
        Sdk.SDKMetric.Builder vmVersion = adSource.setVmVersion(strL);
        com.vungle.ads.internal.util.d dVar = com.vungle.ads.internal.util.d.f;
        Sdk.SDKMetric.Builder appState = vmVersion.setAppState(com.vungle.ads.internal.util.a.a() ? 0L : 2L);
        if (sVar == null || (hVarD = sVar.d()) == null || (string = hVarD.toString()) == null) {
            string = "";
        }
        Sdk.SDKMetric.Builder adState = appState.setAdState(string);
        if (sVar == null || (strI = sVar.i()) == null) {
            strI = "";
        }
        Sdk.SDKMetric.Builder experiments = adState.setExperiments(strI);
        if (sVar != null && (strE = sVar.e()) != null) {
            str3 = strE;
        }
        Sdk.SDKMetric.Builder adapterAdFormat = experiments.setAdapterAdFormat(str3);
        if (sVar != null && (boolF = sVar.f()) != null) {
            adapterAdFormat.setIsAdoEnabled(boolF.booleanValue());
        }
        if (sVar != null && (boolB = sVar.b()) != null) {
            adapterAdFormat.setIsAdPodding(boolB.booleanValue());
        }
        if (sVar != null && (lA = sVar.a()) != null) {
            adapterAdFormat.setAdLoadType(lA.longValue());
        }
        adapterAdFormat.getClass();
        return adapterAdFormat;
    }

    public static void a(AnalyticsClient analyticsClient, i2 i2Var, com.vungle.ads.internal.util.s sVar, int i2) throws Throwable {
        AnalyticsClient analyticsClient2;
        com.vungle.ads.internal.util.s sVar2 = (i2 & 2) != 0 ? null : sVar;
        String strA = (i2 & 4) != 0 ? i2Var.a() : null;
        synchronized (analyticsClient) {
            try {
                i2Var.getClass();
                analyticsClient2 = analyticsClient;
                try {
                    analyticsClient2.c(i2Var.b(), i2Var.c(), sVar2, strA);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                analyticsClient2 = analyticsClient;
            }
        }
    }

    public final synchronized void a(i2 i2Var, com.vungle.ads.internal.util.s sVar, String str) throws Throwable {
        try {
            try {
                i2Var.getClass();
                c(i2Var.b(), i2Var.c(), sVar, str);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public static void a(AnalyticsClient analyticsClient, j2 j2Var, com.vungle.ads.internal.util.s sVar, int i2) throws Throwable {
        AnalyticsClient analyticsClient2;
        com.vungle.ads.internal.util.s sVar2 = (i2 & 2) != 0 ? null : sVar;
        String strA = (i2 & 4) != 0 ? j2Var.a() : null;
        synchronized (analyticsClient) {
            try {
                j2Var.getClass();
                analyticsClient2 = analyticsClient;
                try {
                    analyticsClient2.c(j2Var.b(), j2Var.c(), sVar2, strA);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                analyticsClient2 = analyticsClient;
            }
        }
    }

    public final synchronized void a(j2 j2Var, com.vungle.ads.internal.util.s sVar, String str) throws Throwable {
        try {
            try {
                j2Var.getClass();
                c(j2Var.b(), j2Var.c(), sVar, str);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized void a(o1 o1Var, com.vungle.ads.internal.util.s sVar, String str) throws Throwable {
        AnalyticsClient analyticsClient;
        try {
            try {
                o1Var.getClass();
                if (o1Var.f()) {
                    analyticsClient = this;
                } else {
                    synchronized (this) {
                        try {
                            analyticsClient = this;
                            try {
                                analyticsClient.c(o1Var.b(), o1Var.c(), sVar, str);
                                o1Var.g();
                            } catch (Throwable th) {
                                th = th;
                                Throwable th2 = th;
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            analyticsClient = this;
                        }
                    }
                }
                return;
            } catch (Throwable th4) {
                th = th4;
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        throw th;
    }
}
