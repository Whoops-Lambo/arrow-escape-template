package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
final class zzd implements zzq {
    private final Executor zza;
    private final Continuation zzb;
    private final zzw zzc;

    @Override // com.google.android.gms.tasks.zzq
    public final void zza(@NonNull Task task) {
        this.zza.execute(new zzc(this, task));
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzb() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Continuation zzc() {
        return this.zzb;
    }

    public final /* synthetic */ zzw zzd() {
        return this.zzc;
    }

    public zzd(@NonNull Executor executor, @NonNull Continuation continuation, @NonNull zzw zzwVar) {
        this.zza = executor;
        this.zzb = continuation;
        this.zzc = zzwVar;
    }
}
