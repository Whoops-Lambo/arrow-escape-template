package com.google.android.gms.tasks;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
final class zzs implements OnTokenCanceledListener {
    final /* synthetic */ TaskCompletionSource zza;

    @Override // com.google.android.gms.tasks.OnTokenCanceledListener
    public final void onCanceled() {
        this.zza.zza().zze();
    }

    public zzs(TaskCompletionSource taskCompletionSource) {
        Objects.requireNonNull(taskCompletionSource);
        this.zza = taskCompletionSource;
    }
}
