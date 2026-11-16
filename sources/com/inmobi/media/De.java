package com.inmobi.media;

import android.view.View;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.nativeAd.MediaView;
import com.inmobi.media.ads.network.inmobiJson.model.Image;
import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import com.inmobi.media.ads.network.inmobiJson.model.NativeMedia;
import defpackage.az2;
import defpackage.cm2;
import defpackage.cz;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.gd1;
import defpackage.pv1;
import defpackage.s50;
import defpackage.s71;
import defpackage.tb5;
import defpackage.wz2;
import defpackage.xa0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class De extends AbstractC4558z implements Nk, InterfaceC4005f {
    public final Ed b;
    public final Jd c;
    public final AbstractC4035g1 d;
    public final cz e;
    public final C4504x f;
    public final gd1 g;

    public static final List b(De de) {
        return AbstractC3872a5.a("load_called", de.b.a.b.g);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(xa0 xa0Var, fy fyVar) {
        Be be;
        if (fyVar instanceof Be) {
            be = (Be) fyVar;
            int i = be.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                be.c = i - Integer.MIN_VALUE;
            } else {
                be = new Be(this, fyVar);
            }
        } else {
            be = new Be(this, fyVar);
        }
        Object objAwait = be.a;
        int i2 = be.c;
        try {
            if (i2 == 0) {
                wz2.a0(objAwait);
                be.c = 1;
                objAwait = xa0Var.await(be);
                Object obj = dz.a;
                if (objAwait == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wz2.a0(objAwait);
            }
            View view = (View) objAwait;
            Y9 y9L = l();
            if (y9L != null) {
                ((Z9) y9L).a("NativeLoadingState", "waitForAdChoiceView - ad choice view inflated successfully");
            }
            return view;
        } catch (Exception e) {
            Z9 z9 = this.b.a.a.c;
            if (z9 != null) {
                z9.b("NativeLoadingState", "AdChoiceView inflation failed: " + e);
            }
            return null;
        }
    }

    @Override // com.inmobi.media.Nk
    public final void c() {
        AbstractC4038g4.a(this.e);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public De(Ed ed, Jd jd) {
        String type;
        AbstractC4035g1 cd;
        NativeMedia media;
        super(ed.a);
        ed.getClass();
        jd.getClass();
        this.b = ed;
        this.c = jd;
        JsonAssetObject assetsObject = ed.b.getAssetsObject();
        cz czVar = ed.a.a.e;
        if (assetsObject != null && (media = assetsObject.getMedia()) != null) {
            type = media.getType();
        } else {
            type = null;
        }
        boolean zB = s71.b(type, "video");
        C4531y c4531y = ed.a;
        if (zB) {
            cd = new Bf(czVar, c4531y.a.c);
        } else {
            cd = new Cd(czVar, c4531y.a.c);
        }
        this.d = cd;
        this.e = AbstractC4318q5.a(k());
        C4531y c4531y2 = ed.a;
        JsonAssetObject assetsObject2 = ed.b.getAssetsObject();
        Image adChoice = assetsObject2 != null ? assetsObject2.getAdChoice() : null;
        c4531y2.getClass();
        this.f = new C4504x(c4531y2.a.b, adChoice, c4531y2.b.a.b.getNative().getAdChoiceConfig(), c4531y2.a.c);
        this.g = new cm2(new s50(this, 0));
    }

    @Override // com.inmobi.media.Nk
    public final void a() {
        Y9 y9L = l();
        if (y9L != null) {
            ((Z9) y9L).a("NativeLoadingState", "Initialize Called - starting inflation process");
        }
        tb5.t(this.e, null, null, new C4354re(this, null), 3);
    }

    @Override // com.inmobi.media.InterfaceC4005f
    public final Object a(dy dyVar) {
        Y9 y9L = l();
        if (y9L != null) {
            ((Z9) y9L).a("NativeLoadingState", "onDestroy");
        }
        Object objA = this.c.a(new Vd(), this, (fy) dyVar);
        return objA == dz.a ? objA : az2.a;
    }

    public static final Mk a(De de) {
        return new Mk(new Md(de.a.a.d, null, null, 30), new s50(de, 1));
    }

    public final void a(MediaView mediaView, View view, Nd nd) {
        Y9 y9L = l();
        if (y9L != null) {
            ((Z9) y9L).a("NativeLoadingState", "onInflateSuccess - transitioning to loaded state (mediaView: " + (mediaView != null) + ", adChoice: " + (view != null) + ")");
        }
        this.c.a(new C4327qe(mediaView, view, this.d, nd, this.b, this.c), this);
    }

    public final void a(short s) {
        Y9 y9L = l();
        if (y9L != null) {
            ((Z9) y9L).a("NativeLoadingState", pv1.k(s, "transitionToFailedState - errorCode: "));
        }
        this.c.a(new Xd(s, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), this.b, this.c), this);
    }
}
