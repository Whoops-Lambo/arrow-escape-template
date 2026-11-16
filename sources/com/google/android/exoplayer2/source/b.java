package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class b extends ForwardingTimeline {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;

    @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
    public final Timeline.Period getPeriod(int i, Timeline.Period period, boolean z) {
        this.timeline.getPeriod(0, period, z);
        long positionInWindowUs = period.getPositionInWindowUs() - this.a;
        long j = this.c;
        return period.set(period.id, period.uid, 0, j != -9223372036854775807L ? j - positionInWindowUs : -9223372036854775807L, positionInWindowUs);
    }

    @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
    public final Timeline.Window getWindow(int i, Timeline.Window window, long j) {
        this.timeline.getWindow(0, window, 0L);
        long j2 = window.positionInFirstPeriodUs;
        long j3 = this.a;
        window.positionInFirstPeriodUs = j2 + j3;
        window.durationUs = this.c;
        window.isDynamic = this.d;
        long j4 = window.defaultPositionUs;
        if (j4 != -9223372036854775807L) {
            long jMax = Math.max(j4, j3);
            window.defaultPositionUs = jMax;
            long j5 = this.b;
            if (j5 != -9223372036854775807L) {
                jMax = Math.min(jMax, j5);
            }
            window.defaultPositionUs = jMax - j3;
        }
        long jUsToMs = Util.usToMs(j3);
        long j6 = window.presentationStartTimeMs;
        if (j6 != -9223372036854775807L) {
            window.presentationStartTimeMs = j6 + jUsToMs;
        }
        long j7 = window.windowStartTimeMs;
        if (j7 != -9223372036854775807L) {
            window.windowStartTimeMs = j7 + jUsToMs;
        }
        return window;
    }

    public b(Timeline timeline, long j, long j2) throws ClippingMediaSource.IllegalClippingException {
        long jMax;
        super(timeline);
        boolean z = false;
        if (timeline.getPeriodCount() == 1) {
            Timeline.Window window = timeline.getWindow(0, new Timeline.Window());
            long jMax2 = Math.max(0L, j);
            if (!window.isPlaceholder && jMax2 != 0 && !window.isSeekable) {
                throw new ClippingMediaSource.IllegalClippingException(1);
            }
            if (j2 == Long.MIN_VALUE) {
                jMax = window.durationUs;
            } else {
                jMax = Math.max(0L, j2);
            }
            long j3 = window.durationUs;
            if (j3 != -9223372036854775807L) {
                jMax = jMax > j3 ? j3 : jMax;
                if (jMax2 > jMax) {
                    throw new ClippingMediaSource.IllegalClippingException(2);
                }
            }
            this.a = jMax2;
            this.b = jMax;
            this.c = jMax != -9223372036854775807L ? jMax - jMax2 : -9223372036854775807L;
            if (window.isDynamic && (jMax == -9223372036854775807L || (j3 != -9223372036854775807L && jMax == j3))) {
                z = true;
            }
            this.d = z;
            return;
        }
        throw new ClippingMediaSource.IllegalClippingException(0);
    }
}
