package com.adsurge.adn.K1;

import android.os.SystemClock;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class c {
    public static final Map a = new ConcurrentHashMap();
    public static final Map b = new ConcurrentHashMap();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface a {
        void a();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class b {
        public final int a;
        public final String b;
        public final long c = SystemClock.elapsedRealtime();

        public b(int i, String str) {
            this.a = i;
            this.b = str;
        }
    }

    public static void a(String str, b bVar) {
        b.put(str, bVar);
        a aVar = (a) a.get(str);
        if (aVar != null) {
            aVar.a();
        }
    }

    public static void b(String str) {
        a.remove(str);
    }

    public static b a(String str) {
        return (b) b.remove(str);
    }

    public static void a(String str, a aVar) {
        a.put(str, aVar);
    }
}
