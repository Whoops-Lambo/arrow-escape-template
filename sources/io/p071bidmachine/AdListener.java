package io.p071bidmachine;

import androidx.annotation.NonNull;
import io.p071bidmachine.IAd;
import io.p071bidmachine.utils.a;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public interface AdListener<AdType extends IAd> {
    void onAdClicked(@NonNull AdType adtype);

    void onAdExpired(@NonNull AdType adtype);

    void onAdImpression(@NonNull AdType adtype);

    void onAdLoadFailed(@NonNull AdType adtype, @NonNull a aVar);

    void onAdLoaded(@NonNull AdType adtype);

    void onAdShowFailed(@NonNull AdType adtype, @NonNull a aVar);
}
