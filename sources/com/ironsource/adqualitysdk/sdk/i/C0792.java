package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᐧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C0792 extends AbstractC1098 {
    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static int m600(ArrayList arrayList) {
        return AbstractC0793.m609((String) AbstractC1098.m806(arrayList, 0, String.class), (String) AbstractC1098.m806(arrayList, 1, String.class));
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static boolean m601(ArrayList arrayList) {
        return AbstractC0793.m608((String) AbstractC1098.m806(arrayList, 0, String.class));
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static String m602(ArrayList arrayList) {
        String str = (String) AbstractC1098.m806(arrayList, 0, String.class);
        boolean zBooleanValue = arrayList.size() > 2 ? ((Boolean) AbstractC1098.m806(arrayList, 2, Boolean.class)).booleanValue() : true;
        if (arrayList.get(1) instanceof String) {
            return AbstractC0793.m611(str, (String) AbstractC1098.m806(arrayList, 1, String.class), zBooleanValue);
        }
        JSONArray jSONArray = new JSONArray((Collection) AbstractC1098.m806(arrayList, 1, List.class));
        for (int i = 0; i < jSONArray.length(); i++) {
            String strM611 = AbstractC0793.m611(str, jSONArray.optString(i), zBooleanValue);
            if (strM611 != null) {
                return strM611;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static ArrayList m604(ArrayList arrayList) {
        String str = (String) AbstractC1098.m806(arrayList, 0, String.class);
        if (arrayList.get(1) instanceof String) {
            return AbstractC0793.m607(str, (String) AbstractC1098.m806(arrayList, 1, String.class), false);
        }
        JSONArray jSONArray = new JSONArray((Collection) AbstractC1098.m806(arrayList, 1, List.class));
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList2.addAll(AbstractC0793.m607(str, jSONArray.optString(i), false));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static String m605(ArrayList arrayList) {
        return AbstractC0793.m610((String) AbstractC1098.m806(arrayList, 0, String.class));
    }

    static {
        StringFog.decrypt("YsnhjcY58FV7weOf3TM=\n", "FKyT/q9WnhY=\n");
        StringFog.decrypt("yTTPE+k7/YzcONU19g==\n", "rlG7UoVXrvg=\n");
        StringFog.decrypt("EMvQaudF3tUQy9xm6l3v2BLd\n", "d66kK4spjLA=\n");
        StringFog.decrypt("TvO5+oGZI+R786rZkKYx5Er+\n", "KZbNvOjrUJA=\n");
        StringFog.decrypt("jtldy1ykOTmK2mj0RqcfMrTeaPhbsw==\n", "56oakTXUelY=\n");
        StringFog.decrypt("pyyoFI1Jn1ywOowhiUm+TbEgpRw=\n", "w0nLe+A57Tk=\n");
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static ArrayList m603(ArrayList arrayList) {
        Object objM806 = AbstractC1098.m806(arrayList, 0, Object.class);
        List list = (List) AbstractC1098.m806(arrayList, 1, List.class);
        int iIntValue = ((Integer) AbstractC1098.m806(arrayList, 2, Integer.class)).intValue();
        C0679 c0679 = C0891.m648().f2390;
        c0679.getClass();
        C0727 c0727 = new C0727();
        C0758 c0758 = new C0758();
        C0783 c0783 = c0758.f2006;
        c0783.f2061 = -1;
        c0783.f2060 = -1;
        c0783.f2059 = -1;
        c0783.f2063 = -1;
        c0758.f2005 = c0727;
        c0758.f2004 = null;
        c0783.f2067 = list;
        c0783.f2066 = iIntValue;
        c0783.f2069 = C0727.class;
        c0783.f2068 = null;
        C0750 c0750 = new C0750(c0758);
        c0750.f1987 = true;
        c0679.m574(objM806, c0750, 0, (C0860) null);
        return new ArrayList(c0750.f1986);
    }
}
