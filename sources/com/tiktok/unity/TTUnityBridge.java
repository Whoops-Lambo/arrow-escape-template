package com.tiktok.unity;

import android.app.Activity;
import com.unity3d.player.UnityPlayer;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class TTUnityBridge {
    public static void setConfigCallback(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            Activity activity = UnityPlayer.currentActivity;
            UnityPlayer.class.getMethod("UnitySendMessage", String.class, String.class, String.class).invoke(UnityPlayer.class, "TikTokInnerManager", "UpdateConfigFromNative", jSONObject.toString());
        } catch (Throwable unused) {
        }
    }
}
