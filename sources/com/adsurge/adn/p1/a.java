package com.adsurge.adn.p1;

import com.adsurge.adn.u1.e;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class a {
    public static volatile a b;
    public volatile ConcurrentHashMap a = new ConcurrentHashMap();

    public static a a() {
        if (b == null) {
            synchronized (a.class) {
                try {
                    if (b == null) {
                        b = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public final int b(e eVar, String str, int i) {
        a(eVar, str, Integer.valueOf(i));
        return i;
    }

    public static void a(e eVar, String str, Object obj) {
    }

    public int a(e eVar, String str, int i) {
        return b(eVar, str, i);
    }

    public int a(String str, int i) {
        return a((e) null, str, i);
    }
}
