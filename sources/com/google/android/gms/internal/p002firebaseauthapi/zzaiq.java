package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaiq implements zzaff {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public final zzajf g = new zzajf();
    public final zzajf h = new zzajf();
    public String i;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("returnSecureToken", true);
        zzajf zzajfVar = this.h;
        if (!zzajfVar.a.isEmpty()) {
            List list = zzajfVar.a;
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < list.size(); i++) {
                jSONArray.put(list.get(i));
            }
            jSONObject.put("deleteProvider", jSONArray);
        }
        List list2 = this.g.a;
        int size = list2.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < list2.size(); i2++) {
            String str = (String) list2.get(i2);
            str.getClass();
            int i3 = 2;
            switch (str) {
                case "DISPLAY_NAME":
                    break;
                case "EMAIL":
                    i3 = 1;
                    break;
                case "PHOTO_URL":
                    i3 = 4;
                    break;
                case "PASSWORD":
                    i3 = 5;
                    break;
                default:
                    i3 = 0;
                    break;
            }
            iArr[i2] = i3;
        }
        if (size > 0) {
            JSONArray jSONArray2 = new JSONArray();
            for (int i4 = 0; i4 < size; i4++) {
                jSONArray2.put(iArr[i4]);
            }
            jSONObject.put("deleteAttribute", jSONArray2);
        }
        String str2 = this.a;
        if (str2 != null) {
            jSONObject.put("idToken", str2);
        }
        String str3 = this.c;
        if (str3 != null) {
            jSONObject.put("email", str3);
        }
        String str4 = this.d;
        if (str4 != null) {
            jSONObject.put("password", str4);
        }
        String str5 = this.b;
        if (str5 != null) {
            jSONObject.put("displayName", str5);
        }
        String str6 = this.f;
        if (str6 != null) {
            jSONObject.put("photoUrl", str6);
        }
        String str7 = this.e;
        if (str7 != null) {
            jSONObject.put("oobCode", str7);
        }
        String str8 = this.i;
        if (str8 != null) {
            jSONObject.put("tenantId", str8);
        }
        return jSONObject.toString();
    }
}
