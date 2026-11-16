package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.flow.j0;
import com.fyber.inneractive.sdk.flow.x;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class NativeAdImageContentController extends j0 {
    @Override // com.fyber.inneractive.sdk.flow.j0
    public boolean canControl(InneractiveAdSpot inneractiveAdSpot) {
        x adContent = inneractiveAdSpot.getAdContent();
        if ((adContent instanceof NativeAdContent) && !adContent.isVideoAd()) {
            return true;
        }
        return false;
    }
}
