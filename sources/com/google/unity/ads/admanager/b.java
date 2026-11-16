package com.google.unity.ads.admanager;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((UnityAdManagerBannerView.AnonymousClass1) obj2).lambda$onAdFailedToLoad$0((LoadAdError) obj);
                break;
            case 1:
                ((UnityAdManagerBannerView.AnonymousClass2) obj2).lambda$onPaidEvent$0((AdValue) obj);
                break;
            case 2:
                ((UnityAdManagerInterstitialAd.AnonymousClass1) obj2).lambda$onAdFailedToShowFullScreenContent$0((AdError) obj);
                break;
            case 3:
                ((UnityAdManagerInterstitialAd.AnonymousClass2) obj2).lambda$onPaidEvent$0((AdValue) obj);
                break;
            default:
                ((UnityAdManagerInterstitialAd.AnonymousClass4) obj2).lambda$onAdFailedToLoad$0((LoadAdError) obj);
                break;
        }
    }
}
