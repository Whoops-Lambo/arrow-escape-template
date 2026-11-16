package com.google.unity.mediation.liftoffmonetize;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.unity.ads.AdNetworkExtras;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
abstract class VungleUnityExtrasBuilder implements AdNetworkExtras {
    private static final String BACK_BUTTON_IMMEDIATELY_ENABLED_KEY = "back_button_immediately_enabled";
    private static final String USER_ID_KEY = "user_id";

    @Override // com.google.unity.ads.AdNetworkExtras
    public Bundle buildExtras(HashMap<String, String> map) {
        Bundle bundle = new Bundle();
        String str = map.get(USER_ID_KEY);
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("userId", str);
        }
        String str2 = map.get(BACK_BUTTON_IMMEDIATELY_ENABLED_KEY);
        if (!TextUtils.isEmpty(str2)) {
            bundle.putBoolean(BACK_BUTTON_IMMEDIATELY_ENABLED_KEY, Boolean.parseBoolean(str2));
        }
        return bundle;
    }
}
