package com.bytedance.sdk.openadsdk.core;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import defpackage.n30;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class kus {
    private static final Runnable fi;
    public static volatile boolean kgy;
    private static volatile HandlerThread noq;
    public static long rz;
    public static long uq;
    public static AtomicBoolean ahm = new AtomicBoolean(false);
    private static volatile int ct = 0;
    private static volatile Handler yo = null;

    static {
        HandlerThread handlerThread = new HandlerThread("pag_init_handle", 10) { // from class: com.bytedance.sdk.openadsdk.core.kus.1
            boolean kgy = false;

            @Override // java.lang.Thread
            public synchronized void start() {
                if (this.kgy) {
                    return;
                }
                this.kgy = true;
                super.start();
            }
        };
        noq = handlerThread;
        handlerThread.start();
        com.bytedance.sdk.component.utils.fi.kgy(noq);
        uq = System.currentTimeMillis();
        fi = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.kus.2
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.openadsdk.core.settings.nu.ahm().ko()) {
                    kus.noq();
                    return;
                }
                String strAhm = com.bytedance.sdk.openadsdk.core.settings.nu.ahm(xh.kgy());
                int iKgy = com.bytedance.sdk.openadsdk.core.settings.nu.kgy(xh.kgy());
                if (!TextUtils.equals(strAhm, com.bytedance.sdk.openadsdk.core.settings.nu.uq) || iKgy != com.bytedance.sdk.openadsdk.core.settings.nu.ct) {
                    com.bytedance.sdk.openadsdk.core.settings.nu.ahm().kgy(6, true);
                    com.bytedance.sdk.openadsdk.core.settings.nu.uq = strAhm;
                    com.bytedance.sdk.openadsdk.core.settings.nu.ct = iKgy;
                }
                kus.noq();
            }
        };
    }

    public static Handler ahm() {
        if (noq == null || !noq.isAlive()) {
            synchronized (kus.class) {
                try {
                    if (noq == null || !noq.isAlive()) {
                        noq = com.bytedance.sdk.component.utils.fi.kgy("pag_init_handle", -1);
                        yo = new Handler(noq.getLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (yo == null) {
            synchronized (kus.class) {
                try {
                    if (yo == null) {
                        yo = new Handler(noq.getLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return yo;
    }

    public static void kgy(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if ("mediation".equals(jSONObject.optString("name", ""))) {
                    ra.ahm().ahm(jSONObject.optString("value", ""));
                    return;
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0=", "cuAkgSu5ZdeFWA==", "S+8/hgaRbMOJS8NUgx+JJl3h", 162);
            com.bytedance.sdk.component.utils.sx.rz("InitHelper", th.getMessage());
        }
    }

    public static Handler rz() {
        return new Handler(Looper.getMainLooper());
    }

    public static int uq() {
        return ct;
    }

    public static boolean ct() {
        if (uq() == 1) {
            return true;
        }
        return false;
    }

    public static void noq() {
        Handler handlerAhm = ahm();
        Runnable runnable = fi;
        handlerAhm.removeCallbacks(runnable);
        ahm().postDelayed(runnable, 10000L);
    }

    public static void yo() {
        ahm().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.kus.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.um.rz.kgy(new com.bytedance.sdk.openadsdk.um.uq() { // from class: com.bytedance.sdk.openadsdk.core.kus.3.1
                        @Override // com.bytedance.sdk.openadsdk.um.uq
                        public com.bytedance.sdk.openadsdk.um.ahm.kgy kgy() {
                            return n30.e("init");
                        }
                    });
                } catch (Throwable th) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0=", "cuAkgSu5ZdeFWJMO", "Sfsj", 181);
                    com.bytedance.sdk.component.utils.sx.rz("InitHelper", th.getMessage());
                }
            }
        });
    }

    public static long kgy() {
        return uq;
    }

    public static void kgy(int i) {
        ct = i;
    }

    public static void kgy(long j) {
        uq = j;
    }
}
