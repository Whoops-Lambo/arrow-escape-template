package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.games.gamessignin.AuthResponse;
import com.google.android.gms.games.gamessignin.AuthScope;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
final class zzv extends zza {
    private final TaskCompletionSource zza;

    public zzv(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzaj
    public final void zzs(Status status, String str, List list) {
        boolean zIsSuccess = status.isSuccess();
        TaskCompletionSource taskCompletionSource = this.zza;
        if (!zIsSuccess) {
            taskCompletionSource.setException(ApiExceptionUtil.fromStatus(status));
        } else {
            taskCompletionSource.setResult(new AuthResponse(str, AuthScope.zzb(list)));
        }
    }
}
