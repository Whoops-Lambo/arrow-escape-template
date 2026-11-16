package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.AdConfig;
import com.vungle.ads.BaseAd;
import com.vungle.ads.VungleAdSize;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class h0 extends BaseAd {
    public final VungleAdSize s;
    public final i0 t;

    public final i0 a() {
        return this.t;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(Context context, String str, VungleAdSize vungleAdSize, AdConfig adConfig) {
        super(context, str, adConfig);
        context.getClass();
        str.getClass();
        vungleAdSize.getClass();
        adConfig.getClass();
        this.s = vungleAdSize;
        r adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        adInternal$vungle_ads_release.getClass();
        this.t = ((j0) adInternal$vungle_ads_release).a(new g0(this));
    }

    @Override // com.vungle.ads.BaseAd
    public final r constructAdInternal$vungle_ads_release(Context context) {
        context.getClass();
        return new j0(context, this.s);
    }

    public final VungleAdSize getAdViewSize() {
        r adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        adInternal$vungle_ads_release.getClass();
        return ((j0) adInternal$vungle_ads_release).k();
    }
}
