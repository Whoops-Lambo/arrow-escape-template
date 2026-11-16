package defpackage;

import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioSink;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher b;
    public final /* synthetic */ AudioSink.AudioTrackConfig c;

    public /* synthetic */ xa(AudioRendererEventListener.EventDispatcher eventDispatcher, AudioSink.AudioTrackConfig audioTrackConfig, int i) {
        this.a = i;
        this.b = eventDispatcher;
        this.c = audioTrackConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AudioSink.AudioTrackConfig audioTrackConfig = this.c;
        AudioRendererEventListener.EventDispatcher eventDispatcher = this.b;
        switch (i) {
            case 0:
                eventDispatcher.lambda$audioTrackInitialized$10(audioTrackConfig);
                break;
            default:
                eventDispatcher.lambda$audioTrackReleased$11(audioTrackConfig);
                break;
        }
    }
}
