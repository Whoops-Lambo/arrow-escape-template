package com.fyber.inneractive.sdk.activities;

import android.media.MediaPlayer;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class p implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ InneractiveRichMediaVideoPlayerActivityCore a;

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/activities/p;->onCompletion(Landroid/media/MediaPlayer;)V");
        CreativeInfoManager.onVideoCompleted(com.safedk.android.utils.h.p, mediaPlayer, "media-player");
        safedk_p_onCompletion_d00f09dd3cda0a32346ee2b5267eb7a5(mediaPlayer);
    }

    public p(InneractiveRichMediaVideoPlayerActivityCore inneractiveRichMediaVideoPlayerActivityCore) {
        this.a = inneractiveRichMediaVideoPlayerActivityCore;
    }

    public void safedk_p_onCompletion_d00f09dd3cda0a32346ee2b5267eb7a5(MediaPlayer p0) {
        this.a.finish();
    }
}
