package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class Z extends RuntimeException {
    public final InMobiAdRequestStatus a;
    public final W b;

    @Override // java.lang.Throwable
    public final String toString() {
        return "AdFetchFailureException(statusCode=" + this.a.getStatusCode() + ", statusMessage=" + this.a.getMessage() + ", adFetchError=" + this.b + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(InMobiAdRequestStatus inMobiAdRequestStatus, W w) {
        super(inMobiAdRequestStatus.getMessage());
        inMobiAdRequestStatus.getClass();
        w.getClass();
        this.a = inMobiAdRequestStatus;
        this.b = w;
    }
}
