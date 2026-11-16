package com.adsurge.adn.L0;

import androidx.core.app.NotificationCompat;
import com.adsurge.adn.Y0.d;
import com.adsurge.adn.Y0.v;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class a {
    public static void a(d dVar) {
        Runtime runtime = Runtime.getRuntime();
        long jMaxMemory = runtime.maxMemory();
        long jFreeMemory = runtime.totalMemory() - runtime.freeMemory();
        dVar.a("data", Long.valueOf(jMaxMemory));
        dVar.a("data2", Long.valueOf(jFreeMemory));
        dVar.a("data3", Long.valueOf(jMaxMemory - jFreeMemory));
    }

    public static void a(int i, Throwable th) {
        a(null, i, th);
    }

    public static void a(String str, int i, Throwable th) {
        d dVar = new d();
        if (str != null) {
            dVar.a("url", str);
        }
        dVar.a(NotificationCompat.CATEGORY_MESSAGE, th.getMessage());
        a(dVar);
        v.a(9700001, null, Integer.valueOf(i), dVar);
    }

    public static void a(String str, int i) {
        d dVar = new d();
        dVar.a("url", str);
        dVar.a(NotificationCompat.CATEGORY_MESSAGE, Integer.valueOf(i));
        a(dVar);
        v.a(9700001, null, 1, dVar);
    }
}
