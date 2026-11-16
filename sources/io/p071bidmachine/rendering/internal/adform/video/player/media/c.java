package io.p071bidmachine.rendering.internal.adform.video.player.media;

import android.media.MediaPlayer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements MediaPlayer.OnPreparedListener {
    public final /* synthetic */ e a;

    public c(e eVar) {
        this.a = eVar;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        mediaPlayer.getClass();
        mediaPlayer.seekTo(1);
        this.a.x();
    }
}
