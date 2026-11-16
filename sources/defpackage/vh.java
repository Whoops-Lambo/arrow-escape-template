package defpackage;

import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.preload.BasePreloadManager;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ BasePreloadManager b;
    public final /* synthetic */ MediaSource c;

    public /* synthetic */ vh(BasePreloadManager basePreloadManager, MediaSource mediaSource, int i) {
        this.a = i;
        this.b = basePreloadManager;
        this.c = mediaSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        MediaSource mediaSource = this.c;
        BasePreloadManager basePreloadManager = this.b;
        switch (i) {
            case 0:
                basePreloadManager.lambda$onPreloadCompleted$2(mediaSource);
                break;
            default:
                basePreloadManager.lambda$onPreloadSkipped$5(mediaSource);
                break;
        }
    }
}
