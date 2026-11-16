package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Strings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.sq3;
import defpackage.xp3;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class zzaib implements zzafi<zzaib> {
    public String a;
    public i b;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final zzafi zza(String str) throws zzacw {
        i iVarR;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.a = Strings.emptyToNull(jSONObject.optString("recaptchaKey"));
            if (jSONObject.has("recaptchaEnforcementState")) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("recaptchaEnforcementState");
                if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                    sq3 sq3Var = zzah.b;
                    iVarR = i.e;
                } else {
                    sq3 sq3Var2 = zzah.b;
                    zzak zzakVar = new zzak();
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                        zzakVar.b(jSONObject2 == null ? new xp3(null, null) : new xp3(Strings.emptyToNull(jSONObject2.optString(IronSourceConstants.EVENTS_PROVIDER)), Strings.emptyToNull(jSONObject2.optString("enforcementState"))));
                    }
                    zzakVar.c = true;
                    iVarR = zzah.r(zzakVar.b, zzakVar.a);
                }
                this.b = iVarR;
            }
            return this;
        } catch (NullPointerException e) {
            e = e;
            throw zzajs.a("zzaib", str, e);
        } catch (JSONException e2) {
            e = e2;
            throw zzajs.a("zzaib", str, e);
        }
    }

    public final String a(String str) {
        Preconditions.checkNotEmpty(str);
        i iVar = this.b;
        if (iVar != null && !iVar.isEmpty()) {
            i iVar2 = this.b;
            int i = iVar2.d;
            int i2 = 0;
            while (i2 < i) {
                Object obj = iVar2.get(i2);
                i2++;
                zzaii zzaiiVar = (zzaii) obj;
                String strA = zzaiiVar.a();
                String strB = zzaiiVar.b();
                if (strA != null && strB != null && strB.equals(str)) {
                    return zzaiiVar.a();
                }
            }
            return null;
        }
        return null;
    }
}
