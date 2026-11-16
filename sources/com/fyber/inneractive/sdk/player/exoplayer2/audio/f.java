package com.fyber.inneractive.sdk.player.exoplayer2.audio;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class f implements Runnable {
    public final /* synthetic */ com.fyber.inneractive.sdk.player.exoplayer2.o a;
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher b;

    public f(AudioRendererEventListener.EventDispatcher eventDispatcher, com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
        this.b = eventDispatcher;
        this.a = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.listener.onAudioInputFormatChanged(this.a);
    }
}
