package com.inmobi.media;

import android.media.MediaPlayer;
import android.widget.RelativeLayout;
import defpackage.z43;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Ve {
    public final I5 a;
    public final RelativeLayout b;
    public final MediaPlayer c;
    public final Z9 d;
    public InterfaceC4389sl e;

    public Ve(I5 i5, RelativeLayout relativeLayout, MediaPlayer mediaPlayer, Z9 z9) {
        i5.getClass();
        relativeLayout.getClass();
        mediaPlayer.getClass();
        this.a = i5;
        this.b = relativeLayout;
        this.c = mediaPlayer;
        this.d = z9;
    }

    public final void a(InterfaceC4389sl interfaceC4389sl) {
        interfaceC4389sl.getClass();
        this.e = interfaceC4389sl;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13, -1);
        this.b.addView(this.a, layoutParams);
        a();
        int videoWidth = this.c.getVideoWidth();
        int videoHeight = this.c.getVideoHeight();
        I5 i5 = this.a;
        if (videoHeight == 0) {
            i5.setAspectRatio(1.0f);
        } else {
            i5.setAspectRatio(videoWidth / videoHeight);
        }
        this.a.setSurfaceTextureListener(new Ue(this));
    }

    public final void a() {
        this.c.setOnVideoSizeChangedListener(new z43(this, 0));
    }

    public static final void a(Ve ve, MediaPlayer mediaPlayer, int i, int i2) {
        Z9 z9 = ve.d;
        if (z9 != null) {
            z9.a("NativePlayerTextureManager", defpackage.nj.i(i, i2, "Video Size Changed: ", " x "));
        }
        int videoWidth = ve.c.getVideoWidth();
        int videoHeight = ve.c.getVideoHeight();
        I5 i5 = ve.a;
        if (videoHeight == 0) {
            i5.setAspectRatio(1.0f);
        } else {
            i5.setAspectRatio(videoWidth / videoHeight);
        }
    }
}
