package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ऽ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class C0703 extends AbstractC1098 {
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static Field m580(ArrayList arrayList) {
        if (!(arrayList.get(0) instanceof Class)) {
            Object objM806 = AbstractC1098.m806(arrayList, 0, Object.class);
            return C0891.m648().f2391.m596(objM806.getClass(), (Class) AbstractC1098.m806(arrayList, 1, Class.class));
        }
        Class cls = (Class) AbstractC1098.m806(arrayList, 0, Class.class);
        if (arrayList.get(1) instanceof Class) {
            return C0891.m648().f2391.m596(cls, (Class) AbstractC1098.m806(arrayList, 1, Class.class));
        }
        return C0891.m648().f2391.m595(cls, (C0761) AbstractC1098.m806(arrayList, 1, C0761.class));
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static List m581(ArrayList arrayList) {
        if (!(arrayList.get(0) instanceof Class)) {
            Object objM806 = AbstractC1098.m806(arrayList, 0, Object.class);
            boolean zBooleanValue = arrayList.size() > 1 ? ((Boolean) AbstractC1098.m806(arrayList, 1, Boolean.class)).booleanValue() : false;
            C0744 c0744 = C0891.m648().f2391;
            return Arrays.asList(C0744.m594(objM806.getClass(), zBooleanValue, -1, null));
        }
        if (arrayList.size() <= 1) {
            return new ArrayList();
        }
        Class cls = (Class) AbstractC1098.m806(arrayList, 0, Class.class);
        C0761 c0761 = (C0761) AbstractC1098.m806(arrayList, 1, C0761.class);
        C0744 c0745 = C0891.m648().f2391;
        ArrayList arrayList2 = new ArrayList();
        c0745.m597(cls, c0761, arrayList2);
        return arrayList2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Field m583(ArrayList arrayList) {
        return C0891.m648().f2391.m595((Class) AbstractC1098.m806(arrayList, 0, Class.class), (C0761) AbstractC1098.m806(arrayList, 1, C0761.class));
    }

    static {
        StringFog.decrypt("8CB48O6rokU=\n", "l0UMtofOziE=\n");
        StringFog.decrypt("97rgfQ6iOozj\n", "kN+UO2fHVug=\n");
        StringFog.decrypt("1PiX4N+WXC719IbK0qtJDsrthg==\n", "s53jprbkL1o=\n");
        StringFog.decrypt("IYIn9MG/wPYAjjbezJra9i63IdfOpMs=\n", "RudTsqjNs4I=\n");
        StringFog.decrypt("hVnhPRFLJtSDR+AYAEgiyI9H4DkX\n", "5iuEXGUuYL0=\n");
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static Field m579(ArrayList arrayList) {
        Field[] fields;
        Class cls = (Class) AbstractC1098.m806(arrayList, 0, Class.class);
        String str = (String) AbstractC1098.m806(arrayList, 1, String.class);
        C0744 c0744 = C0891.m648().f2391;
        synchronized (C0744.class) {
            try {
                if (c0744.f1937 == null) {
                    c0744.f1937 = new ArrayList();
                }
                c0744.f1937.clear();
                ArrayList arrayList2 = c0744.f1937;
                try {
                    fields = cls.getDeclaredFields();
                } catch (Error unused) {
                    fields = cls.getFields();
                }
                for (Field field : fields) {
                    if (field.getType().getName().toLowerCase().startsWith(str.toLowerCase())) {
                        field.setAccessible(true);
                        arrayList2.add(field);
                    }
                }
                if (c0744.f1937.isEmpty()) {
                    return null;
                }
                return (Field) c0744.f1937.get(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static C0798 m582() {
        C0744 c0744 = C0891.m648().f2391;
        return new C0798();
    }
}
