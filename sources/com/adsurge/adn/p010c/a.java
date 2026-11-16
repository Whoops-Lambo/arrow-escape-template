package com.adsurge.adn.p010c;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.adsurge.adn.I0.g;
import com.adsurge.adn.X.j;
import com.adsurge.adn.X.l;
import com.adsurge.adn.X.o;
import com.adsurge.adn.ads.AdSurgeAdFormat;
import com.adsurge.adn.p021f1.d;
import com.adsurge.adn.x1.u;
import com.singular.sdk.internal.Constants;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class a implements d {
    public static final ConcurrentHashMap f = new ConcurrentHashMap();
    public static final AtomicBoolean g = new AtomicBoolean(false);
    public static final boolean h;
    public static final long i;
    public static final com.adsurge.adn.p016e.b j;
    public final com.adsurge.adn.u1.c a;
    public final com.adsurge.adn.p007b.c b = new com.adsurge.adn.p007b.c();
    public final com.adsurge.adn.p007b.c c = new com.adsurge.adn.p007b.c();
    public final f d;
    public final e e;

    /* JADX INFO: renamed from: com.adsurge.adn.c.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class C0101a implements l.g {
        @Override // com.adsurge.adn.X.l.g
        public boolean b() {
            return false;
        }

        @Override // com.adsurge.adn.X.l.g
        public boolean a() {
            if (a.f.isEmpty()) {
                return false;
            }
            a.f();
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            a.b();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            a.b();
        }
    }

    static {
        h = com.adsurge.adn.N.b.a("asdcvcr", 1, (AdSurgeAdFormat) null, (String) null) == 1;
        i = ((long) com.adsurge.adn.N.b.a("asdcvt", 10, (AdSurgeAdFormat) null, (String) null)) * 100;
        j = new com.adsurge.adn.p016e.c(com.adsurge.adn.s1.a.b().a());
        l.b().a(new C0101a());
    }

    public static boolean e() {
        for (Map.Entry entry : f.entrySet()) {
            Integer num = (Integer) entry.getKey();
            View view = (View) ((WeakReference) entry.getValue()).get();
            if (view == null) {
                f.remove(num);
            } else if (u.a(view, 1, true) && (!h || !((Boolean) u.b(view, 100).first).booleanValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.adsurge.adn.p010c.d
    public com.adsurge.adn.p007b.c a() {
        int[] iArrA;
        this.b.P = com.adsurge.adn.p010c.b.a(j.d());
        this.b.Q = com.adsurge.adn.p010c.b.a(o.v());
        String strY0 = this.a.y0();
        if (!TextUtils.isEmpty(strY0)) {
            com.adsurge.adn.p007b.c cVar = this.b;
            cVar.U = strY0;
            cVar.j = String.valueOf(this.a.A0());
        }
        this.b.r = String.valueOf(this.a.x().type);
        boolean zU0 = this.a.U0();
        com.adsurge.adn.p007b.c cVar2 = this.b;
        if (zU0) {
            cVar2.R = "1";
        } else {
            cVar2.R = "0";
        }
        int iZ0 = this.a.z0();
        boolean zV = this.a.a0().v();
        if (iZ0 == 3) {
            this.b.S = Constants.SdidMigrationStatusCodes.DID_NOT_SEND_START_SESSION_WITH_SDID_YET;
        } else {
            com.adsurge.adn.p007b.c cVar3 = this.b;
            if (iZ0 == 2) {
                cVar3.S = zV ? "5" : "2";
            } else {
                cVar3.S = zV ? "4" : "1";
            }
        }
        if (com.adsurge.adn.p007b.b.a && (iArrA = j.a()) != null && iArrA.length >= 2) {
            this.b.K = String.valueOf(iArrA[0]);
            this.b.L = String.valueOf(iArrA[1]);
        }
        return this.b;
    }

    public com.adsurge.adn.u1.c c() {
        return this.a;
    }

    public com.adsurge.adn.p007b.c d() {
        return this.c;
    }

    public a(int i2, View view, com.adsurge.adn.u1.c cVar) {
        this.a = cVar;
        f.put(Integer.valueOf(i2), new WeakReference(view));
        if (com.adsurge.adn.p007b.b.a) {
            com.adsurge.adn.p016e.b bVar = j;
            if (!bVar.b()) {
                bVar.start();
            }
        }
        f();
        this.d = new f(view, this, 0);
        this.e = new e(this);
    }

    public static void b() {
        a(e());
        if (l.b().c() && !f.isEmpty()) {
            g.a(new c(), i);
        } else {
            g.set(false);
        }
    }

    public static void f() {
        if (l.b().c() && g.compareAndSet(false, true)) {
            g.a(new b());
        }
    }

    public final void b(int i2) {
        this.c.T = String.valueOf(i2);
    }

    public void a(d dVar) {
        b(dVar.d);
        a(dVar.c);
    }

    public void a(MotionEvent motionEvent) {
        this.d.a(motionEvent, this.b);
    }

    public void a(String str) {
        this.c.X = str;
    }

    public final void a(int i2) {
        if (i2 > 0) {
            this.c.k = String.valueOf(i2);
        }
    }

    public static void a(boolean z) {
        if (z) {
            com.adsurge.adn.p016e.b bVar = j;
            if (bVar.b()) {
                return;
            }
            bVar.start();
            return;
        }
        com.adsurge.adn.p016e.b bVar2 = j;
        if (bVar2.b()) {
            bVar2.stop();
        }
    }
}
