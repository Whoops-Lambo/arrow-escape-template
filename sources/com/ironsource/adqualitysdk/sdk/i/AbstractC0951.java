package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᙆ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC0951 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static final String f2572 = StringFog.decrypt("w534gLW7mQb+lsuYubSe\n", "kfie7NDY7W8=\n");

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static final ConcurrentHashMap f2571 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m736(Class[] clsArr, List list) {
        int i = 0;
        while (true) {
            boolean zIsAssignableFrom = true;
            if (i >= clsArr.length) {
                return true;
            }
            Object obj = list.get(i);
            if (obj != null || Object.class.isAssignableFrom(clsArr[i])) {
                if (obj != null) {
                    Class cls = clsArr[i];
                    Class<?> cls2 = obj.getClass();
                    if (!cls.isAssignableFrom(Byte.TYPE) || !cls2.isAssignableFrom(Byte.class)) {
                        Class<?> cls3 = Short.TYPE;
                        if ((!cls.isAssignableFrom(cls3) || !cls2.isAssignableFrom(Short.class)) && (!cls.isAssignableFrom(cls3) || !cls2.isAssignableFrom(Byte.class))) {
                            Class<?> cls4 = Integer.TYPE;
                            if ((!cls.isAssignableFrom(cls4) || !cls2.isAssignableFrom(Integer.class)) && ((!cls.isAssignableFrom(cls4) || !cls2.isAssignableFrom(Short.class)) && (!cls.isAssignableFrom(cls4) || !cls2.isAssignableFrom(Byte.class)))) {
                                Class<?> cls5 = Long.TYPE;
                                if ((!cls.isAssignableFrom(cls5) || !cls2.isAssignableFrom(Long.class)) && ((!cls.isAssignableFrom(cls5) || !cls2.isAssignableFrom(Integer.class)) && ((!cls.isAssignableFrom(cls5) || !cls2.isAssignableFrom(Short.class)) && (!cls.isAssignableFrom(cls5) || !cls2.isAssignableFrom(Byte.class))))) {
                                    Class<?> cls6 = Float.TYPE;
                                    if ((!cls.isAssignableFrom(cls6) || !cls2.isAssignableFrom(Float.class)) && ((!cls.isAssignableFrom(cls6) || !cls2.isAssignableFrom(Long.class)) && ((!cls.isAssignableFrom(cls6) || !cls2.isAssignableFrom(Integer.class)) && ((!cls.isAssignableFrom(cls6) || !cls2.isAssignableFrom(Short.class)) && (!cls.isAssignableFrom(cls6) || !cls2.isAssignableFrom(Byte.class)))))) {
                                        Class<?> cls7 = Double.TYPE;
                                        if ((!cls.isAssignableFrom(cls7) || !cls2.isAssignableFrom(Double.class)) && ((!cls.isAssignableFrom(cls7) || !cls2.isAssignableFrom(Float.class)) && ((!cls.isAssignableFrom(cls7) || !cls2.isAssignableFrom(Long.class)) && ((!cls.isAssignableFrom(cls7) || !cls2.isAssignableFrom(Integer.class)) && ((!cls.isAssignableFrom(cls7) || !cls2.isAssignableFrom(Short.class)) && ((!cls.isAssignableFrom(cls7) || !cls2.isAssignableFrom(Byte.class)) && (!cls.isAssignableFrom(Boolean.TYPE) || !cls2.isAssignableFrom(Boolean.class)))))))) {
                                            zIsAssignableFrom = cls.isAssignableFrom(cls2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (!zIsAssignableFrom) {
                    }
                }
                i++;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Method m732(Class cls, String str, List list, boolean z) {
        for (Method method : cls.getMethods()) {
            if (method.getName().equals(str) && method.getParameterTypes().length == list.size() && Modifier.isStatic(method.getModifiers()) == z && m736(method.getParameterTypes(), list)) {
                return method;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Method m734(Object obj, String str, List list) {
        Method methodM732;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 != null) {
                arrayList.add(obj2.getClass());
            } else {
                arrayList.add(Object.class);
            }
        }
        C0959 c0959 = new C0959(obj, str, arrayList);
        ConcurrentHashMap concurrentHashMap = f2571;
        Method method = (Method) concurrentHashMap.get(c0959);
        if (method != null) {
            if (m736(method.getParameterTypes(), list)) {
                return method;
            }
            AbstractC0914.m680(f2572, StringFog.decrypt("sDE6k6PdCVSBNyGStt0NUJYrLZjxkAtFnSws3A==\n", "9UNI/NH9bjE=\n") + c0959, null, null);
        }
        if (obj instanceof Class) {
            methodM732 = m732((Class) obj, str, list, true);
            if (methodM732 == null) {
                methodM732 = m732(Class.class.getClass(), str, list, false);
            }
        } else {
            methodM732 = m732(obj.getClass(), str, list, false);
        }
        if (methodM732 != null) {
            concurrentHashMap.put(c0959, methodM732);
        }
        return methodM732;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.reflect.Method] */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Method m733(Object obj, String str, ArrayList arrayList) {
        try {
            Class<?>[] clsArr = new Class[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                clsArr[i] = (Class) arrayList.get(i);
            }
            if (obj instanceof Class) {
                try {
                    obj = ((Class) obj).getMethod(str, clsArr);
                    return obj;
                } catch (NoSuchMethodException unused) {
                    return Class.class.getMethod(str, clsArr);
                }
            }
            return obj.getClass().getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            String str2 = f2572;
            StringBuilder sbM577 = AbstractC0688.m577("iMuIbg==\n", "xqSoSQr/rk4=\n", new StringBuilder(), str);
            sbM577.append(StringFog.decrypt("euhR1cMjzZ19rlPF2S+CnzK6HA==\n", "Xcg8sLdLovk=\n"));
            sbM577.append(obj);
            AbstractC0914.m680(str2, sbM577.toString(), e, null);
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m735(Class cls, List list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if ((str.equals("") && (cls.getPackage() == null || cls.getPackage().getName().equals(""))) || (!str.equals("") && cls.getName().startsWith(str))) {
                return true;
            }
        }
        return !AbstractC0951.class.getName().startsWith(StringFog.decrypt("8a8KeMEyYEfhrxIkyyUhSPaxEjfEKXtQ\n", "ksBnVqhADyk=\n")) && ((AbstractC0951.class.getPackage() == null && cls.getPackage() == null) || (AbstractC0951.class.getPackage() != null && AbstractC0951.class.getPackage().equals(cls.getPackage())));
    }
}
