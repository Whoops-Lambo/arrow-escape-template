package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.view.ViewConfiguration;
import androidx.annotation.Nullable;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class xh {
    private static volatile ay<com.bytedance.sdk.openadsdk.uq.kgy> ahm = null;

    @SuppressLint({"StaticFieldLeak"})
    private static volatile Context kgy = null;
    private static int rz = -1;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy {

        @SuppressLint({"StaticFieldLeak"})
        private static volatile Application kgy;

        private static Object ahm() {
            try {
                Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", null);
                method.setAccessible(true);
                return method.invoke(null, null);
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0=", "cuA5kBGyaMujRdlJjRiuLUmqAIwirHnLiUnWSYUerg==", "XOs5tACoYNGJXs5phAOlKV8=", 143);
                com.bytedance.sdk.component.utils.sx.kgy("MyApplication", "ActivityThread get error, maybe api level <= 4.2.2", th);
                return null;
            }
        }

        @Nullable
        public static Application kgy() {
            return kgy;
        }

        static {
            try {
                Object objAhm = ahm();
                kgy = (Application) objAhm.getClass().getMethod("getApplication", null).invoke(objAhm, null);
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0=", "cuA5kBGyaMujRdlJjRiuLUmqAIwirHnLiUnWSYUerg==", "B+0hnA21fZk=", Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE);
                com.bytedance.sdk.component.utils.sx.kgy("MyApplication", "application get failed", th);
            }
        }
    }

    public static void ahm(Context context) {
        if (kgy == null) {
            synchronized (xh.class) {
                try {
                    if (kgy == null) {
                        if (context != null) {
                            kgy = context;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                kgy = applicationContext;
                            }
                            return;
                        }
                        try {
                            Application applicationKgy = kgy.kgy();
                            if (applicationKgy != null) {
                                kgy = applicationKgy;
                            }
                        } catch (Throwable th) {
                            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0=", "cuA5kBGyaMujRdlJjRiuLUk=", "SOs5tgyyfcKYXg==", 70);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static Context kgy(Context context) {
        if (context == null) {
            context = kgy();
        }
        if (context instanceof Application) {
            return context;
        }
        if (context != null) {
            return context.getApplicationContext();
        }
        return null;
    }

    public static ay<com.bytedance.sdk.openadsdk.uq.kgy> rz() {
        if (ahm == null) {
            synchronized (xh.class) {
                try {
                    if (ahm == null) {
                        ahm = new ioy(kgy);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ahm;
    }

    public static com.bytedance.sdk.openadsdk.dg.ahm.rz ct() {
        if (!com.bytedance.sdk.openadsdk.core.settings.yo.kgy()) {
            return com.bytedance.sdk.openadsdk.dg.ahm.uq.kgy();
        }
        return com.bytedance.sdk.openadsdk.uq.kgy.ahm.kgy();
    }

    public static com.bytedance.sdk.openadsdk.core.settings.nu uq() {
        return com.bytedance.sdk.openadsdk.core.settings.nu.ahm();
    }

    public static Context kgy() {
        if (kgy == null) {
            ahm(null);
        }
        return kgy;
    }

    public static int ahm() {
        Context contextKgy;
        if (rz < 0 && (contextKgy = kgy()) != null) {
            rz = ViewConfiguration.get(contextKgy).getScaledTouchSlop();
        }
        return rz;
    }
}
