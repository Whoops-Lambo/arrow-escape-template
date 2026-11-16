package com.adsurge.adn.oversea_ad;

import android.content.Context;
import android.provider.Settings;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class d {
    public static boolean a(Context context) {
        if (Settings.Secure.getInt(context.getContentResolver(), "mock_location", 0) == 0) {
            return false;
        }
        return true;
    }
}
