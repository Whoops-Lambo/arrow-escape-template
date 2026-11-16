package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@KeepForSdk
public class PendingResultUtil {
    private static final zaac zaa = new zay();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @KeepForSdk
    public interface ResultConverter<R extends Result, T> {
        @Nullable
        @KeepForSdk
        T convert(@NonNull R r);
    }

    @NonNull
    @KeepForSdk
    public static <R extends Result, T extends Response<R>> Task<T> toResponseTask(@NonNull PendingResult<R> pendingResult, @NonNull T t) {
        return toTask(pendingResult, new zaaa(t));
    }

    @NonNull
    @KeepForSdk
    public static <R extends Result, T> Task<T> toTask(@NonNull PendingResult<R> pendingResult, @NonNull ResultConverter<R, T> resultConverter) {
        zaac zaacVar = zaa;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        pendingResult.addStatusListener(new zaz(pendingResult, taskCompletionSource, resultConverter, zaacVar));
        return taskCompletionSource.getTask();
    }

    @NonNull
    @KeepForSdk
    public static <R extends Result> Task<Void> toVoidTask(@NonNull PendingResult<R> pendingResult) {
        return toTask(pendingResult, new zaab());
    }
}
