package com.google.android.exoplayer2.source;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.Assertions;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class MaskingMediaSource extends WrappingMediaSource {
    private boolean hasRealTimeline;
    private boolean hasStartedPreparing;
    private boolean isPrepared;
    private final Timeline.Period period;
    private i timeline;

    @Nullable
    private MaskingMediaPeriod unpreparedMaskingMediaPeriod;
    private final boolean useLazyPreparation;
    private final Timeline.Window window;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @VisibleForTesting
    public static final class PlaceholderTimeline extends Timeline {
        private final MediaItem mediaItem;

        @Override // com.google.android.exoplayer2.Timeline
        public Timeline.Period getPeriod(int i, Timeline.Period period, boolean z) {
            period.set(z ? 0 : null, z ? i.c : null, 0, -9223372036854775807L, 0L, AdPlaybackState.NONE, true);
            return period;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPeriodCount() {
            return 1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getWindowCount() {
            return 1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getIndexOfPeriod(Object obj) {
            return obj == i.c ? 0 : -1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Object getUidOfPeriod(int i) {
            return i.c;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Timeline.Window getWindow(int i, Timeline.Window window, long j) {
            window.set(Timeline.Window.SINGLE_WINDOW_UID, this.mediaItem, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            window.isPlaceholder = true;
            return window;
        }

        public PlaceholderTimeline(MediaItem mediaItem) {
            this.mediaItem = mediaItem;
        }
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource, com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        ((MaskingMediaPeriod) mediaPeriod).releasePeriod();
        if (mediaPeriod == this.unpreparedMaskingMediaPeriod) {
            this.unpreparedMaskingMediaPeriod = null;
        }
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public void releaseSourceInternal() {
        this.isPrepared = false;
        this.hasStartedPreparing = false;
        super.releaseSourceInternal();
    }

    private Object getExternalPeriodUid(Object obj) {
        Object obj2 = this.timeline.b;
        return (obj2 == null || !obj2.equals(obj)) ? obj : i.c;
    }

    private Object getInternalPeriodUid(Object obj) {
        return (this.timeline.b == null || !obj.equals(i.c)) ? obj : this.timeline.b;
    }

    private void setPreparePositionOverrideToUnpreparedMaskingPeriod(long j) {
        MaskingMediaPeriod maskingMediaPeriod = this.unpreparedMaskingMediaPeriod;
        int indexOfPeriod = this.timeline.getIndexOfPeriod(maskingMediaPeriod.id.periodUid);
        if (indexOfPeriod == -1) {
            return;
        }
        long j2 = this.timeline.getPeriod(indexOfPeriod, this.period).durationUs;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        maskingMediaPeriod.overridePreparePositionUs(j);
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource, com.google.android.exoplayer2.source.MediaSource
    public MaskingMediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        MaskingMediaPeriod maskingMediaPeriod = new MaskingMediaPeriod(mediaPeriodId, allocator, j);
        maskingMediaPeriod.setMediaSource(this.mediaSource);
        if (this.isPrepared) {
            maskingMediaPeriod.createPeriod(mediaPeriodId.copyWithPeriodUid(getInternalPeriodUid(mediaPeriodId.periodUid)));
            return maskingMediaPeriod;
        }
        this.unpreparedMaskingMediaPeriod = maskingMediaPeriod;
        if (!this.hasStartedPreparing) {
            this.hasStartedPreparing = true;
            prepareChildSource();
        }
        return maskingMediaPeriod;
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource
    @Nullable
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(MediaSource.MediaPeriodId mediaPeriodId) {
        return mediaPeriodId.copyWithPeriodUid(getExternalPeriodUid(mediaPeriodId.periodUid));
    }

    public Timeline getTimeline() {
        return this.timeline;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0080  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.exoplayer2.source.WrappingMediaSource
    public void onChildSourceInfoRefreshed(Timeline timeline) {
        long j;
        i iVar;
        MediaSource.MediaPeriodId mediaPeriodIdCopyWithPeriodUid;
        i iVar2;
        if (this.isPrepared) {
            i iVar3 = this.timeline;
            this.timeline = new i(timeline, iVar3.a, iVar3.b);
            MaskingMediaPeriod maskingMediaPeriod = this.unpreparedMaskingMediaPeriod;
            if (maskingMediaPeriod != null) {
                setPreparePositionOverrideToUnpreparedMaskingPeriod(maskingMediaPeriod.getPreparePositionOverrideUs());
            }
        } else {
            if (!timeline.isEmpty()) {
                timeline.getWindow(0, this.window);
                long defaultPositionUs = this.window.getDefaultPositionUs();
                Object obj = this.window.uid;
                MaskingMediaPeriod maskingMediaPeriod2 = this.unpreparedMaskingMediaPeriod;
                if (maskingMediaPeriod2 != null) {
                    long preparePositionUs = maskingMediaPeriod2.getPreparePositionUs();
                    this.timeline.getPeriodByUid(this.unpreparedMaskingMediaPeriod.id.periodUid, this.period);
                    long positionInWindowUs = this.period.getPositionInWindowUs() + preparePositionUs;
                    if (positionInWindowUs != this.timeline.getWindow(0, this.window).getDefaultPositionUs()) {
                        j = positionInWindowUs;
                    } else {
                        j = defaultPositionUs;
                    }
                } else {
                    j = defaultPositionUs;
                }
                Pair<Object, Long> periodPositionUs = timeline.getPeriodPositionUs(this.window, this.period, 0, j);
                Object obj2 = periodPositionUs.first;
                long jLongValue = ((Long) periodPositionUs.second).longValue();
                if (this.hasRealTimeline) {
                    i iVar4 = this.timeline;
                    iVar = new i(timeline, iVar4.a, iVar4.b);
                } else {
                    iVar = new i(timeline, obj, obj2);
                }
                this.timeline = iVar;
                MaskingMediaPeriod maskingMediaPeriod3 = this.unpreparedMaskingMediaPeriod;
                if (maskingMediaPeriod3 != null) {
                    setPreparePositionOverrideToUnpreparedMaskingPeriod(jLongValue);
                    MediaSource.MediaPeriodId mediaPeriodId = maskingMediaPeriod3.id;
                    mediaPeriodIdCopyWithPeriodUid = mediaPeriodId.copyWithPeriodUid(getInternalPeriodUid(mediaPeriodId.periodUid));
                }
                this.hasRealTimeline = true;
                this.isPrepared = true;
                refreshSourceInfo(this.timeline);
                if (mediaPeriodIdCopyWithPeriodUid != null) {
                    ((MaskingMediaPeriod) Assertions.checkNotNull(this.unpreparedMaskingMediaPeriod)).createPeriod(mediaPeriodIdCopyWithPeriodUid);
                }
            }
            if (this.hasRealTimeline) {
                i iVar5 = this.timeline;
                iVar2 = new i(timeline, iVar5.a, iVar5.b);
            } else {
                iVar2 = new i(timeline, Timeline.Window.SINGLE_WINDOW_UID, i.c);
            }
            this.timeline = iVar2;
        }
        mediaPeriodIdCopyWithPeriodUid = null;
        this.hasRealTimeline = true;
        this.isPrepared = true;
        refreshSourceInfo(this.timeline);
        if (mediaPeriodIdCopyWithPeriodUid != null) {
            ((MaskingMediaPeriod) Assertions.checkNotNull(this.unpreparedMaskingMediaPeriod)).createPeriod(mediaPeriodIdCopyWithPeriodUid);
        }
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource
    public void prepareSourceInternal() {
        if (this.useLazyPreparation) {
            return;
        }
        this.hasStartedPreparing = true;
        prepareChildSource();
    }

    public MaskingMediaSource(MediaSource mediaSource, boolean z) {
        boolean z2;
        super(mediaSource);
        if (z && mediaSource.isSingleWindow()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.useLazyPreparation = z2;
        this.window = new Timeline.Window();
        this.period = new Timeline.Period();
        Timeline initialTimeline = mediaSource.getInitialTimeline();
        if (initialTimeline != null) {
            this.timeline = new i(initialTimeline, null, null);
            this.hasRealTimeline = true;
        } else {
            this.timeline = new i(new PlaceholderTimeline(mediaSource.getMediaItem()), Timeline.Window.SINGLE_WINDOW_UID, i.c);
        }
    }
}
