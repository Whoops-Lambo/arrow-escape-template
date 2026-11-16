package com.bytedance.sdk.openadsdk.core.settings;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class ahm {
    public int ahm;
    public int at;
    public int ay;
    public int bmz;
    public int ct;
    public int dg;
    public int fi;
    public int fpp;
    public int fpz;
    public int ft;
    public int gf;
    public boolean gm;
    public JSONObject ikw;
    public List<String> ioy;
    public int jpc;
    public String kgy;
    public int kus;
    public int lqi;
    public int noq;
    public int nu;
    public int ra;
    public int rz;
    public int sx;
    public int twf;
    public boolean uf;
    public int um;
    public int uq;
    public boolean vg;
    public int vs;
    public boolean wy;
    public int xh;
    public int yo;

    public void kgy(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        this.ioy = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                this.ioy.add(jSONArray.get(i).toString());
            } catch (Exception e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V/SiBF7VnwJM=", "euoemQyoWsKUXtJP", "SOs5pQKubMmUfsdRpRWz", 176);
                return;
            }
        }
    }

    public ahm(JSONObject jSONObject) {
        this.ahm = 1;
        this.rz = 1;
        this.uq = 2;
        this.ct = 1;
        this.noq = 100;
        this.yo = 0;
        this.fi = 2;
        this.gf = 1;
        this.ra = 3;
        this.nu = 30;
        this.at = 30;
        this.twf = 1;
        this.kus = 1;
        this.vs = 2;
        this.dg = 5000;
        this.xh = 2;
        this.um = 3500;
        this.fpp = 0;
        this.sx = 5;
        this.gm = false;
        this.ay = 0;
        this.lqi = 2;
        this.fpz = 0;
        this.jpc = 0;
        this.ft = 5;
        this.wy = true;
        this.uf = false;
        this.vg = false;
        this.bmz = -1;
        new JSONObject();
        this.ikw = jSONObject;
        if (jSONObject == null) {
            return;
        }
        this.kgy = jSONObject.optString("code_id");
        this.ahm = jSONObject.optInt("auto_play", 1);
        this.bmz = jSONObject.optInt("endcard_close_time", -1);
        this.rz = jSONObject.optInt("voice_control", 1);
        this.uq = jSONObject.optInt("rv_preload", 2);
        this.ct = jSONObject.optInt("nv_preload", 1);
        this.noq = Math.min(100, Math.max(0, jSONObject.optInt("proportion_watching", 100)));
        this.yo = jSONObject.optInt("skip_time_displayed", 0);
        this.fi = jSONObject.optInt("video_skip_result", 2);
        this.gf = jSONObject.optInt("reg_creative_control", 1);
        this.ra = jSONObject.optInt("play_bar_show_time", 3);
        int iOptInt = jSONObject.optInt("rv_skip_time", 30);
        this.nu = iOptInt;
        if (iOptInt < 0) {
            this.nu = 30;
        }
        this.twf = jSONObject.optInt("voice_control", 1);
        this.kus = jSONObject.optInt("if_show_win", 1);
        this.vs = jSONObject.optInt("sp_preload", 2);
        this.dg = jSONObject.optInt("stop_time", 5000);
        this.xh = jSONObject.optInt("native_playable_delay", 2);
        this.um = jSONObject.optInt("time_out_control", -1);
        this.fpp = jSONObject.optInt("playable_reward_type", 0);
        this.ay = jSONObject.optInt("reward_is_callback", 0);
        int iOptInt2 = jSONObject.optInt("iv_skip_time", 5);
        this.sx = iOptInt2;
        if (iOptInt2 < 0) {
            this.sx = 5;
        }
        kgy(jSONObject.optJSONArray("parent_tpl_ids"));
        this.lqi = jSONObject.optInt("slot_type", 2);
        this.gm = jSONObject.optBoolean("close_on_click", false);
        this.fpz = jSONObject.optInt("allow_system_back", 0);
        this.jpc = jSONObject.optInt("splash_skip_time", 0);
        this.ft = jSONObject.optInt("splash_image_count_down_time", 5);
        this.uf = jSONObject.optBoolean("splash_count_down_time_off", false);
        this.vg = jSONObject.optBoolean("splash_close_on_click", false);
        this.wy = jSONObject.optBoolean("allow_mediaview_click", true);
        if (!kgy(this.rz)) {
            this.rz = 1;
        }
        if (!kgy(this.twf)) {
            this.twf = 1;
        }
        this.at = jSONObject.optInt("multi_rv_skip_time", 30);
    }

    private static boolean kgy(int i) {
        return i == 1 || i == 2;
    }

    public ahm(String str, int i) {
        this.ahm = 1;
        this.rz = 1;
        this.uq = 2;
        this.ct = 1;
        this.noq = 100;
        this.yo = 0;
        this.fi = 2;
        this.gf = 1;
        this.ra = 3;
        this.nu = 30;
        this.at = 30;
        this.twf = 1;
        this.kus = 1;
        this.vs = 2;
        this.dg = 5000;
        this.xh = 2;
        this.um = 3500;
        this.fpp = 0;
        this.sx = 5;
        this.gm = false;
        this.ay = 0;
        this.lqi = 2;
        this.fpz = 0;
        this.jpc = 0;
        this.ft = 5;
        this.wy = true;
        this.uf = false;
        this.vg = false;
        this.bmz = -1;
        this.ikw = new JSONObject();
        this.kgy = str;
        this.rz = i;
    }
}
