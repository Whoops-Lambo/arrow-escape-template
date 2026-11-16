package com.google.android.gms.internal.p002firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class zzaiw implements zzafi<zzaiw> {
    public String a() {
        return null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public zzaiw zza(String str) throws zzacw {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optJSONObject("phoneSessionInfo") != null) {
                zzaja zzajaVar = new zzaja();
                zzajaVar.zza(str);
                return zzajaVar;
            }
            if (jSONObject.optJSONObject("totpSessionInfo") == null) {
                throw new IllegalArgumentException("Missing phoneSessionInfo or totpSessionInfo.");
            }
            zzajc zzajcVar = new zzajc();
            zzajcVar.zza(str);
            return zzajcVar;
        } catch (NullPointerException e) {
            e = e;
            throw zzajs.a("zzaiw", str, e);
        } catch (JSONException e2) {
            e = e2;
            throw zzajs.a("zzaiw", str, e);
        }
    }
}
