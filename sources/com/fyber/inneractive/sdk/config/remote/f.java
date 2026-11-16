package com.fyber.inneractive.sdk.config.remote;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.enums.Track;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public Set a = null;

    public static f a(JSONObject jSONObject) {
        Track trackFromValue;
        f fVar = null;
        if (jSONObject == null) {
            return null;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("track");
        if (jSONArrayOptJSONArray != null) {
            fVar = new f();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                String strOptString = jSONArrayOptJSONArray.optString(i);
                if (!TextUtils.isEmpty(strOptString) && (trackFromValue = Track.fromValue(strOptString)) != null) {
                    linkedHashSet.add(trackFromValue);
                }
            }
            fVar.a = linkedHashSet;
        }
        return fVar;
    }
}
