package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import com.google.firebase.auth.zzao;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class zzahq implements zzafi<zzahq> {
    public zzahs a;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final zzafi zza(String str) throws zzacw {
        zzahs zzahsVar;
        zzaht zzahtVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("users")) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("users");
                if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                    zzahsVar = new zzahs(new ArrayList());
                } else {
                    ArrayList arrayList = new ArrayList(jSONArrayOptJSONArray.length());
                    boolean z = false;
                    int i = 0;
                    while (i < jSONArrayOptJSONArray.length()) {
                        JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                        if (jSONObject2 == null) {
                            zzahtVar = new zzaht();
                        } else {
                            String strEmptyToNull = Strings.emptyToNull(jSONObject2.optString("localId", null));
                            String strEmptyToNull2 = Strings.emptyToNull(jSONObject2.optString("email", null));
                            boolean zOptBoolean = jSONObject2.optBoolean("emailVerified", z);
                            String strEmptyToNull3 = Strings.emptyToNull(jSONObject2.optString("displayName", null));
                            String strEmptyToNull4 = Strings.emptyToNull(jSONObject2.optString("photoUrl", null));
                            zzaij zzaijVarA = zzaij.a(jSONObject2.optJSONArray("providerUserInfo"));
                            Strings.emptyToNull(jSONObject2.optString("rawPassword", null));
                            zzahtVar = new zzaht(strEmptyToNull, strEmptyToNull2, zOptBoolean, strEmptyToNull3, strEmptyToNull4, zzaijVarA, Strings.emptyToNull(jSONObject2.optString("phoneNumber", null)), jSONObject2.optLong("createdAt", 0L), jSONObject2.optLong("lastLoginAt", 0L), zzaih.b(jSONObject2.optJSONArray("mfaInfo")), zzao.d(jSONObject2.optJSONArray("passkeyInfo")));
                        }
                        arrayList.add(zzahtVar);
                        i++;
                        jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                        z = false;
                    }
                    zzahsVar = new zzahs(arrayList);
                }
            } else {
                zzahsVar = new zzahs();
            }
            this.a = zzahsVar;
            return this;
        } catch (NullPointerException e) {
            e = e;
            throw zzajs.a("zzahq", str, e);
        } catch (JSONException e2) {
            e = e2;
            throw zzajs.a("zzahq", str, e);
        }
    }
}
