package com.bytedance.sdk.openadsdk.core.at.ahm;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class uq extends com.bytedance.adsdk.ugeno.ra.rz.kgy {
    public uq(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.ra.rz.kgy
    public String kus(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.getClass();
        switch (str) {
            case "unmuted":
                return "tt_reward_full_unmute";
            case "feedback":
                return "tt_reward_full_feedback";
            case "right_arrow":
                return "tt_skip_btn";
            case "back":
                return "tt_back";
            case "logo":
                return "tt_ad_logo";
            case "close":
                return "tt_close_btn";
            case "muted":
                return "tt_reward_full_mute";
            case "loading":
                return "tt_loading";
            default:
                return null;
        }
    }
}
