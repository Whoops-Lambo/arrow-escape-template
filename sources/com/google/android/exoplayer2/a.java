package com.google.android.exoplayer2;

import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataOutput;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView;
import defpackage.oj2;
import defpackage.pj0;
import defpackage.sj0;
import defpackage.wb0;
import defpackage.zj0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class a implements VideoRendererEventListener, AudioRendererEventListener, TextOutput, MetadataOutput, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, SphericalGLSurfaceView.VideoSurfaceListener, AudioFocusManager$PlayerControl, AudioBecomingNoisyManager$EventListener, StreamVolumeManager$Listener, ExoPlayer.AudioOffloadListener {
    public final /* synthetic */ d a;

    @Override // com.google.android.exoplayer2.AudioBecomingNoisyManager$EventListener
    public final void onAudioBecomingNoisy() {
        this.a.w(-1, 3, false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        d dVar = this.a;
        dVar.t(null);
        dVar.m(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // com.google.android.exoplayer2.AudioFocusManager$PlayerControl
    public final void executePlayerCommand(int i) {
        d dVar = this.a;
        boolean playWhenReady = dVar.getPlayWhenReady();
        int i2 = 1;
        if (playWhenReady && i != 1) {
            i2 = 2;
        }
        dVar.w(i, i2, playWhenReady);
    }

    @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioCodecError(Exception exc) {
        this.a.q.onAudioCodecError(exc);
    }

    @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioDecoderInitialized(String str, long j, long j2) {
        this.a.q.onAudioDecoderInitialized(str, j, j2);
    }

    @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioDecoderReleased(String str) {
        this.a.q.onAudioDecoderReleased(str);
    }

    @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioDisabled(DecoderCounters decoderCounters) {
        d dVar = this.a;
        dVar.q.onAudioDisabled(decoderCounters);
        dVar.S = null;
        dVar.e0 = null;
    }

    @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioEnabled(DecoderCounters decoderCounters) {
        d dVar = this.a;
        dVar.e0 = decoderCounters;
        dVar.q.onAudioEnabled(decoderCounters);
    }

    @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioInputFormatChanged(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        d dVar = this.a;
        dVar.S = format;
        dVar.q.onAudioInputFormatChanged(format, decoderReuseEvaluation);
    }

    @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioPositionAdvancing(long j) {
        this.a.q.onAudioPositionAdvancing(j);
    }

    @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioSinkError(Exception exc) {
        this.a.q.onAudioSinkError(exc);
    }

    @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioUnderrun(int i, long j, long j2) {
        this.a.q.onAudioUnderrun(i, j, j2);
    }

    @Override // com.google.android.exoplayer2.text.TextOutput
    public final void onCues(CueGroup cueGroup) {
        d dVar = this.a;
        dVar.j0 = cueGroup;
        dVar.k.sendEvent(27, new sj0(cueGroup, 4));
    }

    @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
    public final void onDroppedFrames(int i, long j) {
        this.a.q.onDroppedFrames(i, j);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener
    public final void onExperimentalSleepingForOffloadChanged(boolean z) {
        this.a.y();
    }

    @Override // com.google.android.exoplayer2.metadata.MetadataOutput
    public final void onMetadata(Metadata metadata) {
        d dVar = this.a;
        ListenerSet listenerSet = dVar.k;
        dVar.t0 = dVar.t0.buildUpon().populateFromMetadata(metadata).build();
        MediaMetadata mediaMetadataB = dVar.b();
        if (!mediaMetadataB.equals(dVar.P)) {
            dVar.P = mediaMetadataB;
            listenerSet.queueEvent(14, new sj0(this, 5));
        }
        listenerSet.queueEvent(28, new sj0(metadata, 6));
        listenerSet.flushEvents();
    }

    @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
    public final void onRenderedFirstFrame(Object obj, long j) {
        d dVar = this.a;
        dVar.q.onRenderedFirstFrame(obj, j);
        if (dVar.U == obj) {
            dVar.k.sendEvent(26, new wb0(15));
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
    public final void onSkipSilenceEnabledChanged(boolean z) {
        d dVar = this.a;
        if (dVar.i0 == z) {
            return;
        }
        dVar.i0 = z;
        dVar.k.sendEvent(23, new pj0(z, 2));
    }

    @Override // com.google.android.exoplayer2.StreamVolumeManager$Listener
    public final void onStreamTypeChanged(int i) {
        d dVar = this.a;
        oj2 oj2Var = dVar.A;
        oj2Var.getClass();
        AudioManager audioManager = oj2Var.d;
        DeviceInfo deviceInfo = new DeviceInfo(0, Util.SDK_INT >= 28 ? audioManager.getStreamMinVolume(oj2Var.f) : 0, audioManager.getStreamMaxVolume(oj2Var.f));
        if (deviceInfo.equals(dVar.r0)) {
            return;
        }
        dVar.r0 = deviceInfo;
        dVar.k.sendEvent(29, new sj0(deviceInfo, 7));
    }

    @Override // com.google.android.exoplayer2.StreamVolumeManager$Listener
    public final void onStreamVolumeChanged(int i, boolean z) {
        this.a.k.sendEvent(30, new zj0(i, z));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface = new Surface(surfaceTexture);
        d dVar = this.a;
        dVar.t(surface);
        dVar.V = surface;
        dVar.m(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.a.m(i, i2);
    }

    @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
    public final void onVideoCodecError(Exception exc) {
        this.a.q.onVideoCodecError(exc);
    }

    @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
    public final void onVideoDecoderInitialized(String str, long j, long j2) {
        this.a.q.onVideoDecoderInitialized(str, j, j2);
    }

    @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
    public final void onVideoDecoderReleased(String str) {
        this.a.q.onVideoDecoderReleased(str);
    }

    @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
    public final void onVideoDisabled(DecoderCounters decoderCounters) {
        d dVar = this.a;
        dVar.q.onVideoDisabled(decoderCounters);
        dVar.R = null;
        dVar.d0 = null;
    }

    @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
    public final void onVideoEnabled(DecoderCounters decoderCounters) {
        d dVar = this.a;
        dVar.d0 = decoderCounters;
        dVar.q.onVideoEnabled(decoderCounters);
    }

    @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
    public final void onVideoFrameProcessingOffset(long j, int i) {
        this.a.q.onVideoFrameProcessingOffset(j, i);
    }

    @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
    public final void onVideoInputFormatChanged(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        d dVar = this.a;
        dVar.R = format;
        dVar.q.onVideoInputFormatChanged(format, decoderReuseEvaluation);
    }

    @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
    public final void onVideoSizeChanged(VideoSize videoSize) {
        d dVar = this.a;
        dVar.s0 = videoSize;
        dVar.k.sendEvent(25, new sj0(videoSize, 8));
    }

    @Override // com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener
    public final void onVideoSurfaceCreated(Surface surface) {
        this.a.t(surface);
    }

    @Override // com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener
    public final void onVideoSurfaceDestroyed(Surface surface) {
        this.a.t(null);
    }

    @Override // com.google.android.exoplayer2.AudioFocusManager$PlayerControl
    public final void setVolumeMultiplier(float f) {
        d dVar = this.a;
        dVar.q(1, 2, Float.valueOf(dVar.h0 * dVar.z.g));
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.a.m(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        d dVar = this.a;
        if (dVar.Y) {
            dVar.t(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        d dVar = this.a;
        if (dVar.Y) {
            dVar.t(null);
        }
        dVar.m(0, 0);
    }

    public a(d dVar) {
        this.a = dVar;
    }

    @Override // com.google.android.exoplayer2.text.TextOutput
    public final void onCues(List list) {
        this.a.k.sendEvent(27, new sj0(list, 3));
    }
}
