package defpackage;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.fido.zzd;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class h05 extends zzd {
    public final /* synthetic */ int a;
    public final /* synthetic */ TaskCompletionSource b;

    public /* synthetic */ h05(TaskCompletionSource taskCompletionSource, int i) {
        this.a = i;
        this.b = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.fido.zze
    public final void h(Status status) {
        switch (this.a) {
            case 0:
                this.b.trySetException(new ApiException(status));
                break;
            default:
                this.b.trySetException(new ApiException(status));
                break;
        }
    }

    @Override // com.google.android.gms.internal.fido.zze
    public final void zzb(boolean z) {
        int i = this.a;
        TaskCompletionSource taskCompletionSource = this.b;
        switch (i) {
            case 0:
                taskCompletionSource.setResult(Boolean.valueOf(z));
                break;
            default:
                taskCompletionSource.setResult(Boolean.valueOf(z));
                break;
        }
    }
}
