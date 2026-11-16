package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ĺ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0381 extends AbstractC1224 implements MediaPlayer.OnCompletionListener {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static final String f748 = StringFog.decrypt("/6YNeTJG8IjEoSF4E1/vmdWmK2QbU/+Cwqk6eS0=\n", "sMhOFl82nO0=\n");

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final InterfaceC0383 f749;

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/adqualitysdk/sdk/i/ĺ;->onCompletion(Landroid/media/MediaPlayer;)V");
        CreativeInfoManager.onVideoCompleted(com.safedk.android.utils.h.f, mediaPlayer, "media-player");
        m455safedk__onCompletion_2d90a0e6dd76115c07301e7a340dd88b(mediaPlayer);
    }

    /* JADX INFO: renamed from: safedk_ĺ_onCompletion_2d90a0e6dd76115c07301e7a340dd88b, reason: contains not printable characters */
    public void m455safedk__onCompletion_2d90a0e6dd76115c07301e7a340dd88b(MediaPlayer p0) {
        try {
            this.f749.mo452(this, p0);
        } catch (Throwable th) {
            AbstractC1290.m905(f748, StringFog.decrypt("IageOePv5MNEtzg03ab+2QG0CSSxoOPuC7ccOvS75MIK\n", "ZNpsVpHPja0=\n"), th, false);
        }
        Object obj = this.f3723;
        if (obj != null) {
            ((MediaPlayer.OnCompletionListener) obj).onCompletion(p0);
        }
    }

    public C0381(MediaPlayer.OnCompletionListener onCompletionListener, InterfaceC0383 interfaceC0383) {
        super(onCompletionListener);
        this.f749 = interfaceC0383;
    }
}
