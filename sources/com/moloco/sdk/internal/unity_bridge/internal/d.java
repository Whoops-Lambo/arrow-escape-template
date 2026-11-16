package com.moloco.sdk.internal.unity_bridge.internal;

import android.os.Handler;
import com.moloco.sdk.internal.unity_bridge.MolocoUnityShowCallback;
import com.moloco.sdk.publisher.InterstitialAdShowListener;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import defpackage.y93;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class d implements InterstitialAdShowListener {
    public final /* synthetic */ Handler a;
    public final /* synthetic */ MolocoUnityShowCallback b;

    public d(Handler handler, MolocoUnityShowCallback molocoUnityShowCallback) {
        this.a = handler;
        this.b = molocoUnityShowCallback;
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public final void onAdClicked(MolocoAd molocoAd) {
        molocoAd.getClass();
        this.a.post(new c(this.b, molocoAd, 1));
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public final void onAdHidden(MolocoAd molocoAd) {
        molocoAd.getClass();
        this.a.post(new c(this.b, molocoAd, 0));
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public final void onAdShowFailed(MolocoAdError molocoAdError) {
        molocoAdError.getClass();
        this.a.post(new y93(28, this.b, molocoAdError));
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public final void onAdShowSuccess(MolocoAd molocoAd) {
        molocoAd.getClass();
        this.a.post(new c(this.b, molocoAd, 2));
    }
}
