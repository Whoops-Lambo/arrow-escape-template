package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.Ῐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class C1103 extends AbstractC1098 {
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static ArrayList m816(ArrayList arrayList) {
        C1106 c1106 = (C1106) AbstractC1098.m806(arrayList, 1, C1106.class);
        return arrayList.get(0) instanceof Class ? AbstractC1105.m819((Class) AbstractC1098.m806(arrayList, 0, Class.class), c1106) : AbstractC1105.m819(AbstractC1098.m806(arrayList, 0, Object.class).getClass(), c1106);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Method m818(ArrayList arrayList) {
        C1106 c1106 = (C1106) AbstractC1098.m806(arrayList, 1, C1106.class);
        if (arrayList.get(0) instanceof Class) {
            ArrayList arrayListM819 = AbstractC1105.m819((Class) AbstractC1098.m806(arrayList, 0, Class.class), c1106);
            if (arrayListM819.isEmpty()) {
                return null;
            }
            return (Method) arrayListM819.get(0);
        }
        ArrayList arrayListM8110 = AbstractC1105.m819(AbstractC1098.m806(arrayList, 0, Object.class).getClass(), c1106);
        if (arrayListM8110.isEmpty()) {
            return null;
        }
        return (Method) arrayListM8110.get(0);
    }

    static {
        StringFog.decrypt("LGdP4OZbMNYv\n", "SwI7rYMvWLk=\n");
        StringFog.decrypt("BOZDfrC3Rc0H8A==\n", "Y4M3M9XDLaI=\n");
        StringFog.decrypt("ICIZ+h1TW483OBP/LVNwqDY5EP8MRA==\n", "Q1B8m2k2Fuo=\n");
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static C1119 m817() {
        return new C1119();
    }
}
