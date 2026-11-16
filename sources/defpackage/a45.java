package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.internal.nearby.zznp;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class a45 extends zznp {
    public final /* synthetic */ Status a;

    public a45(Status status) {
        this.a = status;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        BaseImplementation.ResultHolder resultHolder = (BaseImplementation.ResultHolder) obj;
        Status status = this.a;
        if (status.isSuccess()) {
            resultHolder.setResult(status);
        } else {
            resultHolder.setFailedResult(status);
        }
    }
}
