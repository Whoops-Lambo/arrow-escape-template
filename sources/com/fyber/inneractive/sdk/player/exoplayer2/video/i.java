package com.fyber.inneractive.sdk.player.exoplayer2.video;

import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class i implements Runnable {
    public final /* synthetic */ DecoderCounters a;
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher b;

    public i(VideoRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters) {
        this.b = eventDispatcher;
        this.a = decoderCounters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.listener.onVideoEnabled(this.a);
    }
}
