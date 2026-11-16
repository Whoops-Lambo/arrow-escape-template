package com.adsurge.adn.I0;

import android.os.StatFs;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static long a() {
        try {
            return new StatFs(com.adsurge.adn.D0.a.c().a().getFilesDir().getAbsolutePath()).getAvailableBytes();
        } catch (Throwable unused) {
            return -1L;
        }
    }
}
