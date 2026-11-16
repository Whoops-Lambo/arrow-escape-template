package com.facebook.gamingservices;

import android.util.Log;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class t {
    public static void a(String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            map.put("game_request_id", jSONObject.optString("game_request_id"));
            map.put(HandleInvocationsFromAdViewer.KEY_PAYLOAD, jSONObject.optString(HandleInvocationsFromAdViewer.KEY_PAYLOAD));
            map.put("tournament_id", jSONObject.optString("tournament_id"));
        } catch (JSONException e) {
            Log.e("t", e.toString(), e);
        }
    }
}
