package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.wrappers.Wrappers;
import com.ironsource.C4664b4;
import com.ironsource.R6;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.model.HttpRequest;
import defpackage.jc1;
import defpackage.jj3;
import defpackage.os0;
import defpackage.q14;
import defpackage.uy3;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcbc implements zzcbe {
    public static final Object l = new Object();
    public static zzcbe m;
    public static zzcbe n;
    public static zzcbe o;
    public static Boolean p;
    public final Context b;
    public final VersionInfoParcel e;
    public final PackageInfo f;
    public final String g;
    public final String h;
    public boolean j;
    public final HashSet k;
    public final Object a = new Object();
    public final WeakHashMap c = new WeakHashMap();
    public final ExecutorService d = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new jj3(3)));
    public final AtomicBoolean i = new AtomicBoolean();

    public static boolean h(Context context) {
        if (context != null) {
            synchronized (l) {
                try {
                    if (p == null) {
                        p = Boolean.valueOf(com.google.android.gms.ads.internal.client.zzay.zzh().nextInt(100) < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.De)).intValue());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (p.booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.P8)).booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static zzcbe c(Context context) {
        synchronized (l) {
            try {
                if (m == null) {
                    if (h(context)) {
                        m = new zzcbc(context, VersionInfoParcel.forPackage());
                    } else {
                        m = new zzcbd();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return m;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0039  */
    public static zzcbe d(Context context, VersionInfoParcel versionInfoParcel) {
        boolean z;
        synchronized (l) {
            try {
                if (o == null) {
                    if (((Boolean) zzblk.c.c()).booleanValue()) {
                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.P8)).booleanValue() || ((Boolean) zzblk.a.c()).booleanValue()) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    if (h(context)) {
                        zzcbc zzcbcVar = new zzcbc(context, versionInfoParcel);
                        zzcbcVar.i();
                        Thread.setDefaultUncaughtExceptionHandler(new q14(zzcbcVar, Thread.getDefaultUncaughtExceptionHandler(), 0));
                        o = zzcbcVar;
                    } else if (!z || context == null) {
                        o = new zzcbd();
                    } else {
                        zzcbc zzcbcVar2 = new zzcbc(context, versionInfoParcel);
                        zzcbcVar2.j = true;
                        zzcbcVar2.i();
                        Thread.setDefaultUncaughtExceptionHandler(new q14(zzcbcVar2, Thread.getDefaultUncaughtExceptionHandler(), 0));
                        o = zzcbcVar2;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003b A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0019, B:11:0x002d, B:14:0x003b, B:15:0x0042), top: B:20:0x0003 }] */
    public static zzcbe e(Context context) {
        synchronized (l) {
            try {
                if (n == null) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Q8)).booleanValue()) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.P8)).booleanValue() || context == null) {
                            n = new zzcbd();
                        } else {
                            n = new zzcbc(context, VersionInfoParcel.forPackage());
                        }
                    } else {
                        n = new zzcbd();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return n;
    }

    public static String f(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final void a(Throwable th, String str, float f) {
        Throwable th2;
        String strZzh;
        boolean zIsCallerInstantApp;
        String packageName;
        PackageInfo packageInfo;
        ActivityManager.MemoryInfo memoryInfoZze;
        Context context = this.b;
        if (this.j) {
            return;
        }
        Handler handler = com.google.android.gms.ads.internal.util.client.zzf.zza;
        if (((Boolean) zzbmb.e.c()).booleanValue()) {
            th2 = th;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                linkedList.push(cause);
            }
            th2 = null;
            while (!linkedList.isEmpty()) {
                Throwable th3 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th3.getStackTrace();
                boolean z = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.n3)).booleanValue() && stackTrace != null && stackTrace.length == 0 && com.google.android.gms.ads.internal.util.client.zzf.zzq(th3.getClass().getName());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (com.google.android.gms.ads.internal.util.client.zzf.zzq(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (z) {
                    th2 = th2 == null ? new Throwable(th3.getMessage()) : new Throwable(th3.getMessage(), th2);
                    th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th2 != null) {
            String name = th.getClass().getName();
            String strF = f(th);
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.qa)).booleanValue() || (strZzh = com.google.android.gms.ads.internal.util.client.zzf.zzh(f(th))) == null) {
                strZzh = "";
            }
            double d = f;
            double dRandom = Math.random();
            int i = f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (int) (1.0f / f) : 1;
            if (dRandom < d) {
                ArrayList arrayList2 = new ArrayList();
                try {
                    zIsCallerInstantApp = Wrappers.packageManager(context).isCallerInstantApp();
                } catch (Throwable th4) {
                    zzo.zzg("Error fetching instant app info", th4);
                    zIsCallerInstantApp = false;
                }
                try {
                    packageName = context.getPackageName();
                } catch (Throwable unused) {
                    zzo.zzi("Cannot obtain package name, proceeding.");
                    packageName = "unknown";
                }
                Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(zIsCallerInstantApp)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter(R6.F, Build.VERSION.RELEASE);
                int i2 = Build.VERSION.SDK_INT;
                Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("api", String.valueOf(i2));
                String str2 = Build.MANUFACTURER;
                String strO = Build.MODEL;
                if (!strO.startsWith(str2)) {
                    strO = jc1.o(str2, " ", new StringBuilder(String.valueOf(str2).length() + 1 + strO.length()), strO);
                }
                Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter(C4664b4.i.G, strO);
                VersionInfoParcel versionInfoParcel = this.e;
                Uri.Builder builderAppendQueryParameter4 = builderAppendQueryParameter3.appendQueryParameter("js", versionInfoParcel.afmaVersion).appendQueryParameter("appid", packageName).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", strF).appendQueryParameter("eids", TextUtils.join(",", com.google.android.gms.ads.internal.client.zzba.zzb().a())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "982601081").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(zzbmb.c.c())).appendQueryParameter("gmscv", String.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(context))).appendQueryParameter("lite", true != versionInfoParcel.isLiteSdk ? "0" : "1");
                if (!TextUtils.isEmpty(strZzh)) {
                    builderAppendQueryParameter4.appendQueryParameter("hash", strZzh);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.W8)).booleanValue() && (memoryInfoZze = com.google.android.gms.ads.internal.util.client.zzf.zze(context)) != null) {
                    builderAppendQueryParameter4.appendQueryParameter("available_memory", Long.toString(memoryInfoZze.availMem));
                    builderAppendQueryParameter4.appendQueryParameter("total_memory", Long.toString(memoryInfoZze.totalMem));
                    builderAppendQueryParameter4.appendQueryParameter("is_low_memory", true != memoryInfoZze.lowMemory ? "0" : "1");
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.V8)).booleanValue()) {
                    String str3 = this.g;
                    if (!TextUtils.isEmpty(str3)) {
                        builderAppendQueryParameter4.appendQueryParameter("countrycode", str3);
                    }
                    String str4 = this.h;
                    if (!TextUtils.isEmpty(str4)) {
                        builderAppendQueryParameter4.appendQueryParameter("psv", str4);
                    }
                    if (i2 >= 26) {
                        packageInfo = WebView.getCurrentWebViewPackage();
                    } else if (context == null) {
                        packageInfo = null;
                    } else {
                        try {
                            packageInfo = Wrappers.packageManager(context).getPackageInfo("com.android.webview", 128);
                        } catch (PackageManager.NameNotFoundException unused2) {
                            packageInfo = null;
                        }
                    }
                    if (packageInfo != null) {
                        builderAppendQueryParameter4.appendQueryParameter("wvvc", Integer.toString(packageInfo.versionCode));
                        builderAppendQueryParameter4.appendQueryParameter("wvvn", packageInfo.versionName);
                        builderAppendQueryParameter4.appendQueryParameter("wvpn", packageInfo.packageName);
                    }
                }
                PackageInfo packageInfo2 = this.f;
                if (packageInfo2 != null) {
                    builderAppendQueryParameter4.appendQueryParameter("appvc", String.valueOf(packageInfo2.versionCode));
                    builderAppendQueryParameter4.appendQueryParameter("appvn", packageInfo2.versionName);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.pd)).booleanValue()) {
                    String strZzf = com.google.android.gms.ads.internal.util.client.zzf.zzf(context);
                    builderAppendQueryParameter4.appendQueryParameter("uev", strZzf != null ? strZzf : "");
                }
                arrayList2.add(builderAppendQueryParameter4.toString());
                int size = arrayList2.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList2.get(i3);
                    i3++;
                    this.d.execute(new os0(12, new zzu(context, null), (String) obj));
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final void b(String str, Throwable th) {
        if (this.j) {
            return;
        }
        a(th, str, 1.0f);
    }

    public final void g(Throwable th) {
        Context context;
        SharedPreferences sharedPreferences;
        if (th != null) {
            boolean zZzq = false;
            boolean zEquals = false;
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                for (StackTraceElement stackTraceElement : cause.getStackTrace()) {
                    zZzq |= com.google.android.gms.ads.internal.util.client.zzf.zzq(stackTraceElement.getClassName());
                    zEquals |= zzcbc.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.R8)).intValue();
            if (iIntValue > 0) {
                HashSet hashSet = this.k;
                if (hashSet.size() >= iIntValue) {
                    return;
                }
                String strZzh = com.google.android.gms.ads.internal.util.client.zzf.zzh(f(th));
                if (strZzh == null) {
                    strZzh = "";
                }
                if (hashSet.contains(strZzh)) {
                    return;
                } else {
                    hashSet.add(strZzh);
                }
            }
            if (!zZzq || zEquals) {
                return;
            }
            if (!this.j) {
                b("", th);
            }
            if (this.i.getAndSet(true) || !((Boolean) zzblk.c.c()).booleanValue() || (sharedPreferences = (context = this.b).getSharedPreferences("admob", 0)) == null) {
                return;
            }
            sharedPreferences.edit().putInt("crash_without_write", zzbjc.b(context, "crash_without_write") + 1).commit();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0053  */
    public zzcbc(Context context, VersionInfoParcel versionInfoParcel) {
        PackageInfo packageInfo;
        String country;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.b = context;
        this.e = versionInfoParcel;
        String string = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.i9)).booleanValue()) {
            Handler handler = com.google.android.gms.ads.internal.util.client.zzf.zza;
            if (context == null || context.getApplicationInfo() == null) {
                packageInfo = null;
            } else {
                try {
                    packageInfo = Wrappers.packageManager(context).getPackageInfo(context.getApplicationInfo().packageName, 0);
                } catch (PackageManager.NameNotFoundException unused) {
                    packageInfo = null;
                }
            }
        } else {
            packageInfo = null;
        }
        this.f = packageInfo;
        uy3 uy3Var = zzbjr.V8;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(uy3Var)).booleanValue()) {
            country = "unknown";
        } else {
            Handler handler2 = com.google.android.gms.ads.internal.util.client.zzf.zza;
            country = Locale.getDefault().getCountry();
        }
        this.g = country;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(uy3Var)).booleanValue()) {
            string = "unknown";
        } else {
            Context context2 = this.b;
            Handler handler3 = com.google.android.gms.ads.internal.util.client.zzf.zza;
            if (context2 != null) {
                try {
                    PackageInfo packageInfo2 = Wrappers.packageManager(context2).getPackageInfo("com.android.vending", 128);
                    if (packageInfo2 != null) {
                        string = Integer.toString(packageInfo2.versionCode);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                }
            }
        }
        this.h = string;
        if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.R8)).intValue() > 0) {
            this.k = new HashSet();
        }
    }

    public final void i() {
        Thread thread = Looper.getMainLooper().getThread();
        if (thread == null) {
            return;
        }
        synchronized (this.a) {
            this.c.put(thread, Boolean.TRUE);
        }
        thread.setUncaughtExceptionHandler(new q14(this, thread.getUncaughtExceptionHandler(), 1));
    }
}
