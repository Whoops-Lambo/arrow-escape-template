package com.unity3d.ads.core.domain;

import com.singular.sdk.internal.Constants;
import com.unity3d.ads.adplayer.model.WebViewClientError;
import com.unity3d.ads.core.data.model.AdObject;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J&\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H¦\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/core/domain/SendWebViewClientErrorDiagnostics;", "", "", "Lcom/unity3d/ads/adplayer/model/WebViewClientError;", Constants.RequestParamsKeys.REMOTE_ERROR_COLLECTION_KEY, "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "Laz2;", "invoke", "(Ljava/util/List;Lcom/unity3d/ads/core/data/model/AdObject;)V", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface SendWebViewClientErrorDiagnostics {
    void invoke(@NotNull List<WebViewClientError> errors, @NotNull AdObject adObject);
}
