package com.adsurge.adn.p025h;

import android.os.Handler;
import defpackage.jc1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class c {
    public static volatile c e;
    public final LinkedBlockingQueue a = new LinkedBlockingQueue();
    public final LinkedList b = new LinkedList();
    public final int c = com.adsurge.adn.N.b.a("odcuhml", 100);
    public final Handler d = new Handler(jc1.h("BehaviorRecordThread").getLooper());

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                List<com.adsurge.adn.p025h.b> listA = com.adsurge.adn.p025h.a.a().a(c.this.c);
                c.this.a.clear();
                for (com.adsurge.adn.p025h.b bVar : listA) {
                    bVar.a(true);
                    c.this.a.offer(bVar);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b implements Runnable {
        public final /* synthetic */ String a;
        public final /* synthetic */ d b;
        public final /* synthetic */ long c;

        public b(String str, d dVar, long j) {
            this.a = str;
            this.b = dVar;
            this.c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.adsurge.adn.p025h.b bVar;
            try {
                c.this.a.offer(new com.adsurge.adn.p025h.b(this.a, this.b, this.c));
                int size = c.this.a.size();
                c cVar = c.this;
                if (size <= cVar.c || (bVar = (com.adsurge.adn.p025h.b) cVar.a.poll()) == null || !bVar.e()) {
                    return;
                }
                c.this.b.offer(bVar);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.adsurge.adn.h.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class RunnableC0113c implements Runnable {
        public RunnableC0113c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.adsurge.adn.p025h.a.a().a(new ArrayList(c.this.a), c.this.b);
                c.this.b.clear();
                Iterator it = c.this.a.iterator();
                while (it.hasNext()) {
                    ((com.adsurge.adn.p025h.b) it.next()).a(true);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public JSONObject a() {
        try {
            if (this.a.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList(this.a);
            if (arrayList.isEmpty()) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            JSONArray jSONArray3 = new JSONArray();
            JSONArray jSONArray4 = new JSONArray();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                com.adsurge.adn.p025h.b bVar = (com.adsurge.adn.p025h.b) obj;
                jSONArray.put(bVar.c() == null ? "" : bVar.c());
                jSONArray2.put(bVar.a().b());
                jSONArray3.put(bVar.d());
                jSONArray4.put(bVar.b());
            }
            jSONObject.put("cids", jSONArray);
            jSONObject.put("action_types", jSONArray2);
            jSONObject.put("timestamps", jSONArray3);
            jSONObject.put("action_values", jSONArray4);
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static c b() {
        if (e == null) {
            synchronized (c.class) {
                try {
                    if (e == null) {
                        e = new c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public void c() {
        this.d.post(new a());
    }

    public void d() {
        this.d.post(new RunnableC0113c());
    }

    public void a(String str, d dVar, long j) {
        this.d.post(new b(str, dVar, j));
    }
}
