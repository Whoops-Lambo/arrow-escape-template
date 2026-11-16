package com.adsurge.adn.p022g;

import android.content.Context;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.adsurge.adn.I0.g;
import com.adsurge.adn.ads.AdConfig;
import com.adsurge.adn.ads.AdSurgeAd;
import com.adsurge.adn.ads.AdSurgeAdError;
import com.adsurge.adn.ads.AdSurgeAdFormat;
import com.adsurge.adn.ads.banner.BannerAdListener;
import com.adsurge.adn.p036k1.j;
import com.adsurge.adn.p059u.d;
import com.adsurge.adn.p059u.e;
import com.adsurge.adn.x1.t;
import defpackage.nb3;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class b extends com.adsurge.adn.p053r.a {
    public e d;
    public d e;
    public final com.adsurge.adn.p022g.a f;
    public com.adsurge.adn.Q.a g;
    public AdConfig h;
    public Map i;
    public com.adsurge.adn.p053r.d j;
    public long k;
    public boolean l;
    public final Runnable m;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements BannerAdListener {
        public a() {
        }

        @Override // com.adsurge.adn.ads.banner.BannerAdListener, com.adsurge.adn.ads.BaseAdListener
        public void onAdFailed(AdSurgeAdError adSurgeAdError) {
            b bVar = b.this;
            bVar.postDelayed(bVar.m, bVar.k * 1000);
        }

        @Override // com.adsurge.adn.ads.banner.BannerAdListener, com.adsurge.adn.ads.BaseAdListener
        public void onAdLoaded(AdSurgeAd adSurgeAd) {
            com.adsurge.adn.p053r.d dVar;
            if (!b.this.isAttachedToWindow() || (dVar = b.this.j) == null) {
                return;
            }
            dVar.A();
            b.this.j.z();
        }
    }

    /* JADX INFO: renamed from: com.adsurge.adn.g.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class C0111b implements BannerAdListener {
        public C0111b() {
        }

        @Override // com.adsurge.adn.ads.banner.BannerAdListener, com.adsurge.adn.ads.BaseAdListener
        public void onAdLoaded(AdSurgeAd adSurgeAd) {
            com.adsurge.adn.p053r.d dVar = b.this.j;
            if (dVar != null) {
                dVar.c();
            }
            b bVar = b.this;
            bVar.j = new com.adsurge.adn.p053r.d(bVar, (com.adsurge.adn.u1.c) bVar.g, bVar.m);
            b bVar2 = b.this;
            bVar2.j.a(bVar2.getContext(), true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class c implements d {
        @Override // com.adsurge.adn.p059u.d
        public void a(List list) {
            Pair pair = (Pair) list.get(0);
            b bVar = b.this;
            com.adsurge.adn.Q.a aVar = (com.adsurge.adn.Q.a) pair.second;
            bVar.g = aVar;
            com.adsurge.adn.p031j.b.a((com.adsurge.adn.u1.c) aVar, bVar.i);
            b bVar2 = b.this;
            bVar2.k = bVar2.g.p();
            b.this.f.onAdLoaded((AdSurgeAd) pair.first);
            b bVar3 = b.this;
            ((com.adsurge.adn.u1.c) bVar3.g).C0 = bVar3.f;
        }

        public c() {
        }

        @Override // com.adsurge.adn.p059u.d
        public void a(com.adsurge.adn.p059u.b bVar) {
            b.this.f.onAdFailed(bVar.a());
        }
    }

    public final void a() {
        this.f.a(new C0111b());
        this.e = new c();
    }

    public final /* synthetic */ void b() {
        removeCallbacks(this.m);
        this.f.a();
        com.adsurge.adn.p053r.d dVar = this.j;
        if (dVar != null) {
            dVar.c();
            this.j = null;
        }
        this.d = null;
        t.a(this);
        this.l = true;
    }

    public final /* synthetic */ void c() {
        if (this.l) {
            return;
        }
        this.f.c(new a());
        loadAd(this.h, this.i);
    }

    public void destroy() {
        g.c(new nb3(this, 1));
    }

    public void loadAd(AdConfig adConfig, Map<String, Object> map) {
        this.h = adConfig;
        this.i = map;
        this.d.a(adConfig, AdSurgeAdFormat.BANNER, this.e);
    }

    public void setListener(@NonNull BannerAdListener bannerAdListener) {
        this.f.b(bannerAdListener);
    }

    static {
        j.a().a(com.adsurge.adn.p006a1.a.UNIFIED_BANNER);
    }

    public b(Context context, String str) {
        super(context);
        this.f = new com.adsurge.adn.p022g.a();
        this.l = false;
        this.m = new nb3(this, 0);
        a();
        this.d = e.a(str);
    }

    public void loadAd(AdConfig adConfig) {
        loadAd(adConfig, null);
    }
}
