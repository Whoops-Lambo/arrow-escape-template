package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcef extends zzcds {
    public final RewardedInterstitialAdLoadCallback a;
    public final zzceg b;

    @Override // com.google.android.gms.internal.ads.zzcdt
    public final void zzf(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcdt
    public final void a(com.google.android.gms.ads.internal.client.zze zzeVar) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.a;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdt
    public final void zze() {
        zzceg zzcegVar;
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.a;
        if (rewardedInterstitialAdLoadCallback == null || (zzcegVar = this.b) == null) {
            return;
        }
        rewardedInterstitialAdLoadCallback.onAdLoaded(zzcegVar);
    }

    public zzcef(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, zzceg zzcegVar) {
        this.a = rewardedInterstitialAdLoadCallback;
        this.b = zzcegVar;
    }
}
