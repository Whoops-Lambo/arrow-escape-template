package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.util.zzbp;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzflv {
    public final String a;
    public final String b;
    public final JSONObject c;
    public final JSONObject d;

    public zzflv(JsonReader jsonReader) throws JSONException, IOException {
        JSONObject jSONObjectZzd = zzbp.zzd(jsonReader);
        this.d = jSONObjectZzd;
        this.a = jSONObjectZzd.optString(CampaignEx.JSON_KEY_AD_HTML, null);
        this.b = jSONObjectZzd.optString("ad_base_url", null);
        this.c = jSONObjectZzd.optJSONObject("ad_json");
    }
}
