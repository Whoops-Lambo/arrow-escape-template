package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ī, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0370 extends AbstractC1224 implements MediaPlayer.OnInfoListener {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static final String f714 = StringFog.decrypt("8lqvkDemUa/OQIOQNLtZo95blJ8lpm8=\n", "vTTm/lHJHcY=\n");

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final InterfaceC0372 f715;

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        try {
            this.f715.mo453(this, mediaPlayer, i, i2);
        } catch (Throwable th) {
            AbstractC1290.m905(f714, StringFog.decrypt("0od3/E/slIW3mFHxcaWOn/KbYOEdo5Oi+ZNq\n", "l/UFkz3M/es=\n"), th, false);
        }
        Object obj = this.f3723;
        if (obj != null) {
            return ((MediaPlayer.OnInfoListener) obj).onInfo(mediaPlayer, i, i2);
        }
        return false;
    }

    public C0370(MediaPlayer.OnInfoListener onInfoListener, InterfaceC0372 interfaceC0372) {
        super(onInfoListener);
        this.f715 = interfaceC0372;
    }
}
