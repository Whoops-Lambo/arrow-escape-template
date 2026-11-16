package com.adsurge.adn.oversea_ad;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventTypes;

/* JADX INFO: renamed from: com.adsurge.adn.oversea_ad.while, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class Cwhile {
    public static int a(Context context) {
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver == null || !TextUtils.equals(intentRegisterReceiver.getAction(), "android.intent.action.BATTERY_CHANGED")) {
                return -1;
            }
            int intExtra = intentRegisterReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, 0);
            int intExtra2 = intentRegisterReceiver.getIntExtra("scale", 100);
            if (intExtra2 == 0) {
                return -1;
            }
            int i = (intExtra * 100) / intExtra2;
            int i2 = i >= 0 ? i : 0;
            if (i2 > 100) {
                return 100;
            }
            return i2;
        } catch (Throwable unused) {
            return -1;
        }
    }
}
