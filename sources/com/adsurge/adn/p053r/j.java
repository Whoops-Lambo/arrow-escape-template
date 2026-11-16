package com.adsurge.adn.p053r;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.adsurge.adn.C1.e;
import com.adsurge.adn.ads.AdConfig;
import com.adsurge.adn.ads.BaseAdListener;
import com.adsurge.adn.ads.nativead.AdChoicesView;
import com.adsurge.adn.ads.nativead.MediaContent;
import com.adsurge.adn.ads.nativead.MediaView;
import com.adsurge.adn.ads.nativead.NativeAdView;
import com.adsurge.adn.p032j0.g;
import com.adsurge.adn.p036k1.h;
import com.adsurge.adn.p036k1.p;
import com.adsurge.adn.p036k1.q;
import com.adsurge.adn.p046o.d;
import com.adsurge.adn.x1.n;
import defpackage.dv2;
import defpackage.hl2;
import defpackage.ob3;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class j extends com.adsurge.adn.p053r.b {
    public static final int x = g.a(20.0d);
    public static final int y = g.a(20.0d);
    public final AdConfig q;
    public final com.adsurge.adn.p055s.b r;
    public NativeAdView s;
    public c t;
    public ImageView u;
    public final com.adsurge.adn.p055s.a v;
    public d w;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements com.adsurge.adn.p053r.a.InterfaceC0134a {
        public a() {
        }

        @Override // com.adsurge.adn.p053r.a.InterfaceC0134a
        public void c() {
            j.this.b(false);
            j.this.r.c();
        }

        @Override // com.adsurge.adn.p053r.a.InterfaceC0134a
        public void e() {
            j.this.a(false);
            j.this.r.e();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class c extends p {
        public final j q;

        public c(j jVar) {
            super(jVar.f, jVar.a);
            this.q = jVar;
        }

        @Override // com.adsurge.adn.p036k1.p
        public void a(com.adsurge.adn.p021f1.d dVar, com.adsurge.adn.p044n0.c cVar) {
            super.a(dVar, cVar);
            this.q.a(dVar, cVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AdConfig.AdLogoPosition.values().length];
            a = iArr;
            try {
                iArr[AdConfig.AdLogoPosition.TOP_RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[AdConfig.AdLogoPosition.BOTTOM_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[AdConfig.AdLogoPosition.BOTTOM_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[AdConfig.AdLogoPosition.TOP_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // com.adsurge.adn.p053r.b
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public NativeAdView h() {
        return this.s;
    }

    public final void B() {
        int i;
        ImageView imageView = (ImageView) this.s.findViewWithTag("ad_logo");
        this.u = imageView;
        if (imageView == null) {
            this.u = new ImageView(this.s.getContext());
            this.u.setImageBitmap(n.a("iVBORw0KGgoAAAANSUhEUgAAACoAAAAoCAYAAACIC2hQAAAAAXNSR0IArs4c6QAABORJREFUWEftl29Ia2Ucx888zvnCDLpOY4PbcrhemAU6NKIN/EdBmsyk5FIEKRjs7d74br4RwXcivlCwQohr4MamL8wuu7TRpVtbMypQRMviTK8KUUs6qzbie3p+4/F0zv7cViDswNjhnOf8fp/n+/vzPI9BuCaX4ZpwClXQSkeqqmhV0UorUGl7/0eOGotA/1HKpMoFJac1giDkOAdqZ/w4jNW7YIPsFAQuFZQc1zKP9P8nc8Q7U0NirBYsfcPb0IUtBZSHhFOCBDMpAmf40UXjAIifqCFplj3TsvEP4FJByXGtLMtvm0ymR+AkGAwGR0dHv2fApAzAFBVlWZ6ksTxoLpfLZDKZ9MnJycna2lrC7/f/zCbKT/gKbDFQqAnHdXAeCARuejweDzlNpVL7Vqv1Y0EQYBTKkKrKxPhJ6SZpLpfZ29v7vL29/UsVbNmgcApQoyRJgxaL5SlyCmUGBwc/iEQiv2iEXpRl+S0omkqlfpiZmbmH74xGY85ms9X19PTc6O7udpLiiUTijtPp/FYPthRF61ko62RZfgOGd3Z2EgMDA0/X1NSYYrHYXbfbDQfIOSoQJQo0/vj4+MBms33CxlBuC319ffWhUOiVhoaGG5i0x+N5PxwOXwqC8DsDzqtaCBRhp9w0bW5utg0NDb0IL2NjY6GlpaXnmpubW9LptNTY2BhmxklsFA8UVSbGQCNsIlREGCt6vd5HFxYWXsWkDw4OvnA4HFAeKQTYDBksBRRhr5ckqQ9hPzs7e9DS0nJ3ZWXFMjk56Yah/v7+dyORCJTgLzXoHaboFVDAnp+fe5qamh5nkw6ynL+iaiFQExWR1+s1Ly4u3gLF+vr6/fHx8e86OjqMu7u7Q1AikUjcczqdX3GhVdoRKcoVHaUHUoRaV108Hn+2q6vreYRfFMWVckAp7EoRRaPRdpfL1Uth39jY+A33+/v73Q6Ho/Xi4uLUbDaHVKuVFih1B77firx9g8GwyCYs83mqpyhA80VEoUH1Wq3WTwXh75PB7OyseXp6uh/3U1NTt5eXl3/lVAXoLVb11MagqHpheGjQK0Xk9Xofo7Ank8lvtre3H5AcZrPZSHmKd52dnZ+xdwBCjr7OgaKYkHe0Ev3r0F8Jezwe70T+6DVsvqeKorjGjyNQVvW6xSRJ0ssWi+VmucVEoAh9vhdiyUun0+rKVrhQsfhfXV3dmpiYOCVYFSi1J7ymylfaE0VM1fRJfaWXauVoPj/n5+etPp9vDAO3trY+Gh4e/lFL2Ww2+yaq/+jo6Gu73X5fB7Rgw4cQc3NzG36//6dSG34eVJKkl9A7Wdt4j6tqJQcJ6PDw8IXW1tYOjOvt7b0djUYVFbgczS+heN7W1lY7MjLyhN1ufwYT5ITYK2cJzeco7X5UfRB2qQ/iXgwEAlbarLDwQ3nsnpSqL5TfmFwymYwVWucLhb42Go0+6XK5XsOgWCz2odvtljhF+V2SUr3ZbPYdqMMVRH5lUoMC7vLy8uL09DTl8/mS4XAYfZm2eGS76O5JvVEmP2SA74N4p971025eb8NM9rQ2ztS6St4488eJfAdiN7wR/uDG7/z5CeidmbSOIvhO8zhSyjaPQAsdvrROmryyemla8cNdsX6v9b7YMVlXPS1jxRR9GMD/5JsqaKVlrSpaVbTSClTa3rXJ0b8Ank92RwRnkTgAAAAASUVORK5CYII="));
            this.s.addView(this.u, new FrameLayout.LayoutParams(x, y));
            this.u.setTag("ad_logo");
        }
        ViewGroup viewGroup = (ViewGroup) this.u.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.u);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.u.getLayoutParams();
        if (layoutParams != null) {
            AdConfig adConfig = this.q;
            if (adConfig == null || (i = b.a[adConfig.adLogoPosition.ordinal()]) == 1) {
                layoutParams.gravity = 53;
            } else if (i == 2) {
                layoutParams.gravity = 83;
            } else if (i != 3) {
                layoutParams.gravity = 51;
            } else {
                layoutParams.gravity = 85;
            }
        }
        this.s.addView(this.u);
        this.u.bringToFront();
    }

    public boolean C() {
        e eVar = this.g;
        return eVar != null && eVar.isPlaying();
    }

    public void D() {
        if (this.g == null || this.f.o()) {
            return;
        }
        this.g.pause();
    }

    public void E() {
        if (this.g == null || this.f.o()) {
            return;
        }
        if (TextUtils.isEmpty(this.g.getVideoPath())) {
            this.g.setDataSource(this.a.D0());
        }
        this.g.play();
    }

    public final /* synthetic */ void b(View view) {
        com.adsurge.adn.p021f1.d dVar = new com.adsurge.adn.p021f1.d(this.a);
        dVar.c = a(view);
        dVar.b = "";
        a(dVar, new com.adsurge.adn.p044n0.c(1, ""));
    }

    @Override // com.adsurge.adn.p053r.b
    public p f() {
        if (this.t == null) {
            this.t = new c(this);
        }
        return this.t;
    }

    @Override // com.adsurge.adn.p053r.b
    public com.adsurge.adn.p037l.a i() {
        d dVar = new d(this.a, new hl2(this, 28), this);
        this.w = dVar;
        return dVar;
    }

    @Override // com.adsurge.adn.p053r.b
    public List l() {
        LinkedList linkedList = new LinkedList(super.l());
        linkedList.add(this.w);
        linkedList.add(this.r);
        return linkedList;
    }

    @Override // com.adsurge.adn.p053r.b
    public List n() {
        LinkedList linkedList = new LinkedList(super.n());
        linkedList.add(this.w);
        linkedList.add(new ob3(this, 3));
        linkedList.add(this.r);
        return linkedList;
    }

    @Override // com.adsurge.adn.p053r.b
    public void t() {
        ((NativeAdView) this.e).setVisibilityChangedListener(new a());
    }

    public final void x() {
        MediaView mediaView = this.s.getMediaView();
        if (mediaView == null) {
            super.a();
        } else {
            mediaView.removeAllViews();
            mediaView.addView(this.f.k());
        }
    }

    public AdChoicesView y() {
        return this.v.a();
    }

    public MediaContent z() {
        return this.r;
    }

    public j(com.adsurge.adn.u1.c cVar, AdConfig adConfig, Context context) {
        super(cVar);
        this.q = adConfig;
        this.r = new com.adsurge.adn.p055s.b(cVar, this);
        this.v = new com.adsurge.adn.p055s.a(context, this.a);
    }

    public final void a(com.adsurge.adn.p021f1.d dVar, com.adsurge.adn.p044n0.c cVar) {
        BaseAdListener baseAdListener;
        com.adsurge.adn.u1.c cVarA = dVar.a();
        com.adsurge.adn.p010c.a aVarD = com.adsurge.adn.p007b.a.d().d(this.e);
        if (aVarD != null) {
            aVarD.a(com.adsurge.adn.p055s.e.a((NativeAdView) this.e, y(), this.u));
        }
        this.j.b(dVar, cVar, b(this.b.b()));
        if (cVarA != null) {
            baseAdListener = cVarA.C0;
        } else {
            baseAdListener = null;
        }
        if (baseAdListener != null) {
            baseAdListener.onAdClicked(cVarA.B0);
        }
        q qVar = this.f;
        if (qVar != null) {
            qVar.a(dVar.c);
        }
    }

    @Override // com.adsurge.adn.p053r.b
    public void c() {
        super.c();
    }

    public boolean d(long j) {
        this.f.a(b(j));
        return true;
    }

    @Override // com.adsurge.adn.p053r.b
    public h j() {
        boolean z;
        h hVarJ = super.j();
        AdConfig adConfig = this.q;
        if (adConfig != null && adConfig.mute == AdConfig.SoundState.UNMUTED) {
            z = true;
        } else {
            z = false;
        }
        return hVarJ.f(z).c(this.a.U()).b(com.adsurge.adn.N.d.b().c());
    }

    @Override // com.adsurge.adn.p053r.b
    public void b(boolean z) {
        this.b.e();
    }

    public void a(NativeAdView nativeAdView) {
        this.s = nativeAdView;
        if (this.f == null) {
            a(nativeAdView.getContext(), true);
        }
        x();
        this.u = (ImageView) this.s.findViewWithTag("ad_logo");
        B();
        com.adsurge.adn.r1.a.a(com.adsurge.adn.Y0.c.a(this.a));
    }

    public void a(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setOnClickListener(new dv2(this, 6));
        }
    }

    public final int a(View view) {
        NativeAdView nativeAdView = this.s;
        if (nativeAdView != null && view != null) {
            if (view == nativeAdView.getHeadLineView()) {
                return 1;
            }
            if (view == this.s.getBodyView()) {
                return 2;
            }
            if (view == this.s.getIconView()) {
                return 3;
            }
            if (view == this.s.getCallToActionView()) {
                return 4;
            }
            if (view == this.s.getMediaView()) {
                return 5;
            }
            if (view == y()) {
                return 6;
            }
        }
        return 0;
    }

    @Override // com.adsurge.adn.p053r.b
    public void a() {
    }

    @Override // com.adsurge.adn.p053r.b
    public void a(boolean z) {
        this.b.d();
    }
}
