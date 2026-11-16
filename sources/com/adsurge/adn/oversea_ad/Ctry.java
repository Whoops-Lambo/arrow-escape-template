package com.adsurge.adn.oversea_ad;

import android.text.TextUtils;
import android.view.accessibility.AccessibilityEvent;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.adsurge.adn.oversea_ad.try, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class Ctry implements InvocationHandler {
    public static final String b = CanisMinor.a(CanisMinor.e1);
    public final AtomicReference a = new AtomicReference();

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        int i;
        String str = b;
        if (!TextUtils.isEmpty(str) && str.equals(method.getName()) && Void.TYPE.equals(method.getReturnType()) && objArr != null && objArr.length > 0) {
            Object obj2 = objArr[0];
            if (obj2 instanceof AccessibilityEvent) {
                AccessibilityEvent accessibilityEvent = (AccessibilityEvent) obj2;
                int eventType = accessibilityEvent.getEventType();
                if (eventType == 0) {
                    AtomicInteger atomicInteger = Eridanus.a;
                } else {
                    AtomicInteger atomicInteger2 = Eridanus.a;
                    synchronized (atomicInteger2) {
                        i = atomicInteger2.get();
                    }
                    if ((eventType & i) != 0) {
                        Eridanus.a(accessibilityEvent);
                        return null;
                    }
                }
                Eridanus.b(accessibilityEvent);
            }
        }
        Object obj3 = this.a.get();
        if (obj3 == null) {
            return null;
        }
        try {
            return method.invoke(obj3, objArr);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause != null) {
                throw cause;
            }
            throw e;
        }
    }
}
