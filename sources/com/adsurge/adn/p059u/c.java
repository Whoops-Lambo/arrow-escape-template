package com.adsurge.adn.p059u;

import android.text.TextUtils;
import com.adsurge.adn.N.d;
import com.adsurge.adn.X.x;
import com.adsurge.adn.w1.b;
import com.adsurge.adn.z1.e;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class c {
    public static volatile c j;
    public boolean a;
    public int b;
    public long c;
    public double d;
    public double e;
    public boolean f = true;
    public LinkedBlockingQueue g = new LinkedBlockingQueue();
    public LinkedBlockingQueue h = new LinkedBlockingQueue();
    public LinkedBlockingQueue i = new LinkedBlockingQueue();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a extends e.c {
        public boolean a = false;

        @Override // com.adsurge.adn.z1.e.c
        public void b(long j) {
            if (this.a) {
                return;
            }
            c.b().a(3);
            this.a = true;
        }

        @Override // com.adsurge.adn.C1.c
        public void a() {
            c.b().a(1);
        }

        @Override // com.adsurge.adn.z1.e.c
        public void c() {
            c.b().a(2);
        }
    }

    public void e() {
        this.f = false;
    }

    public static c b() {
        if (j == null) {
            synchronized (c.class) {
                try {
                    if (j == null) {
                        j = new c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return j;
    }

    public boolean a(com.adsurge.adn.Y0.c cVar) {
        Locale locale = Locale.US;
        this.g.size();
        this.h.size();
        this.i.size();
        if (this.a && !this.f) {
            b.c(6000001, cVar, 8);
            return false;
        }
        if (this.c <= 0 || this.g.size() < this.b) {
            return true;
        }
        double size = ((double) this.h.size()) / ((double) this.g.size());
        if (size > this.d) {
            b.c(6000001, cVar, 9);
            String.format(locale, "AdRequestFailed because video start timeout rate too high: %.2f", Double.valueOf(size));
            return false;
        }
        double size2 = ((double) this.i.size()) / ((double) this.g.size());
        if (size2 <= this.e) {
            return true;
        }
        b.c(6000001, cVar, 10);
        String.format(locale, "AdRequestFailed because video lag rate too high: %.2f", Double.valueOf(size2));
        return false;
    }

    public void c() {
        this.a = com.adsurge.adn.N.b.a("odcjsrae", 1) == 1;
        this.b = com.adsurge.adn.N.b.a("odcvptm", 5);
        this.c = ((long) com.adsurge.adn.N.b.a("odcvset", 5)) * 86400000;
        this.d = ((double) com.adsurge.adn.N.b.a("odcvstot", 50)) / 100.0d;
        this.e = ((double) com.adsurge.adn.N.b.a("odcvltt", 20)) / 100.0d;
    }

    public final void d() {
        String strA = x.a("statistics_data", "");
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(strA);
            this.g = a(jSONObject.optJSONArray("video_play"));
            this.h = a(jSONObject.optJSONArray("video_start_timeout"));
            this.i = a(jSONObject.optJSONArray("video_stuck_timeout"));
        } catch (Exception e) {
            Locale locale = Locale.US;
            e.getMessage();
        }
    }

    public void f() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("video_play", b(this.g));
            jSONObject.put("video_start_timeout", b(this.h));
            jSONObject.put("video_stuck_timeout", b(this.i));
            x.b("statistics_data", jSONObject.toString());
        } catch (JSONException e) {
            Locale locale = Locale.US;
            e.getMessage();
        }
    }

    public c() {
        d();
        a();
    }

    public final JSONArray b(LinkedBlockingQueue linkedBlockingQueue) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = linkedBlockingQueue.iterator();
        while (it.hasNext()) {
            jSONArray.put((Long) it.next());
        }
        return jSONArray;
    }

    public final void a() {
        a(this.g);
        a(this.h);
        a(this.i);
    }

    public final void a(LinkedBlockingQueue linkedBlockingQueue) {
        long jA = d.b().a() - this.c;
        while (true) {
            Long l = (Long) linkedBlockingQueue.peek();
            if (l == null || l.longValue() >= jA) {
                return;
            } else {
                linkedBlockingQueue.poll();
            }
        }
    }

    public void a(int i) {
        if (this.c <= 0) {
            return;
        }
        long jA = d.b().a();
        if (i == 1) {
            this.g.add(Long.valueOf(jA));
            return;
        }
        if (i == 2) {
            this.h.add(Long.valueOf(jA));
        } else if (i != 3) {
            Locale locale = Locale.US;
        } else {
            this.i.add(Long.valueOf(jA));
        }
    }

    public final LinkedBlockingQueue a(JSONArray jSONArray) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                linkedBlockingQueue.add(Long.valueOf(jSONArray.optLong(i, 0L)));
            }
        }
        return linkedBlockingQueue;
    }
}
