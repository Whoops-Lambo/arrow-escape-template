package com.facebook;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import com.facebook.internal.FetchedAppSettingsManager;
import defpackage.bo;
import defpackage.e32;
import defpackage.h41;
import defpackage.j3;
import defpackage.j6;
import defpackage.k3;
import defpackage.kc2;
import defpackage.kk2;
import defpackage.lz;
import defpackage.m93;
import defpackage.n8;
import defpackage.s71;
import defpackage.v7;
import defpackage.y93;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class a0 {
    public static Executor c;
    public static volatile String d;
    public static volatile String e;
    public static String f;
    public static String g;
    public static volatile String h;
    public static volatile Boolean i;
    public static Context k;
    public static boolean o;
    public static boolean p;
    public static boolean q;
    public static boolean v;
    public static final a0 a = new a0();
    public static final HashSet b = kc2.p(p0.b);
    public static final AtomicLong j = new AtomicLong(65536);
    public static int l = 64206;
    public static final ReentrantLock m = new ReentrantLock();
    public static final String n = "v16.0";
    public static final AtomicBoolean r = new AtomicBoolean(false);
    public static volatile String s = "instagram.com";
    public static volatile String t = "facebook.com";
    public static final m93 u = new m93(21);

    public static final Executor c() {
        ReentrantLock reentrantLock = m;
        reentrantLock.lock();
        try {
            if (c == null) {
                c = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            reentrantLock.unlock();
            Executor executor = c;
            if (executor != null) {
                return executor;
            }
            e32.i("Required value was null.");
            return null;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String d() {
        String str = n;
        String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{str}, 1));
        return str;
    }

    public static final String e() {
        Date date = AccessToken.l;
        AccessToken accessTokenP = com.facebook.appevents.h.p();
        String str = accessTokenP != null ? accessTokenP.k : null;
        String str2 = t;
        if (str != null) {
            if (str.equals("gaming")) {
                return kk2.I(str2, "facebook.com", "fb.gg", false);
            }
            if (str.equals("instagram")) {
                return kk2.I(str2, "facebook.com", "instagram.com", false);
            }
        }
        return str2;
    }

    public static final synchronized boolean g() {
        return v;
    }

    public static final void h(Context context) {
        if (context == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            applicationInfo.getClass();
            if (applicationInfo.metaData == null) {
                return;
            }
            if (d == null) {
                Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                if (obj instanceof String) {
                    String str = (String) obj;
                    Locale locale = Locale.ROOT;
                    locale.getClass();
                    String lowerCase = str.toLowerCase(locale);
                    lowerCase.getClass();
                    if (kk2.L(lowerCase, "fb", false)) {
                        d = str.substring(2);
                    } else {
                        d = str;
                    }
                } else if (obj instanceof Number) {
                    com.facebook.appevents.p.e("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                    return;
                }
            }
            f = applicationInfo.metaData.getString("com.facebook.sdk.RedirectURI");
            g = applicationInfo.metaData.getString("com.facebook.sdk.IntentUriPackageTarget");
            if (e == null) {
                e = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
            }
            if (h == null) {
                h = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
            }
            if (l == 64206) {
                l = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
            }
            if (i == null) {
                i = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x006f A[Catch: all -> 0x0014, TryCatch #1 {, blocks: (B:4:0x0003, B:7:0x0010, B:14:0x001a, B:15:0x001f, B:17:0x0033, B:19:0x003a, B:21:0x0040, B:23:0x0044, B:25:0x004a, B:33:0x006f, B:34:0x0071, B:36:0x0075, B:38:0x0079, B:40:0x007f, B:42:0x0083, B:46:0x0094, B:48:0x009c, B:50:0x00a0, B:56:0x00b5, B:57:0x00b9, B:58:0x00be, B:59:0x00bf, B:61:0x00cb, B:64:0x0140, B:65:0x0145, B:43:0x008b, B:44:0x0090, B:45:0x0091, B:66:0x0146, B:67:0x014b, B:31:0x006a, B:68:0x014c, B:69:0x0153, B:70:0x0154, B:71:0x015b, B:72:0x015c, B:73:0x0161, B:53:0x00ab, B:28:0x005d), top: B:79:0x0003, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0075 A[Catch: all -> 0x0014, TryCatch #1 {, blocks: (B:4:0x0003, B:7:0x0010, B:14:0x001a, B:15:0x001f, B:17:0x0033, B:19:0x003a, B:21:0x0040, B:23:0x0044, B:25:0x004a, B:33:0x006f, B:34:0x0071, B:36:0x0075, B:38:0x0079, B:40:0x007f, B:42:0x0083, B:46:0x0094, B:48:0x009c, B:50:0x00a0, B:56:0x00b5, B:57:0x00b9, B:58:0x00be, B:59:0x00bf, B:61:0x00cb, B:64:0x0140, B:65:0x0145, B:43:0x008b, B:44:0x0090, B:45:0x0091, B:66:0x0146, B:67:0x014b, B:31:0x006a, B:68:0x014c, B:69:0x0153, B:70:0x0154, B:71:0x015b, B:72:0x015c, B:73:0x0161, B:53:0x00ab, B:28:0x005d), top: B:79:0x0003, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0091 A[Catch: all -> 0x0014, TryCatch #1 {, blocks: (B:4:0x0003, B:7:0x0010, B:14:0x001a, B:15:0x001f, B:17:0x0033, B:19:0x003a, B:21:0x0040, B:23:0x0044, B:25:0x004a, B:33:0x006f, B:34:0x0071, B:36:0x0075, B:38:0x0079, B:40:0x007f, B:42:0x0083, B:46:0x0094, B:48:0x009c, B:50:0x00a0, B:56:0x00b5, B:57:0x00b9, B:58:0x00be, B:59:0x00bf, B:61:0x00cb, B:64:0x0140, B:65:0x0145, B:43:0x008b, B:44:0x0090, B:45:0x0091, B:66:0x0146, B:67:0x014b, B:31:0x006a, B:68:0x014c, B:69:0x0153, B:70:0x0154, B:71:0x015b, B:72:0x015c, B:73:0x0161, B:53:0x00ab, B:28:0x005d), top: B:79:0x0003, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x009c A[Catch: all -> 0x0014, TryCatch #1 {, blocks: (B:4:0x0003, B:7:0x0010, B:14:0x001a, B:15:0x001f, B:17:0x0033, B:19:0x003a, B:21:0x0040, B:23:0x0044, B:25:0x004a, B:33:0x006f, B:34:0x0071, B:36:0x0075, B:38:0x0079, B:40:0x007f, B:42:0x0083, B:46:0x0094, B:48:0x009c, B:50:0x00a0, B:56:0x00b5, B:57:0x00b9, B:58:0x00be, B:59:0x00bf, B:61:0x00cb, B:64:0x0140, B:65:0x0145, B:43:0x008b, B:44:0x0090, B:45:0x0091, B:66:0x0146, B:67:0x014b, B:31:0x006a, B:68:0x014c, B:69:0x0153, B:70:0x0154, B:71:0x015b, B:72:0x015c, B:73:0x0161, B:53:0x00ab, B:28:0x005d), top: B:79:0x0003, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a0 A[Catch: all -> 0x0014, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0003, B:7:0x0010, B:14:0x001a, B:15:0x001f, B:17:0x0033, B:19:0x003a, B:21:0x0040, B:23:0x0044, B:25:0x004a, B:33:0x006f, B:34:0x0071, B:36:0x0075, B:38:0x0079, B:40:0x007f, B:42:0x0083, B:46:0x0094, B:48:0x009c, B:50:0x00a0, B:56:0x00b5, B:57:0x00b9, B:58:0x00be, B:59:0x00bf, B:61:0x00cb, B:64:0x0140, B:65:0x0145, B:43:0x008b, B:44:0x0090, B:45:0x0091, B:66:0x0146, B:67:0x014b, B:31:0x006a, B:68:0x014c, B:69:0x0153, B:70:0x0154, B:71:0x015b, B:72:0x015c, B:73:0x0161, B:53:0x00ab, B:28:0x005d), top: B:79:0x0003, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00b9 A[Catch: all -> 0x0014, TryCatch #1 {, blocks: (B:4:0x0003, B:7:0x0010, B:14:0x001a, B:15:0x001f, B:17:0x0033, B:19:0x003a, B:21:0x0040, B:23:0x0044, B:25:0x004a, B:33:0x006f, B:34:0x0071, B:36:0x0075, B:38:0x0079, B:40:0x007f, B:42:0x0083, B:46:0x0094, B:48:0x009c, B:50:0x00a0, B:56:0x00b5, B:57:0x00b9, B:58:0x00be, B:59:0x00bf, B:61:0x00cb, B:64:0x0140, B:65:0x0145, B:43:0x008b, B:44:0x0090, B:45:0x0091, B:66:0x0146, B:67:0x014b, B:31:0x006a, B:68:0x014c, B:69:0x0153, B:70:0x0154, B:71:0x015b, B:72:0x015c, B:73:0x0161, B:53:0x00ab, B:28:0x005d), top: B:79:0x0003, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00cb A[Catch: all -> 0x0014, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0003, B:7:0x0010, B:14:0x001a, B:15:0x001f, B:17:0x0033, B:19:0x003a, B:21:0x0040, B:23:0x0044, B:25:0x004a, B:33:0x006f, B:34:0x0071, B:36:0x0075, B:38:0x0079, B:40:0x007f, B:42:0x0083, B:46:0x0094, B:48:0x009c, B:50:0x00a0, B:56:0x00b5, B:57:0x00b9, B:58:0x00be, B:59:0x00bf, B:61:0x00cb, B:64:0x0140, B:65:0x0145, B:43:0x008b, B:44:0x0090, B:45:0x0091, B:66:0x0146, B:67:0x014b, B:31:0x006a, B:68:0x014c, B:69:0x0153, B:70:0x0154, B:71:0x015b, B:72:0x015c, B:73:0x0161, B:53:0x00ab, B:28:0x005d), top: B:79:0x0003, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0140 A[Catch: all -> 0x0014, TRY_ENTER, TryCatch #1 {, blocks: (B:4:0x0003, B:7:0x0010, B:14:0x001a, B:15:0x001f, B:17:0x0033, B:19:0x003a, B:21:0x0040, B:23:0x0044, B:25:0x004a, B:33:0x006f, B:34:0x0071, B:36:0x0075, B:38:0x0079, B:40:0x007f, B:42:0x0083, B:46:0x0094, B:48:0x009c, B:50:0x00a0, B:56:0x00b5, B:57:0x00b9, B:58:0x00be, B:59:0x00bf, B:61:0x00cb, B:64:0x0140, B:65:0x0145, B:43:0x008b, B:44:0x0090, B:45:0x0091, B:66:0x0146, B:67:0x014b, B:31:0x006a, B:68:0x014c, B:69:0x0153, B:70:0x0154, B:71:0x015b, B:72:0x015c, B:73:0x0161, B:53:0x00ab, B:28:0x005d), top: B:79:0x0003, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0146 A[Catch: all -> 0x0014, TryCatch #1 {, blocks: (B:4:0x0003, B:7:0x0010, B:14:0x001a, B:15:0x001f, B:17:0x0033, B:19:0x003a, B:21:0x0040, B:23:0x0044, B:25:0x004a, B:33:0x006f, B:34:0x0071, B:36:0x0075, B:38:0x0079, B:40:0x007f, B:42:0x0083, B:46:0x0094, B:48:0x009c, B:50:0x00a0, B:56:0x00b5, B:57:0x00b9, B:58:0x00be, B:59:0x00bf, B:61:0x00cb, B:64:0x0140, B:65:0x0145, B:43:0x008b, B:44:0x0090, B:45:0x0091, B:66:0x0146, B:67:0x014b, B:31:0x006a, B:68:0x014c, B:69:0x0153, B:70:0x0154, B:71:0x015b, B:72:0x015c, B:73:0x0161, B:53:0x00ab, B:28:0x005d), top: B:79:0x0003, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static final synchronized void i(Context context, final z zVar) {
        Context context2;
        v7 v7VarN;
        Context context3;
        Context context4;
        Application application;
        context.getClass();
        if (r.get()) {
            if (zVar != null) {
                zVar.onInitialized();
            }
            return;
        }
        boolean zA = false;
        try {
            int i2 = FacebookActivity.c;
            com.facebook.internal.v0.x(context, false);
        } catch (ClassNotFoundException unused) {
        }
        com.facebook.internal.v0.y(context, false);
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        k = applicationContext;
        com.facebook.appevents.l.a(context);
        Context context5 = k;
        if (context5 == null) {
            s71.D("applicationContext");
            throw null;
        }
        h(context5);
        String str = d;
        if (str == null || str.length() == 0) {
            throw new u("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
        }
        String str2 = h;
        if (str2 == null || str2.length() == 0) {
            throw new u("A valid Facebook app client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk.");
        }
        int i3 = 1;
        r.set(true);
        w0 w0Var = w0.a;
        if (!lz.a.contains(w0.class)) {
            try {
                w0.a.e();
                zA = w0.d.a();
            } catch (Throwable th) {
                lz.a(w0.class, th);
            }
            if (zA) {
                v = true;
            }
            context2 = k;
            if (context2 != null) {
                s71.D("applicationContext");
                throw null;
            }
            if (context2 instanceof Application) {
                h41.g();
            } else {
                h41.g();
            }
            v7VarN = v7.c.n();
            if (v7VarN != null) {
                context4 = k;
                if (context4 != null) {
                    s71.D("applicationContext");
                    throw null;
                }
                application = (Application) context4;
                if (!lz.a.contains(v7VarN)) {
                    application.registerActivityLifecycleCallbacks(new j3(i3));
                }
            }
            FetchedAppSettingsManager.loadAppSettingsAsync();
            com.facebook.internal.o0.r();
            com.facebook.internal.f fVar = com.facebook.internal.f.c;
            context3 = k;
            if (context3 != null) {
                s71.D("applicationContext");
                throw null;
            }
            com.facebook.internal.l.c(context3);
            bo boVar = new bo(i3);
            com.facebook.internal.j0 j0Var = new com.facebook.internal.j0(i3);
            j0Var.b = new CountDownLatch(1);
            c().execute(new FutureTask(new j6(3, j0Var, boVar)));
            com.facebook.internal.b0.a(new m93(22), com.facebook.internal.z.Instrument);
            com.facebook.internal.b0.a(new m93(23), com.facebook.internal.z.AppEvents);
            com.facebook.internal.b0.a(new m93(24), com.facebook.internal.z.ChromeCustomTabsPrefetching);
            com.facebook.internal.b0.a(new m93(25), com.facebook.internal.z.IgnoreAppSwitchToLoggedOut);
            com.facebook.internal.b0.a(new m93(26), com.facebook.internal.z.BypassAppSwitch);
            c().execute(new FutureTask(new Callable() { // from class: com.facebook.y
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    AccessToken accessTokenN;
                    Profile profile;
                    AccessToken accessTokenP;
                    String string;
                    z zVar2 = zVar;
                    com.explorestack.protobuf.adcom.c cVar = k.f;
                    i iVarH = i.f.h();
                    SharedPreferences sharedPreferences = iVarH.b.a;
                    if (!sharedPreferences.contains("com.facebook.AccessTokenManager.CachedAccessToken") || (string = sharedPreferences.getString("com.facebook.AccessTokenManager.CachedAccessToken", null)) == null) {
                        accessTokenN = null;
                    } else {
                        try {
                            JSONObject jSONObject = new JSONObject(string);
                            Date date = AccessToken.l;
                            accessTokenN = com.facebook.appevents.h.n(jSONObject);
                        } catch (JSONException unused2) {
                            accessTokenN = null;
                        }
                    }
                    if (accessTokenN != null) {
                        iVarH.d(accessTokenN, false);
                    }
                    k kVarJ = cVar.j();
                    String string2 = ((c) kVarJ.b).a.getString("com.facebook.ProfileManager.CachedProfile", null);
                    if (string2 != null) {
                        try {
                            profile = new Profile(new JSONObject(string2));
                        } catch (JSONException unused3) {
                            profile = null;
                        }
                    } else {
                        profile = null;
                    }
                    if (profile != null) {
                        kVarJ.a(profile, false);
                    }
                    Date date2 = AccessToken.l;
                    if (com.facebook.appevents.h.r() && ((Profile) cVar.j().c) == null && (accessTokenP = com.facebook.appevents.h.p()) != null) {
                        if (com.facebook.appevents.h.r()) {
                            com.facebook.internal.v0.s(new com.explorestack.protobuf.adcom.c(28), accessTokenP.e);
                        } else {
                            cVar.j().a(null, true);
                        }
                    }
                    if (zVar2 != null) {
                        zVar2.onInitialized();
                    }
                    Context contextA = a0.a();
                    String str3 = a0.d;
                    String str4 = com.facebook.appevents.o.c;
                    if (w0.c()) {
                        com.facebook.appevents.o oVar = new com.facebook.appevents.o(contextA, str3);
                        ScheduledThreadPoolExecutor scheduledThreadPoolExecutorB = com.facebook.appevents.o.b();
                        if (scheduledThreadPoolExecutorB == null) {
                            e32.i("Required value was null.");
                            return null;
                        }
                        scheduledThreadPoolExecutorB.execute(new y93(23, contextA, oVar));
                    }
                    if (!lz.a.contains(w0.class)) {
                        try {
                            Context contextA2 = a0.a();
                            ApplicationInfo applicationInfo = contextA2.getPackageManager().getApplicationInfo(contextA2.getPackageName(), 128);
                            applicationInfo.getClass();
                            Bundle bundle = applicationInfo.metaData;
                            if (bundle != null && bundle.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                                com.facebook.appevents.o oVar2 = new com.facebook.appevents.o(contextA2, (String) null);
                                Bundle bundle2 = new Bundle();
                                if (!com.facebook.internal.v0.A()) {
                                    bundle2.putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                                    Log.w("com.facebook.w0", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                                }
                                if (w0.c()) {
                                    oVar2.e("fb_auto_applink", bundle2);
                                }
                            }
                        } catch (PackageManager.NameNotFoundException unused4) {
                        } catch (Throwable th2) {
                            lz.a(w0.class, th2);
                        }
                    }
                    Context applicationContext2 = a0.a().getApplicationContext();
                    applicationContext2.getClass();
                    com.facebook.appevents.o oVar3 = new com.facebook.appevents.o(applicationContext2, (String) null);
                    if (!lz.a.contains(oVar3)) {
                        try {
                            com.facebook.appevents.j.c(1);
                        } catch (Throwable th3) {
                            lz.a(oVar3, th3);
                        }
                    }
                    return null;
                }
            }));
            return;
        }
        if (zA) {
            v = true;
        }
        context2 = k;
        if (context2 != null) {
            s71.D("applicationContext");
            throw null;
        }
        if ((context2 instanceof Application) || !w0.c()) {
            h41.g();
        } else {
            Context context6 = k;
            if (context6 == null) {
                s71.D("applicationContext");
                throw null;
            }
            k3.d((Application) context6, d);
        }
        v7VarN = v7.c.n();
        if (v7VarN != null) {
            context4 = k;
            if (context4 != null) {
                s71.D("applicationContext");
                throw null;
            }
            application = (Application) context4;
            if (!lz.a.contains(v7VarN)) {
                try {
                    application.registerActivityLifecycleCallbacks(new j3(i3));
                } catch (Throwable th2) {
                    lz.a(v7VarN, th2);
                }
            }
        }
        FetchedAppSettingsManager.loadAppSettingsAsync();
        com.facebook.internal.o0.r();
        com.facebook.internal.f fVar2 = com.facebook.internal.f.c;
        context3 = k;
        if (context3 != null) {
            s71.D("applicationContext");
            throw null;
        }
        com.facebook.internal.l.c(context3);
        bo boVar2 = new bo(i3);
        com.facebook.internal.j0 j0Var2 = new com.facebook.internal.j0(i3);
        j0Var2.b = new CountDownLatch(1);
        c().execute(new FutureTask(new j6(3, j0Var2, boVar2)));
        com.facebook.internal.b0.a(new m93(22), com.facebook.internal.z.Instrument);
        com.facebook.internal.b0.a(new m93(23), com.facebook.internal.z.AppEvents);
        com.facebook.internal.b0.a(new m93(24), com.facebook.internal.z.ChromeCustomTabsPrefetching);
        com.facebook.internal.b0.a(new m93(25), com.facebook.internal.z.IgnoreAppSwitchToLoggedOut);
        com.facebook.internal.b0.a(new m93(26), com.facebook.internal.z.BypassAppSwitch);
        c().execute(new FutureTask(new Callable() { // from class: com.facebook.y
            @Override // java.util.concurrent.Callable
            public final Object call() {
                AccessToken accessTokenN;
                Profile profile;
                AccessToken accessTokenP;
                String string;
                z zVar2 = zVar;
                com.explorestack.protobuf.adcom.c cVar = k.f;
                i iVarH = i.f.h();
                SharedPreferences sharedPreferences = iVarH.b.a;
                if (!sharedPreferences.contains("com.facebook.AccessTokenManager.CachedAccessToken") || (string = sharedPreferences.getString("com.facebook.AccessTokenManager.CachedAccessToken", null)) == null) {
                    accessTokenN = null;
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(string);
                        Date date = AccessToken.l;
                        accessTokenN = com.facebook.appevents.h.n(jSONObject);
                    } catch (JSONException unused2) {
                        accessTokenN = null;
                    }
                }
                if (accessTokenN != null) {
                    iVarH.d(accessTokenN, false);
                }
                k kVarJ = cVar.j();
                String string2 = ((c) kVarJ.b).a.getString("com.facebook.ProfileManager.CachedProfile", null);
                if (string2 != null) {
                    try {
                        profile = new Profile(new JSONObject(string2));
                    } catch (JSONException unused3) {
                        profile = null;
                    }
                } else {
                    profile = null;
                }
                if (profile != null) {
                    kVarJ.a(profile, false);
                }
                Date date2 = AccessToken.l;
                if (com.facebook.appevents.h.r() && ((Profile) cVar.j().c) == null && (accessTokenP = com.facebook.appevents.h.p()) != null) {
                    if (com.facebook.appevents.h.r()) {
                        com.facebook.internal.v0.s(new com.explorestack.protobuf.adcom.c(28), accessTokenP.e);
                    } else {
                        cVar.j().a(null, true);
                    }
                }
                if (zVar2 != null) {
                    zVar2.onInitialized();
                }
                Context contextA = a0.a();
                String str3 = a0.d;
                String str4 = com.facebook.appevents.o.c;
                if (w0.c()) {
                    com.facebook.appevents.o oVar = new com.facebook.appevents.o(contextA, str3);
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutorB = com.facebook.appevents.o.b();
                    if (scheduledThreadPoolExecutorB == null) {
                        e32.i("Required value was null.");
                        return null;
                    }
                    scheduledThreadPoolExecutorB.execute(new y93(23, contextA, oVar));
                }
                if (!lz.a.contains(w0.class)) {
                    try {
                        Context contextA2 = a0.a();
                        ApplicationInfo applicationInfo = contextA2.getPackageManager().getApplicationInfo(contextA2.getPackageName(), 128);
                        applicationInfo.getClass();
                        Bundle bundle = applicationInfo.metaData;
                        if (bundle != null && bundle.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                            com.facebook.appevents.o oVar2 = new com.facebook.appevents.o(contextA2, (String) null);
                            Bundle bundle2 = new Bundle();
                            if (!com.facebook.internal.v0.A()) {
                                bundle2.putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                                Log.w("com.facebook.w0", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                            }
                            if (w0.c()) {
                                oVar2.e("fb_auto_applink", bundle2);
                            }
                        }
                    } catch (PackageManager.NameNotFoundException unused4) {
                    } catch (Throwable th3) {
                        lz.a(w0.class, th3);
                    }
                }
                Context applicationContext2 = a0.a().getApplicationContext();
                applicationContext2.getClass();
                com.facebook.appevents.o oVar3 = new com.facebook.appevents.o(applicationContext2, (String) null);
                if (!lz.a.contains(oVar3)) {
                    try {
                        com.facebook.appevents.j.c(1);
                    } catch (Throwable th4) {
                        lz.a(oVar3, th4);
                    }
                }
                return null;
            }
        }));
        return;
        throw th;
    }

    public static final void j(String[] strArr, int i2, int i3) {
        if (lz.a.contains(a0.class)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data_processing_options", new JSONArray((Collection) n8.o0(strArr)));
            jSONObject.put("data_processing_options_country", i2);
            jSONObject.put("data_processing_options_state", i3);
            Context context = k;
            if (context != null) {
                context.getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).edit().putString("data_processing_options", jSONObject.toString()).apply();
            } else {
                s71.D("applicationContext");
                throw null;
            }
        } catch (JSONException unused) {
        } catch (Throwable th) {
            lz.a(a0.class, th);
        }
    }

    public static final Context a() {
        com.facebook.internal.v0.U();
        Context context = k;
        if (context != null) {
            return context;
        }
        s71.D("applicationContext");
        throw null;
    }

    public static final String b() {
        com.facebook.internal.v0.U();
        String str = d;
        if (str != null) {
            return str;
        }
        com.facebook.appevents.p.e("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
        return null;
    }

    public static final boolean f(Context context) {
        context.getClass();
        com.facebook.internal.v0.U();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }
}
