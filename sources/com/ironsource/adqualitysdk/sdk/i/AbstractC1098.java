package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ῑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC1098 {
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static boolean m805(List list, int i, Class cls) {
        Object obj = list.get(i);
        if (obj != null && !cls.isAssignableFrom(obj.getClass())) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Object m806(List list, int i, Class cls) {
        Object obj = list.get(i);
        if (obj != null && !cls.isAssignableFrom(obj.getClass())) {
            throw new ClassCastException(StringFog.decrypt("Ch/3F6eoE4koDe1Z\n", "SX6ZecjcM+o=\n") + obj.getClass().getName() + StringFog.decrypt("Tz/ceA==\n", "b0uzWOSvC3c=\n") + cls.getName());
        }
        return obj;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static List m807(List list, int i) {
        return (list.size() <= i || !m805(list, i, List.class)) ? new ArrayList() : (List) m806(list, i, List.class);
    }
}
