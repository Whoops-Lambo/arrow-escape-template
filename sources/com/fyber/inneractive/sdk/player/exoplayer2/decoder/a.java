package com.fyber.inneractive.sdk.player.exoplayer2.decoder;

import android.media.MediaCodec;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class a {
    public final MediaCodec.CryptoInfo a;
    public final MediaCodec.CryptoInfo.Pattern b = new MediaCodec.CryptoInfo.Pattern(0, 0);

    public static void a(a aVar) {
        aVar.b.set(0, 0);
        aVar.a.setPattern(aVar.b);
    }

    public a(MediaCodec.CryptoInfo cryptoInfo) {
        this.a = cryptoInfo;
    }
}
