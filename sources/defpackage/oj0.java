package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.trackselection.TrackSelector;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class oj0 implements ol2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TrackSelector b;

    public /* synthetic */ oj0(TrackSelector trackSelector, int i) {
        this.a = i;
        this.b = trackSelector;
    }

    @Override // defpackage.ol2
    public final Object get() {
        int i = this.a;
        TrackSelector trackSelector = this.b;
        switch (i) {
            case 0:
                return ExoPlayer.Builder.lambda$new$10(trackSelector);
            default:
                return ExoPlayer.Builder.lambda$setTrackSelector$18(trackSelector);
        }
    }
}
