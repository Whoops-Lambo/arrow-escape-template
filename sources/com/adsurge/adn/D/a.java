package com.adsurge.adn.D;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a {
    public static c a(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Object objOpt = jSONObject.opt("version");
            Object objOpt2 = jSONObject.opt("scriptContent");
            Object objOpt3 = jSONObject.opt(InAppPurchaseMetaData.KEY_SIGNATURE);
            if (!(objOpt instanceof String) || !(objOpt2 instanceof String) || !(objOpt3 instanceof String)) {
                return null;
            }
            String str2 = (String) objOpt;
            String str3 = (String) objOpt2;
            String str4 = (String) objOpt3;
            if (str2.isEmpty() || str3.isEmpty() || str4.isEmpty() || !b.a(str3, str2, str4)) {
                return null;
            }
            return new c(str2, str3, str4);
        } catch (Exception unused) {
            return null;
        }
    }
}
