package com.unity3d.ads.adplayer;

import com.singular.sdk.internal.Constants;
import com.unity3d.ads.adplayer.model.WebViewClientError;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/adplayer/LoadWebViewError;", "Lcom/unity3d/ads/adplayer/AdPlayerError;", Constants.RequestParamsKeys.REMOTE_ERROR_COLLECTION_KEY, "", "Lcom/unity3d/ads/adplayer/model/WebViewClientError;", "<init>", "(Ljava/util/List;)V", "getErrors", "()Ljava/util/List;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LoadWebViewError extends AdPlayerError {

    @NotNull
    private final List<WebViewClientError> errors;

    @NotNull
    public final List<WebViewClientError> getErrors() {
        return this.errors;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadWebViewError(@NotNull List<WebViewClientError> list) {
        super("AdPlayer was not able to load the webview.", null);
        list.getClass();
        this.errors = list;
    }
}
