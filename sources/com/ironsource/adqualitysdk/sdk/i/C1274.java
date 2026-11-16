package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ﺫ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C1274 extends AbstractC1224 implements MediaPlayer.OnPreparedListener {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static final String f3828 = StringFog.decrypt("HON6nWbPQsI26WaGcMtG3jb/bopg0FHRJ+JY\n", "U40q7wO/I7A=\n");

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final InterfaceC1297 f3829;

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        try {
            this.f3829.mo454(this, mediaPlayer);
        } catch (Throwable th) {
            AbstractC1290.m905(f3828, StringFog.decrypt("TsPTnyCeCk4r3PWSHtcQVG7fxIJy0Q1wedTRkSDbBw==\n", "C7Gh8FK+YyA=\n"), th, false);
        }
        Object obj = this.f3723;
        if (obj != null) {
            ((MediaPlayer.OnPreparedListener) obj).onPrepared(mediaPlayer);
        }
    }

    public C1274(MediaPlayer.OnPreparedListener onPreparedListener, InterfaceC1297 interfaceC1297) {
        super(onPreparedListener);
        this.f3829 = interfaceC1297;
    }
}
