package defpackage;

import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.upstream.BandwidthMeter;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ij0 implements ol2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BandwidthMeter b;

    public /* synthetic */ ij0(BandwidthMeter bandwidthMeter, int i) {
        this.a = i;
        this.b = bandwidthMeter;
    }

    @Override // defpackage.ol2
    public final Object get() {
        int i = this.a;
        BandwidthMeter bandwidthMeter = this.b;
        switch (i) {
            case 0:
                return ExoPlayer.Builder.lambda$new$12(bandwidthMeter);
            default:
                return ExoPlayer.Builder.lambda$setBandwidthMeter$20(bandwidthMeter);
        }
    }
}
