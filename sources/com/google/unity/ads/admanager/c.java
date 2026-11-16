package com.google.unity.ads.admanager;

import com.google.android.gms.ads.admanager.AppEventListener;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ AppEventListener d;

    public /* synthetic */ c(AppEventListener appEventListener, String str, String str2, int i) {
        this.a = i;
        this.d = appEventListener;
        this.b = str;
        this.c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.c;
        String str2 = this.b;
        AppEventListener appEventListener = this.d;
        switch (i) {
            case 0:
                ((UnityAdManagerBannerView.AnonymousClass3) appEventListener).lambda$onAppEvent$0(str2, str);
                break;
            default:
                ((UnityAdManagerInterstitialAd.AnonymousClass3) appEventListener).lambda$onAppEvent$0(str2, str);
                break;
        }
    }
}
