package defpackage;

import com.google.android.gms.nearby.connection.PayloadCallback;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class lo4 extends in4 {
    public final /* synthetic */ String a;
    public final /* synthetic */ PayloadTransferUpdate b;

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void notifyListener(Object obj) {
        PayloadTransferUpdate payloadTransferUpdate = new PayloadTransferUpdate.Builder(this.b).a;
        payloadTransferUpdate.b = 2;
        ((PayloadCallback) obj).onPayloadTransferUpdate(this.a, payloadTransferUpdate);
    }

    public lo4(String str, PayloadTransferUpdate payloadTransferUpdate) {
        this.a = str;
        this.b = payloadTransferUpdate;
    }
}
