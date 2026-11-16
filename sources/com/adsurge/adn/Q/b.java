package com.adsurge.adn.Q;

import com.adsurge.adn.ads.AdSurgeAdFormat;
import com.ironsource.C5074y2;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class b extends a {
    public String A;
    public String[] B;
    public String C;
    public String D;
    public String E;
    public double F;
    public int G;
    public String H;
    public int I;
    public String J;
    public String K;
    public g L;
    public int M;
    public String N;
    public String O;
    public String P;
    public String Q;
    public int R;
    public int S;
    public j[] T;
    public String U;
    public int V;
    public String W;
    public String X;
    public int Y;
    public final AdSurgeAdFormat Z;
    public final String a0;
    public JSONObject b;
    public final String b0;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public int h;
    public int i;
    public String j;
    public int k;
    public int l;
    public String m;
    public String n;
    public int o;
    public int p;
    public int q;
    public int r;
    public long s;
    public String t;
    public String u;
    public int v;
    public int w;
    public int x;
    public String y;
    public String[] z;

    public String A() {
        return this.W;
    }

    public int B() {
        return this.V;
    }

    public int C() {
        return this.Y;
    }

    public String D() {
        return this.t;
    }

    public String[] E() {
        return this.B;
    }

    public String F() {
        return this.A;
    }

    public String G() {
        return this.Q;
    }

    public String H() {
        return this.f;
    }

    public String[] I() {
        return this.z;
    }

    public String J() {
        return this.y;
    }

    public String K() {
        return this.e;
    }

    public int L() {
        return this.l;
    }

    public String M() {
        return this.j;
    }

    public int N() {
        return this.k;
    }

    public int O() {
        return this.i;
    }

    public String P() {
        return this.g;
    }

    public int Q() {
        return this.h;
    }

    public JSONObject R() {
        return this.b;
    }

    public String S() {
        return this.U;
    }

    public String T() {
        return this.D;
    }

    public String U() {
        return this.E;
    }

    public String V() {
        return this.J;
    }

    public String W() {
        return this.C;
    }

    public String X() {
        return this.P;
    }

    public int Y() {
        return this.M;
    }

    public String Z() {
        return this.O;
    }

    public int a() {
        return this.r;
    }

    public g a0() {
        return this.L;
    }

    public void b(String str) {
        this.y = str;
    }

    public double b0() {
        return this.F;
    }

    public int c0() {
        return this.q;
    }

    public String d() {
        return this.d;
    }

    public j[] d0() {
        return this.T;
    }

    public String e0() {
        return this.n;
    }

    public int f0() {
        return this.p;
    }

    @Override // com.adsurge.adn.Q.a
    public String h() {
        return this.K;
    }

    @Override // com.adsurge.adn.Q.a
    public String j() {
        return this.c;
    }

    @Override // com.adsurge.adn.Q.a
    public int n() {
        return this.G;
    }

    @Override // com.adsurge.adn.Q.a
    public int o() {
        return this.R;
    }

    @Override // com.adsurge.adn.Q.a
    public int p() {
        return this.S;
    }

    @Override // com.adsurge.adn.Q.a
    public int q() {
        return this.I;
    }

    @Override // com.adsurge.adn.Q.a
    public String r() {
        return this.N;
    }

    @Override // com.adsurge.adn.Q.a
    public int s() {
        return this.v;
    }

    @Override // com.adsurge.adn.Q.a
    public String u() {
        return this.H;
    }

    public AdSurgeAdFormat x() {
        return this.Z;
    }

    public String y() {
        return this.b0;
    }

    public String z() {
        return this.X;
    }

    public b(JSONObject jSONObject, AdSurgeAdFormat adSurgeAdFormat, String str, String str2) {
        this.b = jSONObject;
        this.Z = adSurgeAdFormat;
        this.a0 = str;
        this.b0 = str2;
        if (jSONObject == null) {
            return;
        }
        this.c = jSONObject.optString("tid", "");
        this.d = jSONObject.optString("cid", "");
        this.e = jSONObject.optString("hint_txt", "");
        this.f = jSONObject.optString(CampaignEx.JSON_KEY_DESC, "");
        this.g = jSONObject.optString("img_url", "");
        this.h = jSONObject.optInt("img_width", 0);
        this.i = jSONObject.optInt("img_height", 0);
        this.j = jSONObject.optString("icon_img_url", "");
        this.k = jSONObject.optInt("icon_width", 0);
        this.l = jSONObject.optInt("icon_height", 0);
        this.m = jSONObject.optString("negative_feedback_url", "");
        this.n = jSONObject.optString("video_url", "");
        this.o = jSONObject.optInt("video_encode_type", 0);
        this.p = jSONObject.optInt("video_width", 0);
        this.q = jSONObject.optInt("video_height", 0);
        this.r = jSONObject.optInt("video_duration", 0);
        this.s = jSONObject.optLong("video_file_size", 0L);
        this.t = jSONObject.optString("button_txt", "");
        this.u = jSONObject.optString("reward_txt", "");
        this.v = jSONObject.optInt("marketing_target_type", 0);
        this.w = jSONObject.optInt("marketing_goal", 1);
        this.x = jSONObject.optInt("promoted_object_type", 1);
        this.y = jSONObject.optString("exposure_url", "");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("imp_track_urls");
        if (jSONArrayOptJSONArray != null) {
            this.z = new String[jSONArrayOptJSONArray.length()];
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                this.z[i] = jSONArrayOptJSONArray.optString(i);
            }
        } else {
            this.z = new String[0];
        }
        this.A = jSONObject.optString("click_url", "");
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("click_track_urls");
        if (jSONArrayOptJSONArray2 != null) {
            this.B = new String[jSONArrayOptJSONArray2.length()];
            for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                this.B[i2] = jSONArrayOptJSONArray2.optString(i2);
            }
        } else {
            this.B = new String[0];
        }
        this.C = jSONObject.optString(C5074y2.A, "");
        this.D = jSONObject.optString(C5074y2.z, "");
        this.E = jSONObject.optString("landing_page_url", "");
        this.F = jSONObject.optDouble("unified_bid_dollar", 0.0d);
        this.G = jSONObject.optInt("ad_expire_time", 0);
        this.H = jSONObject.optString("targeting_label", "");
        this.I = jSONObject.optInt("expire_biases", 0);
        this.J = jSONObject.optString("marketing_target_name", "");
        this.K = jSONObject.optString("trace_id", "");
        this.L = new i(new com.adsurge.adn.I0.e(jSONObject.optString("tpl_info")).a());
        this.M = jSONObject.optInt("resource_type", 0);
        this.N = jSONObject.optString("marketing_target_detail_id", "");
        this.O = jSONObject.optString("store_params", "");
        this.P = jSONObject.optString("playable_page_url", "");
        this.Q = jSONObject.optString("deep_link_url", "");
        this.R = jSONObject.optInt("app_install_target", 0);
        this.S = jSONObject.optInt("banner_refresh_secs", 0);
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("video_infos");
        if (jSONArrayOptJSONArray3 != null) {
            this.T = new j[jSONArrayOptJSONArray3.length()];
            for (int i3 = 0; i3 < jSONArrayOptJSONArray3.length(); i3++) {
                this.T[i3] = new k(jSONArrayOptJSONArray3.optJSONObject(i3));
            }
        } else {
            this.T = new j[0];
        }
        this.U = jSONObject.optString("jump_priority", "");
        this.V = jSONObject.optInt("app_store_type", 0);
        this.W = jSONObject.optString("package_url", "");
        this.X = jSONObject.optString("adm", "");
        this.Y = jSONObject.optInt("banner_size", 0);
        v();
    }

    public void a(String str) {
        this.A = str;
    }

    public void a(g gVar) {
        this.L = gVar;
    }
}
