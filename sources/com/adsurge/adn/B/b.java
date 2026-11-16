package com.adsurge.adn.B;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.adsurge.adn.G.e;
import com.adsurge.adn.X.x;
import com.adsurge.adn.lib.dysi.IAdSurgeBridge;
import defpackage.nj2;
import defpackage.pl1;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class b {
    public static final AtomicBoolean h = new AtomicBoolean(b());
    public static final long i = a();
    public volatile com.adsurge.adn.F.d f;
    public final com.adsurge.adn.E.c a = com.adsurge.adn.E.c.a();
    public final com.adsurge.adn.H.a b = new com.adsurge.adn.H.a();
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final c d = new c();
    public final com.adsurge.adn.C.b e = new com.adsurge.adn.C.b();
    public final ExecutorService g = Executors.newSingleThreadExecutor(new pl1(1));

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements Callable {
        public final /* synthetic */ com.adsurge.adn.u1.c a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ com.adsurge.adn.Y0.c e;

        public a(com.adsurge.adn.u1.c cVar, String str, String str2, String str3, com.adsurge.adn.Y0.c cVar2) {
            this.a = cVar;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = cVar2;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.adsurge.adn.B.a call() {
            if (b.this.f == null || !b.this.f.c()) {
                return null;
            }
            b.this.b.a(this.a);
            try {
                Object objA = b.this.f.a(String.format("typeof %1$s[%2$s]==='function'?JSON.stringify(%1$s[%2$s](%3$s,%4$s,%5$s)||{}):null", "AdSurgeBizFunctions", this.c, b.this.a.b().a(), b.this.a.c(this.b).a(), this.d));
                com.adsurge.adn.B.a aVar = objA != null ? new com.adsurge.adn.B.a(String.valueOf(objA)) : null;
                b.this.b.b(this.a);
                return aVar;
            } catch (Throwable th) {
                try {
                    b.a(6002009, this.e, 1, th);
                    return null;
                } finally {
                    b.this.b.b(this.a);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.adsurge.adn.B.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class C0064b {
        public static final b a = new b();
    }

    public static b c() {
        return C0064b.a;
    }

    public JSONObject a(String str, JSONObject jSONObject, com.adsurge.adn.u1.c cVar, Map map) {
        FutureTask cVar2;
        if (!h.get()) {
            return new JSONObject();
        }
        com.adsurge.adn.Y0.c cVarA = cVar != null ? com.adsurge.adn.Y0.c.a(cVar) : null;
        com.adsurge.adn.w1.b.a(6002006, cVarA);
        String strH = cVar != null ? cVar.h() : null;
        a aVar = new a(cVar, strH, JSONObject.quote(str), jSONObject != null ? jSONObject.toString() : new JSONObject().toString(), cVarA);
        if (this.f instanceof com.adsurge.adn.F.a) {
            cVar2 = new FutureTask(aVar);
        } else {
            if (!(this.f instanceof e)) {
                return new JSONObject();
            }
            cVar2 = new com.adsurge.adn.G.c(aVar, (e) this.f);
        }
        this.g.execute(cVar2);
        try {
            com.adsurge.adn.B.a aVar2 = (com.adsurge.adn.B.a) cVar2.get(i, TimeUnit.MILLISECONDS);
            if (aVar2 == null) {
                return new JSONObject();
            }
            this.a.a(strH, aVar2.c());
            this.e.a(aVar2.a(), map, cVar);
            com.adsurge.adn.w1.b.a(6002007, cVarA);
            return aVar2.b();
        } catch (Exception e) {
            cVar2.cancel(false);
            if (e instanceof TimeoutException) {
                h.set(false);
                com.adsurge.adn.w1.b.c(6002008, cVarA, 1);
            }
            return new JSONObject();
        }
    }

    public void b(int i2) {
        if (i2 == 1) {
            x.b("dybs", 1);
        } else {
            x.a("dybs");
            h.set(false);
        }
    }

    public void d() {
        if (h.get() && this.c.compareAndSet(false, true)) {
            this.g.submit(new nj2(this, 28));
        }
    }

    public void f() {
        this.d.a(com.adsurge.adn.N.b.a("dybju", ""));
    }

    public final /* synthetic */ void e() {
        try {
            String strA = this.d.a();
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            com.adsurge.adn.w1.b.a(6002003, (com.adsurge.adn.Y0.c) null);
            com.adsurge.adn.F.e.d().a((com.adsurge.adn.Y0.c) null);
            this.f = com.adsurge.adn.F.d.a();
            if (this.f == null) {
                com.adsurge.adn.w1.b.c(6002005, null, 1);
                return;
            }
            boolean z = this.f instanceof com.adsurge.adn.F.a;
            com.adsurge.adn.F.d dVar = this.f;
            if (z) {
                dVar.a("AdSurgeBridge", IAdSurgeBridge.class, this.b);
            } else {
                boolean z2 = dVar instanceof e;
                com.adsurge.adn.F.d dVar2 = this.f;
                if (z2) {
                    ((e) dVar2).a("AdSurgeBridge", IAdSurgeBridge.class, this.b, com.adsurge.adn.G.b.CURRENT);
                } else {
                    dVar2.getClass();
                    return;
                }
            }
            this.f.a(strA);
            com.adsurge.adn.w1.b.a(6002004, (com.adsurge.adn.Y0.c) null);
        } catch (Throwable th) {
            a(6002005, (com.adsurge.adn.Y0.c) null, 2, th);
        }
    }

    public static boolean b() {
        int iA = x.a("dybs", 0);
        x.a("dybs");
        return iA == 1;
    }

    public static long a() {
        int iA = x.a("dybat", 0);
        x.a("dybat");
        if (iA > 0) {
            return iA;
        }
        return 3000L;
    }

    public void a(int i2) {
        if (i2 > 0) {
            x.b("dybat", i2);
        } else {
            x.a("dybat");
        }
    }

    public static /* synthetic */ Thread a(Runnable runnable) {
        return new Thread(runnable, "ADSURGE_DYBIZJS_THREAD");
    }

    public static void a(int i2, com.adsurge.adn.Y0.c cVar, int i3, Throwable th) {
        com.adsurge.adn.w1.b.b(i2, cVar, Integer.valueOf(i3), new com.adsurge.adn.Y0.d().a(NotificationCompat.CATEGORY_MESSAGE, th.getMessage() != null ? th.getMessage() : th.getClass().getSimpleName()));
    }
}
