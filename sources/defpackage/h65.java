package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.fido.zzi;
import com.google.android.gms.internal.fido.zzl;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class h65 extends zzl {
    public final /* synthetic */ int a;
    public final /* synthetic */ TaskCompletionSource b;

    public /* synthetic */ h65(TaskCompletionSource taskCompletionSource, int i) {
        this.a = i;
        this.b = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.fido.zzm
    public final void e(Status status, PendingIntent pendingIntent) {
        switch (this.a) {
            case 0:
                TaskUtil.setResultOrApiException(status, pendingIntent, (TaskCompletionSource<PendingIntent>) this.b);
                break;
            case 1:
                TaskUtil.setResultOrApiException(status, pendingIntent, (TaskCompletionSource<PendingIntent>) this.b);
                break;
            case 2:
                TaskUtil.setResultOrApiException(status, new zzi(), (TaskCompletionSource<zzi>) this.b);
                break;
            default:
                TaskUtil.setResultOrApiException(status, new zzi(), (TaskCompletionSource<zzi>) this.b);
                break;
        }
    }
}
