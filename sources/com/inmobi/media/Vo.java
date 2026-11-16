package com.inmobi.media;

import android.media.MediaPlayer;
import com.safedk.android.internal.partials.InMobiVideoBridge;
import defpackage.az2;
import defpackage.wr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Vo implements wr0 {
    public final /* synthetic */ MediaPlayer a;

    public Vo(MediaPlayer mediaPlayer) {
        this.a = mediaPlayer;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        InMobiVideoBridge.MediaPlayerRelease(this.a);
        return az2.a;
    }
}
