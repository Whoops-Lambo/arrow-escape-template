package com.vungle.ads.internal.ui.view;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.VisibleForTesting;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.partials.LiftoffMonetizeVideoBridge;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.n1;
import com.vungle.ads.internal.ui.view.d;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import com.vungle.ads.nativead.NativeVideoListener;
import defpackage.az2;
import defpackage.f6;
import defpackage.g6;
import defpackage.j52;
import defpackage.jc1;
import defpackage.k52;
import defpackage.oc3;
import defpackage.sr0;
import defpackage.tb5;
import defpackage.z43;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class d extends FrameLayout implements TextureView.SurfaceTextureListener {
    public boolean a;
    public final ViewTreeObserver.OnScrollChangedListener b;
    public final ViewTreeObserver.OnGlobalLayoutListener c;
    public float d;
    public TextureView e;
    public Surface f;
    public MediaPlayer g;
    public Uri h;
    public AtomicBoolean i;
    public AtomicBoolean j;
    public boolean k;
    public boolean l;
    public int m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public int r;
    public int s;
    public com.vungle.ads.nativead.b t;
    public b u;
    public int v;
    public final Handler w;
    public final a x;
    public sr0 y;

    @VisibleForTesting
    public static /* synthetic */ void getMediaPlayerFactory$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getSurface$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getTexture$vungle_ads_release$annotations() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.d, this, me);
        return super.dispatchTouchEvent(me);
    }

    public final void h() {
        this.l = true;
        g();
    }

    public final void i() {
        Surface surface;
        this.k = true;
        this.l = false;
        this.q = false;
        boolean z = u.a;
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("play(): prepared=");
        sbA.append(this.i);
        sbA.append(", surfaceValid=");
        Surface surface2 = this.f;
        sbA.append(surface2 != null ? Boolean.valueOf(surface2.isValid()) : null);
        sbA.append(", visible=");
        sbA.append(e());
        t.a("NativeAd-Video", sbA.toString());
        if (!this.i.get() || (surface = this.f) == null || !surface.isValid() || !e()) {
            k();
            return;
        }
        MediaPlayer mediaPlayer = this.g;
        if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
            StringBuilder sbA2 = com.iab.omid.library.vungle.internal.l.a("play(): pos=");
            MediaPlayer mediaPlayer2 = this.g;
            sbA2.append(mediaPlayer2 != null ? Integer.valueOf(mediaPlayer2.getCurrentPosition()) : null);
            sbA2.append(" ms");
            t.a("NativeAd-Video", sbA2.toString());
            MediaPlayer mediaPlayer3 = this.g;
            if (mediaPlayer3 != null) {
                LiftoffMonetizeVideoBridge.MediaPlayerStart(mediaPlayer3);
            }
            f();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void c() {
        MediaPlayer mediaPlayer;
        Surface surface;
        if (this.a) {
            if (!e() || !this.k || this.l) {
                if (this.i.get() && (mediaPlayer = this.g) != null && mediaPlayer.isPlaying()) {
                    boolean z = u.a;
                    t.a("NativeAd-Video", "auto-pause: visibility NOT enough");
                    g();
                    return;
                }
                return;
            }
            if (!this.i.get() || (surface = this.f) == null || !surface.isValid()) {
                k();
                return;
            }
            MediaPlayer mediaPlayer2 = this.g;
            if ((mediaPlayer2 == null || !mediaPlayer2.isPlaying()) && !this.q) {
                boolean z2 = u.a;
                StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("auto-resume: visibility OK, start() at pos=");
                MediaPlayer mediaPlayer3 = this.g;
                sbA.append(mediaPlayer3 != null ? Integer.valueOf(mediaPlayer3.getCurrentPosition()) : null);
                sbA.append(" ms");
                t.a("NativeAd-Video", sbA.toString());
                MediaPlayer mediaPlayer4 = this.g;
                if (mediaPlayer4 != null) {
                    LiftoffMonetizeVideoBridge.MediaPlayerStart(mediaPlayer4);
                }
                f();
            }
        }
    }

    public final void d() {
        if (this.g != null) {
            return;
        }
        MediaPlayer mediaPlayer = (MediaPlayer) this.y.invoke();
        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(3).build());
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: lc3
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer2) {
                d.a(this.a, mediaPlayer2);
            }
        });
        mediaPlayer.setOnVideoSizeChangedListener(new z43(this, 1));
        mediaPlayer.setOnCompletionListener(new oc3(this, 0));
        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: pc3
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                return d.b(this.a, mediaPlayer2, i, i2);
            }
        });
        this.g = mediaPlayer;
    }

    public final void f() {
        NativeVideoListener nativeVideoListener;
        this.w.removeCallbacks(this.x);
        this.w.post(this.x);
        com.vungle.ads.nativead.b bVar = this.t;
        if (bVar == null || (nativeVideoListener = ((m) bVar).getNativeVideoListener()) == null) {
            return;
        }
        nativeVideoListener.onVideoPlay();
    }

    public final void g() {
        Object j52Var;
        NativeVideoListener nativeVideoListener;
        MediaPlayer mediaPlayer = this.g;
        if (mediaPlayer != null && this.i.get() && mediaPlayer.isPlaying()) {
            boolean z = u.a;
            StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("pauseInternal(): pos=");
            sbA.append(mediaPlayer.getCurrentPosition());
            sbA.append(" ms");
            t.a("NativeAd-Video", sbA.toString());
            LiftoffMonetizeVideoBridge.MediaPlayerPause(mediaPlayer);
            this.w.removeCallbacks(this.x);
            b();
            com.vungle.ads.nativead.b bVar = this.t;
            if (bVar != null && (nativeVideoListener = ((m) bVar).getNativeVideoListener()) != null) {
                nativeVideoListener.onVideoPause();
            }
        } else {
            boolean z2 = u.a;
            t.a("NativeAd-Video", "pauseInternal(): no-op (not playing or no player)");
        }
        try {
            j52Var = Integer.valueOf(mediaPlayer != null ? mediaPlayer.getCurrentPosition() : this.m);
        } catch (Throwable th) {
            j52Var = new j52(th);
        }
        Object objValueOf = Integer.valueOf(this.m);
        if (j52Var instanceof j52) {
            j52Var = objValueOf;
        }
        this.m = ((Number) j52Var).intValue();
    }

    public final int getCurrentPositionMs() {
        Object j52Var;
        if (!this.i.get()) {
            int i = this.m;
            if (i < 0) {
                return 0;
            }
            return i;
        }
        try {
            MediaPlayer mediaPlayer = this.g;
            j52Var = Integer.valueOf(mediaPlayer != null ? mediaPlayer.getCurrentPosition() : this.m);
        } catch (Throwable th) {
            j52Var = new j52(th);
        }
        Object objValueOf = Integer.valueOf(this.m);
        if (j52Var instanceof j52) {
            j52Var = objValueOf;
        }
        int iIntValue = ((Number) j52Var).intValue();
        if (iIntValue < 0) {
            return 0;
        }
        return iIntValue;
    }

    public final int getDurationMs() {
        return this.n;
    }

    @NotNull
    public final sr0 getMediaPlayerFactory$vungle_ads_release() {
        return this.y;
    }

    @Nullable
    public final Surface getSurface$vungle_ads_release() {
        return this.f;
    }

    @NotNull
    public final TextureView getTexture$vungle_ads_release() {
        return this.e;
    }

    public final void j() {
        if (this.k && this.l && !this.q) {
            i();
        }
    }

    public final void k() {
        Object j52Var;
        try {
            Uri uri = this.h;
            if (uri != null && !this.i.get() && !this.j.get()) {
                d();
                this.j.set(true);
                this.i.set(false);
                MediaPlayer mediaPlayer = this.g;
                if (mediaPlayer != null) {
                    mediaPlayer.reset();
                }
                MediaPlayer mediaPlayer2 = this.g;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.setLooping(this.p);
                }
                MediaPlayer mediaPlayer3 = this.g;
                if (mediaPlayer3 != null) {
                    LiftoffMonetizeVideoBridge.MediaPlayerSetSurface(mediaPlayer3, this.f);
                }
                MediaPlayer mediaPlayer4 = this.g;
                if (mediaPlayer4 != null) {
                    LiftoffMonetizeVideoBridge.MediaPlayerSetDataSource(mediaPlayer4, getContext(), uri);
                }
                boolean z = u.a;
                StringBuilder sb = new StringBuilder("prepareAsync(): uri=");
                sb.append(uri);
                sb.append(", surfaceValid=");
                Surface surface = this.f;
                j52Var = null;
                sb.append(surface != null ? Boolean.valueOf(surface.isValid()) : null);
                t.a("NativeAd-Video", sb.toString());
                MediaPlayer mediaPlayer5 = this.g;
                if (mediaPlayer5 != null) {
                    mediaPlayer5.prepareAsync();
                    j52Var = az2.a;
                }
                Throwable thB = k52.b(j52Var);
                if (thB != null) {
                    String strValueOf = String.valueOf(thB.getLocalizedMessage());
                    com.vungle.ads.nativead.b bVar = this.t;
                    if (bVar != null) {
                        ((m) bVar).a(strValueOf, -1);
                    }
                }
            }
        } catch (Throwable th) {
            j52Var = new j52(th);
        }
    }

    public final void l() {
        Object j52Var;
        Object j52Var2;
        Object j52Var3 = az2.a;
        boolean z = u.a;
        t.a("NativeAd-Video", "release()");
        StringBuilder sb = new StringBuilder("pause() at pos=");
        MediaPlayer mediaPlayer = this.g;
        sb.append(mediaPlayer != null ? Integer.valueOf(mediaPlayer.getCurrentPosition()) : null);
        sb.append(" ms");
        t.a("NativeAd-Video", sb.toString());
        this.l = true;
        this.k = false;
        g();
        this.w.removeCallbacks(this.x);
        try {
            MediaPlayer mediaPlayer2 = this.g;
            if (mediaPlayer2 != null) {
                LiftoffMonetizeVideoBridge.MediaPlayerSetSurface(mediaPlayer2, null);
                j52Var = j52Var3;
            } else {
                j52Var = null;
            }
        } catch (Throwable th) {
            j52Var = new j52(th);
        }
        Throwable thB = k52.b(j52Var);
        if (thB != null) {
            boolean z2 = u.a;
            t.a("NativeAd-Video", "Failed to clear Surface", thB);
        }
        try {
            MediaPlayer mediaPlayer3 = this.g;
            if (mediaPlayer3 != null) {
                LiftoffMonetizeVideoBridge.MediaPlayerStop(mediaPlayer3);
                j52Var2 = j52Var3;
            } else {
                j52Var2 = null;
            }
        } catch (Throwable th2) {
            j52Var2 = new j52(th2);
        }
        Throwable thB2 = k52.b(j52Var2);
        if (thB2 != null) {
            boolean z3 = u.a;
            t.a("NativeAd-Video", "Failed to stop MediaPlayer", thB2);
        }
        try {
            MediaPlayer mediaPlayer4 = this.g;
            if (mediaPlayer4 != null) {
                LiftoffMonetizeVideoBridge.MediaPlayerRelease(mediaPlayer4);
            } else {
                j52Var3 = null;
            }
        } catch (Throwable th3) {
            j52Var3 = new j52(th3);
        }
        Throwable thB3 = k52.b(j52Var3);
        if (thB3 != null) {
            boolean z4 = u.a;
            t.a("NativeAd-Video", "Failed to release MediaPlayer", thB3);
        }
        this.g = null;
        Surface surface = this.f;
        if (surface != null) {
            surface.release();
        }
        this.f = null;
        this.i.set(false);
        this.j.set(false);
    }

    public final void m() {
        boolean z = u.a;
        t.a("NativeAd-Video", "setAutoVisibility enabled=true threshold=0.01");
        this.a = true;
        this.d = tb5.f(0.01f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        boolean z = u.a;
        t.a("NativeAd-Video", "onAttachedToWindow()");
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.b);
        getViewTreeObserver().addOnGlobalLayoutListener(this.c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        boolean z = u.a;
        t.a("NativeAd-Video", "onDetachedFromWindow()");
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnScrollChangedListener(this.b);
        getViewTreeObserver().removeOnGlobalLayoutListener(this.c);
        g();
        Surface surface = this.f;
        if (surface != null) {
            surface.release();
        }
        this.f = null;
    }

    public final void setLooping(boolean z) {
        boolean z2 = u.a;
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("setLooping to ");
        sbA.append(this.p);
        t.a("NativeAd-Video", sbA.toString());
        this.p = z;
        MediaPlayer mediaPlayer = this.g;
        if (mediaPlayer == null) {
            return;
        }
        mediaPlayer.setLooping(z);
    }

    public final void setMuted(boolean z) {
        boolean z2 = u.a;
        t.a("NativeAd-Video", "setMuted to " + z);
        this.o = z;
        float f = z ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f;
        MediaPlayer mediaPlayer = this.g;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(f, f);
        }
        com.vungle.ads.nativead.b bVar = this.t;
        if (bVar != null) {
            m mVar = (m) bVar;
            if (z) {
                n1.a(mVar.getInternal(), "video.mute");
                mVar.getInternal().a(9, (Map) null);
                NativeVideoListener nativeVideoListener = mVar.getNativeVideoListener();
                if (nativeVideoListener != null) {
                    nativeVideoListener.onVideoMute();
                    return;
                }
                return;
            }
            n1.a(mVar.getInternal(), "video.unmute");
            mVar.getInternal().a(10, (Map) null);
            NativeVideoListener nativeVideoListener2 = mVar.getNativeVideoListener();
            if (nativeVideoListener2 != null) {
                nativeVideoListener2.onVideoUnmute();
            }
        }
    }

    public final void setSurface$vungle_ads_release(@Nullable Surface surface) {
        this.f = surface;
    }

    public final void setVideoTransformCallback$vungle_ads_release(@Nullable b bVar) {
        this.u = bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.b = new g6(this, 1);
        this.c = new f6(this, 1);
        this.d = 0.01f;
        TextureView textureView = new TextureView(context);
        textureView.setSurfaceTextureListener(this);
        this.e = textureView;
        this.i = new AtomicBoolean(false);
        this.j = new AtomicBoolean(false);
        this.v = -1;
        this.w = new Handler(Looper.getMainLooper());
        this.x = new a(this);
        this.y = c.a;
        setClickable(false);
        setFocusable(false);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.e, new FrameLayout.LayoutParams(-1, -1));
    }

    public static final void a(d dVar, MediaPlayer mediaPlayer) {
        float f;
        Surface surface;
        dVar.getClass();
        com.vungle.ads.nativead.b bVar = dVar.t;
        if (bVar != null) {
            ((m) bVar).b();
        }
        dVar.n = mediaPlayer.getDuration();
        dVar.j.set(false);
        dVar.i.set(true);
        int i = dVar.m;
        if (i > 0) {
            mediaPlayer.seekTo(i);
        }
        if (dVar.o) {
            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else {
            f = 1.0f;
        }
        MediaPlayer mediaPlayer2 = dVar.g;
        if (mediaPlayer2 != null) {
            mediaPlayer2.setVolume(f, f);
        }
        boolean z = u.a;
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("onPrepared(): duration=");
        sbA.append(dVar.n);
        sbA.append(" ms lastPos=");
        sbA.append(dVar.m);
        sbA.append(" wantPlay=");
        sbA.append(dVar.k);
        t.a("NativeAd-Video", sbA.toString());
        if (dVar.k && (surface = dVar.f) != null && surface.isValid()) {
            t.a("NativeAd-Video", "start video on prepared.");
            LiftoffMonetizeVideoBridge.MediaPlayerStart(mediaPlayer);
            dVar.f();
        }
    }

    public static final void b(d dVar, MediaPlayer mediaPlayer) {
        dVar.getClass();
        boolean z = u.a;
        t.a("NativeAd-Video", "onCompletion()");
        dVar.m = dVar.n;
        dVar.q = true;
        dVar.w.removeCallbacks(dVar.x);
        dVar.b();
        dVar.v = 100;
        com.vungle.ads.nativead.b bVar = dVar.t;
        if (bVar != null) {
            ((m) bVar).a(100);
        }
        com.vungle.ads.nativead.b bVar2 = dVar.t;
        if (bVar2 != null) {
            m mVar = (m) bVar2;
            n1.a(mVar.getInternal(), "video.close");
            mVar.getInternal().a(3, (Map) null);
            NativeVideoListener nativeVideoListener = mVar.getNativeVideoListener();
            if (nativeVideoListener != null) {
                nativeVideoListener.onVideoEnd();
            }
        }
    }

    public final boolean e() {
        if (!isShown()) {
            return false;
        }
        Rect rect = new Rect();
        if (!getGlobalVisibleRect(rect)) {
            return false;
        }
        long jHeight = ((long) rect.height()) * ((long) rect.width());
        long height = ((long) getHeight()) * ((long) getWidth());
        if (height <= 0 || jHeight / height < this.d) {
            return false;
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Object j52Var;
        surfaceTexture.getClass();
        Surface surface = this.f;
        if (surface != null) {
            surface.release();
        }
        Surface surface2 = new Surface(surfaceTexture);
        this.f = surface2;
        try {
            MediaPlayer mediaPlayer = this.g;
            if (mediaPlayer != null) {
                LiftoffMonetizeVideoBridge.MediaPlayerSetSurface(mediaPlayer, surface2);
                j52Var = az2.a;
            } else {
                j52Var = null;
            }
        } catch (Throwable th) {
            j52Var = new j52(th);
        }
        Throwable thB = k52.b(j52Var);
        if (thB != null) {
            boolean z = u.a;
            t.a("NativeAd-Video", "Failed to set surface", thB);
        }
        boolean z2 = j52Var instanceof j52;
        boolean z3 = u.a;
        StringBuilder sbT = jc1.t("onSurfaceTextureAvailable(): ", i, " x ", i2, ", prepared=");
        sbT.append(this.i);
        sbT.append(", wantPlay=");
        sbT.append(this.k);
        sbT.append(", surfaceRet=");
        sbT.append(!z2);
        t.a("NativeAd-Video", sbT.toString());
        if (!z2 && this.i.get() && this.k) {
            StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("onSurfaceTextureAvailable and videoCompleted=");
            sbA.append(this.q);
            t.a("NativeAd-Video", sbA.toString());
            if (!this.q) {
                MediaPlayer mediaPlayer2 = this.g;
                if (mediaPlayer2 != null) {
                    LiftoffMonetizeVideoBridge.MediaPlayerStart(mediaPlayer2);
                }
                f();
            } else {
                int i3 = this.n;
                if (i3 < 0) {
                    i3 = 0;
                }
                this.m = i3;
                StringBuilder sbA2 = com.iab.omid.library.vungle.internal.l.a("seekTo ");
                sbA2.append(this.m);
                t.a("NativeAd-Video", sbA2.toString());
                if (this.i.get()) {
                    MediaPlayer mediaPlayer3 = this.g;
                    if (mediaPlayer3 != null) {
                        mediaPlayer3.seekTo(this.m);
                    }
                    b();
                }
                MediaPlayer mediaPlayer4 = this.g;
                if (mediaPlayer4 != null) {
                    LiftoffMonetizeVideoBridge.MediaPlayerStart(mediaPlayer4);
                }
                MediaPlayer mediaPlayer5 = this.g;
                if (mediaPlayer5 != null) {
                    LiftoffMonetizeVideoBridge.MediaPlayerPause(mediaPlayer5);
                }
            }
        } else {
            k();
        }
        a();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Object j52Var;
        surfaceTexture.getClass();
        boolean z = u.a;
        t.a("NativeAd-Video", "onSurfaceTextureDestroyed()");
        g();
        try {
            MediaPlayer mediaPlayer = this.g;
            if (mediaPlayer != null) {
                LiftoffMonetizeVideoBridge.MediaPlayerSetSurface(mediaPlayer, null);
                j52Var = az2.a;
            } else {
                j52Var = null;
            }
        } catch (Throwable th) {
            j52Var = new j52(th);
        }
        Throwable thB = k52.b(j52Var);
        if (thB != null) {
            boolean z2 = u.a;
            t.a("NativeAd-Video", "Failed to clear surface", thB);
        }
        Surface surface = this.f;
        if (surface != null) {
            surface.release();
        }
        this.f = null;
        this.w.removeCallbacks(this.x);
        b();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        surfaceTexture.getClass();
        boolean z = u.a;
        t.a("NativeAd-Video", "onSurfaceTextureSizeChanged() width=" + i + " height=" + i2);
        a();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        surfaceTexture.getClass();
    }

    public final void setMediaPlayerFactory$vungle_ads_release(@NotNull sr0 sr0Var) {
        sr0Var.getClass();
        this.y = sr0Var;
    }

    public final void setSource(@NotNull Uri uri) {
        uri.getClass();
        this.h = uri;
        this.i.set(false);
        this.j.set(false);
        this.r = 0;
        this.s = 0;
        k();
    }

    public final void setTexture$vungle_ads_release(@NotNull TextureView textureView) {
        textureView.getClass();
        this.e = textureView;
    }

    public final void setVideoLifecycleCallback(@NotNull com.vungle.ads.nativead.b bVar) {
        bVar.getClass();
        this.t = bVar;
    }

    public static final void b(d dVar) {
        dVar.getClass();
        dVar.c();
    }

    public static final boolean b(d dVar, MediaPlayer mediaPlayer, int i, int i2) {
        dVar.getClass();
        boolean z = u.a;
        t.c("NativeAd-Video", "onError(): what=" + i + ", extra=" + i2);
        dVar.j.set(false);
        dVar.i.set(false);
        String strValueOf = String.valueOf(i2);
        com.vungle.ads.nativead.b bVar = dVar.t;
        if (bVar == null) {
            return true;
        }
        ((m) bVar).a(strValueOf, i);
        return true;
    }

    public final void b() {
        int iG;
        int i = this.n;
        if (i <= 0 || !this.i.get() || (iG = tb5.g((int) ((((long) getCurrentPositionMs()) * 100) / ((long) i)), 0, 100)) == this.v) {
            return;
        }
        this.v = iG;
        com.vungle.ads.nativead.b bVar = this.t;
        if (bVar != null) {
            ((m) bVar).a(iG);
        }
    }

    public /* synthetic */ d(Context context) {
        this(context, null);
    }

    public static final void a(d dVar) {
        dVar.getClass();
        dVar.c();
    }

    public static final void a(d dVar, MediaPlayer mediaPlayer, int i, int i2) {
        dVar.getClass();
        if (i <= 0 || i2 <= 0) {
            return;
        }
        dVar.r = i;
        dVar.s = i2;
        SurfaceTexture surfaceTexture = dVar.e.getSurfaceTexture();
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i, i2);
        }
        dVar.a();
    }

    public final void a() {
        float f;
        if (this.r <= 0 || this.s <= 0) {
            return;
        }
        int width = this.e.getWidth();
        int height = this.e.getHeight();
        if (width == 0 || height == 0) {
            return;
        }
        float f2 = width;
        float f3 = height;
        float f4 = f2 / f3;
        float f5 = this.r / this.s;
        Matrix matrix = new Matrix();
        if (f4 > f5) {
            f = f3 / this.s;
        } else {
            f = f2 / this.r;
        }
        matrix.setScale((this.r * f) / f2, (this.s * f) / f3, f2 / 2.0f, f3 / 2.0f);
        this.e.setTransform(matrix);
        this.e.invalidate();
        float f6 = (f2 - (this.r * f)) / 2.0f;
        float f7 = (f3 - (this.s * f)) / 2.0f;
        b bVar = this.u;
        if (bVar != null) {
            bVar.a(this.e.getX() + f6, this.e.getY() + f7);
        }
    }
}
