package com.unity3d.player;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.os.SystemClock;
import java.io.File;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
class DeviceInfo {
    public static String getDeviceModel() {
        return Build.MODEL;
    }

    public static String getOsVersion() {
        return Build.VERSION.RELEASE;
    }

    public static String getLocaleList(Context context) {
        LocaleList locales = context.getResources().getConfiguration().getLocales();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < locales.size(); i++) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append(locales.get(i).toString());
        }
        return sb.toString();
    }

    public static long getSystemBootTime() {
        return (System.currentTimeMillis() - SystemClock.elapsedRealtime()) / 1000;
    }

    public static String getSystemLanguage() {
        return Locale.getDefault().toString();
    }

    public static long getTotalSpace(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null && cacheDir.exists()) {
            return Math.round(cacheDir.getTotalSpace() / 1024);
        }
        return -1L;
    }
}
