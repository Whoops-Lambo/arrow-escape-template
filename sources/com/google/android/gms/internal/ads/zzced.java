package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewarded.RewardItem;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzced extends zzcdi {
    public final String a;
    public final int b;

    public zzced(RewardItem rewardItem) {
        this(rewardItem != null ? rewardItem.getType() : "", rewardItem != null ? rewardItem.getAmount() : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzcdj
    public final String zze() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzcdj
    public final int zzf() {
        return this.b;
    }

    public zzced(String str, int i) {
        this.a = str;
        this.b = i;
    }
}
