package com.moloco.sdk.publisher;

import android.app.Activity;
import defpackage.zr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements zr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ a(Activity activity, int i) {
        this.a = i;
        this.b = activity;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Activity activity = this.b;
        switch (i) {
            case 0:
                return BannerActivitySample.onCreate$lambda$0((BannerActivitySample) activity, (Banner) obj, (MolocoAdError.AdCreateError) obj2);
            case 1:
                return InterstitialAdActivitySample.onCreate$lambda$0((InterstitialAdActivitySample) activity, (InterstitialAd) obj, (MolocoAdError.AdCreateError) obj2);
            default:
                return RewardedInterstitialAdSample.onCreate$lambda$0((RewardedInterstitialAdSample) activity, (RewardedInterstitialAd) obj, (MolocoAdError.AdCreateError) obj2);
        }
    }
}
