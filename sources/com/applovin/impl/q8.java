package com.applovin.impl;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class q8 {
    private final String a;
    private final String b;
    private final List c;

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public List c() {
        return this.c;
    }

    public q8(JSONObject jSONObject) {
        this.a = JsonUtils.getString(jSONObject, "user_type", TtmlNode.COMBINE_ALL);
        this.b = JsonUtils.getString(jSONObject, "device_type", TtmlNode.COMBINE_ALL);
        this.c = JsonUtils.getStringList(jSONObject, "segments", null);
    }
}
