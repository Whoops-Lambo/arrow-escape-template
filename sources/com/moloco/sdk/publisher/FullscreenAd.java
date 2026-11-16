package com.moloco.sdk.publisher;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.moloco.sdk.publisher.AdShowListener;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\n\b\u0000\u0010\u0002 \u0000*\u00020\u00012\u00020\u00032\u00020\u0004J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/moloco/sdk/publisher/FullscreenAd;", "Lcom/moloco/sdk/publisher/AdShowListener;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/moloco/sdk/publisher/AdLoad;", "Lcom/moloco/sdk/publisher/Destroyable;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Laz2;", "show", "(Lcom/moloco/sdk/publisher/AdShowListener;)V", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface FullscreenAd<T extends AdShowListener> extends AdLoad, Destroyable {
    void show(@Nullable T listener);
}
