package com.inmobi.media;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Z5 {
    public static final boolean a(Context context) {
        boolean zIsLowRamDevice;
        context.getClass();
        Object systemService = context.getSystemService("activity");
        systemService.getClass();
        ActivityManager activityManager = (ActivityManager) systemService;
        Y5.a.getClass();
        if (Y5.w()) {
            zIsLowRamDevice = activityManager.isLowRamDevice();
        } else {
            zIsLowRamDevice = true;
        }
        if (!zIsLowRamDevice) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            if (memoryInfo.availMem / 1048576 >= 100) {
                return false;
            }
        }
        return true;
    }

    public static final int a() {
        int i = Resources.getSystem().getDisplayMetrics().densityDpi;
        if (640 <= i && i <= Integer.MAX_VALUE) {
            return 1080;
        }
        if (480 <= i && i < 640) {
            return 720;
        }
        if (320 > i || i >= 480) {
            return (240 > i || i >= 320) ? 240 : 360;
        }
        return 480;
    }
}
