package com.vungle.ads.internal;

import android.content.Context;
import android.os.Handler;
import androidx.core.content.ContextCompat;
import com.vungle.ads.InitializationListener;
import com.vungle.ads.InvalidAppId;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.SdkVersionTooLow;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.PathProvider;
import defpackage.dk2;
import defpackage.eu;
import defpackage.gd1;
import defpackage.gg0;
import defpackage.h50;
import defpackage.pd1;
import defpackage.r91;
import defpackage.vf3;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class t2 {
    public AtomicBoolean a = new AtomicBoolean(false);
    public AtomicBoolean b = new AtomicBoolean(false);
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public final j2 d = new j2(Sdk.SDKMetric.SDKMetricType.INIT_TO_SUCCESS_CALLBACK_DURATION_MS);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v13, types: [gg0] */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v18, types: [java.util.ArrayList] */
    public static final void a(t2 t2Var, Context context, String str, gd1 gd1Var) {
        boolean z;
        ?? arrayList;
        pd1 pd1Var = pd1.a;
        t2Var.getClass();
        context.getClass();
        str.getClass();
        gd1Var.getClass();
        int i = 0;
        boolean z2 = ContextCompat.a(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        boolean z3 = ContextCompat.a(context, "android.permission.INTERNET") == 0;
        if (!z2 || !z3) {
            boolean z4 = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.b("VungleInitializer", "Network permissions not granted");
            Handler handler = com.vungle.ads.internal.util.y.a;
            com.vungle.ads.internal.util.y.a(new q2(t2Var));
            return;
        }
        PrivacyManager.INSTANCE.a(context);
        ((VungleApiClient) gd1Var.getValue()).c(str);
        try {
            gd1 gd1VarV = eu.v(pd1Var, new k2(context));
            ConfigManager configManager = ConfigManager.INSTANCE;
            FilePreferences filePreferences = (FilePreferences) gd1VarV.getValue();
            configManager.getClass();
            com.vungle.ads.internal.model.w2 w2VarA = ConfigManager.a(filePreferences, str);
            if (w2VarA != null) {
                configManager.a(context, w2VarA, p0.INIT_CACHED, null);
                ConfigManager.c();
                z = true;
            } else {
                z = false;
            }
            File[] fileArrListFiles = ((PathProvider) eu.v(pd1Var, new l2(context)).getValue()).getVmDir().listFiles();
            if (fileArrListFiles != null) {
                ArrayList arrayList2 = new ArrayList();
                for (File file : fileArrListFiles) {
                    if (file.isDirectory()) {
                        arrayList2.add(file);
                    }
                }
                arrayList = new ArrayList(eu.f(arrayList2, 10));
                int size = arrayList2.size();
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    arrayList.add(((File) obj).getName());
                }
            } else {
                arrayList = gg0.a;
            }
            gd1 gd1VarV2 = eu.v(pd1Var, new m2(context));
            boolean z5 = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a("VungleInitializer", "Running cleanup jobs.");
            ((com.vungle.ads.internal.task.r) ((com.vungle.ads.internal.task.g) gd1VarV2.getValue())).a(com.vungle.ads.internal.task.a.a(null, arrayList, 1));
            t2Var.a.set(true);
            t2Var.b();
            a(context);
            if (z) {
                return;
            }
            ConfigManager configManager2 = ConfigManager.INSTANCE;
            n2 n2Var = new n2(t2Var, context);
            configManager2.getClass();
            ConfigManager.a(context, n2Var);
        } catch (Throwable th) {
            boolean z6 = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a("VungleInitializer", "Cannot get config", th);
        }
    }

    public final void b() throws Throwable {
        this.b.set(false);
        this.d.a(Sdk.SDKMetric.SDKMetricType.INIT_TO_SUCCESS_CALLBACK_DURATION_MS);
        this.d.d();
        AnalyticsClient.a(AnalyticsClient.INSTANCE, this.d, (com.vungle.ads.internal.util.s) null, 6);
        boolean z = com.vungle.ads.internal.util.u.a;
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("onSuccess ");
        sbA.append(Thread.currentThread().getId());
        com.vungle.ads.internal.util.t.a("VungleInitializer", sbA.toString());
        Handler handler = com.vungle.ads.internal.util.y.a;
        com.vungle.ads.internal.util.y.a(new s2(this));
    }

    public final void a(Context context, String str, InitializationListener initializationListener) {
        str.getClass();
        context.getClass();
        initializationListener.getClass();
        AnalyticsClient.a(AnalyticsClient.INSTANCE, new i2(Sdk.SDKMetric.SDKMetricType.SDK_INIT_API), (com.vungle.ads.internal.util.s) null, 6);
        this.d.e();
        this.c.add(initializationListener);
        if (!dk2.Z(str)) {
            int i = 0;
            while (true) {
                if (i < str.length()) {
                    char cCharAt = str.charAt(i);
                    if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '.') {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    if (com.vungle.ads.internal.util.z.a()) {
                        boolean z = com.vungle.ads.internal.util.u.a;
                        com.vungle.ads.internal.util.t.b("VungleInitializer", "Init: SDK is supported only for API versions 25 and above.");
                        a(new SdkVersionTooLow("Init: SDK is supported only for API versions 25 and above.").logError$vungle_ads_release());
                        return;
                    }
                    ConfigManager.INSTANCE.getClass();
                    ConfigManager.b(str);
                    if (this.a.get()) {
                        boolean z2 = com.vungle.ads.internal.util.u.a;
                        com.vungle.ads.internal.util.t.a("VungleInitializer", "init already complete");
                        b();
                        return;
                    } else {
                        if (this.b.getAndSet(true)) {
                            boolean z3 = com.vungle.ads.internal.util.u.a;
                            com.vungle.ads.internal.util.t.a("VungleInitializer", "init already in progress");
                            return;
                        }
                        o2 o2Var = new o2(context);
                        pd1 pd1Var = pd1.a;
                        ((com.vungle.ads.internal.executor.d) ((com.vungle.ads.internal.executor.a) eu.v(pd1Var, o2Var).getValue())).b().a(new io.p071bidmachine.media3.exoplayer.audio.r(this, context, str, eu.v(pd1Var, new p2(context)), 5), new vf3(this, 4));
                        return;
                    }
                }
            }
        }
        StringBuilder sbR = h50.r("App id invalid: ", str, ", package name: ");
        sbR.append(context.getPackageName());
        a(new InvalidAppId(sbR.toString()).logError$vungle_ads_release());
    }

    public static final void a(t2 t2Var) {
        t2Var.getClass();
        t2Var.a(new OutOfMemory("Config: Out of Memory").logError$vungle_ads_release());
    }

    public final void a(VungleError vungleError) {
        this.b.set(false);
        String localizedMessage = vungleError.getLocalizedMessage();
        if (localizedMessage == null) {
            StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Exception code is ");
            sbA.append(vungleError.getCom.tiktok.appevents.edp.TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE java.lang.String());
            localizedMessage = sbA.toString();
        }
        this.d.a(Sdk.SDKMetric.SDKMetricType.INIT_TO_FAIL_CALLBACK_DURATION_MS);
        this.d.d();
        AnalyticsClient.INSTANCE.a(this.d, (com.vungle.ads.internal.util.s) null, localizedMessage);
        Handler handler = com.vungle.ads.internal.util.y.a;
        com.vungle.ads.internal.util.y.a(new r2(this, vungleError));
        boolean z = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.b("VungleInitializer", localizedMessage);
    }

    public final void a() {
        q1 q1Var = ServiceLocator.d;
        ServiceLocator serviceLocator = ServiceLocator.INSTANCE;
        if (serviceLocator != null && serviceLocator.c()) {
            ((com.vungle.ads.internal.downloader.t) serviceLocator.getService(com.vungle.ads.internal.downloader.t.class)).a();
        }
        synchronized (q1Var) {
            ServiceLocator.INSTANCE = null;
        }
        r91 r91Var = VungleApiClient.n;
        com.vungle.ads.internal.network.f0.a = com.vungle.ads.internal.network.f0.a();
        com.vungle.ads.internal.presenter.f0.c.set(false);
        ConfigManager.INSTANCE.a();
        this.a.set(false);
        this.b.set(false);
        this.c.clear();
    }

    public static void a(Context context) {
        context.getClass();
        ConfigManager.INSTANCE.getClass();
        if (ConfigManager.q()) {
            com.vungle.ads.internal.presenter.f0.a(context);
        }
    }

    public final void a(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (dk2.Z(str)) {
            boolean z = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.b("VungleInitializer", "integrationName is empty");
            return;
        }
        String strD = com.vungle.ads.internal.network.f0.d();
        String strA = com.iab.omid.library.vungle.d.a(str, !dk2.Z(str2) ? "/".concat(str2) : "");
        if (dk2.O(strD, strA, false)) {
            boolean z2 = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.c("VungleInitializer", "Wrapper info already set");
            return;
        }
        com.vungle.ads.internal.network.f0.c(strD + ';' + strA);
        if (this.a.get()) {
            boolean z3 = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.c("VungleInitializer", "VUNGLE WARNING: SDK already initialized, you should've set wrapper info before");
        }
    }
}
