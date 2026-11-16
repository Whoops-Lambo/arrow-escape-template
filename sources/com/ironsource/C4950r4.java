package com.ironsource;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.r4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class C4950r4 {
    private static final String k = "1.0.6";
    public static String l = "";
    private final B7 a;
    private String b;
    private String c;
    private String d;
    private String e;
    private ContextProvider f;
    public Thread.UncaughtExceptionHandler g;
    public String h;
    private String i;
    private boolean j;

    /* JADX INFO: renamed from: com.ironsource.r4$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements InterfaceC4659b {
        @Override // com.ironsource.InterfaceC4659b
        public void b() {
        }

        public a() {
        }

        @Override // com.ironsource.InterfaceC4659b
        public void a() {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            StringBuilder sb = new StringBuilder(128);
            for (Thread thread : allStackTraces.keySet()) {
                StackTraceElement[] stackTrace = thread.getStackTrace();
                if (stackTrace != null && stackTrace.length > 0) {
                    sb.append("*** Thread Name ");
                    sb.append(thread.getName());
                    sb.append(" Thread ID ");
                    sb.append(thread.getId());
                    sb.append(" (");
                    sb.append(thread.getState().toString());
                    sb.append(") ***\n");
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        sb.append(stackTraceElement.toString());
                        sb.append(" ");
                        sb.append(thread.getState().toString());
                        sb.append("\n");
                    }
                }
            }
            C4950r4.l = sb.toString();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.r4$b */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b implements Runnable {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;

        public b(Context context, String str) {
            this.a = context;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String strI = C4950r4.this.a.I(this.a);
                if (!TextUtils.isEmpty(strI)) {
                    C4950r4.this.c = strI;
                }
                String strC = C4950r4.this.a.c(this.a);
                if (!TextUtils.isEmpty(strC)) {
                    C4950r4.this.e = strC;
                }
                SharedPreferences.Editor editorEdit = this.a.getSharedPreferences("CRep", 0).edit();
                editorEdit.putString("String1", C4950r4.this.c);
                editorEdit.putString("sId", this.b);
                editorEdit.apply();
            } catch (Exception e) {
                IronLog.INTERNAL.error(e.toString());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.r4$c */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class c extends RunnableC4968s4 {
        public c(JSONObject jSONObject) {
            super(jSONObject);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.r4$d */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @SuppressLint({"StaticFieldLeak"})
    public static class d {
        static volatile C4950r4 a = new C4950r4(0);

        private d() {
        }
    }

    private void a(Context context, HashSet<String> hashSet) {
        String strA = a(a());
        if (strA.equals("none")) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("CRep", 0);
        String string = sharedPreferences.getString("String1", this.c);
        String string2 = sharedPreferences.getString("sId", this.d);
        List<P5> listB = I4.b();
        IronLog.INTERNAL.verbose("reportList size " + listB.size());
        for (P5 p5 : listB) {
            JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
            String strB = p5.b();
            String strE = p5.e();
            String strD = p5.d();
            String packageName = context.getPackageName();
            JSONObject jSONObjectJsonObjectInit2 = IronSourceNetworkBridge.jsonObjectInit();
            try {
                ActivityManager.MemoryInfo memoryInfoO = this.a.o(context);
                if (memoryInfoO != null) {
                    jSONObjectJsonObjectInit2.put("availRam", this.a.c(memoryInfoO));
                    jSONObjectJsonObjectInit2.put(R6.x, this.a.b(memoryInfoO));
                    jSONObjectJsonObjectInit2.put("mThreshold", this.a.a(memoryInfoO));
                }
                String strT = this.a.t();
                if (strT != null) {
                    jSONObjectJsonObjectInit2.put(R6.z, strT);
                }
                jSONObjectJsonObjectInit2.put("crashDate", strB);
                jSONObjectJsonObjectInit2.put("stacktraceCrash", strE);
                jSONObjectJsonObjectInit2.put("crashType", strD);
                jSONObjectJsonObjectInit2.put("CrashReporterVersion", k);
                jSONObjectJsonObjectInit2.put(C4664b4.j.q, "9.6.1");
                jSONObjectJsonObjectInit2.put(C4664b4.j.x, this.a.d(context));
                jSONObjectJsonObjectInit2.put(C4664b4.j.W, M1.b(context, packageName));
                jSONObjectJsonObjectInit2.put(C4664b4.j.n, this.a.i());
                jSONObjectJsonObjectInit2.put("network", strA);
                jSONObjectJsonObjectInit2.put(C4664b4.j.p, this.a.e());
                jSONObjectJsonObjectInit2.put("deviceModel", this.a.l());
                jSONObjectJsonObjectInit2.put("totalRam", this.a.r(context));
                jSONObjectJsonObjectInit2.put(C4671bb.o, this.a.f());
                jSONObjectJsonObjectInit2.put("advertisingId", string);
                jSONObjectJsonObjectInit2.put("deviceOEM", this.a.q());
                jSONObjectJsonObjectInit2.put("systemProperties", System.getProperties());
                jSONObjectJsonObjectInit2.put("bundleId", packageName);
                jSONObjectJsonObjectInit2.put("sId", string2);
                if (!TextUtils.isEmpty(this.e)) {
                    jSONObjectJsonObjectInit2.put(C4664b4.j.M, Boolean.parseBoolean(this.e));
                }
                if (hashSet == null || hashSet.isEmpty()) {
                    jSONObjectJsonObjectInit = jSONObjectJsonObjectInit2;
                } else {
                    for (String str : hashSet) {
                        try {
                            if (jSONObjectJsonObjectInit2.has(str)) {
                                jSONObjectJsonObjectInit.put(str, jSONObjectJsonObjectInit2.opt(str));
                            }
                        } catch (Exception e) {
                            IronLog.INTERNAL.error(e.toString());
                        }
                    }
                }
            } catch (Exception unused) {
            }
            if (jSONObjectJsonObjectInit.length() == 0) {
                Log.d("ISCrashReport", " Is Empty");
            } else {
                new Thread(new c(jSONObjectJsonObjectInit)).start();
            }
        }
        I4.a();
    }

    public String e() {
        return this.i;
    }

    private C4950r4() {
        this.j = false;
        this.a = Pb.k0().a();
        this.f = ContextProvider.getInstance();
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        this.g = defaultUncaughtExceptionHandler;
        this.i = " ";
        this.h = "https://o-crash.mediation.unity3d.com/reporter";
        Thread.setDefaultUncaughtExceptionHandler(new C4915p4(defaultUncaughtExceptionHandler));
    }

    public static List<P5> c() {
        return null;
    }

    public static C4950r4 d() {
        return d.a;
    }

    public String b() {
        return k;
    }

    public /* synthetic */ C4950r4(int i) {
        this();
    }

    public void a(HashSet<String> hashSet, String str, String str2, boolean z, String str3, int i, boolean z2) {
        Context applicationContext = this.f.getApplicationContext();
        if (applicationContext != null) {
            Log.d("automation_log", "init ISCrashReporter");
            if (!TextUtils.isEmpty(str2)) {
                this.i = str2;
            }
            if (!TextUtils.isEmpty(str)) {
                this.h = str;
            }
            this.d = str3;
            if (z) {
                new C4585a(i).a(z2).b(true).a(new a()).start();
            }
            a(applicationContext, hashSet);
            new Thread(new b(applicationContext, str3)).start();
        }
        this.j = true;
        IronLog.INTERNAL.verbose("initialized");
    }

    public void a(Throwable th) {
        IronLog.INTERNAL.verbose("isInitialized=" + this.j);
        if (!this.j || th == null) {
            return;
        }
        new P5(new C4933q4(th).b(), "" + System.currentTimeMillis(), "Caught_IS_Crash").a();
    }

    public Context a() {
        return this.f.getApplicationContext();
    }

    private String a(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return "none";
        }
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities == null) {
                return "none";
            }
            if (networkCapabilities.hasTransport(1)) {
                return "wifi";
            }
            return networkCapabilities.hasTransport(0) ? X3.g : "none";
        } catch (Exception e) {
            IronLog.INTERNAL.error(e.toString());
            return "none";
        }
    }
}
