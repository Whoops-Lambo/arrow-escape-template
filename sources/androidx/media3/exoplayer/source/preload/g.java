package androidx.media3.exoplayer.source.preload;

import androidx.media3.exoplayer.source.MediaPeriod;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PreloadMediaSource.PreloadMediaPeriodCallback b;
    public final /* synthetic */ MediaPeriod c;

    public /* synthetic */ g(PreloadMediaSource.PreloadMediaPeriodCallback preloadMediaPeriodCallback, MediaPeriod mediaPeriod, int i) {
        this.a = i;
        this.b = preloadMediaPeriodCallback;
        this.c = mediaPeriod;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        MediaPeriod mediaPeriod = this.c;
        PreloadMediaSource.PreloadMediaPeriodCallback preloadMediaPeriodCallback = this.b;
        switch (i) {
            case 0:
                preloadMediaPeriodCallback.lambda$onPrepared$0(mediaPeriod);
                break;
            default:
                preloadMediaPeriodCallback.lambda$onContinueLoadingRequested$1(mediaPeriod);
                break;
        }
    }
}
