package defpackage;

import androidx.media3.exoplayer.source.preload.PreloadMediaSource;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class oy1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PreloadMediaSource b;

    public /* synthetic */ oy1(PreloadMediaSource preloadMediaSource, int i) {
        this.a = i;
        this.b = preloadMediaSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        PreloadMediaSource preloadMediaSource = this.b;
        switch (i) {
            case 0:
                preloadMediaSource.lambda$releasePreloadMediaSource$3();
                break;
            case 1:
                preloadMediaSource.lambda$clear$1();
                break;
            default:
                preloadMediaSource.checkForPreloadError();
                break;
        }
    }
}
