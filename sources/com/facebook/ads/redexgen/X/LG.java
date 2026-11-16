package com.facebook.ads.redexgen.X;

import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public abstract class LG implements InterfaceC2805en {
    public int A00;
    public long A01;
    public RewardData A02;

    public abstract int A0I();

    public abstract AbstractC2831fD A0J();

    public abstract boolean A0K();

    public final void A00(int i) {
        this.A00 = i;
    }

    public final void A01(long j) {
        this.A01 = j;
    }

    public final void A02(RewardData rewardData) {
        this.A02 = rewardData;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2805en
    public final AdPlacementType A9N() {
        return AdPlacementType.REWARDED_VIDEO;
    }
}
