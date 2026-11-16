package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Log;
import com.ironsource.C4664b4;
import defpackage.n30;
import defpackage.pv1;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzajs {
    public static ArrayList b(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null && jSONArray.length() != 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
        }
        return arrayList;
    }

    public static zzacw a(String str, String str2, Exception exc) {
        String message = exc.getMessage();
        StringBuilder sbR = pv1.r("Failed to parse ", str, " for string [", str2, "] with exception: ");
        sbR.append(message);
        Log.e(str, sbR.toString());
        return new zzacw(n30.n("Failed to parse ", str, " for string [", str2, C4664b4.j.e), exc);
    }

    public static void c(String str, String str2, JSONObject jSONObject) throws JSONException {
        jSONObject.put(str, str2);
        jSONObject.put("recaptchaVersion", "RECAPTCHA_ENTERPRISE");
        jSONObject.put("clientType", "CLIENT_TYPE_ANDROID");
    }
}
