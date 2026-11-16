package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@KeepForSdk
public class TaskUtil {
    @NonNull
    @KeepForSdk
    @Deprecated
    public static Task<Void> toVoidTaskThatFailsOnFalse(@NonNull Task<Boolean> task) {
        return task.continueWith(new zaco());
    }

    @KeepForSdk
    public static <ResultT> void setResultOrApiException(@NonNull Status status, @Nullable ResultT resultt, @NonNull TaskCompletionSource<ResultT> taskCompletionSource) {
        if (status.isSuccess()) {
            taskCompletionSource.setResult(resultt);
        } else {
            taskCompletionSource.setException(ApiExceptionUtil.fromStatus(status));
        }
    }

    @KeepForSdk
    public static <ResultT> boolean trySetResultOrApiException(@NonNull Status status, @Nullable ResultT resultt, @NonNull TaskCompletionSource<ResultT> taskCompletionSource) {
        if (status.isSuccess()) {
            return taskCompletionSource.trySetResult(resultt);
        }
        return taskCompletionSource.trySetException(ApiExceptionUtil.fromStatus(status));
    }

    @KeepForSdk
    public static void setResultOrApiException(@NonNull Status status, @NonNull TaskCompletionSource<Void> taskCompletionSource, @Nullable ApiMetadata apiMetadata) {
        if (apiMetadata != null) {
            int i = com.google.android.gms.internal.base.zak.a;
        }
        setResultOrApiException(status, taskCompletionSource);
    }

    @KeepForSdk
    public static void setResultOrApiException(@NonNull Status status, @NonNull TaskCompletionSource<Void> taskCompletionSource) {
        setResultOrApiException(status, (Object) null, taskCompletionSource);
    }

    @KeepForSdk
    public static <ResultT> boolean trySetResultOrApiException(@NonNull Status status, @Nullable ResultT resultt, @NonNull TaskCompletionSource<ResultT> taskCompletionSource, @Nullable ApiMetadata apiMetadata) {
        if (apiMetadata != null) {
            int i = com.google.android.gms.internal.base.zak.a;
        }
        return trySetResultOrApiException(status, resultt, taskCompletionSource);
    }

    @KeepForSdk
    public static <ResultT> void setResultOrApiException(@NonNull Status status, @Nullable ResultT resultt, @NonNull TaskCompletionSource<ResultT> taskCompletionSource, @Nullable ApiMetadata apiMetadata) {
        if (apiMetadata != null) {
            int i = com.google.android.gms.internal.base.zak.a;
        }
        setResultOrApiException(status, resultt, taskCompletionSource);
    }
}
