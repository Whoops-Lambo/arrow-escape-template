package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ﹹ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C1248 extends AbstractC1224 implements MediaPlayer.OnSeekCompleteListener {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static final String f3770 = StringFog.decrypt("pjRM2gHZOVKEKnPaENc2VJouetEBwD5YijVt3hDdCA==\n", "6Vofv2Syej0=\n");

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final InterfaceC1254 f3771;

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        try {
            this.f3771.mo451(this, mediaPlayer);
        } catch (Throwable th) {
            AbstractC1290.m905(f3770, StringFog.decrypt("si9kcQDmkrvXMEJ8Pq+IoZIzc2xSqZWGkjh9XR2ri7mSKXM=\n", "910WHnLG+9U=\n"), th, false);
        }
        Object obj = this.f3723;
        if (obj != null) {
            ((MediaPlayer.OnSeekCompleteListener) obj).onSeekComplete(mediaPlayer);
        }
    }

    public C1248(MediaPlayer.OnSeekCompleteListener onSeekCompleteListener, InterfaceC1254 interfaceC1254) {
        super(onSeekCompleteListener);
        this.f3771 = interfaceC1254;
    }
}
