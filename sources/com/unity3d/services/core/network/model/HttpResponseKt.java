package com.unity3d.services.core.network.model;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import defpackage.hg0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0004¨\u0006\u0005"}, d2 = {"isSuccessful", "", "Lcom/unity3d/services/core/network/model/HttpResponse;", "toHttpResponse", "Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException;", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class HttpResponseKt {
    public static final boolean isSuccessful(@NotNull HttpResponse httpResponse) {
        httpResponse.getClass();
        int statusCode = httpResponse.getStatusCode();
        if (200 > statusCode || statusCode >= 300) {
            return false;
        }
        return true;
    }

    @NotNull
    public static final HttpResponse toHttpResponse(@NotNull UnityAdsNetworkException unityAdsNetworkException) {
        int iIntValue;
        String str;
        String str2;
        unityAdsNetworkException.getClass();
        Integer code = unityAdsNetworkException.getCode();
        if (code != null) {
            iIntValue = code.intValue();
        } else {
            iIntValue = IronSourceError.ERROR_NO_INTERNET_CONNECTION;
        }
        int i = iIntValue;
        String url = unityAdsNetworkException.getUrl();
        if (url == null) {
            str = "";
        } else {
            str = url;
        }
        String protocol = unityAdsNetworkException.getProtocol();
        if (protocol == null) {
            str2 = "";
        } else {
            str2 = protocol;
        }
        String client = unityAdsNetworkException.getClient();
        if (client == null) {
            client = "unknown";
        }
        return new HttpResponse("", i, hg0.a, str, str2, client, 0L, 64, null);
    }
}
