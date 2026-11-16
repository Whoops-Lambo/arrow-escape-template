package io.p071bidmachine.rendering.internal.adform.video.player.media;

import android.media.MediaPlayer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements MediaPlayer.OnSeekCompleteListener {
    public final /* synthetic */ e a;

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        Long lValueOf;
        e eVar = this.a;
        try {
            lValueOf = Long.valueOf(eVar.d());
        } catch (Exception unused) {
            lValueOf = null;
        }
        eVar.l(lValueOf);
    }

    public d(e eVar) {
        this.a = eVar;
    }
}
