package io.p071bidmachine;

import androidx.annotation.NonNull;
import io.p071bidmachine.AdRequestParameters;
import io.p071bidmachine.models.g;
import io.p071bidmachine.unified.d;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class UnifiedAdRequestParamsImpl<AdRequestParametersType extends AdRequestParameters> implements d {

    @NonNull
    private final AdRequestParametersType adRequestParameters;

    @NonNull
    private final io.p071bidmachine.models.d dataRestrictions;

    @NonNull
    private final g targetingInfo;

    @Override // io.p071bidmachine.unified.d
    @NonNull
    public AdRequestParametersType getAdRequestParameters() {
        return this.adRequestParameters;
    }

    @Override // io.p071bidmachine.GeneralParams
    @NonNull
    public io.p071bidmachine.models.d getDataRestrictions() {
        return this.dataRestrictions;
    }

    @Override // io.p071bidmachine.GeneralParams
    @NonNull
    public g getTargetingInfo() {
        return this.targetingInfo;
    }

    public UnifiedAdRequestParamsImpl(@NonNull AdRequestParametersType adrequestparameterstype, @NonNull g gVar, @NonNull io.p071bidmachine.models.d dVar) {
        this.adRequestParameters = adrequestparameterstype;
        this.targetingInfo = gVar;
        this.dataRestrictions = dVar;
    }

    @Override // io.p071bidmachine.GeneralParams
    public boolean isTestMode() {
        return p1.d().w;
    }
}
