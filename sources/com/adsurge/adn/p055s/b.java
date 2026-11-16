package com.adsurge.adn.p055s;

import android.text.TextUtils;
import android.view.View;
import com.adsurge.adn.C1.c;
import com.adsurge.adn.X.B;
import com.adsurge.adn.ads.nativead.MediaContent;
import com.adsurge.adn.ads.nativead.VideoLifecycleCallbacks;
import com.adsurge.adn.p053r.a;
import com.adsurge.adn.p053r.j;
import com.adsurge.adn.p057t.f;
import com.adsurge.adn.x1.u;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class b implements MediaContent, c, B.a, View.OnAttachStateChangeListener, a.InterfaceC0134a {
    public final com.adsurge.adn.u1.c a;
    public final j b;
    public final f c = new f(this);
    public final int d;
    public VideoLifecycleCallbacks e;
    public View f;

    @Override // com.adsurge.adn.p053r.a.InterfaceC0134a
    public void c() {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f = null;
        this.c.i();
    }

    @Override // com.adsurge.adn.X.B.a
    public boolean a(long j) {
        this.c.a(u.a(this.f, this.d, true));
        return false;
    }

    @Override // com.adsurge.adn.C1.c
    public void b() {
        this.c.b();
        VideoLifecycleCallbacks videoLifecycleCallbacks = this.e;
        if (videoLifecycleCallbacks != null) {
            videoLifecycleCallbacks.onVideoEnd();
        }
    }

    @Override // com.adsurge.adn.C1.c
    public void d() {
        this.c.d();
    }

    @Override // com.adsurge.adn.p053r.a.InterfaceC0134a
    public void e() {
        this.c.i();
    }

    @Override // com.adsurge.adn.C1.c
    public void f() {
        this.c.f();
    }

    @Override // com.adsurge.adn.C1.c
    public void g() {
        this.c.g();
        VideoLifecycleCallbacks videoLifecycleCallbacks = this.e;
        if (videoLifecycleCallbacks != null) {
            videoLifecycleCallbacks.onVideoPlay();
        }
    }

    @Override // com.adsurge.adn.ads.nativead.MediaContent
    public float getAspectRatio() {
        float fT0;
        int iS0;
        boolean zX0 = this.a.X0();
        com.adsurge.adn.u1.c cVar = this.a;
        if (zX0) {
            fT0 = cVar.f0();
            iS0 = this.a.c0();
        } else {
            fT0 = cVar.t0();
            iS0 = this.a.s0();
        }
        return fT0 / iS0;
    }

    @Override // com.adsurge.adn.ads.nativead.MediaContent
    public float getDuration() {
        return this.a.a();
    }

    @Override // com.adsurge.adn.C1.c
    public void h() {
        this.c.h();
        VideoLifecycleCallbacks videoLifecycleCallbacks = this.e;
        if (videoLifecycleCallbacks != null) {
            videoLifecycleCallbacks.onVideoPlay();
        }
    }

    @Override // com.adsurge.adn.ads.nativead.MediaContent
    public boolean hasVideoContent() {
        return !TextUtils.isEmpty(this.a.D0());
    }

    @Override // com.adsurge.adn.C1.c
    public void j() {
        this.c.j();
    }

    @Override // com.adsurge.adn.C1.c
    public void l() {
        this.c.l();
    }

    @Override // com.adsurge.adn.C1.c
    public void o() {
        this.c.o();
        VideoLifecycleCallbacks videoLifecycleCallbacks = this.e;
        if (videoLifecycleCallbacks != null) {
            videoLifecycleCallbacks.onVideoEnd();
        }
    }

    @Override // com.adsurge.adn.C1.c
    public void onVideoPause() {
        this.c.onVideoPause();
        VideoLifecycleCallbacks videoLifecycleCallbacks = this.e;
        if (videoLifecycleCallbacks != null) {
            videoLifecycleCallbacks.onVideoPause();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f = view;
    }

    @Override // com.adsurge.adn.ads.nativead.MediaContent
    public void pause() {
        this.c.c();
    }

    @Override // com.adsurge.adn.ads.nativead.MediaContent
    public void play() {
        this.c.e();
    }

    @Override // com.adsurge.adn.ads.nativead.MediaContent
    public void setVideoLifecycleCallbacks(VideoLifecycleCallbacks videoLifecycleCallbacks) {
        this.e = videoLifecycleCallbacks;
    }

    public String toString() {
        return "MediaContentImpl{aspectRatio=" + getAspectRatio() + ", hasVideoContent=" + hasVideoContent() + ", duration=" + getDuration() + '}';
    }

    public b(com.adsurge.adn.u1.c cVar, j jVar) {
        this.a = cVar;
        this.b = jVar;
        this.d = com.adsurge.adn.N.b.a("namevira", 50, cVar);
    }

    @Override // com.adsurge.adn.C1.c
    public void a(int i, Exception exc) {
        this.c.a(i, exc);
        VideoLifecycleCallbacks videoLifecycleCallbacks = this.e;
        if (videoLifecycleCallbacks != null) {
            videoLifecycleCallbacks.onVideoEnd();
        }
    }
}
