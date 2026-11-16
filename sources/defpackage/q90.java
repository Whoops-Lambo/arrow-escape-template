package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.preload.DefaultPreloadManager;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class q90 implements ol2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaSource.Factory b;

    public /* synthetic */ q90(MediaSource.Factory factory, int i) {
        this.a = i;
        this.b = factory;
    }

    @Override // defpackage.ol2
    public final Object get() {
        int i = this.a;
        MediaSource.Factory factory = this.b;
        switch (i) {
            case 0:
                return DefaultPreloadManager.Builder.lambda$setMediaSourceFactory$3(factory);
            case 1:
                return ExoPlayer.Builder.lambda$new$7(factory);
            case 2:
                return ExoPlayer.Builder.lambda$new$9(factory);
            case 3:
                return ExoPlayer.Builder.lambda$new$5(factory);
            default:
                return ExoPlayer.Builder.lambda$setMediaSourceFactory$17(factory);
        }
    }
}
