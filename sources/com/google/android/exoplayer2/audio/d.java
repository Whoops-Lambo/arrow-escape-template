package com.google.android.exoplayer2.audio;

import android.os.SystemClock;
import com.google.android.exoplayer2.util.Log;
import defpackage.h50;
import defpackage.n30;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class d implements AudioTrackPositionTracker$Listener {
    public final /* synthetic */ DefaultAudioSink a;

    @Override // com.google.android.exoplayer2.audio.AudioTrackPositionTracker$Listener
    public final void onInvalidLatency(long j) {
        Log.w("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j);
    }

    @Override // com.google.android.exoplayer2.audio.AudioTrackPositionTracker$Listener
    public final void onPositionAdvancing(long j) {
        DefaultAudioSink defaultAudioSink = this.a;
        if (defaultAudioSink.listener != null) {
            defaultAudioSink.listener.onPositionAdvancing(j);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioTrackPositionTracker$Listener
    public final void onPositionFramesMismatch(long j, long j2, long j3, long j4) {
        StringBuilder sbO = h50.o(j, "Spurious audio timestamp (frame position mismatch): ", ", ");
        sbO.append(j2);
        n30.x(sbO, ", ", j3, ", ");
        sbO.append(j4);
        sbO.append(", ");
        DefaultAudioSink defaultAudioSink = this.a;
        sbO.append(defaultAudioSink.getSubmittedFrames());
        sbO.append(", ");
        sbO.append(defaultAudioSink.getWrittenFrames());
        String string = sbO.toString();
        if (DefaultAudioSink.failOnSpuriousAudioTimestamp) {
            throw new DefaultAudioSink.InvalidAudioTrackTimestampException(string);
        }
        Log.w("DefaultAudioSink", string);
    }

    @Override // com.google.android.exoplayer2.audio.AudioTrackPositionTracker$Listener
    public final void onSystemTimeUsMismatch(long j, long j2, long j3, long j4) {
        StringBuilder sbO = h50.o(j, "Spurious audio timestamp (system clock mismatch): ", ", ");
        sbO.append(j2);
        n30.x(sbO, ", ", j3, ", ");
        sbO.append(j4);
        sbO.append(", ");
        DefaultAudioSink defaultAudioSink = this.a;
        sbO.append(defaultAudioSink.getSubmittedFrames());
        sbO.append(", ");
        sbO.append(defaultAudioSink.getWrittenFrames());
        String string = sbO.toString();
        if (DefaultAudioSink.failOnSpuriousAudioTimestamp) {
            throw new DefaultAudioSink.InvalidAudioTrackTimestampException(string);
        }
        Log.w("DefaultAudioSink", string);
    }

    @Override // com.google.android.exoplayer2.audio.AudioTrackPositionTracker$Listener
    public final void onUnderrun(int i, long j) {
        DefaultAudioSink defaultAudioSink = this.a;
        if (defaultAudioSink.listener != null) {
            defaultAudioSink.listener.onUnderrun(i, j, SystemClock.elapsedRealtime() - defaultAudioSink.lastFeedElapsedRealtimeMs);
        }
    }

    public d(DefaultAudioSink defaultAudioSink) {
        this.a = defaultAudioSink;
    }
}
