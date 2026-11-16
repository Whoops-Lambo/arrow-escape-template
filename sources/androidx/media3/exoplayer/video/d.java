package androidx.media3.exoplayer.video;

import androidx.media3.common.VideoSize;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoSize b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d(Object obj, VideoSize videoSize, int i) {
        this.a = i;
        this.c = obj;
        this.b = videoSize;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        VideoSize videoSize = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((DefaultVideoSink.FrameRendererImpl) obj).lambda$onVideoSizeChanged$0(videoSize);
                break;
            default:
                ((VideoSink.Listener) obj).onVideoSizeChanged(videoSize);
                break;
        }
    }
}
