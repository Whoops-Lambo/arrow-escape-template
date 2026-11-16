package com.adsurge.adn.I1;

import com.adsurge.adn.E1.f;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class c implements com.adsurge.adn.I1.a {
    public static final /* synthetic */ int c = 0;
    public final b a;
    public final ConcurrentHashMap b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements com.adsurge.adn.G0.b {
        public final /* synthetic */ String a;
        public final /* synthetic */ f b;
        public final /* synthetic */ d c;

        public a(String str, f fVar, d dVar) {
            this.a = str;
            this.b = fVar;
            this.c = dVar;
        }

        @Override // com.adsurge.adn.G0.b
        public void a(com.adsurge.adn.H0.a aVar, com.adsurge.adn.H0.b bVar) {
            try {
                try {
                    int iB = bVar.b();
                    if (iB == 200) {
                        c.this.a(bVar, this.a, this.b, this.c);
                    } else {
                        d dVar = this.c;
                        if (dVar != null) {
                            dVar.a(Integer.valueOf(iB));
                        }
                    }
                } finally {
                    c.this.b.remove(this.a);
                    this.b.a.countDown();
                }
            } catch (Throwable unused) {
                d dVar2 = this.c;
                if (dVar2 != null) {
                    dVar2.a(0);
                }
            }
        }

        @Override // com.adsurge.adn.G0.b
        public void a(com.adsurge.adn.H0.a aVar, Exception exc) {
            c.this.b.remove(this.a);
            this.b.a.countDown();
            d dVar = this.c;
            if (dVar != null) {
                dVar.a(1);
            }
        }
    }

    public c(b bVar, ConcurrentHashMap concurrentHashMap) {
        this.a = bVar;
        this.b = concurrentHashMap;
    }

    public final void a(com.adsurge.adn.H0.b bVar, String str, f fVar, d dVar) throws Throwable {
        byte[] bArrA = bVar.a();
        if (bArrA != null && bArrA.length > 0) {
            this.a.a(str, bArrA);
            fVar.c = bArrA;
            fVar.b = true;
            if (dVar != null) {
                dVar.a();
                return;
            }
            return;
        }
        if (dVar != null) {
            dVar.a(2);
        }
    }

    @Override // com.adsurge.adn.I1.a
    public InputStream a(String str) {
        f fVar = new f();
        f fVar2 = (f) this.b.putIfAbsent(str, fVar);
        if (fVar2 != null) {
            return fVar2.a(str);
        }
        a(str, fVar, null);
        return fVar.a(str);
    }

    public final void a(String str, f fVar, d dVar) {
        com.adsurge.adn.R.c.a().a(new com.adsurge.adn.T.c(str, com.adsurge.adn.H0.a.EnumC0076a.GET, null), new a(str, fVar, dVar));
    }

    public void a(String str, com.adsurge.adn.u1.c cVar) {
        f fVar = new f();
        if (this.b.putIfAbsent(str, fVar) != null) {
            return;
        }
        d dVar = new d(cVar);
        dVar.b();
        a(str, fVar, dVar);
    }
}
