package io.p071bidmachine.ads.networks.gam;

import android.content.Context;
import com.facebook.ads.a;
import com.facebook.internal.v;
import defpackage.h50;
import defpackage.nj;
import io.p071bidmachine.AdsFormat;
import io.p071bidmachine.ExpirationHandler;
import io.p071bidmachine.core.j;
import io.p071bidmachine.utils.i;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class m implements ExpirationHandler.Listener {
    public final i a;
    public final j b;
    public final AdsFormat c;
    public final l d;
    public final ExpirationHandler e;
    public volatile int f = 1;
    public WeakReference g;

    public abstract void b();

    public abstract void d(Context context, a aVar);

    public final void a(boolean z) {
        io.p071bidmachine.core.a.b(this.a, new g(this, 3));
        WeakReference weakReference = this.g;
        if (weakReference != null) {
            weakReference.clear();
            this.g = null;
        }
        this.e.stop();
        j jVar = this.b;
        if (!z) {
            jVar.f(this);
            return;
        }
        jVar.getClass();
        j.l(new v(this, 7));
        jVar.d(this);
    }

    public final n c() {
        WeakReference weakReference = this.g;
        if (weakReference != null) {
            return (n) weakReference.get();
        }
        return null;
    }

    public final void e() {
        io.p071bidmachine.core.a.b(this.a, new g(this, 5));
        this.f = 3;
        this.e.start();
    }

    public final void f() {
        io.p071bidmachine.core.a.b(this.a, new g(this, 1));
        this.b.d(this);
        this.f = 5;
        this.e.stop();
    }

    @Override // io.bidmachine.ExpirationHandler.Listener
    public final void onExpired() {
        int i = this.f;
        if (i == 0 || h50.C(i) < 4) {
            io.p071bidmachine.core.a.b(this.a, new g(this, 2));
            this.f = 6;
            n nVarC = c();
            if (nVarC != null) {
                ((io.p071bidmachine.iab.mraid.m) ((c) nVarC).a).a();
            }
            a(true);
            this.b.c(this.c);
        }
    }

    public final String toString() {
        return this.a + ", " + this.d;
    }

    public m(j jVar, AdsFormat adsFormat, l lVar) {
        this.a = new i(nj.q(new StringBuilder(), jVar.d, "Ad"));
        this.b = jVar;
        this.c = adsFormat;
        this.d = lVar;
        this.e = new ExpirationHandler(jVar.g, this);
    }
}
