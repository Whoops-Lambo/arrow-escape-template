package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.webkit.WebSettings;
import defpackage.aj0;
import defpackage.cm2;
import defpackage.cz;
import defpackage.gd1;
import defpackage.kc2;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: com.inmobi.media.mk, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC4221mk {
    public static Context a = null;
    public static String b = "";
    public static String c;
    public static final AtomicBoolean d = new AtomicBoolean();
    public static final AtomicLong e = new AtomicLong(0);
    public static final gd1 f = new cm2(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.d0(21));
    public static boolean g;
    public static final ExecutorService h;
    public static final cz i;
    public static int j;

    static {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC4239na("mk", false));
        h = executorServiceNewSingleThreadExecutor;
        executorServiceNewSingleThreadExecutor.getClass();
        i = kc2.a(new aj0(executorServiceNewSingleThreadExecutor));
    }

    public static String b(Context context) {
        Context applicationContext;
        if (context != null) {
            try {
                applicationContext = context.getApplicationContext();
            } catch (Exception e2) {
                try {
                    throw new C4196ln(e2.getMessage());
                } catch (C4196ln e3) {
                    e3.getMessage();
                    gd1 gd1Var = Ba.a;
                    Ba.a(new C4120j3(e3));
                    try {
                        String property = System.getProperty("http.agent");
                        return property == null ? "" : property;
                    } catch (Exception e4) {
                        e4.getMessage();
                        gd1 gd1Var2 = Ba.a;
                        U9.a(e4);
                        return "";
                    }
                } catch (Exception e5) {
                    e5.getMessage();
                    return "";
                }
            }
        } else {
            applicationContext = null;
        }
        String defaultUserAgent = WebSettings.getDefaultUserAgent(applicationContext);
        defaultUserAgent.getClass();
        return defaultUserAgent;
    }

    public static final boolean c() {
        return j == 2;
    }

    public static final void a(Context context, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.getClass();
        if (!(context instanceof Activity)) {
            return;
        }
        Activity activity = (Activity) context;
        activity.getApplication().unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
        activity.getApplication().registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }

    public static boolean c(Context context) {
        return true;
    }

    public static void a(Context context) {
        context.getClass();
        try {
            AbstractC4431u7.a(new File(context.getFilesDir(), "im_cached_content"));
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public static final C4518xd a() {
        return new C4518xd();
    }

    public static final String b() {
        if (b.length() == 0) {
            b = b(a);
        }
        return b;
    }
}
