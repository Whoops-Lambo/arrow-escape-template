package com.bytedance.sdk.component.fi.rz;

import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.d;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class noq {
    public static boolean kgy(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (str.startsWith(d.v) || str.startsWith("https://")) {
                return true;
            }
            return false;
        }
        return false;
    }
}
