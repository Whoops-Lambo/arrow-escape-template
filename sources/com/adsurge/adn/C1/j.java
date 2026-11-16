package com.adsurge.adn.C1;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.TextureView;
import defpackage.nj;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class j extends TextureView implements i, MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener, MediaPlayer.OnInfoListener, TextureView.SurfaceTextureListener {
    public String a;
    public final k b;
    public volatile MediaPlayer c;
    public volatile SurfaceTexture d;
    public volatile Surface e;
    public final AtomicBoolean f;
    public final AtomicBoolean g;
    public final AtomicBoolean h;
    public final AtomicBoolean i;
    public Handler j;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.play();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.a();
        }
    }

    @Override // com.adsurge.adn.C1.f
    public void free() {
        a(true);
    }

    @Override // com.adsurge.adn.C1.f
    public int getPlayerVersion() {
        return 1;
    }

    @Override // com.adsurge.adn.C1.i
    public int getThreadType() {
        return 0;
    }

    @Override // com.adsurge.adn.C1.i
    public void k() {
        a(false);
        this.h.set(false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    private void c() {
        Handler handler = this.j;
        if (handler == null) {
            return;
        }
        handler.post(new a());
    }

    public final void a() {
        if (this.d == null || this.c == null) {
            return;
        }
        if (this.e == null) {
            this.e = new Surface(this.d);
        }
        this.c.setSurface(this.e);
        this.f.set(true);
        if (this.h.get() && this.g.get() && this.i.get()) {
            c();
        }
    }

    public final void d() {
        try {
            if (this.c == null) {
                return;
            }
            this.c.reset();
        } catch (Throwable unused) {
            e();
        }
    }

    @Override // com.adsurge.adn.C1.i
    public boolean f() {
        return this.h.get();
    }

    public final void g() {
        this.i.set(false);
        this.g.set(false);
    }

    @Override // com.adsurge.adn.C1.f
    public int getCurrentPosition() {
        if (this.c == null) {
            return 0;
        }
        return this.c.getCurrentPosition();
    }

    @Override // com.adsurge.adn.C1.f
    public int getDuration() {
        if (this.c != null && this.i.get()) {
            return this.c.getDuration();
        }
        return 0;
    }

    @Override // com.adsurge.adn.C1.i
    public void i() {
        if (this.c == null) {
            e();
        } else {
            d();
        }
        g();
    }

    @Override // com.adsurge.adn.C1.f
    public boolean isPlaying() {
        if (this.c == null) {
            return false;
        }
        return this.c.isPlaying();
    }

    @Override // com.adsurge.adn.C1.i
    public boolean isValid() {
        return this.c != null;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        this.b.d();
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        this.b.a(i, new Exception(nj.j(i2, "")));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        if (i == 701) {
            this.b.h();
            return false;
        }
        if (i != 702) {
            return false;
        }
        this.b.g();
        return false;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        this.b.a(mediaPlayer.getVideoWidth(), mediaPlayer.getVideoHeight());
        this.i.set(true);
        if (this.g.get() && this.f.get()) {
            c();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.b.onViewDestroy();
        this.g.set(false);
        this.f.set(false);
        return this.d == null;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.d = surfaceTexture;
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        this.b.b(mediaPlayer.getVideoWidth(), mediaPlayer.getVideoHeight());
    }

    @Override // com.adsurge.adn.C1.f
    public void pause() {
        if (this.c == null) {
            return;
        }
        this.c.pause();
    }

    @Override // com.adsurge.adn.C1.f
    public void play() {
        this.g.set(true);
        if (this.i.get() && this.f.get() && this.c != null) {
            this.c.start();
            this.b.c();
        }
    }

    @Override // com.adsurge.adn.C1.i
    public void reset() {
        try {
            if (this.c == null) {
                return;
            }
            this.c.reset();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.adsurge.adn.C1.i
    public void setLooping(boolean z) {
        try {
            if (this.c == null) {
                return;
            }
            this.c.setLooping(z);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override // com.adsurge.adn.C1.f
    public void setSpeed(float f) {
        try {
            if (this.c == null) {
                return;
            }
            PlaybackParams playbackParams = this.c.getPlaybackParams();
            playbackParams.setSpeed(f);
            this.c.setPlaybackParams(playbackParams);
        } catch (Exception unused) {
        }
    }

    @Override // com.adsurge.adn.C1.i
    public void setWorkHandler(Handler handler) {
        this.j = handler;
    }

    public j(Context context, k kVar) {
        super(context);
        this.a = "j";
        this.f = new AtomicBoolean(false);
        this.g = new AtomicBoolean(false);
        this.h = new AtomicBoolean(false);
        this.i = new AtomicBoolean(false);
        getThreadId();
        this.b = kVar;
        setSurfaceTextureListener(this);
    }

    private String getThreadId() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            return "# " + looperMyLooper.getThread().getId();
        }
        return "# null id";
    }

    @Override // com.adsurge.adn.C1.i
    public void e() {
        getThreadId();
        this.c = new MediaPlayer();
        this.c.setOnPreparedListener(this);
        this.c.setOnCompletionListener(this);
        this.c.setOnErrorListener(this);
        this.c.setOnSeekCompleteListener(this);
        this.c.setOnVideoSizeChangedListener(this);
        this.c.setOnInfoListener(this);
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public void onSeekComplete(MediaPlayer mediaPlayer) {
        mediaPlayer.getCurrentPosition();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        getThreadId();
        if (this.d == null) {
            this.d = surfaceTexture;
        } else {
            setSurfaceTexture(this.d);
        }
        this.b.j();
        Handler handler = this.j;
        if (handler == null) {
            return;
        }
        handler.post(new b());
    }

    @Override // com.adsurge.adn.C1.f
    public void setDataSource(String str) {
        g();
        try {
            if (this.c == null) {
                return;
            }
            d();
            this.c.setDataSource(str);
            this.h.set(true);
            this.b.a();
            this.c.prepareAsync();
        } catch (Exception e) {
            e.getMessage();
            this.b.a(5003, e);
        }
    }

    public final void a(boolean z) {
        if (this.c != null) {
            this.c.release();
            this.c = null;
        } else if (z) {
            this.d = null;
        }
    }

    @Override // com.adsurge.adn.C1.i
    public void a(float f, float f2) {
        try {
            if (this.c == null) {
                return;
            }
            this.c.setVolume(f, f2);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override // com.adsurge.adn.C1.f
    public void a(int i) {
        if (this.c == null) {
            return;
        }
        this.c.seekTo(i);
    }
}
