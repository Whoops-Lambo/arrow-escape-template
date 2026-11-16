package io.p071bidmachine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.protobuf.adcom.Placement;
import io.p071bidmachine.protobuf.ResponsePayload;
import io.p071bidmachine.utils.a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AdRequestParameters {

    @NonNull
    private AdPlacementConfig adPlacementConfig;

    @Nullable
    private ResponsePayload bidPayload;

    @Nullable
    private List<NetworkConfig> networkConfigList;

    @Nullable
    private PriceFloorParams priceFloorParams;

    @Nullable
    private TargetingParams targetingParams;

    @Nullable
    private Integer timeOutMs;

    @Nullable
    public abstract a checkPlacement(@NonNull Placement placement) throws Throwable;

    @Nullable
    @Deprecated
    public SessionAdParams getSessionAdParams() {
        return null;
    }

    @NonNull
    public AdFormat getAdFormat() {
        return this.adPlacementConfig.getAdFormat();
    }

    @NonNull
    public AdPlacementConfig getAdPlacementConfig() {
        return this.adPlacementConfig;
    }

    @Nullable
    public ResponsePayload getBidPayload() {
        return this.bidPayload;
    }

    @Nullable
    public CustomParams getCustomParams() {
        return this.adPlacementConfig.getCustomParams();
    }

    @Nullable
    public List<NetworkConfig> getNetworkConfigList() {
        return this.networkConfigList;
    }

    @Nullable
    public String getPlacementId() {
        return this.adPlacementConfig.getPlacementId();
    }

    @Nullable
    public PriceFloorParams getPriceFloorParams() {
        return this.priceFloorParams;
    }

    @Nullable
    public TargetingParams getTargetingParams() {
        return this.targetingParams;
    }

    @Nullable
    public Integer getTimeOutMs() {
        return this.timeOutMs;
    }

    public boolean isPricePassedByPriceFloor(double d) {
        PriceFloorParams priceFloorParams = this.priceFloorParams;
        if (priceFloorParams == null) {
            return true;
        }
        Map<String, Double> priceFloors = priceFloorParams.getPriceFloors();
        if (priceFloors.isEmpty()) {
            return true;
        }
        Iterator<Double> it = priceFloors.values().iterator();
        while (it.hasNext()) {
            if (d > it.next().doubleValue()) {
                return true;
            }
        }
        return false;
    }

    public void setAdPlacementConfig(@NonNull AdPlacementConfig adPlacementConfig) {
        AdFormat adFormat = this.adPlacementConfig.getAdFormat();
        AdFormat adFormat2 = adPlacementConfig.getAdFormat();
        if (!adFormat.equals(adFormat2)) {
            io.p071bidmachine.core.a.h("setAdPlacementConfig received different AdsFormat. Expected: " + adFormat + ", actual: " + adFormat2);
            adPlacementConfig = adPlacementConfig.newBuilder(adFormat).build();
        }
        this.adPlacementConfig = adPlacementConfig;
    }

    public void setBidPayload(@Nullable ResponsePayload responsePayload) {
        this.bidPayload = responsePayload;
    }

    public void setNetworkConfigList(@Nullable List<NetworkConfig> list) {
        this.networkConfigList = list;
    }

    public void setPriceFloorParams(@Nullable PriceFloorParams priceFloorParams) {
        this.priceFloorParams = priceFloorParams;
    }

    public void setTargetingParams(@Nullable TargetingParams targetingParams) {
        this.targetingParams = targetingParams;
    }

    public void setTimeOutMs(@Nullable Integer num) {
        this.timeOutMs = num;
    }

    public AdRequestParameters(@NonNull AdPlacementConfig adPlacementConfig) {
        this.adPlacementConfig = adPlacementConfig;
    }

    @NonNull
    @Deprecated(since = "3.5.0")
    public AdsFormat getAdsFormat() {
        return AdsFormat.fromAdFormat(getAdFormat());
    }

    @NonNull
    public AdsType getAdsType() {
        return getAdFormat().getAdsType();
    }

    public boolean isParametersMatched(@NonNull AdRequestParameters adRequestParameters) {
        if (getAdsType() == adRequestParameters.getAdsType()) {
            return true;
        }
        return false;
    }
}
