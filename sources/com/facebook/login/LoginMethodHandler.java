package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.facebook.FacebookRequestError;
import com.facebook.e0;
import com.facebook.internal.v0;
import com.facebook.k0;
import com.facebook.n0;
import com.facebook.o0;
import com.facebook.w0;
import com.mbridge.msdk.MBridgeConstans;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import defpackage.rl3;
import defpackage.s71;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/login/LoginMethodHandler;", "Landroid/os/Parcelable;", "com/facebook/appevents/h", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@VisibleForTesting
public abstract class LoginMethodHandler implements Parcelable {
    public HashMap a;
    public LoginClient b;

    public void b() {
    }

    /* JADX INFO: renamed from: e */
    public abstract String getC();

    public boolean h(int i, int i2, Intent intent) {
        return false;
    }

    public void j(JSONObject jSONObject) {
    }

    public abstract int l(LoginClient.Request request);

    public final void a(String str, String str2) {
        if (this.a == null) {
            this.a = new HashMap();
        }
        HashMap map = this.a;
        if (map != null) {
        }
    }

    public final LoginClient d() {
        LoginClient loginClient = this.b;
        if (loginClient != null) {
            return loginClient;
        }
        s71.D("loginClient");
        throw null;
    }

    public String f() {
        return "fb" + com.facebook.a0.b() + "://authorize/";
    }

    public final void i(Bundle bundle, LoginClient.Request request) {
        String string = bundle.getString(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE);
        if (v0.G(string)) {
            com.facebook.appevents.p.e("No code param found from the request");
            return;
        }
        if (string == null) {
            com.facebook.appevents.p.e("Failed to create code exchange request");
            return;
        }
        String strF = f();
        String str = request.t;
        if (str == null) {
            str = "";
        }
        strF.getClass();
        Bundle bundle2 = new Bundle();
        bundle2.putString(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, string);
        bundle2.putString("client_id", com.facebook.a0.b());
        bundle2.putString("redirect_uri", strF);
        bundle2.putString("code_verifier", str);
        String str2 = k0.j;
        k0 k0VarM = com.explorestack.protobuf.adcom.c.m(null, "oauth/access_token", null);
        k0VarM.h = o0.a;
        k0VarM.d = bundle2;
        n0 n0VarC = k0VarM.c();
        FacebookRequestError facebookRequestError = n0VarC.d;
        if (facebookRequestError != null) {
            throw new e0(facebookRequestError, facebookRequestError.a());
        }
        try {
            JSONObject jSONObject = n0VarC.b;
            String string2 = jSONObject != null ? jSONObject.getString("access_token") : null;
            if (jSONObject == null || v0.G(string2)) {
                throw new com.facebook.u("No access token found from result");
            }
            bundle.putString("access_token", string2);
            if (jSONObject.has("id_token")) {
                bundle.putString("id_token", jSONObject.getString("id_token"));
            }
        } catch (JSONException e) {
            throw new com.facebook.u("Fail to process code exchange response: " + e.getMessage());
        }
    }

    public LoginMethodHandler(Parcel parcel) {
        HashMap map;
        int i = parcel.readInt();
        if (i < 0) {
            map = null;
        } else {
            map = new HashMap();
            for (int i2 = 0; i2 < i; i2++) {
                map.put(parcel.readString(), parcel.readString());
            }
        }
        this.a = map != null ? new LinkedHashMap(map) : null;
    }

    public final String c(String str) {
        str.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", str);
            jSONObject.put("3_method", getC());
            j(jSONObject);
        } catch (JSONException e) {
            Log.w("LoginMethodHandler", "Error creating client state json: " + e.getMessage());
        }
        String string = jSONObject.toString();
        string.getClass();
        return string;
    }

    public final void g(String str) {
        String strB;
        LoginClient.Request request = d().g;
        if (request == null || (strB = request.d) == null) {
            strB = com.facebook.a0.b();
        }
        com.facebook.appevents.o oVar = new com.facebook.appevents.o(d().e(), strB);
        Bundle bundleG = rl3.g("fb_web_login_e2e", str);
        bundleG.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundleG.putString(MBridgeConstans.APP_ID, strB);
        com.facebook.a0 a0Var = com.facebook.a0.a;
        if (w0.c()) {
            oVar.h(bundleG, "fb_dialogs_web_login_dialog_complete");
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        HashMap map = this.a;
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }
}
