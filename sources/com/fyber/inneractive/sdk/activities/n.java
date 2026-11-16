package com.fyber.inneractive.sdk.activities;

import android.media.MediaPlayer;
import com.fyber.inneractive.sdk.util.IAlog;
import com.safedk.android.internal.partials.DTExchangeVideoBridge;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class n implements MediaPlayer.OnPreparedListener {
    public final /* synthetic */ InneractiveRichMediaVideoPlayerActivityCore a;

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        IAlog.a("onPrepared", new Object[0]);
        InneractiveRichMediaVideoPlayerActivityCore inneractiveRichMediaVideoPlayerActivityCore = this.a;
        inneractiveRichMediaVideoPlayerActivityCore.a.seekTo(inneractiveRichMediaVideoPlayerActivityCore.b);
        DTExchangeVideoBridge.VideoViewPlay(this.a.a);
    }

    public n(InneractiveRichMediaVideoPlayerActivityCore inneractiveRichMediaVideoPlayerActivityCore) {
        this.a = inneractiveRichMediaVideoPlayerActivityCore;
    }
}
