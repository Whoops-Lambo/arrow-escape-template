package com.adsurge.adn.oversea_ad;

import androidx.core.app.NotificationCompat;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.adsurge.adn.oversea_ad.public, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class Cpublic {
    public int a = 3;
    public Creturn[] b = null;
    public int c = -1;
    public String d = null;
    public long e = -1;

    public final String a(int i) {
        Creturn[] creturnArr;
        int i2 = this.a;
        if (i2 == 3 || i2 == 2 || (creturnArr = this.b) == null || creturnArr.length == 0) {
            try {
                JSONObject jSONObject = new JSONObject();
                String str = this.d;
                if (str == null) {
                    str = "unknown error, result=" + this.a;
                }
                jSONObject.put(NotificationCompat.CATEGORY_ERROR, str);
                return jSONObject.toString();
            } catch (Throwable unused) {
                return "{\"err\":\"serialize_failed\"}";
            }
        }
        try {
            int length = creturnArr.length;
            int iMax = i <= 0 ? length : Math.max(1, length - i);
            JSONArray jSONArray = new JSONArray();
            for (int i3 = 0; i3 < length; i3++) {
                Creturn creturn = this.b[i3];
                if (creturn == null) {
                    jSONArray.put("");
                } else if (i3 >= iMax) {
                    String[] strArrA = Cstatic.a(creturn);
                    jSONArray.put("1," + strArrA[0] + "," + strArrA[1]);
                } else {
                    String str2 = creturn.a;
                    jSONArray.put("0," + (str2 != null ? str2 : ""));
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("certs", jSONArray);
            jSONObject2.put("source", this.c);
            return jSONObject2.toString();
        } catch (Throwable th) {
            try {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(NotificationCompat.CATEGORY_ERROR, "serialize_ex:" + th.getMessage());
                return jSONObject3.toString();
            } catch (Throwable unused2) {
                return "{\"err\":\"serialize_failed\"}";
            }
        }
    }
}
