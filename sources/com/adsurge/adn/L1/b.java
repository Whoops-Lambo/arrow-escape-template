package com.adsurge.adn.L1;

import com.adsurge.adn.E1.f;
import com.adsurge.adn.x1.l;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class b {
    public static final /* synthetic */ int c = 0;
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final File b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements com.adsurge.adn.G0.b {
        public final /* synthetic */ String a;
        public final /* synthetic */ f b;
        public final /* synthetic */ String c;

        public a(String str, f fVar, String str2) {
            this.a = str;
            this.b = fVar;
            this.c = str2;
        }

        @Override // com.adsurge.adn.G0.b
        public void a(com.adsurge.adn.H0.a aVar, com.adsurge.adn.H0.b bVar) {
            try {
                try {
                    if (bVar.b() == 200) {
                        b.this.a(bVar, this.a, this.b);
                    }
                    b.this.a.remove(this.c);
                    this.b.a.countDown();
                } finally {
                    b.this.a.remove(this.c);
                    this.b.a.countDown();
                }
            } catch (Throwable unused) {
                String str = this.c;
                ConcurrentHashMap concurrentHashMap = b.this.a;
            }
        }

        @Override // com.adsurge.adn.G0.b
        public void a(com.adsurge.adn.H0.a aVar, Exception exc) {
            b.this.a.remove(this.c);
            this.b.a.countDown();
        }
    }

    public InputStream a(String str, String str2) {
        f fVar = new f();
        if (((f) this.a.putIfAbsent(str, fVar)) != null) {
            return null;
        }
        a(str, str2, fVar);
        return null;
    }

    public b(File file) {
        this.b = file;
    }

    public final void a(String str, String str2, f fVar) {
        com.adsurge.adn.R.c.a().a(new com.adsurge.adn.T.c(str, com.adsurge.adn.H0.a.EnumC0076a.GET, null), new a(str2, fVar, str));
    }

    public final void a(com.adsurge.adn.H0.b bVar, String str, f fVar) throws Throwable {
        byte[] bArrA = bVar.a();
        if (bArrA == null || bArrA.length <= 0) {
            return;
        }
        a(str, bArrA);
        fVar.b = true;
    }

    public void a(String str, byte[] bArr) throws Throwable {
        File file = new File(this.b, str);
        l.a(file, bArr);
        file.getName();
    }
}
