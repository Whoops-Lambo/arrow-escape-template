package com.unity3d.player;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.ironsource.C4664b4;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
class AndroidAdvertisingIdHelper {
    private static native void nativeOnAndroidAdvertisingIdResult(String str);

    public static void requestGoogleAdId(Context context) {
        try {
            Method method = AdvertisingIdClient.class.getMethod("getAdvertisingIdInfo", Context.class);
            if (method == null) {
                nativeOnAndroidAdvertisingIdResult(null);
                return;
            }
            Object objInvoke = method.invoke(null, context);
            if (objInvoke == null) {
                nativeOnAndroidAdvertisingIdResult(null);
                return;
            }
            Class<?> cls = objInvoke.getClass();
            Method method2 = cls.getMethod("getId", null);
            if (method2 == null) {
                nativeOnAndroidAdvertisingIdResult(null);
                return;
            }
            String str = (String) method2.invoke(objInvoke, null);
            Method method3 = cls.getMethod(C4664b4.j.M, null);
            if (method3 == null) {
                nativeOnAndroidAdvertisingIdResult(null);
            } else if (((Boolean) method3.invoke(objInvoke, null)).booleanValue()) {
                nativeOnAndroidAdvertisingIdResult(null);
            } else {
                nativeOnAndroidAdvertisingIdResult(str);
            }
        } catch (Exception unused) {
            nativeOnAndroidAdvertisingIdResult(null);
        }
    }
}
