package com.tiktok.appevents;

import com.tiktok.TikTokBusinessSdk;
import com.tiktok.util.JSON;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
class DebugModeHelper {
    private static volatile boolean sIsSuccess;

    public static boolean isSuccess() {
        return sIsSuccess;
    }

    public static void tryRequestConfig() {
        boolean z;
        if (!isSuccess()) {
            try {
                JSONObject debugModeConfig = TTRequest.getDebugModeConfig();
                if (debugModeConfig != null && debugModeConfig.has("enable_debug_mode")) {
                    z = true;
                } else {
                    z = false;
                }
                sIsSuccess = z;
                if (JSON.getBoolean(debugModeConfig, "enable_debug_mode", false)) {
                    TikTokBusinessSdk.enableDebugMode();
                } else {
                    TikTokBusinessSdk.disableDebugMode();
                }
            } catch (Throwable unused) {
            }
        }
    }
}
