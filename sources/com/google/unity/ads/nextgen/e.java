package com.google.unity.ads.nextgen;

import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import com.google.android.libraries.ads.mobile.sdk.common.ResponseInfo;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e(Object obj, String str, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = str;
        this.d = obj2;
    }

    private final void a() {
        ((UnityAppOpenAdPreloader.AnonymousClass1) this.b).lambda$onAdFailedToPreload$0(this.c, (LoadAdError) this.d);
    }

    private final void c() {
        ((UnityAppOpenAdPreloader.AnonymousClass1) this.b).lambda$onAdPreloaded$0(this.c, (ResponseInfo) this.d);
    }

    private final void d() {
        ((UnityBannerAdPreloader.AnonymousClass1) this.b).lambda$onAdFailedToPreload$0(this.c, (LoadAdError) this.d);
    }

    private final void e() {
        ((UnityBannerAdPreloader.AnonymousClass1) this.b).lambda$onAdPreloaded$0(this.c, (ResponseInfo) this.d);
    }

    private final void f() {
        ((UnityInterstitialAdPreloader.AnonymousClass1) this.b).lambda$onAdFailedToPreload$0(this.c, (LoadAdError) this.d);
    }

    private final void g() {
        ((UnityInterstitialAdPreloader.AnonymousClass1) this.b).lambda$onAdPreloaded$0(this.c, (ResponseInfo) this.d);
    }

    private final void h() {
        ((UnityRewardedAdPreloader.AnonymousClass1) this.b).lambda$onAdPreloaded$0(this.c, (ResponseInfo) this.d);
    }

    private final void i() {
        ((UnityRewardedAdPreloader.AnonymousClass1) this.b).lambda$onAdFailedToPreload$0(this.c, (LoadAdError) this.d);
    }

    private final void j() {
        ((UnityRewardedInterstitialAdPreloader.AnonymousClass1) this.b).lambda$onAdFailedToPreload$0(this.c, (LoadAdError) this.d);
    }

    private final void k() {
        ((UnityRewardedInterstitialAdPreloader.AnonymousClass1) this.b).lambda$onAdPreloaded$0(this.c, (ResponseInfo) this.d);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.d;
        String str = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                a();
                break;
            case 1:
                c();
                break;
            case 2:
                ((UnityBannerAd.AnonymousClass1.C03111) obj2).lambda$onAppEvent$0(str, (String) obj);
                break;
            case 3:
                d();
                break;
            case 4:
                e();
                break;
            case 5:
                ((UnityInterstitialAd.AnonymousClass2) obj2).lambda$onAppEvent$0(str, (String) obj);
                break;
            case 6:
                f();
                break;
            case 7:
                g();
                break;
            case 8:
                h();
                break;
            case 9:
                i();
                break;
            case 10:
                j();
                break;
            default:
                k();
                break;
        }
    }
}
