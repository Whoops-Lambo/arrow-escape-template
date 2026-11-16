package com.mbridge.msdk.newinterstitial.out;

import android.content.Context;
import com.mbridge.msdk.out.strategy.base.BidAdHandler;
import com.mbridge.msdk.out.strategy.component.BidComponentStrategy;
import com.mbridge.msdk.out.strategy.legacy.interstitial.BidNewInterstitialStrategy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class MBBidNewInterstitialHandler extends BidAdHandler {
    @Override // com.mbridge.msdk.out.strategy.base.BaseAdHandler
    public void initStrategy(String str, String str2) {
        this.legacyBidVideoAdStrategy = new BidNewInterstitialStrategy(str2, str);
        this.componentBidVideoAdStrategy = new BidComponentStrategy(str2, str, 287);
    }

    public MBBidNewInterstitialHandler(Context context, String str, String str2) {
        super(context, str, str2);
    }

    public MBBidNewInterstitialHandler(String str, String str2) {
        super(str, str2);
    }
}
