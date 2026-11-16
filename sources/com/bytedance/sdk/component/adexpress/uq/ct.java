package com.bytedance.sdk.component.adexpress.uq;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class ct {
    public static boolean kgy(String str) {
        if (com.bytedance.sdk.component.adexpress.uq.ahm()) {
            if (TextUtils.equals(str, "embeded_ad") || TextUtils.equals(str, "banner_ad")) {
                return true;
            }
            return false;
        }
        return false;
    }
}
