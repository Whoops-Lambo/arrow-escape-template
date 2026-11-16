package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class ob5 extends IStatusCallback.Stub {
    public final /* synthetic */ TaskCompletionSource a;

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) {
        ll3.a(status, null, this.a);
    }

    public ob5(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }
}
