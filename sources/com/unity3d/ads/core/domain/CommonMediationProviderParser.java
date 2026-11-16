package com.unity3d.ads.core.domain;

import com.google.ads.mediation.moloco.MolocoMediationAdapter;
import defpackage.kk2;
import gatewayprotocol.v1.ClientInfoOuterClass;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonMediationProviderParser;", "Lcom/unity3d/ads/core/domain/MediationProviderParser;", "<init>", "()V", "invoke", "Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;", "mediationProvider", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CommonMediationProviderParser implements MediationProviderParser {
    @Override // com.unity3d.ads.core.domain.MediationProviderParser
    @NotNull
    public ClientInfoOuterClass.MediationProvider invoke(@Nullable String mediationProvider) {
        ClientInfoOuterClass.MediationProvider mediationProvider2;
        if (mediationProvider != null) {
            if (kk2.L(mediationProvider, "AppLovinSdk_", true)) {
                mediationProvider2 = ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_MAX;
            } else if (mediationProvider.equalsIgnoreCase(MolocoMediationAdapter.MEDIATION_PLATFORM_NAME)) {
                mediationProvider2 = ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_ADMOB;
            } else if (mediationProvider.equalsIgnoreCase("MAX")) {
                mediationProvider2 = ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_MAX;
            } else {
                mediationProvider2 = mediationProvider.equalsIgnoreCase("ironSource") ? ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_LEVELPLAY : ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_CUSTOM;
            }
            if (mediationProvider2 != null) {
                return mediationProvider2;
            }
        }
        return ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_UNSPECIFIED;
    }
}
