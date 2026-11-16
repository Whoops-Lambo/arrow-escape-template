package com.adsurge.adn.B1;

import android.text.TextUtils;
import com.adsurge.adn.Y0.d;
import com.adsurge.adn.p042m1.f;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class c implements Runnable {
    public final com.adsurge.adn.B1.b a;
    public com.adsurge.adn.p039l1.b b;
    public volatile boolean c;
    public b d;
    public a e;
    public final String f;
    public volatile f g;
    public final com.adsurge.adn.p039l1.c h;
    public volatile double i = 0.0d;
    public double j;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface a {
        void a(File file);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface b {
        void a(String str);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.c = true;
        a(false);
        if (this.i > this.j) {
            this.j = this.i;
            a(true);
        }
        b bVar = this.d;
        if (bVar != null) {
            bVar.a(this.f);
        }
        this.c = false;
    }

    public final void a(boolean z) {
        File file = (this.a.b() == null || TextUtils.isEmpty(this.a.d())) ? null : new File(this.a.b(), this.a.d());
        a aVar = this.e;
        if (aVar != null) {
            aVar.a(file);
        }
        this.g = new f(this.a.g(), file, this.a.k() ? 3 : 1, this.h, this.a.i(), this.a.f());
        this.g.a(this.b);
        this.g.a(this.j);
        this.g.b(z);
        if (this.a.i()) {
            com.adsurge.adn.w1.b.b(1402203, this.a.a(), Integer.valueOf(com.adsurge.adn.y1.a.a("vcrn")));
        }
        if (!this.g.c() && this.a.i()) {
            d dVar = new d();
            dVar.a("rs", this.a.g());
            com.adsurge.adn.w1.b.b(1402204, this.a.a(), Integer.valueOf(this.g.f()), dVar);
        }
        this.g.f();
        this.g.g();
    }

    public boolean b() {
        return this.c;
    }

    public c(String str, com.adsurge.adn.B1.b bVar, com.adsurge.adn.p039l1.b bVar2, com.adsurge.adn.p039l1.c cVar) {
        this.a = bVar;
        this.b = bVar2;
        this.f = str;
        this.h = cVar;
        this.j = bVar.c();
    }

    public com.adsurge.adn.B1.b a() {
        return this.a;
    }

    public void a(double d) {
        this.i = d;
    }

    public void a(com.adsurge.adn.p039l1.b bVar) {
        if (bVar != null) {
            this.b = bVar;
            if (this.g != null) {
                this.g.a(bVar);
            }
        }
    }

    public void a(b bVar) {
        this.d = bVar;
    }

    public void a(a aVar) {
        this.e = aVar;
    }
}
