package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.RewardedInterstitialAdShowListener;
import defpackage.s71;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class i implements RewardedInterstitialAdShowListener {
    public final j a;
    public final boolean b;
    public final f c;
    public final String d;
    public final boolean e;
    public final f f;
    public final com.moloco.sdk.acm.recorder.c g;
    public boolean h;

    public final void a(MolocoAd molocoAd) {
        String strName;
        if (this.h) {
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, "RewardedInterstitialAdShowListenerImpl", "issuing of reward is already handled", false, 4, null);
            return;
        }
        this.h = true;
        if (!s71.b(this.c.invoke(), Boolean.FALSE)) {
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, "RewardedInterstitialAdShowListenerImpl", "reward can't be issued: ad was forcibly closed or ad was missing", false, 4, null);
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n nVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n) this.f.invoke();
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "RewardedInterstitialAdShowListenerImpl", "issuing of reward... creativeType: " + nVar, false, 4, null);
        com.moloco.sdk.acm.e eVar = new com.moloco.sdk.acm.e("reward_issued");
        String lowerCase = (nVar == null || (strName = nVar.name()) == null) ? "UNKNOWN".toLowerCase(Locale.ROOT) : strName.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        eVar.a("creative_type", lowerCase);
        this.g.a(eVar);
        onUserRewarded(molocoAd);
    }

    public i(j jVar, boolean z, f fVar, String str, boolean z2, f fVar2, com.moloco.sdk.acm.recorder.c cVar) {
        str.getClass();
        this.a = jVar;
        this.b = z;
        this.c = fVar;
        this.d = str;
        this.e = z2;
        this.f = fVar2;
        this.g = cVar;
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public final void onAdClicked(MolocoAd molocoAd) {
        molocoAd.getClass();
        this.a.a.onAdClicked(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public final void onAdHidden(MolocoAd molocoAd) {
        molocoAd.getClass();
        a(molocoAd);
        this.a.a.onAdHidden(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public final void onAdShowFailed(MolocoAdError molocoAdError) {
        molocoAdError.getClass();
        this.a.onAdShowFailed(molocoAdError);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public final void onAdShowSuccess(MolocoAd molocoAd) {
        molocoAd.getClass();
        j jVar = this.a;
        jVar.a.onAdShowSuccess(molocoAd);
        if (this.b) {
            jVar.onRewardedVideoStarted(molocoAd);
        }
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public final void onRewardedVideoCompleted(MolocoAd molocoAd) {
        molocoAd.getClass();
        a(molocoAd);
        this.a.onRewardedVideoCompleted(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public final void onRewardedVideoStarted(MolocoAd molocoAd) {
        molocoAd.getClass();
        this.a.onRewardedVideoStarted(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public final void onUserRewarded(MolocoAd molocoAd) {
        molocoAd.getClass();
        this.a.onUserRewarded(molocoAd);
    }
}
