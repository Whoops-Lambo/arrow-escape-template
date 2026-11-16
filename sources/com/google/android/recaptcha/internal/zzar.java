package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.az2;
import defpackage.rc1;
import defpackage.wr0;
import defpackage.xa0;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
final class zzar extends rc1 implements wr0 {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ xa0 zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzar(TaskCompletionSource taskCompletionSource, xa0 xa0Var) {
        super(1);
        this.zza = taskCompletionSource;
        this.zzb = xa0Var;
    }

    @Override // defpackage.wr0
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof CancellationException) {
            this.zza.setException((Exception) th);
        } else {
            Throwable completionExceptionOrNull = this.zzb.getCompletionExceptionOrNull();
            TaskCompletionSource taskCompletionSource = this.zza;
            if (completionExceptionOrNull == null) {
                taskCompletionSource.setResult(this.zzb.getCompleted());
            } else {
                Exception runtimeExecutionException = completionExceptionOrNull instanceof Exception ? (Exception) completionExceptionOrNull : null;
                if (runtimeExecutionException == null) {
                    runtimeExecutionException = new RuntimeExecutionException(completionExceptionOrNull);
                }
                taskCompletionSource.setException(runtimeExecutionException);
            }
        }
        return az2.a;
    }
}
