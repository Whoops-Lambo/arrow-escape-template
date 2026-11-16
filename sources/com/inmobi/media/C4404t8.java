package com.inmobi.media;

import android.widget.FrameLayout;
import androidx.media3.exoplayer.ExoPlayer;

/* JADX INFO: renamed from: com.inmobi.media.t8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4404t8 {
    public final I5 a;
    public final C8 b;
    public final ExoPlayer c;
    public final Y9 d;
    public InterfaceC4389sl e;
    public C3959d8 f;

    public C4404t8(I5 i5, C8 c8, ExoPlayer exoPlayer, Y9 y9) {
        i5.getClass();
        c8.getClass();
        exoPlayer.getClass();
        this.a = i5;
        this.b = c8;
        this.c = exoPlayer;
        this.d = y9;
    }

    public final void a(InterfaceC4389sl interfaceC4389sl) {
        interfaceC4389sl.getClass();
        this.e = interfaceC4389sl;
        this.a.setOnPositionChangeListener(this.f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.b.addView(this.a, layoutParams);
        int i = this.c.getVideoSize().width;
        int i2 = this.c.getVideoSize().height;
        I5 i5 = this.a;
        if (i2 == 0) {
            i5.setAspectRatio(1.0f);
        } else {
            i5.setAspectRatio(i / i2);
        }
        this.a.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC4376s8(this));
    }

    public final void a(int i, int i2) {
        Y9 y9 = this.d;
        if (y9 != null) {
            ((Z9) y9).a("HtmlPlayerTextureManager", defpackage.nj.i(i, i2, "Video Size Changed: ", " x "));
        }
        int i3 = this.c.getVideoSize().width;
        int i4 = this.c.getVideoSize().height;
        I5 i5 = this.a;
        if (i4 == 0) {
            i5.setAspectRatio(1.0f);
        } else {
            i5.setAspectRatio(i3 / i4);
        }
    }
}
