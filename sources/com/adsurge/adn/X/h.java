package com.adsurge.adn.X;

import android.util.Log;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class h {
    public static ReentrantReadWriteLock a;

    static {
        boolean z = com.adsurge.adn.J0.a.a;
        a = new ReentrantReadWriteLock();
    }

    public static void a(String str) {
        if (com.adsurge.adn.J.a.d().b().i()) {
            Log.e("adsurge", str);
        }
    }
}
