package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Log;
import com.ironsource.C4664b4;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import defpackage.pv1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class zzagy implements zzafi<zzagy> {
    public String a;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafi
    public final zzafi zza(String str) throws zzacw {
        try {
            JSONObject jSONObject = new JSONObject(new JSONObject(str).getString("error"));
            jSONObject.getInt(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE);
            this.a = jSONObject.getString("message");
            return this;
        } catch (NullPointerException | JSONException e) {
            Log.e("com.google.android.gms.internal.firebase-auth-api.zzagy", "Failed to parse error for string [" + str + "] with exception: " + e.getMessage());
            throw new zzacw(pv1.n("Failed to parse error for string [", str, C4664b4.j.e), e);
        }
    }
}
