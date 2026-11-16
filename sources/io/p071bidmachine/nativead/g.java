package io.p071bidmachine.nativead;

import com.explorestack.protobuf.adcom.Placement;
import io.p071bidmachine.AdFormat;
import io.p071bidmachine.AdPlacementConfig;
import io.p071bidmachine.AdRequestParameters;
import io.p071bidmachine.MediaAssetType;
import io.p071bidmachine.utils.a;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class g extends AdRequestParameters {
    public final List a;
    public boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(AdPlacementConfig adPlacementConfig) {
        super(adPlacementConfig);
        adPlacementConfig.getClass();
        this.b = true;
        AdFormat adFormat = adPlacementConfig.getAdFormat();
        if (adFormat instanceof AdFormat.Native) {
            this.a = ((AdFormat.Native) adFormat).getMediaAssetTypes();
            return;
        }
        List<MediaAssetType> list = MediaAssetType.DEFAULT;
        list.getClass();
        this.a = list;
    }

    public final boolean a(MediaAssetType mediaAssetType) {
        mediaAssetType.getClass();
        List list = this.a;
        if (!list.isEmpty() && !list.contains(mediaAssetType) && !list.contains(MediaAssetType.All)) {
            return false;
        }
        return true;
    }

    @Override // io.p071bidmachine.AdRequestParameters
    public final a checkPlacement(Placement placement) {
        placement.getClass();
        if (placement.getDisplay().getNativefmt().getAssetCount() <= 0) {
            return a.b("Native assets not found");
        }
        return null;
    }

    @Override // io.p071bidmachine.AdRequestParameters
    public final boolean isParametersMatched(AdRequestParameters adRequestParameters) {
        adRequestParameters.getClass();
        if (super.isParametersMatched(adRequestParameters) && (adRequestParameters instanceof g)) {
            List list = ((g) adRequestParameters).a;
            if (MediaAssetType.isAll(list) || list.containsAll(this.a)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
