package com.google.unity.ads;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.preload.PreloadCallbackV2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PreloadCallbackV2 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e(PreloadCallbackV2 preloadCallbackV2, String str, Object obj, int i) {
        this.a = i;
        this.b = preloadCallbackV2;
        this.c = str;
        this.d = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.d;
        String str = this.c;
        PreloadCallbackV2 preloadCallbackV2 = this.b;
        switch (i) {
            case 0:
                ((UnityAppOpenAdPreloader.AnonymousClass1) preloadCallbackV2).lambda$onAdPreloaded$0(str, (ResponseInfo) obj);
                break;
            case 1:
                ((UnityAppOpenAdPreloader.AnonymousClass1) preloadCallbackV2).lambda$onAdFailedToPreload$0(str, (AdError) obj);
                break;
            case 2:
                ((UnityInterstitialAdPreloader.AnonymousClass1) preloadCallbackV2).lambda$onAdPreloaded$0(str, (ResponseInfo) obj);
                break;
            case 3:
                ((UnityInterstitialAdPreloader.AnonymousClass1) preloadCallbackV2).lambda$onAdFailedToPreload$0(str, (AdError) obj);
                break;
            case 4:
                ((UnityRewardedAdPreloader.AnonymousClass1) preloadCallbackV2).lambda$onAdFailedToPreload$0(str, (AdError) obj);
                break;
            default:
                ((UnityRewardedAdPreloader.AnonymousClass1) preloadCallbackV2).lambda$onAdPreloaded$0(str, (ResponseInfo) obj);
                break;
        }
    }
}
