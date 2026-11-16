package com.mbridge.msdk.newinterstitial.out;

import android.content.Context;
import com.mbridge.msdk.out.strategy.base.NonBidAdHandler;
import com.mbridge.msdk.out.strategy.component.ComponentStrategy;
import com.mbridge.msdk.out.strategy.legacy.interstitial.NewInterstitialStrategy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class MBNewInterstitialHandler extends NonBidAdHandler {
    @Override // com.mbridge.msdk.out.strategy.base.BaseAdHandler
    public void initStrategy(String str, String str2) {
        this.legacyVideoAdStrategy = new NewInterstitialStrategy(str2, str);
        this.componentAdStrategy = new ComponentStrategy(str2, str, 287);
    }

    public MBNewInterstitialHandler(Context context, String str, String str2) {
        super(context, str, str2);
    }

    public MBNewInterstitialHandler(String str, String str2) {
        super(str, str2);
    }
}
