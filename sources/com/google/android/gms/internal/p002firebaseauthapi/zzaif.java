package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Log;
import com.safedk.android.analytics.brandsafety.m;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaif {
    public Long a;
    public Long b;

    public static zzaif a(String str) throws UnsupportedEncodingException {
        try {
            zzaif zzaifVar = new zzaif();
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.optString("iss");
            jSONObject.optString("aud");
            jSONObject.optString("sub");
            zzaifVar.a = Long.valueOf(jSONObject.optLong("iat"));
            zzaifVar.b = Long.valueOf(jSONObject.optLong(m.y));
            jSONObject.optBoolean("is_anonymous");
            return zzaifVar;
        } catch (JSONException e) {
            if (Log.isLoggable("JwtToken", 3)) {
                Log.d("JwtToken", "Failed to read JwtToken from JSONObject. ".concat(String.valueOf(e)));
            }
            throw new UnsupportedEncodingException("Failed to read JwtToken from JSONObject. ".concat(String.valueOf(e)));
        }
    }
}
