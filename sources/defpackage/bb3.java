package defpackage;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.fpz.rz;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class bb3 {
    public int a;
    public int b;
    public long c;
    public double d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public int k;
    public int l;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public int p = 0;
    public int q = 307200;
    public int r = 1;

    public final String a() {
        if (TextUtils.isEmpty(this.j)) {
            this.j = db3.a(this.g);
        }
        return this.j;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cover_height", this.a);
            jSONObject.put("cover_url", this.f);
            jSONObject.put("cover_width", this.b);
            jSONObject.put(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, this.h);
            jSONObject.put("file_hash", a());
            jSONObject.put("resolution", this.e);
            jSONObject.put("size", this.c);
            jSONObject.put("video_duration", this.d);
            jSONObject.put("video_url", this.g);
            jSONObject.put("playable_download_url", this.i);
            jSONObject.put("if_playable_loading_show", this.m);
            jSONObject.put("remove_loading_page_type", this.n);
            jSONObject.put("fallback_endcard_judge", this.k);
            jSONObject.put("video_preload_size", c());
            jSONObject.put("reward_video_cached_type", this.o);
            jSONObject.put("execute_cached_type", this.p);
            jSONObject.put("endcard_render", this.l);
            jSONObject.put("replay_time", this.r);
            jSONObject.put("play_speed_ratio", -1.0d);
            return jSONObject;
        } catch (Exception e) {
            rz.kgy(e, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOUE7Unyo9O0lE=", "becpkAyVZ8GP", "T+EHhgyyRsWK", 256);
            return jSONObject;
        }
    }

    public final int c() {
        if (this.q < 0) {
            this.q = 307200;
        }
        long j = this.q;
        long j2 = this.c;
        if (j > j2) {
            this.q = (int) j2;
        }
        return this.q;
    }
}
