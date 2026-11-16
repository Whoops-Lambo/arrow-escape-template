package com.adsurge.adn.V;

import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class d extends com.adsurge.adn.Y0.d {
    public d a(int i, int i2) {
        a("placement_height", Integer.valueOf(i));
        a("placement_width", Integer.valueOf(i2));
        return this;
    }

    public d b(float f, float f2) {
        a("touch_up_x", Float.valueOf(f));
        a("touch_up_y", Float.valueOf(f2));
        return this;
    }

    public d a(float f, float f2) {
        a("touch_down_x", Float.valueOf(f));
        a("touch_down_y", Float.valueOf(f2));
        return this;
    }

    public d b(int i) {
        a(CampaignEx.JSON_KEY_CLICK_MODE, Integer.valueOf(i));
        return this;
    }

    public d b(String str) {
        a("jump_priority", str);
        return this;
    }

    public d a(com.adsurge.adn.p044n0.c cVar) {
        return b(cVar == null ? 9 : 1);
    }

    public d a(int i) {
        a("click_component", Integer.valueOf(i));
        return this;
    }

    public d a(long j) {
        a("valid_time", Long.valueOf(j));
        return this;
    }

    public d a(String str) {
        a("apk_url", str);
        return this;
    }

    public d a(boolean z) {
        if (z) {
            a("banner_dsp_html", (Object) 1);
        }
        return this;
    }
}
