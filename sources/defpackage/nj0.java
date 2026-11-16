package defpackage;

import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.source.MediaSource;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class nj0 implements ol2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaSource.Factory b;

    public /* synthetic */ nj0(MediaSource.Factory factory, int i) {
        this.a = i;
        this.b = factory;
    }

    @Override // defpackage.ol2
    public final Object get() {
        int i = this.a;
        MediaSource.Factory factory = this.b;
        switch (i) {
            case 0:
                return ExoPlayer.Builder.lambda$new$5(factory);
            case 1:
                return ExoPlayer.Builder.lambda$setMediaSourceFactory$17(factory);
            case 2:
                return ExoPlayer.Builder.lambda$new$7(factory);
            default:
                return ExoPlayer.Builder.lambda$new$9(factory);
        }
    }
}
