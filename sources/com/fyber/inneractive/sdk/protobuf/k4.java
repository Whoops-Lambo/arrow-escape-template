package com.fyber.inneractive.sdk.protobuf;

import com.unity3d.services.UnityAdsConstants;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public enum k4 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(s.b),
    ENUM(null),
    MESSAGE(null);

    private final Object defaultDefault;

    k4(Serializable serializable) {
        this.defaultDefault = serializable;
    }
}
