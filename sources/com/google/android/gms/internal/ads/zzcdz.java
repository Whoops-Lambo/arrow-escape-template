package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcdz extends zzcds {
    public final RewardedAdLoadCallback a;
    public final zzcdv b;

    @Override // com.google.android.gms.internal.ads.zzcdt
    public final void zzf(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcdt
    public final void a(com.google.android.gms.ads.internal.client.zze zzeVar) {
        RewardedAdLoadCallback rewardedAdLoadCallback = this.a;
        if (rewardedAdLoadCallback != null) {
            rewardedAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdt
    public final void zze() {
        RewardedAdLoadCallback rewardedAdLoadCallback = this.a;
        if (rewardedAdLoadCallback != null) {
            rewardedAdLoadCallback.onAdLoaded(this.b);
        }
    }

    public zzcdz(RewardedAdLoadCallback rewardedAdLoadCallback, zzcdv zzcdvVar) {
        this.a = rewardedAdLoadCallback;
        this.b = zzcdvVar;
    }
}
