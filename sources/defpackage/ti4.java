package defpackage;

import com.google.android.gms.internal.nearby.zzgy;
import com.google.android.gms.nearby.connection.ConnectionLifecycleCallback;
import com.google.android.gms.nearby.connection.ConnectionResolution;
import com.google.android.gms.nearby.connection.EndpointDiscoveryCallback;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class ti4 extends in4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ ti4(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void notifyListener(Object obj) {
        switch (this.a) {
            case 0:
                zzgy.b(13);
                ((ConnectionLifecycleCallback) obj).onConnectionResult(this.b, new ConnectionResolution());
                break;
            case 1:
                ((ConnectionLifecycleCallback) obj).onDisconnected(this.b);
                break;
            default:
                ((EndpointDiscoveryCallback) obj).onEndpointLost(this.b);
                break;
        }
    }
}
