package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzgnv extends zzfzx {
    public final zzgic f;

    @Override // com.google.android.gms.internal.ads.zzfzx
    public final void b(int i, long j) {
        this.f.b(null, null, i, j);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.setResult(Boolean.TRUE);
        taskCompletionSource.getTask();
    }

    public zzgnv(Context context, ExecutorService executorService, zzgic zzgicVar) {
        super(context, executorService, new TaskCompletionSource().getTask(), false);
        this.f = zzgicVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzx
    public final void c(int i, long j, Exception exc) {
        this.f.b(null, exc, i, j);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.setResult(Boolean.TRUE);
        taskCompletionSource.getTask();
    }

    @Override // com.google.android.gms.internal.ads.zzfzx
    public final void d(int i, String str) {
        this.f.b(str, null, i, -1L);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.setResult(Boolean.TRUE);
        taskCompletionSource.getTask();
    }
}
