package com.applovin.impl.mediation;

import androidx.annotation.NonNull;
import com.applovin.mediation.MaxReward;
import defpackage.nj;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class MaxRewardImpl implements MaxReward {
    private final String a;
    private final int b;

    public static MaxReward createDefault() {
        return create(0, "");
    }

    public static MaxReward create(int i, String str) {
        return new MaxRewardImpl(i, str);
    }

    @Override // com.applovin.mediation.MaxReward
    public final int getAmount() {
        return this.b;
    }

    @Override // com.applovin.mediation.MaxReward
    public final String getLabel() {
        return this.a;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("MaxReward{amount=");
        sb.append(this.b);
        sb.append(", label=");
        return nj.q(sb, this.a, "}");
    }

    private MaxRewardImpl(int i, String str) {
        if (i >= 0) {
            this.a = str;
            this.b = i;
        } else {
            defpackage.d.r("Reward amount must be greater than or equal to 0");
            throw null;
        }
    }
}
