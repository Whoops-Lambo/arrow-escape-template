package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.ActionCodeSettings;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzahv implements zzaff {
    public String a;
    public String b;
    public String c;
    public String d;
    public ActionCodeSettings e;
    public String f;
    public String g;

    public static String a(int i) {
        if (i == 1) {
            return "PASSWORD_RESET";
        }
        if (i == 4) {
            return "VERIFY_EMAIL";
        }
        if (i != 6) {
            return i != 7 ? "REQUEST_TYPE_UNSET_ENUM_VALUE" : "VERIFY_AND_CHANGE_EMAIL";
        }
        return "EMAIL_SIGNIN";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.a;
        str.getClass();
        int i = 1;
        switch (str) {
            case "PASSWORD_RESET":
                break;
            case "VERIFY_EMAIL":
                i = 4;
                break;
            case "VERIFY_AND_CHANGE_EMAIL":
                i = 7;
                break;
            case "EMAIL_SIGNIN":
                i = 6;
                break;
            default:
                i = 0;
                break;
        }
        jSONObject.put("requestType", i);
        String str2 = this.b;
        if (str2 != null) {
            jSONObject.put("email", str2);
        }
        String str3 = this.c;
        if (str3 != null) {
            jSONObject.put("newEmail", str3);
        }
        String str4 = this.d;
        if (str4 != null) {
            jSONObject.put("idToken", str4);
        }
        ActionCodeSettings actionCodeSettings = this.e;
        if (actionCodeSettings != null) {
            jSONObject.put("androidInstallApp", actionCodeSettings.e);
            jSONObject.put("canHandleCodeInApp", this.e.g);
            String str5 = this.e.a;
            if (str5 != null) {
                jSONObject.put("continueUrl", str5);
            }
            String str6 = this.e.b;
            if (str6 != null) {
                jSONObject.put("iosBundleId", str6);
            }
            String str7 = this.e.c;
            if (str7 != null) {
                jSONObject.put("iosAppStoreId", str7);
            }
            String str8 = this.e.d;
            if (str8 != null) {
                jSONObject.put("androidPackageName", str8);
            }
            String str9 = this.e.f;
            if (str9 != null) {
                jSONObject.put("androidMinimumVersion", str9);
            }
            String str10 = this.e.j;
            if (str10 != null) {
                jSONObject.put("dynamicLinkDomain", str10);
            }
            String str11 = this.e.k;
            if (str11 != null) {
                jSONObject.put("linkDomain", str11);
            }
        }
        String str12 = this.f;
        if (str12 != null) {
            jSONObject.put("tenantId", str12);
        }
        String str13 = this.g;
        if (str13 != null) {
            zzajs.c("captchaResp", str13, jSONObject);
        } else {
            jSONObject.put("clientType", "CLIENT_TYPE_ANDROID");
        }
        return jSONObject.toString();
    }

    public zzahv(int i) {
        this.a = a(i);
    }
}
