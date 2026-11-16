package com.unity3d.ads.core.data.repository;

import com.ironsource.C4962rg;
import com.unity3d.ads.core.data.datasource.MediationDataSource;
import com.unity3d.ads.core.domain.MediationProviderParser;
import defpackage.s5;
import defpackage.sr0;
import gatewayprotocol.v1.ClientInfoOuterClass;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\tR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidMediationRepository;", "Lcom/unity3d/ads/core/data/repository/MediationRepository;", "Lcom/unity3d/ads/core/data/datasource/MediationDataSource;", "mediationDataSource", "Lcom/unity3d/ads/core/domain/MediationProviderParser;", "mediationProviderParser", "<init>", "(Lcom/unity3d/ads/core/data/datasource/MediationDataSource;Lcom/unity3d/ads/core/domain/MediationProviderParser;)V", "Lcom/unity3d/ads/core/data/datasource/MediationDataSource;", "Lcom/unity3d/ads/core/domain/MediationProviderParser;", "", "getName", "()Ljava/lang/String;", "name", C4962rg.b, "version", "Lkotlin/Function0;", "Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;", "getMediationProvider", "()Lsr0;", "mediationProvider", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidMediationRepository implements MediationRepository {

    @NotNull
    private final MediationDataSource mediationDataSource;

    @NotNull
    private final MediationProviderParser mediationProviderParser;

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClientInfoOuterClass.MediationProvider _get_mediationProvider_$lambda$0(AndroidMediationRepository androidMediationRepository) {
        return androidMediationRepository.mediationProviderParser.invoke(androidMediationRepository.getName());
    }

    @Override // com.unity3d.ads.core.data.repository.MediationRepository
    @NotNull
    public sr0 getMediationProvider() {
        return new s5(this, 10);
    }

    @Override // com.unity3d.ads.core.data.repository.MediationRepository
    @Nullable
    public String getName() {
        return this.mediationDataSource.getName();
    }

    @Override // com.unity3d.ads.core.data.repository.MediationRepository
    @Nullable
    public String getVersion() {
        return this.mediationDataSource.getVersion();
    }

    public AndroidMediationRepository(@NotNull MediationDataSource mediationDataSource, @NotNull MediationProviderParser mediationProviderParser) {
        mediationDataSource.getClass();
        mediationProviderParser.getClass();
        this.mediationDataSource = mediationDataSource;
        this.mediationProviderParser = mediationProviderParser;
    }
}
