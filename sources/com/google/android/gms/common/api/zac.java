package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BasePendingResult;
import defpackage.d;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
final class zac<R extends Result> extends BasePendingResult<R> {
    private final Result zae;

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R createFailedResult(Status status) {
        R r = (R) this.zae;
        if (status.getStatusCode() == r.getStatus().getStatusCode()) {
            return r;
        }
        d.u("Creating failed results is not supported");
        return null;
    }

    public zac(Result result) {
        super(Looper.getMainLooper());
        this.zae = result;
    }
}
