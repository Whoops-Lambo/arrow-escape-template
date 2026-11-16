package com.bytedance.sdk.openadsdk.core.at;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.settings.nu;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.d;
import defpackage.h50;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class ct {
    public static String kgy(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && !str2.startsWith(d.v) && !str2.startsWith("https://")) {
            if (!TextUtils.isEmpty(str) && !str.endsWith("/")) {
                return h50.i(str, "/static/", str2);
            }
            return h50.i(str, "static/", str2);
        }
        return str2;
    }

    public static String kgy(String str) {
        return TextUtils.isEmpty(str) ? str : kgy(nu.ahm().fpp(), str);
    }
}
