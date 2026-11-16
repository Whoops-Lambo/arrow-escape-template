package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class at {
    private static String ahm(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return com.bytedance.sdk.openadsdk.fpp.uq.kgy.ahm((String) null, str, str2);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "fvY5kBGyaMuzWuJJhR2z", "XOs5pheuYMmHbMVSgSKw", 37);
            return str2;
        }
    }

    private static void kgy(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.fpp.uq.kgy.kgy((String) null, str, str2);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "fvY5kBGyaMuzWuJJhR2z", "S/s5pheuYMmHfthunA==", 25);
        }
    }

    public static String kgy() {
        return ahm("any_door_id", null);
    }

    public static void kgy(String str) {
        kgy("any_door_id", str);
    }
}
