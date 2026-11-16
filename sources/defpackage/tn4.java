package defpackage;

import com.google.android.gms.internal.nearby.zzli;
import com.google.android.gms.nearby.connection.Payload;
import com.google.android.gms.nearby.connection.PayloadCallback;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class tn4 extends in4 {
    public final /* synthetic */ zzli a;
    public final /* synthetic */ Payload b;

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void notifyListener(Object obj) {
        ((PayloadCallback) obj).onPayloadReceived(this.a.a, this.b);
    }

    public tn4(zzli zzliVar, Payload payload) {
        this.a = zzliVar;
        this.b = payload;
    }
}
