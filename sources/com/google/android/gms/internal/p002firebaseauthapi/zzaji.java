package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.util.Strings;
import com.google.firebase.auth.zzc;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class zzaji implements zzafi<zzaji> {
    public boolean a;
    public String b;
    public String c;
    public long d;
    public String e;
    public String f;
    public String g;
    public boolean h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public ArrayList o;
    public String p;

    public final zzc a() {
        if (TextUtils.isEmpty(this.i) && TextUtils.isEmpty(this.j)) {
            return null;
        }
        return zzc.r0(this.f, this.j, this.i, this.m, this.k);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final zzafi zza(String str) throws zzacw {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.a = jSONObject.optBoolean("needConfirmation", false);
            jSONObject.optBoolean("needEmail", false);
            this.b = Strings.emptyToNull(jSONObject.optString("idToken", null));
            this.c = Strings.emptyToNull(jSONObject.optString("refreshToken", null));
            this.d = jSONObject.optLong("expiresIn", 0L);
            Strings.emptyToNull(jSONObject.optString("localId", null));
            this.e = Strings.emptyToNull(jSONObject.optString("email", null));
            Strings.emptyToNull(jSONObject.optString("displayName", null));
            Strings.emptyToNull(jSONObject.optString("photoUrl", null));
            this.f = Strings.emptyToNull(jSONObject.optString("providerId", null));
            this.g = Strings.emptyToNull(jSONObject.optString("rawUserInfo", null));
            this.h = jSONObject.optBoolean("isNewUser", false);
            this.i = jSONObject.optString("oauthAccessToken", null);
            this.j = jSONObject.optString("oauthIdToken", null);
            this.l = Strings.emptyToNull(jSONObject.optString("errorMessage", null));
            this.m = Strings.emptyToNull(jSONObject.optString("pendingToken", null));
            this.n = Strings.emptyToNull(jSONObject.optString("tenantId", null));
            this.o = zzaih.b(jSONObject.optJSONArray("mfaInfo"));
            this.p = Strings.emptyToNull(jSONObject.optString("mfaPendingCredential", null));
            this.k = Strings.emptyToNull(jSONObject.optString("oauthTokenSecret", null));
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzajs.a("zzaji", str, e);
        }
    }
}
