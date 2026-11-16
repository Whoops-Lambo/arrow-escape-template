package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ﺓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C1261 extends AbstractC1098 {
    static {
        StringFog.decrypt("3DK4PfjBbErd\n", "r1fWWb2zHiU=\n");
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m900(C1199 c1199, ArrayList arrayList) {
        boolean zBooleanValue;
        JSONObject jSONObject;
        boolean zBooleanValue2 = false;
        String str = (String) AbstractC1098.m806(arrayList, 0, String.class);
        String str2 = c1199.m877() + StringFog.decrypt("aQ==\n", "Uw64NM7yhPk=\n") + Integer.toHexString(str.hashCode());
        Throwable th = (Throwable) AbstractC1098.m806(arrayList, 1, Throwable.class);
        try {
            if (arrayList.size() <= 2) {
                AbstractC1290.m904(c1199.m877(), str, str2, th, null, null, true, false, false);
                return;
            }
            if (AbstractC1098.m805(arrayList, 2, JSONObject.class)) {
                JSONObject jSONObject2 = (JSONObject) AbstractC1098.m806(arrayList, 2, JSONObject.class);
                if (arrayList.size() > 3 && AbstractC1098.m805(arrayList, 3, Boolean.class)) {
                    zBooleanValue2 = ((Boolean) AbstractC1098.m806(arrayList, 3, Boolean.class)).booleanValue();
                }
                jSONObject = jSONObject2;
                zBooleanValue = zBooleanValue2;
            } else {
                zBooleanValue = AbstractC1098.m805(arrayList, 2, Boolean.class) ? ((Boolean) AbstractC1098.m806(arrayList, 2, Boolean.class)).booleanValue() : false;
                jSONObject = null;
            }
            AbstractC1290.m904(c1199.m877(), str, str2, th, null, jSONObject, true, false, zBooleanValue);
        } catch (Throwable unused) {
        }
    }
}
