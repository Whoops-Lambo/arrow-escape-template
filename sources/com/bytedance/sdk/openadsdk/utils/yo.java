package com.bytedance.sdk.openadsdk.utils;

import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import com.applovin.sdk.AppLovinEventTypes;
import defpackage.h50;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class yo {
    static float ahm = 0.0f;
    static int kgy = -1;
    private static long rz;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy {
        public final float ahm;
        public final int kgy;

        public kgy(int i, float f) {
            this.kgy = i;
            this.ahm = f;
        }
    }

    @NonNull
    public static kgy kgy() {
        if (rz == 0 || SystemClock.elapsedRealtime() - rz > 60000) {
            Intent intentE = h50.e("android.intent.action.BATTERY_CHANGED", com.bytedance.sdk.openadsdk.core.xh.kgy(), null);
            Log.d("BatteryDataWatcher", "obtainCurrentState: registerReceiver result is ".concat(String.valueOf(intentE)));
            if (intentE != null) {
                kgy(intentE);
                rz = SystemClock.elapsedRealtime();
            }
        }
        return new kgy(kgy, ahm);
    }

    private static void kgy(Intent intent) {
        if (intent.getIntExtra("status", -1) == 2) {
            kgy = 1;
        } else {
            kgy = 0;
        }
        ahm = (intent.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) * 100) / intent.getIntExtra("scale", -1);
    }
}
