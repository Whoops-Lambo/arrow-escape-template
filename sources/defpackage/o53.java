package defpackage;

import androidx.media3.exoplayer.video.VideoRendererEventListener;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o53 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ o53(VideoRendererEventListener.EventDispatcher eventDispatcher, int i, long j) {
        this.b = eventDispatcher;
        this.d = i;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = this.d;
        long j = this.c;
        VideoRendererEventListener.EventDispatcher eventDispatcher = this.b;
        switch (i) {
            case 0:
                eventDispatcher.lambda$droppedFrames$3(i2, j);
                break;
            default:
                eventDispatcher.lambda$reportVideoFrameProcessingOffset$4(j, i2);
                break;
        }
    }

    public /* synthetic */ o53(VideoRendererEventListener.EventDispatcher eventDispatcher, long j, int i) {
        this.b = eventDispatcher;
        this.c = j;
        this.d = i;
    }
}
