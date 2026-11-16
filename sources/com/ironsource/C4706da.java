package com.ironsource;

import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.da, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class C4706da {
    static String a = "ManRewInst_";

    public static String a(JSONObject jSONObject) {
        if (!jSONObject.optBoolean("rewarded")) {
            return jSONObject.optString("name");
        }
        return a + jSONObject.optString("name");
    }

    public static String b() {
        return UUID.randomUUID().toString();
    }

    public static String a() {
        return String.valueOf(System.currentTimeMillis());
    }

    public static String a(R9 r9) {
        if (r9.i()) {
            return C4990t8.e.Banner.toString();
        }
        if (r9.n()) {
            return C4990t8.e.RewardedVideo.toString();
        }
        return C4990t8.e.Interstitial.toString();
    }
}
