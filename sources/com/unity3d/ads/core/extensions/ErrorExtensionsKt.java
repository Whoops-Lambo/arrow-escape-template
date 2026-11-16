package com.unity3d.ads.core.extensions;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import gatewayprotocol.v1.ErrorOuterClass;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0003¨\u0006\u0004"}, d2 = {"getErrorTokenOrNull", "Lcom/google/protobuf/ByteString;", "Lgatewayprotocol/v1/ErrorOuterClass$Error;", "", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ErrorExtensionsKt {
    @Nullable
    public static final ByteString getErrorTokenOrNull(@NotNull ErrorOuterClass.Error error) {
        error.getClass();
        if (error.getErrorToken().isEmpty()) {
            return null;
        }
        return error.getErrorToken();
    }

    @Nullable
    public static final ByteString getErrorTokenOrNull(@NotNull Throwable th) {
        th.getClass();
        GatewayException gatewayException = th instanceof GatewayException ? (GatewayException) th : null;
        if (gatewayException != null) {
            return gatewayException.getErrorToken();
        }
        return null;
    }
}
