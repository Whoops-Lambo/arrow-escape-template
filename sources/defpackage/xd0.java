package defpackage;

import android.os.Handler;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.upstream.TransferListener;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class xd0 implements BandwidthMeter {
    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    public final void addEventListener(Handler handler, BandwidthMeter.EventListener eventListener) {
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    public final TransferListener getTransferListener() {
        return null;
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    public final void removeEventListener(BandwidthMeter.EventListener eventListener) {
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter
    public final long getBitrateEstimate() {
        return 0L;
    }
}
