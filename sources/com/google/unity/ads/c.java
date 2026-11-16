package com.google.unity.ads;

import com.google.android.gms.ads.AdLoadCallback;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AdLoadCallback b;

    public /* synthetic */ c(AdLoadCallback adLoadCallback, int i) {
        this.a = i;
        this.b = adLoadCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AdLoadCallback adLoadCallback = this.b;
        switch (i) {
            case 0:
                ((Interstitial.AnonymousClass3) adLoadCallback).lambda$onAdLoaded$0();
                break;
            case 1:
                ((UnityAppOpenAd.AnonymousClass3) adLoadCallback).lambda$onAdLoaded$0();
                break;
            default:
                ((UnityRewardedAd.AnonymousClass3) adLoadCallback).lambda$onAdLoaded$0();
                break;
        }
    }
}
