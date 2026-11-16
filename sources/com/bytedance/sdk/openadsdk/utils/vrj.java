package com.bytedance.sdk.openadsdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.ironsource.Ba;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class vrj {
    private static String kgy;

    public static boolean rz() {
        return false;
    }

    public static String ahm() {
        if (TextUtils.isEmpty(kgy)) {
            kgy = new String(Base64.decode("ZGV2aWNlX2lk", 0));
        }
        return kgy;
    }

    public static String kgy(String str) {
        try {
            if (kgy()) {
                String strSx = com.bytedance.sdk.openadsdk.core.ra.ahm().sx();
                if (!TextUtils.isEmpty(strSx)) {
                    Log.d("TestHelperUtils", "AnyDoorId=".concat(String.valueOf(strSx)));
                    return Uri.parse(str).buildUpon().appendQueryParameter(ahm(), strSx).appendQueryParameter(Ba.b, "5001121").toString();
                }
            }
            return str;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "b+s+gSu5ZdeFWOJJhR2z", "Wv49kA24SMmZbthSniWhL3TgGIcP", 83);
            return str;
        }
    }

    public static boolean kgy() {
        return com.bytedance.sdk.component.utils.vs.rz() && com.bytedance.sdk.openadsdk.core.ra.ahm().xh() && com.bytedance.sdk.openadsdk.core.ra.ahm().fpp();
    }
}
