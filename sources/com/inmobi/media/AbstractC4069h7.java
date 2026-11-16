package com.inmobi.media;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.h7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC4069h7 {
    public static final JSONObject a(C4041g7 c4041g7) throws JSONException {
        c4041g7.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("x", Float.valueOf(AbstractC4038g4.a(c4041g7.a)));
        jSONObject.put("y", Float.valueOf(AbstractC4038g4.a(c4041g7.b)));
        jSONObject.put("width", c4041g7.c);
        jSONObject.put("height", c4041g7.d);
        return jSONObject;
    }
}
