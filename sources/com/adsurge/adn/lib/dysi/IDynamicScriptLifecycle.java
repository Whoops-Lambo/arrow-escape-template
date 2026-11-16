package com.adsurge.adn.lib.dysi;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public interface IDynamicScriptLifecycle {
    void onAppBackground();

    void onAppForeground();

    void onBindData(JSONObject jSONObject);

    void onStartAnimation(String str);

    void onViewCreate();

    void onViewDestroy();

    void onWindowBlur();

    void onWindowFocus();
}
