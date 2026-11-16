package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.preload.DefaultPreloadManager;
import androidx.media3.exoplayer.upstream.BandwidthMeter;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class o90 implements ol2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BandwidthMeter b;

    public /* synthetic */ o90(BandwidthMeter bandwidthMeter, int i) {
        this.a = i;
        this.b = bandwidthMeter;
    }

    @Override // defpackage.ol2
    public final Object get() {
        int i = this.a;
        BandwidthMeter bandwidthMeter = this.b;
        switch (i) {
            case 0:
                return DefaultPreloadManager.Builder.lambda$setBandwidthMeter$6(bandwidthMeter);
            case 1:
                return ExoPlayer.Builder.lambda$setBandwidthMeter$20(bandwidthMeter);
            default:
                return ExoPlayer.Builder.lambda$new$12(bandwidthMeter);
        }
    }
}
