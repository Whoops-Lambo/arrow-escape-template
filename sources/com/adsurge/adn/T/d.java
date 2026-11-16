package com.adsurge.adn.T;

import java.net.HttpURLConnection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class d extends b {
    public volatile Map c;

    public void a(String str, Object obj) {
        if (this.c == null) {
            synchronized (this) {
                try {
                    if (this.c == null) {
                        this.c = new ConcurrentHashMap();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.c.put(str, obj);
    }

    public final Object b(String str) {
        if (this.c == null) {
            return null;
        }
        return this.c.get(str);
    }

    public long e() {
        try {
            return Long.parseLong(a("Content-Length"));
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    public double f() {
        Double d = (Double) b("rtt_durations_ms");
        if (d == null) {
            return 0.0d;
        }
        return d.doubleValue();
    }

    public d(HttpURLConnection httpURLConnection) {
        super(httpURLConnection);
    }
}
