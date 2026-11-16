package io.p071bidmachine.banner;

import com.explorestack.protobuf.adcom.Placement;
import io.p071bidmachine.AdFormat;
import io.p071bidmachine.AdPlacementConfig;
import io.p071bidmachine.AdRequestParameters;
import io.p071bidmachine.BannerAdSize;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class a extends AdRequestParameters {
    public final BannerAdSize a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AdPlacementConfig adPlacementConfig) {
        super(adPlacementConfig);
        adPlacementConfig.getClass();
        AdFormat adFormat = adPlacementConfig.getAdFormat();
        if (adFormat instanceof AdFormat.Banner) {
            this.a = ((AdFormat.Banner) adFormat).getBannerAdSize();
        } else {
            this.a = BannerAdSize.Banner;
        }
    }

    @Override // io.p071bidmachine.AdRequestParameters
    public final io.p071bidmachine.utils.a checkPlacement(Placement placement) {
        placement.getClass();
        BannerAdSize bannerAdSize = this.a;
        bannerAdSize.getClass();
        Placement.DisplayPlacement display = placement.getDisplay();
        display.getClass();
        if (display == Placement.DisplayPlacement.getDefaultInstance()) {
            return io.p071bidmachine.utils.a.b("DisplayPlacement must not be a default instance");
        }
        if (display.getInstl()) {
            return io.p071bidmachine.utils.a.b("It's is not banner placement. 'Instl' parameter in placement - true");
        }
        int w = display.getW();
        int h = display.getH();
        if (!bannerAdSize.isSuitable(w, h)) {
            return io.p071bidmachine.utils.a.b("Incorrect DisplayPlacement size. Current size - " + bannerAdSize.getWidth() + 'x' + bannerAdSize.getHeight() + ", placement size - " + w + 'x' + h);
        }
        return null;
    }

    @Override // io.p071bidmachine.AdRequestParameters
    public final boolean isParametersMatched(AdRequestParameters adRequestParameters) {
        adRequestParameters.getClass();
        if (super.isParametersMatched(adRequestParameters) && (adRequestParameters instanceof a)) {
            if (this.a.isSuitable(((a) adRequestParameters).a)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
