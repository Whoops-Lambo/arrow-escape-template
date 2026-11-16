package io.p071bidmachine;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class FullScreenAdRequestParameters extends AdRequestParameters {
    @Deprecated(since = "3.5.0")
    public FullScreenAdRequestParameters(@NonNull AdsFormat adsFormat, @NonNull AdContentType adContentType) {
        this(new AdPlacementConfig.Builder(adsFormat.toAdFormat(adContentType)).build());
    }

    private boolean isParametersMatchedInternal(@NonNull FullScreenAdRequestParameters fullScreenAdRequestParameters) {
        return isContentTypeMatch(fullScreenAdRequestParameters.getAdContentType());
    }

    @NonNull
    public AdContentType getAdContentType() {
        AdFormat adFormat = getAdPlacementConfig().getAdFormat();
        if (adFormat instanceof AdFormat.Interstitial) {
            return ((AdFormat.Interstitial) adFormat).getAdContentType();
        }
        if (adFormat instanceof AdFormat.Rewarded) {
            return ((AdFormat.Rewarded) adFormat).getAdContentType();
        }
        return AdContentType.All;
    }

    public boolean isContentTypeMatch(@NonNull AdContentType adContentType) {
        AdContentType adContentType2 = getAdContentType();
        if (adContentType2 != AdContentType.All && adContentType2 != adContentType) {
            return false;
        }
        return true;
    }

    @Override // io.p071bidmachine.AdRequestParameters
    public boolean isParametersMatched(@NonNull AdRequestParameters adRequestParameters) {
        if (super.isParametersMatched(adRequestParameters) && (adRequestParameters instanceof FullScreenAdRequestParameters) && isParametersMatchedInternal((FullScreenAdRequestParameters) adRequestParameters)) {
            return true;
        }
        return false;
    }

    public FullScreenAdRequestParameters(@NonNull AdPlacementConfig adPlacementConfig) {
        super(adPlacementConfig);
    }
}
