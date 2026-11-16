package defpackage;

import androidx.media3.exoplayer.video.VideoSink;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ev1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoSink.Listener b;

    public /* synthetic */ ev1(VideoSink.Listener listener, int i) {
        this.a = i;
        this.b = listener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        VideoSink.Listener listener = this.b;
        switch (i) {
            case 0:
                listener.onFrameDropped();
                break;
            case 1:
                listener.onFirstFrameRendered();
                break;
            default:
                listener.onFrameAvailableForRendering();
                break;
        }
    }
}
