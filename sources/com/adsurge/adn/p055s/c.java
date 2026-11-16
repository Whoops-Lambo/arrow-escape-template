package com.adsurge.adn.p055s;

import android.content.Context;
import android.util.Pair;
import com.adsurge.adn.I0.g;
import com.adsurge.adn.ads.AdConfig;
import com.adsurge.adn.ads.AdSurgeAd;
import com.adsurge.adn.ads.AdSurgeAdFormat;
import com.adsurge.adn.ads.nativead.AdChoicesView;
import com.adsurge.adn.ads.nativead.INativeAd;
import com.adsurge.adn.ads.nativead.Image;
import com.adsurge.adn.ads.nativead.MediaContent;
import com.adsurge.adn.ads.nativead.NativeAdListener;
import com.adsurge.adn.ads.nativead.NativeAdView;
import com.adsurge.adn.p006a1.a;
import com.adsurge.adn.p053r.j;
import com.adsurge.adn.p059u.d;
import com.adsurge.adn.p059u.e;
import com.adsurge.adn.p059u.i;
import com.adsurge.adn.w1.b;
import defpackage.qb3;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class c implements INativeAd, d {
    public final Context a;
    public final String b;
    public final e c;
    public com.adsurge.adn.u1.c e;
    public Image f;
    public j g;
    public AdConfig h;
    public final d d = new d();
    public boolean i = true;

    @Override // com.adsurge.adn.p059u.d
    public void a(List list) {
        Pair pair = (Pair) list.get(0);
        com.adsurge.adn.u1.c cVar = (com.adsurge.adn.u1.c) pair.second;
        this.e = cVar;
        cVar.C0 = this.d;
        this.g = new j(this.e, this.h, this.a);
        this.f = new Image(this.e.M(), this.e.N() / this.e.L());
        this.i = true;
        this.d.onAdLoaded((AdSurgeAd) pair.first);
    }

    @Override // com.adsurge.adn.ads.nativead.INativeAd
    public void destroy() {
        g.c(new qb3(this, 5));
    }

    @Override // com.adsurge.adn.ads.nativead.INativeAd
    public AdChoicesView getAdChoicesView() {
        j jVar = this.g;
        if (jVar == null) {
            return null;
        }
        return jVar.y();
    }

    @Override // com.adsurge.adn.ads.nativead.INativeAd
    public String getBody() {
        com.adsurge.adn.u1.c cVar = this.e;
        return cVar == null ? "" : cVar.H();
    }

    @Override // com.adsurge.adn.ads.nativead.INativeAd
    public String getCallToAction() {
        com.adsurge.adn.u1.c cVar = this.e;
        return cVar == null ? "" : cVar.D();
    }

    @Override // com.adsurge.adn.ads.nativead.INativeAd
    public String getHeadline() {
        com.adsurge.adn.u1.c cVar = this.e;
        return cVar == null ? "" : cVar.K();
    }

    @Override // com.adsurge.adn.ads.nativead.INativeAd
    public Image getIcon() {
        return this.f;
    }

    @Override // com.adsurge.adn.ads.nativead.INativeAd
    public MediaContent getMediaContent() {
        j jVar = this.g;
        if (jVar == null) {
            return null;
        }
        return jVar.z();
    }

    @Override // com.adsurge.adn.ads.nativead.INativeAd
    public String getRewardType() {
        com.adsurge.adn.Q.g gVarA0;
        com.adsurge.adn.Q.c cVarF;
        com.adsurge.adn.u1.c cVar = this.e;
        return (cVar == null || (gVarA0 = cVar.a0()) == null || (cVarF = gVarA0.f()) == null) ? "" : cVarF.g();
    }

    @Override // com.adsurge.adn.ads.nativead.INativeAd
    public void loadAd(AdConfig adConfig, NativeAdListener nativeAdListener) {
        this.d.a(nativeAdListener);
        this.c.a(adConfig, AdSurgeAdFormat.NATIVE, this);
        this.h = adConfig;
    }

    @Override // com.adsurge.adn.ads.nativead.INativeAd
    public void registerViewForInteraction(NativeAdView nativeAdView, List list) {
        j jVar;
        com.adsurge.adn.u1.c cVar = this.e;
        boolean z = cVar == null;
        com.adsurge.adn.Y0.c cVarA = z ? new com.adsurge.adn.Y0.c().e(this.b).a(AdSurgeAdFormat.NATIVE.type) : com.adsurge.adn.Y0.c.a(cVar);
        if (this.i) {
            this.i = false;
            b.a(6000100, cVarA);
        }
        if (nativeAdView == null) {
            com.adsurge.adn.p059u.b bVarA = i.a(5003, "NativeAdView is null");
            com.adsurge.adn.u1.c cVar2 = this.e;
            this.d.onAdShowFailed(cVar2 != null ? cVar2.B0 : new AdSurgeAd.NoAd(AdSurgeAdFormat.NATIVE, this.b), bVarA.a());
            b.c(6000101, cVarA, 3);
            return;
        }
        if (!z && (jVar = this.g) != null) {
            jVar.a(nativeAdView);
            this.g.a(list);
        } else {
            com.adsurge.adn.p059u.b bVarA2 = i.a(5000);
            com.adsurge.adn.u1.c cVar3 = this.e;
            this.d.onAdShowFailed(cVar3 != null ? cVar3.B0 : new AdSurgeAd.NoAd(AdSurgeAdFormat.NATIVE, this.b), bVarA2.a());
            b.c(6000101, cVarA, 0);
        }
    }

    static {
        com.adsurge.adn.p036k1.j.a().a(a.NATIVEUNIFIEDAD);
    }

    public c(Context context, String str) {
        this.a = context;
        this.b = str;
        this.c = e.a(str);
    }

    public final /* synthetic */ void a() {
        j jVar = this.g;
        if (jVar != null) {
            jVar.c();
            this.g = null;
        }
        this.e = null;
        this.f = null;
        this.h = null;
        this.i = true;
        this.d.a();
    }

    @Override // com.adsurge.adn.p059u.d
    public void a(com.adsurge.adn.p059u.b bVar) {
        this.d.onAdFailed(bVar.a());
    }
}
