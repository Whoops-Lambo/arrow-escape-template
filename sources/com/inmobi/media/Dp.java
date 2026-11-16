package com.inmobi.media;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.Surface;
import android.widget.RelativeLayout;
import defpackage.cz;
import defpackage.xi2;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Dp {
    public final cz a;
    public final MediaPlayer b;
    public final Z9 c;
    public final AtomicBoolean d;
    public final ArrayList e;
    public final Ve f;
    public Surface g;
    public InterfaceC4417tl h;
    public final C4170kp i;
    public final Cp j;

    public final void a() {
        if (this.g != null && this.d.get()) {
            Oh oh = (Oh) this.i.d.getValue();
            oh.f.set(false);
            oh.a();
            return;
        }
        Oh oh2 = (Oh) this.i.d.getValue();
        ((xi2) oh2.b).j(EnumC3893aq.HIDDEN);
        oh2.f.set(true);
        AbstractC4097i7.a(oh2.e);
        oh2.e = null;
    }

    public final void b() {
        AbstractC4318q5.a(this.e);
        Ve ve = this.f;
        ve.e = null;
        ve.a.setSurfaceTextureListener(null);
        ve.c.setOnVideoSizeChangedListener(null);
        Oh oh = (Oh) this.i.d.getValue();
        oh.f.set(true);
        AbstractC4097i7.a(oh.e);
        oh.e = null;
        Surface surface = this.g;
        if (surface != null) {
            surface.release();
        }
        this.g = null;
        this.h = null;
    }

    public Dp(cz czVar, MediaPlayer mediaPlayer, RelativeLayout relativeLayout, C4003ep c4003ep, Z9 z9) {
        czVar.getClass();
        mediaPlayer.getClass();
        relativeLayout.getClass();
        c4003ep.getClass();
        this.a = czVar;
        this.b = mediaPlayer;
        this.c = z9;
        this.d = new AtomicBoolean(false);
        this.e = new ArrayList();
        Context context = relativeLayout.getContext();
        context.getClass();
        I5 i5 = new I5(context);
        this.f = new Ve(i5, relativeLayout, mediaPlayer, z9);
        this.i = new C4170kp(czVar, i5, c4003ep.e);
        this.j = new Cp(this);
    }
}
