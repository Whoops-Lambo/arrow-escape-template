package com.singular.sdk.internal;

import android.content.res.Configuration;
import defpackage.h50;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class SLReflectionUtils {
    private static final SingularLog logger = SingularLog.getLogger("SLReflectionUtils");

    public static Locale getLocaleFromLocaleList(Configuration configuration) {
        try {
            Object objInvokeInstanceMethod = invokeInstanceMethod(configuration, "getLocales", null, new Object[0]);
            if (objInvokeInstanceMethod != null) {
                return (Locale) invokeInstanceMethod(objInvokeInstanceMethod, "get", new Class[]{Integer.TYPE}, 0);
            }
            logger.debug("getLocaleFromLocaleList: locales list is null");
            return null;
        } catch (Throwable th) {
            logger.debug("Failed to get locale from locale list via reflection: " + Utils.formatException(th));
            return null;
        }
    }

    public static String getCpuAbi() {
        try {
            return (String) readField("android.os.Build", "CPU_ABI");
        } catch (Throwable th) {
            logger.debug("Failed to get CPU ABI via reflection: " + Utils.formatException(th));
            return null;
        }
    }

    public static Locale getLocaleFromField(Configuration configuration) {
        try {
            return (Locale) readField("android.content.res.Configuration", "locale", configuration);
        } catch (Throwable th) {
            logger.debug("Failed to get locale from field via reflection: " + Utils.formatException(th));
            return null;
        }
    }

    public static String[] getSupportedAbis() {
        try {
            return (String[]) readField("android.os.Build", "SUPPORTED_ABIS");
        } catch (Throwable th) {
            logger.debug("Failed to get supported ABIs via reflection: " + Utils.formatException(th));
            return null;
        }
    }

    public static Class forName(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable th) {
            SingularLog singularLog = logger;
            StringBuilder sbR = h50.r("Failed to find class ", str, " via reflection: ");
            sbR.append(Utils.formatException(th));
            singularLog.debug(sbR.toString());
            return null;
        }
    }

    public static Object invokeInstanceMethod(Object obj, String str, Class[] clsArr, Object... objArr) throws Exception {
        return invokeMethod(obj.getClass(), str, obj, clsArr, objArr);
    }

    public static Object invokeMethod(Class cls, String str, Object obj, Class[] clsArr, Object... objArr) throws Exception {
        Method method = cls.getMethod(str, clsArr);
        if (method == null) {
            logger.debug("invokeMethod: method object is null for method: " + str);
            return null;
        }
        return method.invoke(obj, objArr);
    }

    public static Object invokeStaticMethod(String str, String str2, Class[] clsArr, Object... objArr) throws Exception {
        return invokeMethod(Class.forName(str), str2, null, clsArr, objArr);
    }

    public static Object readField(String str, String str2, Object obj) throws Exception {
        Class clsForName = forName(str);
        if (clsForName == null) {
            logger.debug("readField: class object is null for class: " + str);
            return null;
        }
        Field field = clsForName.getField(str2);
        if (field == null) {
            logger.debug("readField: field object is null for field: " + str2 + " in class: " + str);
            return null;
        }
        return field.get(obj);
    }

    public static Object readField(String str, String str2) throws Exception {
        return readField(str, str2, null);
    }
}
