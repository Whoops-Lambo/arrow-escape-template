package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.util.Log;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class b implements AudioSink.Listener {
    public final /* synthetic */ DecoderAudioRenderer a;

    @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
    public final void onAudioSinkError(Exception exc) {
        Log.e("DecoderAudioRenderer", "Audio sink error", exc);
        this.a.eventDispatcher.audioSinkError(exc);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
    public final void onPositionAdvancing(long j) {
        this.a.eventDispatcher.positionAdvancing(j);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
    public final void onPositionDiscontinuity() {
        this.a.onPositionDiscontinuity();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
    public final void onSkipSilenceEnabledChanged(boolean z) {
        this.a.eventDispatcher.skipSilenceEnabledChanged(z);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
    public final void onUnderrun(int i, long j, long j2) {
        this.a.eventDispatcher.underrun(i, j, j2);
    }

    public b(DecoderAudioRenderer decoderAudioRenderer) {
        this.a = decoderAudioRenderer;
    }
}
