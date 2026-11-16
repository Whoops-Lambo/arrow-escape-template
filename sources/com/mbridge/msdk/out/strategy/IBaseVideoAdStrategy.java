package com.mbridge.msdk.out.strategy;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public interface IBaseVideoAdStrategy {
    void clearVideoCache();

    String getCreativeIdWithUnitId();

    String getRequestId();

    void loadFormSelfFilling();

    void playVideoMute(int i);

    void setAlertDialogText(String str, String str2, String str3, String str4);

    void setExtraInfo(JSONObject jSONObject);

    void setRewardPlus(boolean z);
}
