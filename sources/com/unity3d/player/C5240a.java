package com.unity3d.player;

import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.unity3d.player.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class C5240a implements InvocationHandler {
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2;
        String string;
        if (!"onSuccess".equals(method.getName())) {
            return AndroidAppSetIdHelper.defaultProxyResult(obj, method, objArr);
        }
        if (objArr != null) {
            try {
                if (objArr.length > 0 && (obj2 = objArr[0]) != null) {
                    Object objInvoke = obj2.getClass().getMethod("getId", null).invoke(objArr[0], null);
                    if (objInvoke != null) {
                        string = objInvoke.toString();
                    } else {
                        string = null;
                    }
                    if (!TextUtils.isEmpty(string)) {
                        AndroidAppSetIdHelper.nativeOnAndroidAppSetIdResult(string);
                        return null;
                    }
                }
            } catch (Exception e) {
                Log.w("Insights", "AndroidAppSetIdHelper: failed to extract app set ID: " + e);
            }
        }
        AndroidAppSetIdHelper.nativeOnAndroidAppSetIdResult(null);
        return null;
    }
}
