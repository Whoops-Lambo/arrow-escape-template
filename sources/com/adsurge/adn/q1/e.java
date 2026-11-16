package com.adsurge.adn.q1;

import android.graphics.Bitmap;
import android.graphics.Movie;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.LruCache;
import android.widget.ImageView;
import com.adsurge.adn.I0.g;
import com.adsurge.adn.x1.l;
import com.ecffri.arrows.R;
import com.ironsource.R6;
import java.io.File;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class e implements Runnable {
    public static final ConcurrentHashMap n = new ConcurrentHashMap();
    public static final com.adsurge.adn.p039l1.c o = new com.adsurge.adn.l1.c.a().a(false).a(10000).b(10000).a();
    public static final LruCache p = new LruCache(5);
    public static Boolean q = null;
    public static final String r = com.adsurge.adn.s1.a.b().c().b("webppv", "imageView2/format/webp=");
    public static final String s = com.adsurge.adn.s1.a.b().c().b(R6.d, "imageView2/format/avif");
    public String a;
    public final WeakReference b;
    public final c c;
    public File d;
    public final boolean e;
    public final boolean f;
    public String g;
    public String h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public String m;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements Runnable {
        public final /* synthetic */ int a;
        public final /* synthetic */ Exception b;

        public a(int i, Exception exc) {
            this.a = i;
            this.b = exc;
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = e.this;
            c cVar = eVar.c;
            if (cVar != null) {
                cVar.a(eVar.a, this.a, this.b);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b implements Runnable {
        public final /* synthetic */ f.a a;

        public b(f.a aVar) {
            this.a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            ImageView imageView = (ImageView) e.this.b.get();
            f fVarA = this.a.a();
            e.this.a(imageView, fVarA);
            e eVar = e.this;
            c cVar = eVar.c;
            if (cVar != null) {
                cVar.a(eVar.a, imageView, fVarA);
            }
        }
    }

    public final f.a a() {
        com.adsurge.adn.M0.a aVarA;
        Movie movieA = com.adsurge.adn.x1.d.a(this.d);
        if (movieA != null) {
            return new f.a().a(movieA);
        }
        if (q.booleanValue() && (aVarA = com.adsurge.adn.x1.d.a(this.d, this.a)) != null) {
            return new f.a().a(aVarA);
        }
        Bitmap bitmapA = com.adsurge.adn.x1.d.a(this.d, (ImageView) this.b.get(), this.k && this.l);
        if (bitmapA == null) {
            return null;
        }
        p.put(c(), new SoftReference(bitmapA));
        return new f.a().a(bitmapA);
    }

    public final void b() throws com.adsurge.adn.p039l1.d {
        this.h = a(this.a);
        com.adsurge.adn.p042m1.f fVar = new com.adsurge.adn.p042m1.f(this.h, this.d, 1, o, false, this.g);
        int iD = d();
        com.adsurge.adn.w1.b.b(1402201, null, Integer.valueOf(iD));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zC = fVar.c();
        if (zC && iD > 100) {
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
            if (jElapsedRealtime2 > 1000) {
                jElapsedRealtime2 = 1000;
            }
            com.adsurge.adn.w1.b.a(9130065, (com.adsurge.adn.Y0.c) null, Integer.valueOf(iD), Integer.valueOf((int) (jElapsedRealtime2 / 10)), (com.adsurge.adn.Y0.d) null);
        }
        if (!zC) {
            throw new com.adsurge.adn.p039l1.d(fVar.f(), fVar.g());
        }
    }

    public final String c() {
        com.adsurge.adn.x1.d.a aVarA = com.adsurge.adn.x1.d.a((ImageView) this.b.get(), 0, 0);
        return this.m + "_" + aVarA.b() + "_" + aVarA.a();
    }

    public final int d() {
        int i;
        if (TextUtils.isEmpty(this.h) || !this.h.endsWith(s)) {
            i = this.j ? 1 : 2;
        } else {
            i = 3;
        }
        return (i * 10) + (this.e ? 1 : 0);
    }

    public final void f() {
        ConcurrentHashMap concurrentHashMap = n;
        Object obj = concurrentHashMap.get(this.m);
        if (obj != null) {
            synchronized (obj) {
                Object obj2 = concurrentHashMap.get(this.m);
                if (obj2 != null) {
                    try {
                        obj2.wait(5000L);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }

    public e(ImageView imageView, c cVar, boolean z, boolean z2) {
        this.i = true;
        this.b = new WeakReference(imageView);
        this.c = cVar;
        this.e = z;
        this.f = z2;
        if (q == null) {
            q = Boolean.valueOf(com.adsurge.adn.s1.a.b().c().a("eia", 1) == 1);
        }
    }

    public final Bitmap e() {
        Bitmap bitmap;
        String strC = c();
        LruCache lruCache = p;
        SoftReference softReference = (SoftReference) lruCache.get(strC);
        if (softReference != null) {
            bitmap = (Bitmap) softReference.get();
        } else {
            bitmap = null;
        }
        if (bitmap != null && !bitmap.isRecycled()) {
            return bitmap;
        }
        lruCache.remove(strC);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public void run() {
        Bitmap bitmapE;
        f();
        if (!this.e && (bitmapE = e()) != null) {
            a(new f.a().a(bitmapE), true);
            return;
        }
        if (!this.d.exists() || !b(true)) {
            if (TextUtils.isEmpty(this.a)) {
                a(32768, new Exception());
                return;
            }
            ConcurrentHashMap concurrentHashMap = n;
            concurrentHashMap.putIfAbsent(this.m, new Object());
            Object obj = concurrentHashMap.get(this.m);
            synchronized (obj) {
                try {
                    b();
                    b(false);
                    String str = this.m;
                    concurrentHashMap.remove(str);
                    this = str;
                } catch (com.adsurge.adn.p039l1.d e) {
                    a(e.a(), e);
                    ConcurrentHashMap concurrentHashMap2 = n;
                    String str2 = this.m;
                    concurrentHashMap2.remove(str2);
                    this = str2;
                } finally {
                    n.remove(this.m);
                    obj.notifyAll();
                }
            }
        }
    }

    public e(File file, ImageView imageView, c cVar, boolean z, Bitmap bitmap) {
        this(imageView, cVar, false, z);
        this.d = file;
        this.m = file.getAbsolutePath();
        a(imageView, bitmap);
    }

    public e(String str, ImageView imageView, c cVar, boolean z, boolean z2, Bitmap bitmap, String str2) {
        this(imageView, cVar, z, z2);
        this.a = str;
        this.j = str.contains(r);
        File file = new File(l.b(), l.b(str));
        this.d = file;
        this.m = file.getAbsolutePath();
        a(imageView, bitmap);
        this.g = str2;
    }

    public void a(boolean z) {
        this.i = z;
    }

    public final boolean b(boolean z) {
        if (this.e) {
            a(new f.a(), z);
            return true;
        }
        try {
            f.a aVarA = a();
            if (aVarA != null) {
                a(aVarA, z);
                return true;
            }
            if (z) {
                this.d.delete();
                return false;
            }
            a(102, new Exception("DecodeFailed"));
            return true;
        } catch (Exception unused) {
            a(102, new Exception("DecodeFailed"));
            return true;
        } catch (OutOfMemoryError e) {
            a(101, new Exception(e));
            return true;
        }
    }

    public final void a(ImageView imageView, Bitmap bitmap) {
        if (imageView == null) {
            return;
        }
        Object tag = imageView.getTag(R.mipmap.ic_launcher);
        if (tag == null || !tag.equals(this.m)) {
            imageView.setImageBitmap(bitmap);
            imageView.setTag(R.mipmap.ic_launcher, this.m);
        }
    }

    public final void a(int i, Exception exc) {
        c cVar;
        com.adsurge.adn.Y0.d dVar = new com.adsurge.adn.Y0.d();
        dVar.a("rs", this.a);
        com.adsurge.adn.w1.b.a(1402202, (com.adsurge.adn.Y0.c) null, Integer.valueOf(d()), Integer.valueOf(i), dVar);
        if (this.f && (cVar = this.c) != null) {
            cVar.a(this.a, i, exc);
        } else {
            g.a(new a(i, exc));
        }
    }

    public final void a(ImageView imageView, f fVar) {
        int iF;
        Object tag;
        if (imageView == null || (iF = fVar.f()) == 0) {
            return;
        }
        if (iF == 3) {
            imageView.setImageDrawable(fVar.c());
        } else if (iF == 1 && (tag = imageView.getTag(R.mipmap.ic_launcher)) != null && tag.equals(this.m)) {
            imageView.setImageBitmap(fVar.b());
        }
    }

    public final void a(f.a aVar, boolean z) {
        aVar.a(this.d);
        aVar.b(z);
        aVar.c(this.j);
        aVar.a(this.k);
        if (this.f && this.c != null) {
            f fVarA = aVar.a();
            this.c.a(this.a, (ImageView) this.b.get(), fVarA);
            return;
        }
        g.a(new b(aVar));
    }

    public final String a(String str) {
        return str;
    }
}
