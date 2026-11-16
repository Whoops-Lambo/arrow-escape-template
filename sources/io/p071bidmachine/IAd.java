package io.p071bidmachine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.p071bidmachine.AdRequest;
import io.p071bidmachine.IAd;
import io.p071bidmachine.models.c;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public interface IAd<SelfType extends IAd, AdRequestType extends AdRequest> {
    boolean canShow();

    void destroy();

    @Nullable
    c getAuctionResult();

    boolean isDestroyed();

    boolean isExpired();

    boolean isLoaded();

    boolean isLoading();

    @NonNull
    SelfType load(AdRequestType adrequesttype);

    @NonNull
    SelfType setRendererConfiguration(@Nullable RendererConfiguration rendererConfiguration);
}
