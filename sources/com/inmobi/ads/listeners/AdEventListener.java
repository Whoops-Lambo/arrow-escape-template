package com.inmobi.ads.listeners;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@Keep
public abstract class AdEventListener<T> {
    public void onAdClicked(@NonNull T t, Map<Object, Object> map) {
    }

    public void onAdFetchSuccessful(@NonNull T t, @NonNull AdMetaInfo adMetaInfo) {
    }

    public void onAdImpression(@NonNull T t) {
    }

    public void onAdLoadFailed(@NonNull T t, @NonNull InMobiAdRequestStatus inMobiAdRequestStatus) {
    }

    public void onAdLoadSucceeded(@NonNull T t, @NonNull AdMetaInfo adMetaInfo) {
    }

    public void onRequestPayloadCreated(byte[] bArr) {
    }

    public void onRequestPayloadCreationFailed(@NonNull InMobiAdRequestStatus inMobiAdRequestStatus) {
    }
}
