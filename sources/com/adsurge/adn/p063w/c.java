package com.adsurge.adn.p063w;

import com.adsurge.adn.N.b;
import com.adsurge.adn.N.d;
import com.adsurge.adn.ads.AdSurgeAdFormat;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class c {
    public static final long f = ((long) b.a("odcret", 1440, (AdSurgeAdFormat) null, (String) null)) * 60000;
    public final String a;
    public final int b;
    public final com.adsurge.adn.Y0.c c;
    public final JSONObject d;
    public final long e = d.b().a();

    public com.adsurge.adn.Y0.c a() {
        return this.c;
    }

    public JSONObject b() {
        return this.d;
    }

    public long c() {
        return this.e;
    }

    public int d() {
        return this.b;
    }

    public String e() {
        return this.a;
    }

    public String toString() {
        return "ReportRetryRecord{url='" + this.a + "', bizExtra=" + this.c + ", type=" + this.b + ", time=" + this.e + ", postBody=" + this.d + '}';
    }

    public c(String str, int i, com.adsurge.adn.Y0.c cVar, JSONObject jSONObject) {
        this.a = str;
        this.b = i;
        this.c = cVar;
        this.d = jSONObject;
    }

    public boolean f() {
        if (d.b().a() - this.e > f) {
            return true;
        }
        return false;
    }
}
