package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    public final String a;
    public int b;
    public long c;
    public final MediaSource.MediaPeriodId d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ DefaultPlaybackSessionManager g;

    public final boolean a(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        if (mediaPeriodId == null) {
            return i == this.b;
        }
        MediaSource.MediaPeriodId mediaPeriodId2 = this.d;
        if (mediaPeriodId2 == null) {
            return !mediaPeriodId.isAd() && mediaPeriodId.windowSequenceNumber == this.c;
        }
        return mediaPeriodId.windowSequenceNumber == mediaPeriodId2.windowSequenceNumber && mediaPeriodId.adGroupIndex == mediaPeriodId2.adGroupIndex && mediaPeriodId.adIndexInAdGroup == mediaPeriodId2.adIndexInAdGroup;
    }

    public final boolean b(AnalyticsListener.EventTime eventTime) {
        MediaSource.MediaPeriodId mediaPeriodId = eventTime.mediaPeriodId;
        if (mediaPeriodId == null) {
            return this.b != eventTime.windowIndex;
        }
        long j = this.c;
        if (j == -1) {
            return false;
        }
        if (mediaPeriodId.windowSequenceNumber > j) {
            return true;
        }
        MediaSource.MediaPeriodId mediaPeriodId2 = this.d;
        if (mediaPeriodId2 == null) {
            return false;
        }
        int indexOfPeriod = eventTime.timeline.getIndexOfPeriod(mediaPeriodId.periodUid);
        int indexOfPeriod2 = eventTime.timeline.getIndexOfPeriod(mediaPeriodId2.periodUid);
        MediaSource.MediaPeriodId mediaPeriodId3 = eventTime.mediaPeriodId;
        if (mediaPeriodId3.windowSequenceNumber < mediaPeriodId2.windowSequenceNumber || indexOfPeriod < indexOfPeriod2) {
            return false;
        }
        if (indexOfPeriod > indexOfPeriod2) {
            return true;
        }
        boolean zIsAd = mediaPeriodId3.isAd();
        MediaSource.MediaPeriodId mediaPeriodId4 = eventTime.mediaPeriodId;
        if (!zIsAd) {
            int i = mediaPeriodId4.nextAdGroupIndex;
            return i == -1 || i > mediaPeriodId2.adGroupIndex;
        }
        int i2 = mediaPeriodId4.adGroupIndex;
        int i3 = mediaPeriodId4.adIndexInAdGroup;
        int i4 = mediaPeriodId2.adGroupIndex;
        return i2 > i4 || (i2 == i4 && i3 > mediaPeriodId2.adIndexInAdGroup);
    }

    public final boolean c(Timeline timeline, Timeline timeline2) {
        int i = this.b;
        if (i < timeline.getWindowCount()) {
            DefaultPlaybackSessionManager defaultPlaybackSessionManager = this.g;
            timeline.getWindow(i, defaultPlaybackSessionManager.window);
            int i2 = defaultPlaybackSessionManager.window.firstPeriodIndex;
            while (true) {
                if (i2 > defaultPlaybackSessionManager.window.lastPeriodIndex) {
                    i = -1;
                    break;
                }
                int indexOfPeriod = timeline2.getIndexOfPeriod(timeline.getUidOfPeriod(i2));
                if (indexOfPeriod != -1) {
                    i = timeline2.getPeriod(indexOfPeriod, defaultPlaybackSessionManager.period).windowIndex;
                    break;
                }
                i2++;
            }
        } else if (i >= timeline2.getWindowCount()) {
            i = -1;
            break;
        }
        this.b = i;
        if (i == -1) {
            return false;
        }
        MediaSource.MediaPeriodId mediaPeriodId = this.d;
        return mediaPeriodId == null || timeline2.getIndexOfPeriod(mediaPeriodId.periodUid) != -1;
    }

    public a(DefaultPlaybackSessionManager defaultPlaybackSessionManager, String str, int i, MediaSource.MediaPeriodId mediaPeriodId) {
        long j;
        this.g = defaultPlaybackSessionManager;
        this.a = str;
        this.b = i;
        if (mediaPeriodId == null) {
            j = -1;
        } else {
            j = mediaPeriodId.windowSequenceNumber;
        }
        this.c = j;
        if (mediaPeriodId != null && mediaPeriodId.isAd()) {
            this.d = mediaPeriodId;
        }
    }
}
