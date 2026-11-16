package defpackage;

import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.video.VideoRendererEventListener;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class p53 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher b;
    public final /* synthetic */ DecoderCounters c;

    public /* synthetic */ p53(VideoRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters, int i) {
        this.a = i;
        this.b = eventDispatcher;
        this.c = decoderCounters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        DecoderCounters decoderCounters = this.c;
        VideoRendererEventListener.EventDispatcher eventDispatcher = this.b;
        switch (i) {
            case 0:
                eventDispatcher.lambda$disabled$8(decoderCounters);
                break;
            default:
                eventDispatcher.lambda$enabled$0(decoderCounters);
                break;
        }
    }
}
