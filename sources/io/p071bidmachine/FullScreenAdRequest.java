package io.p071bidmachine;

import androidx.annotation.NonNull;
import io.p071bidmachine.FullScreenAdRequest;
import io.p071bidmachine.displays.f;
import io.p071bidmachine.models.d;
import io.p071bidmachine.models.g;
import io.p071bidmachine.unified.i;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class FullScreenAdRequest<SelfType extends FullScreenAdRequest<SelfType>> extends AdRequest<SelfType, FullScreenAdRequestParameters, i> {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class FullScreenRequestBuilder<SelfType extends FullScreenRequestBuilder<SelfType, ReturnType>, ReturnType extends FullScreenAdRequest<ReturnType>> extends AdRequest.AdRequestBuilderImpl<SelfType, ReturnType, FullScreenAdRequestParameters> {
        public SelfType setAdContentType(@NonNull AdContentType adContentType) {
            return this;
        }

        public FullScreenRequestBuilder(@NonNull AdPlacementConfig adPlacementConfig) {
            super(adPlacementConfig);
        }
    }

    public FullScreenAdRequest(@NonNull FullScreenAdRequestParameters fullScreenAdRequestParameters) {
        super(fullScreenAdRequestParameters);
    }

    @NonNull
    public AdContentType getAdContentType() {
        return getAdRequestParameters().getAdContentType();
    }

    @Override // io.p071bidmachine.AdRequest
    public boolean isPlacementBuilderMatch(@NonNull f fVar) {
        if (super.isPlacementBuilderMatch(fVar) && getAdRequestParameters().isContentTypeMatch(fVar.a)) {
            return true;
        }
        return false;
    }

    @Override // io.p071bidmachine.AdRequest
    @NonNull
    public i createUnifiedAdRequestParams(@NonNull FullScreenAdRequestParameters fullScreenAdRequestParameters, @NonNull g gVar, @NonNull d dVar) {
        return new r0(fullScreenAdRequestParameters, gVar, dVar);
    }
}
