package defpackage;

import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ta implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher b;
    public final /* synthetic */ DecoderCounters c;

    public /* synthetic */ ta(AudioRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters, int i) {
        this.a = i;
        this.b = eventDispatcher;
        this.c = decoderCounters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        DecoderCounters decoderCounters = this.c;
        AudioRendererEventListener.EventDispatcher eventDispatcher = this.b;
        switch (i) {
            case 0:
                eventDispatcher.lambda$enabled$0(decoderCounters);
                break;
            default:
                eventDispatcher.lambda$disabled$6(decoderCounters);
                break;
        }
    }
}
