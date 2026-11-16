package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.appopen.AppOpenAd;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbhf extends zzbhm {
    public final AppOpenAd.AppOpenAdLoadCallback a;
    public final String b;

    @Override // com.google.android.gms.internal.ads.zzbhn
    public final void zzb(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbhn
    public final void M(zzbhk zzbhkVar) {
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.a;
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAdLoaded(new zzbhg(zzbhkVar, this.b));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhn
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.a;
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    public zzbhf(AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback, String str) {
        this.a = appOpenAdLoadCallback;
        this.b = str;
    }
}
