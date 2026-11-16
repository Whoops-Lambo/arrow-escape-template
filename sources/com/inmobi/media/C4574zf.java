package com.inmobi.media;

import android.view.View;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import com.inmobi.media.ads.nativeAd.MediaView;
import defpackage.az2;
import defpackage.ba0;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.tb5;
import defpackage.wg1;
import defpackage.wz2;
import defpackage.xc0;

/* JADX INFO: renamed from: com.inmobi.media.zf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4574zf implements Nk, Pi, InterfaceC4005f {
    public final View a;
    public final MediaView b;
    public final Uj c;
    public final AbstractC4035g1 d;
    public final C3983e5 e;
    public final Nd f;
    public final Ed g;
    public final Jd h;

    @Override // com.inmobi.media.Nk
    public final void c() {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.inmobi.media.InterfaceC4005f
    public final Object a(dy dyVar) throws Throwable {
        C4520xf c4520xf;
        if (dyVar instanceof C4520xf) {
            c4520xf = (C4520xf) dyVar;
            int i = c4520xf.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4520xf.c = i - Integer.MIN_VALUE;
            } else {
                c4520xf = new C4520xf(this, (fy) dyVar);
            }
        } else {
            c4520xf = new C4520xf(this, (fy) dyVar);
        }
        Object obj = c4520xf.a;
        int i2 = c4520xf.c;
        az2 az2Var = az2.a;
        dz dzVar = dz.a;
        if (i2 == 0) {
            wz2.a0(obj);
            AbstractC4035g1 abstractC4035g1 = this.d;
            AdSession adSession = abstractC4035g1.c;
            Y9 y9 = abstractC4035g1.b;
            if (adSession != null) {
                if (y9 != null) {
                    ((Z9) y9).a(AbstractC4035g1.f, "stopAdSession");
                }
                AbstractC4318q5.a(abstractC4035g1.a, new C3979e1(abstractC4035g1, null));
            } else if (y9 != null) {
                ((Z9) y9).a(AbstractC4035g1.f, "Failed to stopAdSession. adSession is null");
            }
            C4186ld c4186ld = (C4186ld) this.g.g.getValue();
            c4520xf.c = 1;
            c4186ld.getClass();
            ba0 ba0Var = xc0.a;
            Object objE = tb5.E(wg1.a, new C4130jd(c4186ld, null), c4520xf);
            if (objE != dzVar) {
                objE = az2Var;
            }
            if (objE != dzVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                wz2.a0(obj);
                return az2Var;
            }
            e32.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        wz2.a0(obj);
        this.e.b();
        Jd jd = this.h;
        Vd vd = new Vd();
        c4520xf.c = 2;
        return jd.a(vd, this, c4520xf) == dzVar ? dzVar : az2Var;
    }

    public C4574zf(View view, MediaView mediaView, Uj uj, AbstractC4035g1 abstractC4035g1, C3983e5 c3983e5, Nd nd, Ed ed, Jd jd) {
        uj.getClass();
        abstractC4035g1.getClass();
        c3983e5.getClass();
        nd.getClass();
        ed.getClass();
        jd.getClass();
        this.a = view;
        this.b = mediaView;
        this.c = uj;
        this.d = abstractC4035g1;
        this.e = c3983e5;
        this.f = nd;
        this.g = ed;
        this.h = jd;
    }

    @Override // com.inmobi.media.Pi
    public final void a(InMobiNativeViewData inMobiNativeViewData) {
        inMobiNativeViewData.getClass();
        this.h.a(new C4439uf(new C4466vf(this.c, new C4219mi(inMobiNativeViewData, this.b, this.a), this.e, this.d, this.f, this.g), this.h), this);
    }

    @Override // com.inmobi.media.Nk
    public final void a() {
        C3997ej c3997ej;
        Z9 z9 = this.g.a.a.c;
        if (z9 == null || (c3997ej = z9.a) == null) {
            return;
        }
        c3997ej.a();
    }
}
