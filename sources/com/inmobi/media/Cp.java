package com.inmobi.media;

import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.view.Surface;
import com.safedk.android.internal.partials.InMobiVideoBridge;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Cp implements InterfaceC4389sl {
    public final /* synthetic */ Dp a;

    public Cp(Dp dp) {
        this.a = dp;
    }

    @Override // com.inmobi.media.InterfaceC4389sl
    public final void a(SurfaceTexture surfaceTexture) {
        surfaceTexture.getClass();
        Surface surface = new Surface(surfaceTexture);
        Dp dp = this.a;
        dp.g = surface;
        MediaPlayer mediaPlayer = dp.b;
        mediaPlayer.getClass();
        try {
            InMobiVideoBridge.MediaPlayerSetSurface(mediaPlayer, surface);
        } catch (IllegalStateException unused) {
        }
        this.a.a();
        InterfaceC4417tl interfaceC4417tl = this.a.h;
        if (interfaceC4417tl != null) {
            interfaceC4417tl.c();
        }
    }

    @Override // com.inmobi.media.InterfaceC4389sl
    public final void a() {
        Surface surface = this.a.g;
        if (surface != null) {
            surface.release();
        }
        Dp dp = this.a;
        dp.g = null;
        MediaPlayer mediaPlayer = dp.b;
        mediaPlayer.getClass();
        try {
            InMobiVideoBridge.MediaPlayerSetSurface(mediaPlayer, null);
        } catch (IllegalStateException unused) {
        }
        this.a.a();
    }
}
