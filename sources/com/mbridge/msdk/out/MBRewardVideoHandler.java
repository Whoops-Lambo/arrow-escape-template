package com.mbridge.msdk.out;

import android.content.Context;
import com.mbridge.msdk.out.strategy.base.NonBidAdHandler;
import com.mbridge.msdk.out.strategy.component.ComponentStrategy;
import com.mbridge.msdk.out.strategy.legacy.reward.RewardVideoStrategy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class MBRewardVideoHandler extends NonBidAdHandler {
    private static final String TAG = "MBRewardVideoHandler";

    @Override // com.mbridge.msdk.out.strategy.base.BaseAdHandler
    public void initStrategy(String str, String str2) {
        this.legacyVideoAdStrategy = new RewardVideoStrategy(str2, str);
        this.componentAdStrategy = new ComponentStrategy(str2, str, 94);
    }

    public MBRewardVideoHandler(Context context, String str, String str2) {
        super(context, str, str2);
    }

    public MBRewardVideoHandler(String str, String str2) {
        super(str, str2);
    }
}
