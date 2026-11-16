package com.adsurge.adn.Q;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class k extends j {
    public JSONObject a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public String i;

    @Override // com.adsurge.adn.Q.j
    public int a() {
        return this.h;
    }

    @Override // com.adsurge.adn.Q.j
    public String b() {
        return this.i;
    }

    @Override // com.adsurge.adn.Q.j
    public String c() {
        return this.b;
    }

    public k(JSONObject jSONObject) {
        this.a = jSONObject;
        if (jSONObject == null) {
            return;
        }
        this.b = jSONObject.optString("video_url", "");
        this.c = jSONObject.optInt("video_encode_type", 0);
        this.d = jSONObject.optInt("video_width", 0);
        this.e = jSONObject.optInt("video_height", 0);
        this.f = jSONObject.optInt("video_duration", 0);
        this.g = jSONObject.optInt("video_file_size", 0);
        this.h = jSONObject.optInt("video_bitrate", 0);
        this.i = jSONObject.optString("video_format_id", "");
    }
}
