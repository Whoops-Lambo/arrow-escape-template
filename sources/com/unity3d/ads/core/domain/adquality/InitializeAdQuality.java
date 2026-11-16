package com.unity3d.ads.core.domain.adquality;

import com.google.protobuf.ByteString;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/unity3d/ads/core/domain/adquality/InitializeAdQuality;", "", "", "appKey", "Lcom/google/protobuf/ByteString;", "sessionToken", "Laz2;", "invoke", "(Ljava/lang/String;Lcom/google/protobuf/ByteString;)V", "invokeWithGameId", "(Lcom/google/protobuf/ByteString;)V", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface InitializeAdQuality {
    void invoke(@NotNull String appKey, @NotNull ByteString sessionToken);

    void invokeWithGameId(@NotNull ByteString sessionToken);
}
