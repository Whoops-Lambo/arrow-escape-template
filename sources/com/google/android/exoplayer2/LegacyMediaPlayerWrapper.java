package com.google.android.exoplayer2;

import android.media.MediaPlayer;
import android.os.Looper;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.s21;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class LegacyMediaPlayerWrapper extends SimpleBasePlayer {
    private boolean playWhenReady;
    private final MediaPlayer player;

    @Override // com.google.android.exoplayer2.SimpleBasePlayer
    public SimpleBasePlayer.State getState() {
        return new SimpleBasePlayer.State.Builder().setAvailableCommands(new Player.Commands.Builder().addAll(1).build()).setPlayWhenReady(this.playWhenReady, 1).build();
    }

    @Override // com.google.android.exoplayer2.SimpleBasePlayer
    public ListenableFuture handleSetPlayWhenReady(boolean z) {
        this.playWhenReady = z;
        MediaPlayer mediaPlayer = this.player;
        if (z) {
            mediaPlayer.start();
        } else {
            mediaPlayer.pause();
        }
        return s21.b;
    }

    public LegacyMediaPlayerWrapper(Looper looper) {
        super(looper);
        this.player = new MediaPlayer();
    }
}
