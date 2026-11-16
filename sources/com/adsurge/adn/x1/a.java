package com.adsurge.adn.x1;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class a {
    public static boolean a(com.adsurge.adn.u1.c cVar, long j) {
        if (cVar == null || j <= 0) {
            return true;
        }
        return SystemClock.elapsedRealtime() > j + ((long) cVar.n());
    }
}
