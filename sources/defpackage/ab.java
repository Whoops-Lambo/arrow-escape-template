package defpackage;

import androidx.media3.exoplayer.audio.AudioRendererEventListener;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ab implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ ab(AudioRendererEventListener.EventDispatcher eventDispatcher, Exception exc, int i) {
        this.a = i;
        this.b = eventDispatcher;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Exception exc = this.c;
        AudioRendererEventListener.EventDispatcher eventDispatcher = this.b;
        switch (i) {
            case 0:
                eventDispatcher.lambda$audioCodecError$9(exc);
                break;
            default:
                eventDispatcher.lambda$audioSinkError$8(exc);
                break;
        }
    }
}
