package com.bytedance.sdk.openadsdk.uq;

import android.app.ActivityManager;
import android.os.Build;
import java.lang.reflect.Method;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class fi {
    private static Class<?> ahm;
    private static boolean ct;
    private static Method kgy;
    private static Method rz;
    private static Method uq;

    private static void ahm() {
        int i;
        if (ct || (i = Build.VERSION.SDK_INT) < 35) {
            return;
        }
        try {
            if (rz()) {
                kgy = ActivityManager.class.getMethod("getHistoricalProcessStartReasons", Integer.TYPE);
                Class<?> cls = Class.forName("android.app.ApplicationStartInfo");
                ahm = cls;
                uq = cls.getMethod("getReason", null);
                if (i >= 36) {
                    rz = ahm.getMethod("getStartComponent", null);
                }
                ct = true;
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "ev49mQq/aNOJRdlumBCyPHLgK5o2qGDLkw==", "UuAkgQq9Zc6aTw==", 42);
            com.bytedance.sdk.component.utils.sx.rz(th.getMessage(), new Object[0]);
        }
    }

    public static JSONObject kgy() {
        Method method;
        List list;
        Method method2;
        Method method3;
        int i = Build.VERSION.SDK_INT;
        JSONObject jSONObject = null;
        if (i >= 35 && rz()) {
            ahm();
            try {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    ActivityManager activityManager = (ActivityManager) com.bytedance.sdk.openadsdk.core.xh.kgy().getSystemService(ActivityManager.class);
                    if (activityManager != null && (method = kgy) != null && (list = (List) method.invoke(activityManager, 1)) != null && !list.isEmpty()) {
                        Object obj = list.get(0);
                        if (i >= 36 && obj != null && (method3 = rz) != null) {
                            jSONObject2.put("start_component", ((Integer) method3.invoke(obj, null)).intValue());
                        }
                        if (obj != null && (method2 = uq) != null) {
                            jSONObject2.put("start_reason", ((Integer) method2.invoke(obj, null)).intValue());
                        }
                    }
                    return jSONObject2;
                } catch (Throwable th) {
                    th = th;
                    jSONObject = jSONObject2;
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "ev49mQq/aNOJRdlumBCyPHLgK5o2qGDLkw==", "XOs5tBOsZc6DS8NUgx+TPFr8ObwNumY=", 76);
                    com.bytedance.sdk.component.utils.sx.rz(th.getMessage(), new Object[0]);
                    return jSONObject;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return jSONObject;
    }

    private static boolean rz() {
        return com.bytedance.sdk.openadsdk.lqi.ct.kgy("s_i_e", 0) == 1;
    }

    static {
        ahm();
    }
}
