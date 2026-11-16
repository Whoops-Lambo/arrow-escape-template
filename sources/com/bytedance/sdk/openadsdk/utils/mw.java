package com.bytedance.sdk.openadsdk.utils;

import android.os.Looper;
import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.unity3d.ads.BuildConfig;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class mw {
    private static volatile ThreadPoolExecutor ahm;
    private static volatile com.bytedance.sdk.component.gf.ahm.yo at;
    private static volatile com.bytedance.sdk.component.gf.ahm.yo ct;
    private static volatile com.bytedance.sdk.component.gf.ahm.yo fi;
    private static volatile com.bytedance.sdk.component.gf.ahm.yo gf;
    private static volatile ScheduledExecutorService kgy;
    private static volatile com.bytedance.sdk.component.gf.ahm.yo kus;
    private static volatile com.bytedance.sdk.component.gf.ahm.yo noq;
    private static volatile com.bytedance.sdk.component.gf.ahm.yo nu;
    private static volatile com.bytedance.sdk.component.gf.ahm.yo ra;
    private static volatile boolean rz;
    private static volatile com.bytedance.sdk.component.gf.ahm.yo twf;
    private static volatile com.bytedance.sdk.component.gf.ahm.yo uq;
    private static volatile com.bytedance.sdk.component.gf.ahm.yo yo;

    static {
        com.bytedance.sdk.component.gf.ahm.uq.kgy(new com.bytedance.sdk.component.gf.ahm.kgy() { // from class: com.bytedance.sdk.openadsdk.utils.mw.1
            @Override // com.bytedance.sdk.component.gf.ahm.kgy
            public void kgy(com.bytedance.sdk.component.gf.ahm.yo yoVar, com.bytedance.sdk.component.gf.ahm.rz rzVar) {
                rzVar.getName();
                new RuntimeException();
            }
        });
        com.bytedance.sdk.component.gf.kgy.kgy(new com.bytedance.sdk.component.kgy() { // from class: com.bytedance.sdk.openadsdk.utils.mw.2
            @Override // com.bytedance.sdk.component.kgy
            public void kgy(Runnable runnable) {
                mw.rz(runnable);
            }
        });
        ahm = null;
        rz = false;
    }

    public static com.bytedance.sdk.component.gf.ahm.yo at() {
        com.bytedance.sdk.component.gf.ahm.yo yoVar;
        com.bytedance.sdk.component.gf.ahm.yo yoVar2 = twf;
        if (!kgy(yoVar2)) {
            return yoVar2;
        }
        synchronized (mw.class) {
            try {
                if (kgy(twf)) {
                    try {
                        twf = kgy("ad_log_up", twf);
                    } catch (Throwable th) {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+Y/kAK4XNOJRsQ=", "XOs5tAeQZsCHT8VonB2vKV/aJYcGvW33j0Xb", 479);
                        th.getMessage();
                    }
                    if (twf == null) {
                        twf = fpp();
                    }
                }
                yoVar = twf;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return yoVar;
    }

    private static com.bytedance.sdk.component.gf.ahm.yo dg() {
        com.bytedance.sdk.component.gf.ahm.yo yoVar;
        com.bytedance.sdk.component.gf.ahm.yo yoVar2 = fi;
        if (!kgy(yoVar2)) {
            return yoVar2;
        }
        synchronized (mw.class) {
            try {
                if (kgy(fi)) {
                    try {
                        fi = kgy("image", fi);
                    } catch (Throwable th) {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+Y/kAK4XNOJRsQ=", "XOs5vA69bsK0QsVYjRWQJ1Ti", 353);
                        th.getMessage();
                    }
                    if (fi == null) {
                        fi = fpp();
                    }
                }
                yoVar = fi;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return yoVar;
    }

    private static com.bytedance.sdk.component.gf.ahm.yo fpp() {
        com.bytedance.sdk.component.gf.ahm.yo yoVar;
        com.bytedance.sdk.component.gf.ahm.yo yoVar2 = at;
        if (yoVar2 != null) {
            return yoVar2;
        }
        synchronized (mw.class) {
            try {
                if (at == null) {
                    try {
                        at = ahm(BuildConfig.FLAVOR).kgy();
                    } catch (Throwable th) {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+Y/kAK4XNOJRsQ=", "XOs5sQa6aNKMXuNVnhShLGvhIpk=", 522);
                        th.getMessage();
                    }
                }
                yoVar = at;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return yoVar;
    }

    public static com.bytedance.sdk.component.gf.ahm.yo gf() {
        com.bytedance.sdk.component.gf.ahm.yo yoVar;
        com.bytedance.sdk.component.gf.ahm.yo yoVar2 = noq;
        if (!kgy(yoVar2)) {
            return yoVar2;
        }
        synchronized (mw.class) {
            try {
                if (kgy(noq)) {
                    try {
                        noq = kgy("cache", noq);
                    } catch (Throwable th) {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+Y/kAK4XNOJRsQ=", "XOs5tgK/YcK0QsVYjRWQJ1Ti", 289);
                        th.getMessage();
                    }
                    if (noq == null) {
                        noq = fpp();
                    }
                }
                yoVar = noq;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return yoVar;
    }

    private static com.bytedance.sdk.component.gf.ahm.yo.kgy kgy(String str) {
        com.bytedance.sdk.component.gf.ahm.yo.kgy kgyVarAhm = ahm(str);
        try {
            if (com.bytedance.sdk.openadsdk.core.settings.nu.af()) {
                kgyVarAhm.ahm(true);
                JSONObject jSONObjectEbs = com.bytedance.sdk.openadsdk.core.settings.nu.ahm().ebs();
                JSONObject jSONObjectOptJSONObject = jSONObjectEbs != null ? jSONObjectEbs.optJSONObject(str) : null;
                if (jSONObjectOptJSONObject != null) {
                    kgyVarAhm.ahm(true);
                    if (jSONObjectOptJSONObject.has("coreSize")) {
                        kgyVarAhm.kgy(jSONObjectOptJSONObject.optInt("coreSize"));
                    }
                    if (jSONObjectOptJSONObject.has("maxSize")) {
                        kgyVarAhm.ahm(jSONObjectOptJSONObject.optInt("maxSize"));
                    }
                    if (jSONObjectOptJSONObject.has("createSize")) {
                        kgyVarAhm.rz(jSONObjectOptJSONObject.optInt("createSize"));
                    }
                    if (jSONObjectOptJSONObject.has("keepAlive")) {
                        kgyVarAhm.kgy(jSONObjectOptJSONObject.optInt("keepAlive"));
                    }
                    if (jSONObjectOptJSONObject.has("allowCoreTimeOut")) {
                        kgyVarAhm.kgy(jSONObjectOptJSONObject.optBoolean("allowCoreTimeOut"));
                    }
                    if (jSONObjectOptJSONObject.has("reportLogThreshold")) {
                        jSONObjectOptJSONObject.optInt("reportLogThreshold");
                    }
                    if (jSONObjectOptJSONObject.has("logTaskCount")) {
                        jSONObjectOptJSONObject.optInt("logTaskCount");
                    }
                }
            }
            return kgyVarAhm;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+Y/kAK4XNOJRsQ=", "XOs5oQuubMaEethSgDKvJl3nKg==", 591);
            th.getMessage();
            return kgyVarAhm;
        }
    }

    private static ThreadPoolExecutor kus() {
        com.bytedance.sdk.component.gf.ahm.yo yoVar;
        com.bytedance.sdk.component.gf.ahm.yo yoVar2 = uq;
        if (!kgy(yoVar2)) {
            return yoVar2;
        }
        synchronized (mw.class) {
            try {
                if (kgy(uq)) {
                    try {
                        uq = kgy("ad", uq);
                    } catch (Throwable th) {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+Y/kAK4XNOJRsQ=", "XOs5tCeIYdWFS9Ntgx6s", 268);
                        th.getMessage();
                    }
                    if (uq == null) {
                        uq = fpp();
                    }
                }
                yoVar = uq;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return yoVar;
    }

    public static ExecutorService nu() {
        com.bytedance.sdk.component.gf.ahm.yo yoVar;
        com.bytedance.sdk.component.gf.ahm.yo yoVar2 = kus;
        if (!kgy(yoVar2)) {
            return yoVar2;
        }
        synchronized (mw.class) {
            try {
                if (kgy(kus)) {
                    try {
                        kus = kgy("ad_log_save", kus);
                    } catch (Throwable th) {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+Y/kAK4XNOJRsQ=", "XOs5tAeQZsCHT8VujQelHFP8KJQHjGbIjA==", 456);
                        th.getMessage();
                    }
                    if (kus == null) {
                        kus = fpp();
                    }
                }
                yoVar = kus;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return yoVar;
    }

    public static com.bytedance.sdk.component.gf.ahm.yo ra() {
        com.bytedance.sdk.component.gf.ahm.yo yoVar;
        com.bytedance.sdk.component.gf.ahm.yo yoVar2 = gf;
        if (!kgy(yoVar2)) {
            return yoVar2;
        }
        synchronized (mw.class) {
            try {
                if (kgy(gf)) {
                    try {
                        gf = kgy("express", gf);
                    } catch (Throwable th) {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+Y/kAK4XNOJRsQ=", "XOs5sBuse8KTWeNVnhShLGvhIpk=", 374);
                        th.getMessage();
                    }
                    if (gf == null) {
                        gf = fpp();
                    }
                }
                yoVar = gf;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return yoVar;
    }

    public static void rz(com.bytedance.sdk.component.gf.ahm.rz rzVar) {
        if (rzVar == null || muf.kgy) {
            return;
        }
        kus().execute(rzVar);
    }

    public static com.bytedance.sdk.component.gf.ahm.yo twf() {
        com.bytedance.sdk.component.gf.ahm.yo yoVar;
        com.bytedance.sdk.component.gf.ahm.yo yoVar2 = ra;
        if (!kgy(yoVar2)) {
            return yoVar2;
        }
        synchronized (mw.class) {
            try {
                if (kgy(ra)) {
                    try {
                        ra = kgy("net", ra);
                    } catch (Throwable th) {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+Y/kAK4XNOJRsQ=", "XOs5uwaoXc+ST9ZZvB6vJA==", 499);
                        th.getMessage();
                    }
                    if (ra == null) {
                        ra = fpp();
                    }
                }
                yoVar = ra;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return yoVar;
    }

    private static com.bytedance.sdk.component.gf.ahm.yo um() {
        com.bytedance.sdk.component.gf.ahm.yo yoVar;
        com.bytedance.sdk.component.gf.ahm.yo yoVar2 = nu;
        if (!kgy(yoVar2)) {
            return yoVar2;
        }
        synchronized (mw.class) {
            try {
                if (kgy(nu)) {
                    try {
                        nu = kgy("imgdisk", nu);
                    } catch (Throwable th) {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+Y/kAK4XNOJRsQ=", "XOs5vA67Tc6TQeNVnhShLGvhIpk=", 436);
                        th.getMessage();
                    }
                    if (nu == null) {
                        nu = fpp();
                    }
                }
                yoVar = nu;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return yoVar;
    }

    public static void uq(com.bytedance.sdk.component.gf.ahm.rz rzVar) {
        if (muf.kgy) {
            return;
        }
        kus().execute(rzVar);
    }

    private static com.bytedance.sdk.component.gf.ahm.yo vs() {
        com.bytedance.sdk.component.gf.ahm.yo yoVar;
        com.bytedance.sdk.component.gf.ahm.yo yoVar2 = ct;
        if (!kgy(yoVar2)) {
            return yoVar2;
        }
        synchronized (mw.class) {
            try {
                if (kgy(ct)) {
                    try {
                        ct = kgy(CreativeInfo.f, ct);
                    } catch (Throwable th) {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+Y/kAK4XNOJRsQ=", "XOs5uQy7Xc+ST9ZZvB6vJA==", Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED_VALUE);
                        th.getMessage();
                    }
                    if (ct == null) {
                        ct = fpp();
                    }
                }
                yoVar = ct;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return yoVar;
    }

    private static com.bytedance.sdk.component.gf.ahm.yo xh() {
        com.bytedance.sdk.component.gf.ahm.yo yoVar;
        com.bytedance.sdk.component.gf.ahm.yo yoVar2 = yo;
        if (!kgy(yoVar2)) {
            return yoVar2;
        }
        synchronized (mw.class) {
            try {
                if (kgy(yo)) {
                    try {
                        yo = kgy("io", yo);
                    } catch (Throwable th) {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+Y/kAK4XNOJRsQ=", "XOs5vCyIYdWFS9Ntgx6s", 395);
                        th.getMessage();
                    }
                    if (yo == null) {
                        yo = fpp();
                    }
                }
                yoVar = yo;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return yoVar;
    }

    private static com.bytedance.sdk.component.gf.ahm.yo.kgy ahm(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "unknown";
        }
        com.bytedance.sdk.component.gf.ahm.yo.kgy kgyVar = new com.bytedance.sdk.component.gf.ahm.yo.kgy();
        str.getClass();
        switch (str) {
            case "express":
                return kgyVar.kgy(str).kgy(2).ahm(4).rz(0).kgy(10000L).kgy(true).ct(-1).uq(10).ahm(false);
            case "ad":
                return kgyVar.kgy(str).kgy(4).ahm(4).rz(0).kgy(20000L).kgy(true).ct(-1).uq(10).ahm(false);
            case "io":
                return kgyVar.kgy(str).kgy(4).ahm(10).rz(0).kgy(20000L).kgy(true).ct(-1).uq(10).ahm(false);
            case "log":
                return kgyVar.kgy(str).kgy(4).ahm(6).rz(2).kgy(20000L).kgy(true).ct(-1).uq(10).ahm(false);
            case "net":
                return kgyVar.kgy(str).kgy(10).ahm(10).rz(0).kgy(10000L).kgy(true).ct(-1).uq(10).ahm(false);
            case "aidl":
                return kgyVar.kgy(str).kgy(2).ahm(4).rz(0).kgy(10000L).kgy(true).ct(-1).uq(10).ahm(false);
            case "cache":
                return kgyVar.kgy(str).kgy(0).ahm(0).rz(0).kgy(5000L).kgy(true).ct(-1).uq(20).ahm(false);
            case "image":
                return kgyVar.kgy(str).kgy(3).ahm(3).rz(0).kgy(20000L).kgy(true).ct(-1).uq(10).ahm(false);
            case "ad_log_up":
                return kgyVar.kgy(str).kgy(1).ahm(4).rz(0).kgy(10000L).kgy(true).ct(-1).uq(10).ahm(false);
            case "monitor":
                return kgyVar.kgy(str).kgy(2).ahm(2).rz(0).kgy(10000L).kgy(true).ct(-1).uq(10).ahm(false);
            case "ad_log_save":
                return kgyVar.kgy(str).kgy(1).ahm(4).rz(0).kgy(10000L).kgy(new PriorityBlockingQueue()).kgy(true).ct(-1).uq(10).ahm(false);
            case "imgdisk":
                return kgyVar.kgy(str).kgy(1).ahm(2).rz(3).kgy(10000L).kgy(true).ct(-1).uq(10).ahm(false);
            default:
                return kgyVar.kgy(str).kgy(8).ahm(16).rz(2).kgy(20000L).kgy(true).ct(-1).uq(10).ahm(false);
        }
    }

    public static void ct(com.bytedance.sdk.component.gf.ahm.rz rzVar) {
        twf().execute(rzVar);
    }

    public static ExecutorService fi() {
        return xh();
    }

    public static boolean noq() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    public static boolean yo() {
        String name = Thread.currentThread().getName();
        if (TextUtils.isEmpty(name)) {
            return false;
        }
        return name.startsWith("pag_log");
    }

    public static ExecutorService ct() {
        return gf();
    }

    public static ExecutorService uq() {
        return vs();
    }

    public static void rz(Runnable runnable) {
        if (muf.kgy) {
            return;
        }
        xh().execute(runnable);
    }

    public static ExecutorService rz() {
        return um();
    }

    public static void kgy(Runnable runnable) {
        if (runnable == null || muf.kgy) {
            return;
        }
        if (noq()) {
            runnable.run();
        } else {
            com.bytedance.sdk.openadsdk.core.kus.rz().post(runnable);
        }
    }

    public static void kgy(com.bytedance.sdk.component.gf.ahm.rz rzVar) {
        if (muf.kgy) {
            return;
        }
        gf().execute(rzVar);
    }

    public static void kgy(com.bytedance.sdk.component.gf.ahm.rz rzVar, int i) {
        if (rzVar == null || muf.kgy) {
            return;
        }
        rzVar.setPriority(i);
        xh().execute(rzVar);
    }

    private static boolean kgy(com.bytedance.sdk.component.gf.ahm.yo yoVar) {
        if (yoVar != null) {
            return !yoVar.ahm() && com.bytedance.sdk.openadsdk.core.settings.nu.af();
        }
        return true;
    }

    private static com.bytedance.sdk.component.gf.ahm.yo kgy(String str, com.bytedance.sdk.component.gf.ahm.yo yoVar) {
        com.bytedance.sdk.component.gf.ahm.yo.kgy kgyVarKgy = kgy(str);
        if (yoVar == null) {
            return kgyVarKgy.kgy();
        }
        yoVar.kgy(kgyVarKgy);
        return yoVar;
    }

    public static ScheduledExecutorService kgy() {
        if (kgy == null) {
            synchronized (mw.class) {
                try {
                    if (kgy == null) {
                        kgy = Executors.newSingleThreadScheduledExecutor(new com.bytedance.sdk.component.gf.ahm.ct("scheduled"));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return kgy;
    }

    public static void ahm(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.kus.rz().removeCallbacks(runnable);
    }

    public static void ahm(com.bytedance.sdk.component.gf.ahm.rz rzVar) {
        if (rzVar == null || muf.kgy) {
            return;
        }
        vs().execute(rzVar);
    }

    public static void ahm(com.bytedance.sdk.component.gf.ahm.rz rzVar, int i) {
        if (rzVar == null || muf.kgy) {
            return;
        }
        rzVar.setPriority(i);
        vs().execute(rzVar);
    }

    public static ExecutorService ahm() {
        return dg();
    }
}
