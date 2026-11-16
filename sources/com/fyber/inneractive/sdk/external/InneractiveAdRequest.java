package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.config.x0;
import com.fyber.inneractive.sdk.flow.v0;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class InneractiveAdRequest extends v0 {
    public static final double FLOOR_PRICE_MAX_VALUE = 400000.0d;
    public static final double FLOOR_PRICE_MIN_VALUE = 0.0d;
    public final String c;
    public x0 d;
    public Double e;

    public Double getFloorPrice() {
        return this.e;
    }

    public x0 getSelectedUnitConfig() {
        return this.d;
    }

    public String getSpotId() {
        return this.c;
    }

    public void setSelectedUnitConfig(x0 x0Var) {
        this.d = x0Var;
    }

    public InneractiveAdRequest(String str) {
        this.c = str;
    }

    @Deprecated
    public boolean getMuteVideo() {
        return InneractiveAdManager.getMuteVideo();
    }

    @Deprecated
    public InneractiveUserConfig getUserParams() {
        return InneractiveAdManager.getUserParams();
    }

    public void setFloorPrice(double d) {
        double dMax = 0.0d;
        if (!Double.isNaN(d)) {
            dMax = Math.max(0.0d, Math.min(d, 400000.0d));
        }
        if (dMax != d) {
            IAlog.f("Invalid floor price: %.2f — adjusted to %.2f.", Double.valueOf(d), Double.valueOf(dMax));
        }
        this.e = Double.valueOf(dMax);
    }

    @Deprecated
    public void setMuteVideo(boolean z) {
        InneractiveAdManager.setMuteVideo(z);
    }

    @Deprecated
    public void setUserParams(InneractiveUserConfig inneractiveUserConfig) {
        InneractiveAdManager.setUserParams(inneractiveUserConfig);
    }
}
