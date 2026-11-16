package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.MolocoAdKt;
import defpackage.az2;
import defpackage.sr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g implements sr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;

    public /* synthetic */ g(i iVar, int i) {
        this.a = i;
        this.b = iVar;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.a;
        az2 az2Var = az2.a;
        i iVar = this.b;
        switch (i) {
            case 0:
                if (!iVar.e) {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "RewardedInterstitialAdShowListenerImpl", "onCloseOrSkipButtonShown called - skip button shown but reward requires user click (feature flag disabled)", null, false, 12, null);
                } else {
                    MolocoLogger.debug$default(MolocoLogger.INSTANCE, "RewardedInterstitialAdShowListenerImpl", "onCloseOrSkipButtonShown called - attempt issue reward as skip button is now available (feature flag enabled)", false, 4, null);
                    iVar.a(MolocoAdKt.createAdInfo$default(iVar.d, null, null, 6, null));
                }
                break;
            default:
                MolocoLogger.debug$default(MolocoLogger.INSTANCE, "RewardedInterstitialAdShowListenerImpl", "onIssueReward called - attempt issue reward as requested by the creative", false, 4, null);
                iVar.a(MolocoAdKt.createAdInfo$default(iVar.d, null, null, 6, null));
                break;
        }
        return az2Var;
    }
}
