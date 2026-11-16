package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.SessionRepository;
import defpackage.cm2;
import defpackage.gd1;
import defpackage.s5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\f\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\b¨\u0006\r"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonTokenNumberProvider;", "Lcom/unity3d/ads/core/domain/TokenNumberProvider;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "<init>", "(Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "", "invoke", "()I", "number$delegate", "Lgd1;", "getNumber", "number", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CommonTokenNumberProvider implements TokenNumberProvider {

    /* JADX INFO: renamed from: number$delegate, reason: from kotlin metadata */
    @NotNull
    private final gd1 number;

    private final int getNumber() {
        return ((Number) this.number.getValue()).intValue();
    }

    public CommonTokenNumberProvider(@NotNull SessionRepository sessionRepository) {
        sessionRepository.getClass();
        this.number = new cm2(new s5(sessionRepository, 14));
    }

    @Override // com.unity3d.ads.core.domain.TokenNumberProvider
    public int invoke() {
        return getNumber();
    }
}
