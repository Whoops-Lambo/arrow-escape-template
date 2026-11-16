package com.adsurge.adn.p063w;

import com.adsurge.adn.R.c;
import com.adsurge.adn.R.d;
import com.adsurge.adn.ads.AdSurgeAdFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class b {
    public static volatile b c;
    public static final boolean d;
    public static final boolean e;
    public static final int f;
    public final List a = new ArrayList();
    public int b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a extends d {
        public final /* synthetic */ c a;

        @Override // com.adsurge.adn.G0.b
        public void a(com.adsurge.adn.H0.a aVar, com.adsurge.adn.H0.b bVar) {
            if (bVar.b() != 200) {
                b.this.b(this.a);
                Objects.toString(this.a);
                return;
            }
            int iD = this.a.d();
            c cVar = this.a;
            if (iD == 1) {
                com.adsurge.adn.w1.b.b(6001201, cVar.a(), 2);
            } else if (cVar.d() == 2) {
                com.adsurge.adn.w1.b.b(6001202, this.a.a(), 2);
            }
            Objects.toString(this.a);
        }

        public a(c cVar) {
            this.a = cVar;
        }

        @Override // com.adsurge.adn.R.d
        public void a(com.adsurge.adn.H0.a aVar, int i, Exception exc) {
            b.this.b(this.a);
            Objects.toString(this.a);
        }
    }

    public synchronized void b() {
        try {
            if (this.a.isEmpty()) {
                return;
            }
            this.b = 0;
            Objects.toString(this.a);
            ArrayList arrayList = new ArrayList(this.a);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                c cVar = (c) obj;
                if (this.b >= f) {
                    break;
                }
                int iD = cVar.d();
                boolean z = true;
                boolean z2 = iD == 1 && d;
                if (iD != 2 || !e) {
                    z = false;
                }
                if (!z2 && !z) {
                    a(cVar);
                    this.a.remove(cVar);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    static {
        d = com.adsurge.adn.N.b.a("odcere", 0, (AdSurgeAdFormat) null, (String) null) == 0;
        e = com.adsurge.adn.N.b.a("odccre", 0, (AdSurgeAdFormat) null, (String) null) == 0;
        f = com.adsurge.adn.N.b.a("odcsrmc", 50, (AdSurgeAdFormat) null, (String) null);
    }

    public final void a(c cVar) {
        JSONObject jSONObject;
        if (cVar.f()) {
            b(cVar);
            cVar.toString();
            return;
        }
        if (cVar.b() != null) {
            jSONObject = cVar.b();
        } else {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("report_type", "1");
            jSONObject.put("raw_timestamp", cVar.c());
            c.a().a(new com.adsurge.adn.T.c(cVar.e(), com.adsurge.adn.H0.a.EnumC0076a.POST, jSONObject.toString().getBytes()), com.adsurge.adn.G0.c.a.Low, new a(cVar));
            this.b++;
        } catch (JSONException unused) {
            b(cVar);
        }
    }

    public synchronized void a(String str, int i, com.adsurge.adn.Y0.c cVar, JSONObject jSONObject) {
        if (i == 1) {
            try {
                if (d) {
                    return;
                } else {
                    com.adsurge.adn.w1.b.b(6001201, cVar, 1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i == 2) {
            if (e) {
                return;
            } else {
                com.adsurge.adn.w1.b.b(6001202, cVar, 1);
            }
        }
        c cVar2 = new c(str, i, cVar, jSONObject);
        this.a.add(cVar2);
        cVar2.toString();
    }

    public final void b(c cVar) {
        if (cVar.d() == 1) {
            com.adsurge.adn.w1.b.b(6001201, cVar.a(), 3);
        } else if (cVar.d() == 2) {
            com.adsurge.adn.w1.b.b(6001202, cVar.a(), 3);
        }
    }

    public static b a() {
        if (c == null) {
            synchronized (b.class) {
                try {
                    if (c == null) {
                        c = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }
}
