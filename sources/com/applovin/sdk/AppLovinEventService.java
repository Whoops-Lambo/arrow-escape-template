package com.applovin.sdk;

import android.content.Intent;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public interface AppLovinEventService {
    void trackCheckout(String str, Map<String, String> map);

    void trackEvent(String str);

    void trackEvent(String str, Map<String, ?> map);

    void trackEvent(String str, Map<String, ?> map, Map<String, Object> map2);

    void trackInAppPurchase(Intent intent, Map<String, String> map);
}
