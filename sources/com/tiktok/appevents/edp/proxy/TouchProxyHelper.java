package com.tiktok.appevents.edp.proxy;

import android.view.View;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class TouchProxyHelper {
    public static void proxy(WeakReference<View> weakReference, ITouchListener iTouchListener) {
        if (iTouchListener == null) {
            return;
        }
        try {
            View view = weakReference.get();
            if (view == null) {
                return;
            }
            Method declaredMethod = View.class.getDeclaredMethod("getListenerInfo", null);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(view, null);
            Field declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener");
            declaredField.setAccessible(true);
            View.OnTouchListener onTouchListener = (View.OnTouchListener) declaredField.get(objInvoke);
            if (onTouchListener instanceof ProxyOnTouchListener) {
                return;
            }
            declaredField.set(objInvoke, new ProxyOnTouchListener(iTouchListener, onTouchListener));
        } catch (Throwable unused) {
        }
    }
}
