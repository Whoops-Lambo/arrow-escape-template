package com.inmobi.media;

import android.content.Context;
import android.media.MediaPlayer;
import android.widget.RelativeLayout;
import defpackage.at;
import defpackage.ba0;
import defpackage.cz;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.kc2;
import defpackage.lp1;
import defpackage.nl2;
import defpackage.qb5;
import defpackage.tb5;
import defpackage.wz2;
import defpackage.xc0;
import defpackage.y80;
import defpackage.ye2;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class Te implements InterfaceC3991ed {
    public final cz a;
    public final C4003ep b;
    public final Z9 c;
    public final ArrayList d;
    public final cz e;
    public final AtomicBoolean f;
    public Kh g;
    public final lp1 h;
    public final RelativeLayout i;
    public final MediaPlayer j;
    public final C3910bf k;
    public final C4421tp l;
    public final Dp m;
    public final Se n;
    public final lp1 o;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ArrayList arrayList, fy fyVar) {
        Re re;
        if (fyVar instanceof Re) {
            re = (Re) fyVar;
            int i = re.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                re.c = i - Integer.MIN_VALUE;
            } else {
                re = new Re(this, fyVar);
            }
        } else {
            re = new Re(this, fyVar);
        }
        Object objA = re.a;
        int i2 = re.c;
        if (i2 == 0) {
            wz2.a0(objA);
            if (this.g != Kh.STATE_INITIALIZED) {
                throw new C3964dd();
            }
            this.g = Kh.STATE_PREPARING;
            AbstractC4318q5.a(this.h, this.a, Po.a);
            Z9 z9 = this.c;
            if (z9 != null) {
                z9.a("NativeMediaPlayer", "Media Player Load started");
            }
            MediaPlayer mediaPlayer = this.j;
            Z9 z10 = this.c;
            re.c = 1;
            objA = AbstractC3892ap.a(mediaPlayer, arrayList, z10, re);
            dz dzVar = dz.a;
            if (objA == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(objA);
        }
        Qo qo = (Qo) objA;
        Z9 z11 = this.c;
        if (z11 != null) {
            z11.a("NativeMediaPlayer", "Media Player Load Status " + qo);
        }
        if (!(qo instanceof Ro)) {
            if (!(qo instanceof No)) {
                io.p071bidmachine.ads.networks.adaptiverendering.e.b();
                return null;
            }
            this.g = Kh.STATE_ERROR;
            AbstractC4318q5.a(this.h, this.a, new C3947co());
            throw new C3964dd();
        }
        AbstractC4318q5.a(this.h, this.a, new So(((Ro) qo).a));
        this.g = Kh.STATE_PREPARED;
        MediaPlayer mediaPlayer2 = this.j;
        mediaPlayer2.getClass();
        try {
            mediaPlayer2.seekTo(0);
        } catch (IllegalStateException unused) {
        }
        Dp dp = this.m;
        Se se = this.n;
        dp.getClass();
        se.getClass();
        AbstractC4318q5.a(dp.a, new C4584zp(dp, se, null));
        C3910bf c3910bf = this.k;
        AbstractC4318q5.a(c3910bf.b, new Xe(c3910bf, null));
        return this.i;
    }

    public Te(Context context, cz czVar, C4003ep c4003ep, Z9 z9) {
        context.getClass();
        czVar.getClass();
        c4003ep.getClass();
        this.a = czVar;
        this.b = c4003ep;
        this.c = z9;
        this.d = new ArrayList();
        nl2 nl2VarA = tb5.a();
        ba0 ba0Var = xc0.a;
        this.e = kc2.a(qb5.l(nl2VarA, y80.c));
        this.f = new AtomicBoolean(false);
        this.g = Kh.STATE_INITIALIZED;
        ye2 ye2VarB = at.b(0, 0, 7);
        this.h = ye2VarB;
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.i = relativeLayout;
        Context context2 = relativeLayout.getContext();
        context2.getClass();
        MediaPlayer mediaPlayerA = AbstractC4031fp.a(context2);
        this.j = mediaPlayerA;
        this.k = new C3910bf(relativeLayout, czVar, mediaPlayerA, c4003ep, ye2VarB);
        this.l = new C4421tp(mediaPlayerA, czVar, c4003ep.c.f, ye2VarB);
        this.m = new Dp(czVar, mediaPlayerA, relativeLayout, c4003ep, z9);
        this.n = new Se(this);
        this.o = ye2VarB;
    }

    public final void a() {
        if (this.f.compareAndSet(false, true)) {
            Z9 z9 = this.c;
            if (z9 != null) {
                z9.a("NativeMediaPlayer", "destroy called");
            }
            this.g = Kh.STATE_DESTROYED;
            AbstractC4318q5.a(this.d);
            this.m.b();
            C3910bf c3910bf = this.k;
            c3910bf.g.removeAllViews();
            c3910bf.f.d();
            this.l.c();
            this.i.removeAllViews();
            tb5.t(this.e, null, null, new Pe(this, null), 3);
        }
    }
}
