package com.google.android.gms.internal.ads;

import android.view.View;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzfyi implements zzfyg {
    public final zzfyj a;

    public final JSONObject a(View view) {
        JSONObject jSONObjectA = zzfyt.a(0, 0, 0, 0);
        int i = zzfyq.a() != zzfwp.CTV ? 2 : zzfyw.a;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        try {
            jSONObjectA.put("noOutputDevice", i2 == 0);
            return jSONObjectA;
        } catch (JSONException e) {
            zzfyu.a("Error with setting output device status", e);
            return jSONObjectA;
        }
    }

    public zzfyi(zzfyj zzfyjVar) {
        this.a = zzfyjVar;
    }
}
