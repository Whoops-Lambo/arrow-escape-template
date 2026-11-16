package defpackage;

import androidx.media3.common.util.NetworkTypeObserver;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;
import androidx.media3.exoplayer.upstream.experimental.ExperimentalBandwidthMeter;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c80 implements NetworkTypeObserver.Listener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c80(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.media3.common.util.NetworkTypeObserver.Listener
    public final void onNetworkTypeChanged(int i) throws Throwable {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                ((DefaultBandwidthMeter) obj).onNetworkTypeChanged(i);
                break;
            default:
                ((ExperimentalBandwidthMeter) obj).onNetworkTypeChanged(i);
                break;
        }
    }
}
