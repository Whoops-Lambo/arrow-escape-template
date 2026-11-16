package io.p071bidmachine.rendering.internal.adform.video.player.media;

import android.media.MediaPlayer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements MediaPlayer.OnVideoSizeChangedListener {
    public final /* synthetic */ h a;

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        this.a.setVideoAspectRatio(i / i2);
    }

    public f(h hVar) {
        this.a = hVar;
    }
}
