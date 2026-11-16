package io.p071bidmachine.rendering.internal.adform.video.player.media;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.Surface;
import android.view.View;
import com.moloco.sdk.internal.ilrd.p;
import com.safedk.android.internal.partials.BidMachineVideoBridge;
import com.unity3d.services.UnityAdsConstants;
import defpackage.dn;
import defpackage.dy;
import defpackage.hh;
import defpackage.kc2;
import defpackage.tb5;
import defpackage.yy;
import io.p071bidmachine.rendering.internal.adform.video.player.a;
import io.p071bidmachine.rendering.internal.adform.video.player.b;
import io.p071bidmachine.rendering.internal.y;
import io.p071bidmachine.rendering.utils.d;
import io.p071bidmachine.util.c;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends b {
    public static final dn q = kc2.a(new yy("MediaPlayerReleaseProcess").plus(tb5.a()).plus(y.e.b()));
    public final Context m;
    public MediaPlayer n;
    public final h o;
    public float p;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.p071bidmachine.rendering.internal.adform.video.player.b
    public final void o() {
        this.h = null;
        p pVar = this.b;
        ((AtomicBoolean) pVar.d).set(false);
        pVar.e();
        a aVar = this.a;
        ((AtomicBoolean) aVar.b).set(false);
        d.a.getClass();
        try {
            if (aVar instanceof c) {
                ((c) aVar).a(true);
            }
        } catch (Throwable unused) {
        }
        io.p071bidmachine.rendering.utils.taskmanager.b.a.removeCallbacks(aVar);
        h hVar = this.o;
        hVar.a(null);
        Surface surface = hVar.d;
        if (surface != null) {
            surface.release();
        }
        hVar.d = null;
        hVar.c = null;
        hVar.a.setSurfaceTextureListener(null);
        B(this.n);
    }

    public final MediaPlayer A() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setLooping(false);
        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(3).build());
        mediaPlayer.setOnPreparedListener(new c(this));
        mediaPlayer.setOnErrorListener(new b(this));
        mediaPlayer.setOnSeekCompleteListener(new d(this));
        mediaPlayer.setOnCompletionListener(new a(this));
        return mediaPlayer;
    }

    @Override // io.p071bidmachine.rendering.internal.adform.video.player.b
    public final long d() {
        return this.n.getCurrentPosition();
    }

    @Override // io.p071bidmachine.rendering.internal.adform.video.player.b
    public final void e(float f) {
        this.n.setVolume(f, f);
    }

    @Override // io.p071bidmachine.rendering.internal.adform.video.player.b
    public final void f(long j) {
        this.n.seekTo((int) j);
    }

    @Override // io.p071bidmachine.rendering.internal.adform.video.player.b
    public final long h() {
        return this.n.getDuration();
    }

    @Override // io.p071bidmachine.rendering.internal.adform.video.player.b
    public final float m() {
        return this.p;
    }

    @Override // io.p071bidmachine.rendering.internal.adform.video.player.b
    public final void n(float f) {
        this.p = f;
        e(f);
        i(f);
    }

    @Override // io.p071bidmachine.rendering.internal.adform.video.player.b
    public final boolean p() {
        return this.n.isPlaying();
    }

    @Override // io.p071bidmachine.rendering.internal.adform.video.player.b
    public final void q() {
        BidMachineVideoBridge.MediaPlayerPause(this.n);
    }

    @Override // io.p071bidmachine.rendering.internal.adform.video.player.b
    public final void r() {
        BidMachineVideoBridge.MediaPlayerStart(this.n);
    }

    @Override // io.p071bidmachine.rendering.internal.adform.video.player.b
    public final void s() {
        this.n.prepareAsync();
    }

    @Override // io.p071bidmachine.rendering.internal.adform.video.player.b
    public final void t() {
        BidMachineVideoBridge.MediaPlayerStop(this.n);
    }

    @Override // io.p071bidmachine.rendering.internal.adform.video.player.b
    public final View u() {
        return this.o;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        super(context);
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.m = applicationContext;
        this.n = A();
        h hVar = new h(context);
        hVar.setListener(new io.p071bidmachine.rendering.internal.adform.countdown.a(this, 2));
        hVar.setMediaPlayer(this.n);
        this.o = hVar;
        this.p = 1.0f;
    }

    public static void B(MediaPlayer mediaPlayer) {
        mediaPlayer.getClass();
        dy dyVar = null;
        mediaPlayer.setOnPreparedListener(null);
        mediaPlayer.setOnErrorListener(null);
        mediaPlayer.setOnSeekCompleteListener(null);
        mediaPlayer.setOnCompletionListener(null);
        mediaPlayer.setOnVideoSizeChangedListener(null);
        try {
            mediaPlayer.setVolume(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } catch (Throwable unused) {
        }
        tb5.t(q, null, null, new hh(mediaPlayer, dyVar, 27), 3);
    }

    @Override // io.p071bidmachine.rendering.internal.adform.video.player.b
    public final void j(Uri uri) throws IOException {
        uri.getClass();
        B(this.n);
        MediaPlayer mediaPlayerA = A();
        float f = this.p;
        mediaPlayerA.setVolume(f, f);
        BidMachineVideoBridge.MediaPlayerSetDataSource(mediaPlayerA, this.m, uri);
        this.o.setMediaPlayer(mediaPlayerA);
        this.n = mediaPlayerA;
    }

    @Override // io.p071bidmachine.rendering.internal.adform.video.player.b
    public final void y() {
        q();
        v();
    }

    @Override // io.p071bidmachine.rendering.internal.adform.video.player.b
    public final void z() {
        r();
        w();
    }
}
