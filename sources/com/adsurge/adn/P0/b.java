package com.adsurge.adn.P0;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class b {
    public static final String u = "b";
    public static final int v = com.adsurge.adn.F0.b.b().a("alspaf", 500);
    public static final boolean w;
    public static final Rect x;
    public final int a;
    public final com.adsurge.adn.S0.b b;
    public final Handler c;
    public int f;
    public final Set h;
    public final AtomicBoolean i;
    public final Runnable j;
    public int k;
    public final Set l;
    public final Object m;
    public Map n;
    public ByteBuffer o;
    public volatile Rect p;
    public com.adsurge.adn.R0.f q;
    public com.adsurge.adn.R0.d r;
    public boolean s;
    public volatile k t;
    public List d = new ArrayList();
    public int e = -1;
    public Integer g = null;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.i.get()) {
                return;
            }
            if (!b.this.a()) {
                b.this.p();
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jO = b.this.o();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
            b bVar = b.this;
            bVar.c.removeCallbacks(bVar.j);
            b.this.c.postDelayed(this, Math.max(0L, jO - jElapsedRealtime2));
            for (j jVar : b.this.h) {
                ByteBuffer byteBuffer = b.this.o;
                if (byteBuffer != null) {
                    jVar.a(byteBuffer);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.adsurge.adn.P0.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class RunnableC0088b implements Runnable {
        public final /* synthetic */ j a;

        public RunnableC0088b(j jVar) {
            this.a = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.h.add(this.a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class c implements Runnable {
        public final /* synthetic */ j a;

        public c(j jVar) {
            this.a = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.h.remove(this.a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.h.size() == 0) {
                b.this.p();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class e implements Runnable {
        public final /* synthetic */ Thread a;

        public e(Thread thread) {
            this.a = thread;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    if (b.this.p == null) {
                        b bVar = b.this;
                        com.adsurge.adn.R0.d dVar = bVar.r;
                        if (dVar == null) {
                            bVar.r = bVar.a(bVar.b.a());
                        } else {
                            dVar.reset();
                        }
                        b bVar2 = b.this;
                        bVar2.a(bVar2.b(bVar2.r));
                    }
                    LockSupport.unpark(this.a);
                } catch (Exception e) {
                    e.printStackTrace();
                    b.this.p = b.x;
                    LockSupport.unpark(this.a);
                } catch (OutOfMemoryError e2) {
                    b.this.p = b.x;
                    com.adsurge.adn.L0.a.a(7, e2);
                    throw e2;
                }
            } catch (Throwable th) {
                LockSupport.unpark(this.a);
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.i();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.j();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b bVar = b.this;
            bVar.f = 0;
            bVar.e = -1;
            bVar.s = false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class i implements Runnable {
        public final /* synthetic */ int a;
        public final /* synthetic */ boolean b;

        public i(int i, boolean z) {
            this.a = i;
            this.b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.j();
            try {
                b bVar = b.this;
                bVar.k = this.a;
                bVar.a(bVar.b(bVar.a(bVar.b.a())));
                if (this.b) {
                    b.this.i();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (OutOfMemoryError e2) {
                com.adsurge.adn.L0.a.a(9, e2);
                throw e2;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface j {
        void a();

        void a(ByteBuffer byteBuffer);

        void b();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum k {
        IDLE,
        RUNNING,
        INITIALIZING,
        FINISHING
    }

    public abstract com.adsurge.adn.R0.d a(com.adsurge.adn.R0.d dVar);

    public abstract void a(com.adsurge.adn.P0.a aVar);

    public abstract Rect b(com.adsurge.adn.R0.d dVar);

    public abstract int e();

    public abstract com.adsurge.adn.R0.f h();

    public abstract void l();

    public Bitmap b(int i2, int i3) {
        synchronized (this.m) {
            try {
                Iterator it = this.l.iterator();
                Bitmap bitmapCreateBitmap = null;
                while (it.hasNext()) {
                    int i4 = i2 * i3 * 4;
                    Bitmap bitmap = (Bitmap) it.next();
                    if (bitmap != null && bitmap.getAllocationByteCount() >= i4) {
                        it.remove();
                        if (bitmap.getWidth() != i2 || bitmap.getHeight() != i3) {
                            if (i2 > 0 && i3 > 0) {
                                bitmap.reconfigure(i2, i3, Bitmap.Config.ARGB_8888);
                            }
                        }
                        bitmap.eraseColor(0);
                        return bitmap;
                    }
                    bitmapCreateBitmap = bitmap;
                }
                if (i2 <= 0 || i3 <= 0) {
                    return null;
                }
                try {
                    try {
                        bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                    } catch (OutOfMemoryError e2) {
                        e2.printStackTrace();
                    }
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
                return bitmapCreateBitmap;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Rect c() {
        if (this.p == null) {
            if (this.t == k.FINISHING) {
                Log.e(u, "In finishing,do not interrupt");
            }
            Thread threadCurrentThread = Thread.currentThread();
            this.c.post(new e(threadCurrentThread));
            int i2 = v;
            if (i2 > 0) {
                LockSupport.parkUntil(threadCurrentThread, i2);
            } else {
                LockSupport.park(threadCurrentThread);
            }
        }
        return this.p == null ? x : this.p;
    }

    public int d() {
        return this.d.size();
    }

    public final int f() {
        Integer num = this.g;
        return num != null ? num.intValue() : e();
    }

    public int g() {
        return this.k;
    }

    public final void i() {
        this.i.compareAndSet(true, false);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            if (d() == 0) {
                try {
                    com.adsurge.adn.R0.d dVar = this.r;
                    if (dVar == null) {
                        this.r = a(this.b.a());
                    } else {
                        dVar.reset();
                    }
                    a(b(this.r));
                } catch (OutOfMemoryError e2) {
                    e2.printStackTrace();
                    com.adsurge.adn.L0.a.a(8, e2);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            String str = u;
            Log.i(str, b() + " Set state to RUNNING,cost " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
            this.t = k.RUNNING;
            if (f() != 0 && this.s) {
                Log.i(str, b() + " No need to started");
                return;
            }
            this.e = -1;
            this.c.removeCallbacks(this.j);
            this.j.run();
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                ((j) it.next()).b();
            }
        } catch (Throwable th2) {
            Log.i(u, b() + " Set state to RUNNING,cost " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
            this.t = k.RUNNING;
            throw th2;
        }
    }

    public final void j() {
        this.c.removeCallbacks(this.j);
        this.d.clear();
        synchronized (this.m) {
            try {
                for (Bitmap bitmap : this.l) {
                    if (bitmap != null && !bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                }
                this.l.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.o != null) {
            this.o = null;
        }
        this.n.clear();
        try {
            com.adsurge.adn.R0.d dVar = this.r;
            if (dVar != null) {
                dVar.close();
                this.r = null;
            }
            com.adsurge.adn.R0.f fVar = this.q;
            if (fVar != null) {
                fVar.close();
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        l();
        this.t = k.IDLE;
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((j) it.next()).a();
        }
    }

    public boolean k() {
        return this.t == k.RUNNING || this.t == k.INITIALIZING;
    }

    public void m() {
        this.c.post(new h());
    }

    public void n() {
        if (this.p == x) {
            return;
        }
        if (this.t != k.RUNNING) {
            k kVar = this.t;
            k kVar2 = k.INITIALIZING;
            if (kVar != kVar2) {
                if (this.t == k.FINISHING) {
                    Log.e(u, b() + " Processing,wait for finish at " + this.t);
                }
                this.t = kVar2;
                if (Looper.myLooper() == this.c.getLooper()) {
                    i();
                    return;
                } else {
                    this.c.post(new f());
                    return;
                }
            }
        }
        Log.i(u, b() + " Already started");
    }

    public final long o() {
        int i2 = this.e + 1;
        this.e = i2;
        if (i2 >= d()) {
            this.e = 0;
            this.f++;
        }
        com.adsurge.adn.P0.a aVarA = a(this.e);
        if (aVarA == null) {
            return 0L;
        }
        a(aVarA);
        return aVarA.f;
    }

    public void p() {
        if (this.p == x) {
            return;
        }
        k kVar = this.t;
        k kVar2 = k.FINISHING;
        if (kVar == kVar2 || this.t == k.IDLE) {
            Log.i(u, b() + "No need to stop");
            return;
        }
        if (this.t == k.INITIALIZING) {
            Log.e(u, b() + "Processing,wait for finish at " + this.t);
        }
        this.t = kVar2;
        if (Looper.myLooper() == this.c.getLooper()) {
            j();
        } else {
            this.c.post(new g());
        }
    }

    public void q() {
        this.c.post(new d());
    }

    static {
        boolean z;
        if ((com.adsurge.adn.F0.b.b().a("apgreo", 7) & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        w = z;
        x = new Rect();
    }

    public b(com.adsurge.adn.S0.b bVar, j jVar) {
        HashSet hashSet = new HashSet();
        this.h = hashSet;
        this.i = new AtomicBoolean(true);
        this.j = new a();
        this.k = 1;
        this.l = new HashSet();
        this.m = new Object();
        this.n = new WeakHashMap();
        this.q = h();
        this.r = null;
        this.s = false;
        this.t = k.IDLE;
        this.b = bVar;
        if (jVar != null) {
            hashSet.add(jVar);
        }
        int iA = com.adsurge.adn.Q0.a.b().a();
        this.a = iA;
        this.c = new Handler(com.adsurge.adn.Q0.a.b().a(iA));
    }

    public final boolean a() {
        if (!k() || d() == 0) {
            return false;
        }
        if (f() <= 0 || this.f < f() - 1) {
            return true;
        }
        if (this.f == f() - 1 && this.e < d() - 1) {
            return true;
        }
        this.s = true;
        return false;
    }

    public int c(int i2, int i3) {
        int iA = a(i2, i3);
        if (iA != g()) {
            boolean zK = k();
            this.c.removeCallbacks(this.j);
            this.c.post(new i(iA, zK));
        }
        return iA;
    }

    public void a(Bitmap bitmap) {
        synchronized (this.m) {
            if (bitmap != null) {
                try {
                    this.l.add(bitmap);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void a(j jVar) {
        this.c.post(new RunnableC0088b(jVar));
    }

    public final void a(Rect rect) {
        this.p = rect;
        if (this.o == null || !w) {
            this.o = ByteBuffer.allocate((((rect.height() * rect.width()) / (g() * g())) + 1) * 4);
        }
        if (this.q == null) {
            this.q = h();
        }
    }

    public int a(int i2, int i3) {
        int i4 = 1;
        if (i2 != 0 && i3 != 0) {
            int iMin = Math.min(c().width() / i2, c().height() / i3);
            while (true) {
                int i5 = i4 * 2;
                if (i5 > iMin) {
                    break;
                }
                i4 = i5;
            }
        }
        return i4;
    }

    public com.adsurge.adn.P0.a a(int i2) {
        if (i2 < 0 || i2 >= this.d.size()) {
            return null;
        }
        return (com.adsurge.adn.P0.a) this.d.get(i2);
    }

    public void b(j jVar) {
        this.c.post(new c(jVar));
    }

    public final String b() {
        return "";
    }

    public void b(int i2) {
        this.g = Integer.valueOf(i2);
    }
}
