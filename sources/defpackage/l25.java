package defpackage;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.games_v2.zzg;
import com.google.android.gms.internal.games_v2.zzs;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class l25 extends zzg {
    public final /* synthetic */ TaskCompletionSource a;

    public l25(p45 p45Var, TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.games_v2.zzg, com.google.android.gms.internal.games_v2.zzv
    public final void m0(Status status, zzs zzsVar) {
        TaskCompletionSource taskCompletionSource = this.a;
        if (zzsVar == null) {
            taskCompletionSource.setException(new ApiException(status));
        } else {
            taskCompletionSource.setResult(zzsVar);
        }
    }
}
