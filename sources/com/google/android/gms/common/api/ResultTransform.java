package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.zach;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class ResultTransform<R extends Result, S extends Result> {
    @NonNull
    public Status onFailure(@NonNull Status status) {
        return status;
    }

    @Nullable
    @WorkerThread
    public abstract PendingResult<S> onSuccess(@NonNull R r);

    @NonNull
    public final PendingResult<S> createFailedResult(@NonNull Status status) {
        return new zach(status);
    }
}
