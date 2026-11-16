package com.unity3d.player;

import com.singular.sdk.internal.Constants;
import com.unity3d.services.UnityAdsConstants;
import defpackage.h50;
import defpackage.pv1;
import defpackage.uj2;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
final class ReflectionHelper {
    protected static boolean LOG;
    protected static final boolean LOGV = false;
    private static final C5280u[] a = new C5280u[4096];
    private static long b;
    private static long c;
    private static boolean d;

    private static Class a(String str, int[] iArr) {
        while (iArr[0] < str.length()) {
            int i = iArr[0];
            iArr[0] = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != '(' && cCharAt != ')') {
                if (cCharAt == 'L') {
                    int iIndexOf = str.indexOf(59, iArr[0]);
                    if (iIndexOf == -1) {
                        return null;
                    }
                    String strSubstring = str.substring(iArr[0], iIndexOf);
                    iArr[0] = iIndexOf + 1;
                    try {
                        return Class.forName(strSubstring.replace('/', '.'));
                    } catch (ClassNotFoundException unused) {
                        return null;
                    }
                }
                if (cCharAt == 'Z') {
                    return Boolean.TYPE;
                }
                if (cCharAt == 'I') {
                    return Integer.TYPE;
                }
                if (cCharAt == 'F') {
                    return Float.TYPE;
                }
                if (cCharAt == 'V') {
                    return Void.TYPE;
                }
                if (cCharAt == 'B') {
                    return Byte.TYPE;
                }
                if (cCharAt == 'C') {
                    return Character.TYPE;
                }
                if (cCharAt == 'S') {
                    return Short.TYPE;
                }
                if (cCharAt == 'J') {
                    return Long.TYPE;
                }
                if (cCharAt == 'D') {
                    return Double.TYPE;
                }
                if (cCharAt == '[') {
                    return Array.newInstance((Class<?>) a(str, iArr), 0).getClass();
                }
                uj2.a(5, "! parseType; " + cCharAt + " is not known!");
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeProxyFinalize(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native Object nativeProxyInvoke(long j, String str, Object[] objArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeProxyJNIFreeGCHandle(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeProxyLogJNIInvokeException(long j);

    public static synchronized boolean beginProxyCall(long j) {
        if (j != b) {
            return false;
        }
        c++;
        return true;
    }

    public static Object createInvocationError(long j, boolean z) {
        return new C5282v(j, z);
    }

    public static synchronized void endProxyCall() {
        long j = c - 1;
        c = j;
        if (0 == j && d) {
            ReflectionHelper.class.notifyAll();
        }
    }

    public static synchronized void endUnityLaunch() {
        try {
            b++;
            d = true;
            while (c > 0) {
                ReflectionHelper.class.wait();
            }
        } catch (InterruptedException unused) {
            uj2.a(6, "Interrupted while waiting for all proxies to exit.");
        }
        d = false;
    }

    public static Constructor getConstructorID(Class cls, String str) {
        Constructor<?> constructor;
        C5280u c5280u = new C5280u(cls, "", str);
        if (a(c5280u)) {
            constructor = (Constructor) c5280u.e;
        } else {
            Class[] clsArrA = a(str);
            Constructor<?>[] constructors = cls.getConstructors();
            Constructor<?> constructor2 = null;
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            for (Constructor<?> constructor3 : constructors) {
                float fA = a(Void.TYPE, constructor3.getParameterTypes(), clsArrA);
                if (fA > f) {
                    if (fA == 1.0f) {
                        constructor2 = constructor3;
                        break;
                    }
                    constructor2 = constructor3;
                    f = fA;
                }
            }
            synchronized (ReflectionHelper.class) {
                c5280u.e = constructor2;
                a[c5280u.d & 4095] = c5280u;
            }
            constructor = constructor2;
        }
        if (constructor != null) {
            return constructor;
        }
        StringBuilder sbR = h50.r("<init>", str, " in class ");
        sbR.append(cls.getName());
        throw new NoSuchMethodError(sbR.toString());
    }

    public static Field getFieldID(Class cls, String str, String str2, boolean z) {
        Field field;
        C5280u c5280u = new C5280u(cls, str, str2);
        if (a(c5280u)) {
            field = (Field) c5280u.e;
        } else {
            Class[] clsArrA = a(str2);
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            Field field2 = null;
            while (cls != null) {
                for (Field field3 : cls.getDeclaredFields()) {
                    if (z == Modifier.isStatic(field3.getModifiers()) && field3.getName().compareTo(str) == 0) {
                        float fA = a(field3.getType(), null, clsArrA);
                        if (fA > f) {
                            field2 = field3;
                            if (fA == 1.0f) {
                                f = fA;
                                break;
                            }
                            f = fA;
                        } else {
                            continue;
                        }
                    }
                }
                if (f == 1.0f || cls.isPrimitive() || cls.isInterface() || cls.equals(Object.class) || cls.equals(Void.TYPE)) {
                    break;
                }
                cls = cls.getSuperclass();
            }
            synchronized (ReflectionHelper.class) {
                c5280u.e = field2;
                a[c5280u.d & 4095] = c5280u;
            }
            field = field2;
        }
        if (field != null) {
            return field;
        }
        throw new NoSuchFieldError(pv1.p(pv1.r("no ", z ? "static" : "non-static", " field with name='", str, "' signature='"), str2, "' in class L", cls.getName(), ";"));
    }

    public static Method getMethodID(Class cls, String str, String str2, boolean z) {
        Method method;
        C5280u c5280u = new C5280u(cls, str, str2);
        if (a(c5280u)) {
            method = (Method) c5280u.e;
        } else {
            Class[] clsArrA = a(str2);
            Method method2 = null;
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            while (cls != null) {
                for (Method method3 : cls.getDeclaredMethods()) {
                    if (z == Modifier.isStatic(method3.getModifiers()) && method3.getName().compareTo(str) == 0) {
                        float fA = a(method3.getReturnType(), method3.getParameterTypes(), clsArrA);
                        if (fA <= f) {
                            continue;
                        } else {
                            if (fA == 1.0f) {
                                method2 = method3;
                                f = fA;
                                break;
                            }
                            method2 = method3;
                            f = fA;
                        }
                    }
                }
                if (f == 1.0f || cls.isPrimitive() || cls.isInterface() || cls.equals(Object.class) || cls.equals(Void.TYPE)) {
                    break;
                }
                cls = cls.getSuperclass();
            }
            synchronized (ReflectionHelper.class) {
                c5280u.e = method2;
                a[c5280u.d & 4095] = c5280u;
            }
            method = method2;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodError(pv1.p(pv1.r("no ", z ? "static" : "non-static", " method with name='", str, "' signature='"), str2, "' in class L", cls.getName(), ";"));
    }

    public static Object newProxyInstance(UnityPlayer unityPlayer, long j, Class[] clsArr) {
        return Proxy.newProxyInstance(ReflectionHelper.class.getClassLoader(), clsArr, new C5278t(j, unityPlayer));
    }

    public static String getFieldSignature(Field field) {
        Class<?> type = field.getType();
        if (type.isPrimitive()) {
            String name = type.getName();
            if ("boolean".equals(name)) {
                return "Z";
            }
            if ("byte".equals(name)) {
                return "B";
            }
            if ("char".equals(name)) {
                return "C";
            }
            if ("double".equals(name)) {
                return "D";
            }
            if ("float".equals(name)) {
                return "F";
            }
            if (com.safedk.android.analytics.brandsafety.m.w.equals(name)) {
                return "I";
            }
            if (Constants.LONG.equals(name)) {
                return "J";
            }
            if ("short".equals(name)) {
                return "S";
            }
            return name;
        }
        if (type.isArray()) {
            return type.getName().replace('.', '/');
        }
        return "L" + type.getName().replace('.', '/') + ";";
    }

    public static Object newProxyInstance(UnityPlayer unityPlayer, long j, Class cls) {
        return newProxyInstance(unityPlayer, j, new Class[]{cls});
    }

    private static synchronized boolean a(C5280u c5280u) {
        C5280u c5280u2 = a[c5280u.d & 4095];
        if (!c5280u.equals(c5280u2)) {
            return false;
        }
        c5280u.e = c5280u2.e;
        return true;
    }

    private static float a(Class cls, Class cls2) {
        if (cls.equals(cls2)) {
            return 1.0f;
        }
        if (cls.isPrimitive() || cls2.isPrimitive()) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        try {
            if (cls.asSubclass(cls2) != null) {
                return 0.5f;
            }
        } catch (ClassCastException unused) {
        }
        try {
            if (cls2.asSubclass(cls) != null) {
                return 0.1f;
            }
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } catch (ClassCastException unused2) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
    }

    private static float a(Class cls, Class[] clsArr, Class[] clsArr2) {
        if (clsArr2.length == 0) {
            return 0.1f;
        }
        int i = 0;
        if ((clsArr == null ? 0 : clsArr.length) + 1 != clsArr2.length) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f = 1.0f;
        if (clsArr != null) {
            int length = clsArr.length;
            float fA = 1.0f;
            int i2 = 0;
            while (i < length) {
                fA *= a(clsArr[i], clsArr2[i2]);
                i++;
                i2++;
            }
            f = fA;
        }
        return f * a(cls, clsArr2[clsArr2.length - 1]);
    }

    private static Class[] a(String str) {
        Class clsA;
        int i = 0;
        int[] iArr = {0};
        ArrayList arrayList = new ArrayList();
        while (iArr[0] < str.length() && (clsA = a(str, iArr)) != null) {
            arrayList.add(clsA);
        }
        Class[] clsArr = new Class[arrayList.size()];
        int size = arrayList.size();
        int i2 = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            clsArr[i2] = (Class) obj;
            i2++;
        }
        return clsArr;
    }
}
