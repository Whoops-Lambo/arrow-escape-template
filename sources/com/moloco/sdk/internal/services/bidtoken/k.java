package com.moloco.sdk.internal.services.bidtoken;

import defpackage.jc1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class k {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof k);
    }

    public final int hashCode() {
        return Long.hashCode(200L) + jc1.d(3, Long.hashCode(2800L) * 31, 31);
    }

    public final String toString() {
        return "BidTokenHttpRequestInfo(requestTimeoutMillis=2800, fetchRetryMax=3, fetchRetryDelayMillis=200)";
    }
}
