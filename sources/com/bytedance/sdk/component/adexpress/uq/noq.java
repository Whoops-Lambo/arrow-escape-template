package com.bytedance.sdk.component.adexpress.uq;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class noq {
    public static boolean kgy(String str) {
        return TextUtils.equals(str, "fullscreen_interstitial_ad") || TextUtils.equals(str, "rewarded_video");
    }

    public static boolean ahm(String str) {
        if (com.bytedance.sdk.component.adexpress.uq.ahm() && kgy(str)) {
            return true;
        }
        return false;
    }
}
