package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth.zzj;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class rk3 extends zzj {
    public final /* synthetic */ int a;
    public final /* synthetic */ TaskCompletionSource b;

    public /* synthetic */ rk3(TaskCompletionSource taskCompletionSource, int i) {
        this.a = i;
        this.b = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth.zzk
    public final void J2(Status status, Bundle bundle) {
        switch (this.a) {
            case 0:
                ll3.a(status, bundle, this.b);
                break;
            default:
                ll3.a(status, bundle, this.b);
                break;
        }
    }
}
