package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.LoadConfigurationInternal;
import defpackage.d;
import defpackage.dy;
import gatewayprotocol.v1.AdFormatOuterClass;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J>\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH¦B¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/core/domain/GetAdPlayerConfigRequest;", "", "", "placement", "Lcom/google/protobuf/ByteString;", "opportunityId", "configToken", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "adFormat", "Lcom/unity3d/ads/core/data/model/LoadConfigurationInternal;", "loadConfiguration", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "invoke", "(Ljava/lang/String;Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ByteString;Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;Lcom/unity3d/ads/core/data/model/LoadConfigurationInternal;Ldy;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface GetAdPlayerConfigRequest {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(GetAdPlayerConfigRequest getAdPlayerConfigRequest, String str, ByteString byteString, ByteString byteString2, AdFormatOuterClass.AdFormat adFormat, LoadConfigurationInternal loadConfigurationInternal, dy dyVar, int i, Object obj) {
            if (obj != null) {
                d.u("Super calls with default arguments not supported in this target, function: invoke");
                return null;
            }
            if ((i & 16) != 0) {
                loadConfigurationInternal = null;
            }
            return getAdPlayerConfigRequest.invoke(str, byteString, byteString2, adFormat, loadConfigurationInternal, dyVar);
        }
    }

    @Nullable
    Object invoke(@NotNull String str, @NotNull ByteString byteString, @NotNull ByteString byteString2, @Nullable AdFormatOuterClass.AdFormat adFormat, @Nullable LoadConfigurationInternal loadConfigurationInternal, @NotNull dy dyVar);
}
