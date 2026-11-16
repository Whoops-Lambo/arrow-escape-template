package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class n implements Runnable {
    public final /* synthetic */ Surface a;
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher b;

    public n(VideoRendererEventListener.EventDispatcher eventDispatcher, Surface surface) {
        this.b = eventDispatcher;
        this.a = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.listener.onRenderedFirstFrame(this.a);
    }
}
