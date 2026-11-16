package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class c implements MediaSourceEventListener, DrmSessionEventListener {
    public final Object a;
    public MediaSourceEventListener.EventDispatcher b;
    public DrmSessionEventListener.EventDispatcher c;
    public final /* synthetic */ CompositeMediaSource d;

    public final boolean a(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        MediaSource.MediaPeriodId mediaPeriodIdForChildMediaPeriodId;
        Object obj = this.a;
        CompositeMediaSource compositeMediaSource = this.d;
        if (mediaPeriodId != null) {
            mediaPeriodIdForChildMediaPeriodId = compositeMediaSource.getMediaPeriodIdForChildMediaPeriodId(obj, mediaPeriodId);
            if (mediaPeriodIdForChildMediaPeriodId == null) {
                return false;
            }
        } else {
            mediaPeriodIdForChildMediaPeriodId = null;
        }
        int windowIndexForChildWindowIndex = compositeMediaSource.getWindowIndexForChildWindowIndex(obj, i);
        MediaSourceEventListener.EventDispatcher eventDispatcher = this.b;
        if (eventDispatcher.windowIndex != windowIndexForChildWindowIndex || !Util.areEqual(eventDispatcher.mediaPeriodId, mediaPeriodIdForChildMediaPeriodId)) {
            this.b = compositeMediaSource.createEventDispatcher(windowIndexForChildWindowIndex, mediaPeriodIdForChildMediaPeriodId, 0L);
        }
        DrmSessionEventListener.EventDispatcher eventDispatcher2 = this.c;
        if (eventDispatcher2.windowIndex == windowIndexForChildWindowIndex && Util.areEqual(eventDispatcher2.mediaPeriodId, mediaPeriodIdForChildMediaPeriodId)) {
            return true;
        }
        this.c = compositeMediaSource.createDrmEventDispatcher(windowIndexForChildWindowIndex, mediaPeriodIdForChildMediaPeriodId);
        return true;
    }

    public final MediaLoadData b(MediaLoadData mediaLoadData) {
        long j = mediaLoadData.mediaStartTimeMs;
        CompositeMediaSource compositeMediaSource = this.d;
        Object obj = this.a;
        long mediaTimeForChildMediaTime = compositeMediaSource.getMediaTimeForChildMediaTime(obj, j);
        long mediaTimeForChildMediaTime2 = compositeMediaSource.getMediaTimeForChildMediaTime(obj, mediaLoadData.mediaEndTimeMs);
        return (mediaTimeForChildMediaTime == mediaLoadData.mediaStartTimeMs && mediaTimeForChildMediaTime2 == mediaLoadData.mediaEndTimeMs) ? mediaLoadData : new MediaLoadData(mediaLoadData.dataType, mediaLoadData.trackType, mediaLoadData.trackFormat, mediaLoadData.trackSelectionReason, mediaLoadData.trackSelectionData, mediaTimeForChildMediaTime, mediaTimeForChildMediaTime2);
    }

    public c(CompositeMediaSource compositeMediaSource, Object obj) {
        this.d = compositeMediaSource;
        this.b = compositeMediaSource.createEventDispatcher(null);
        this.c = compositeMediaSource.createDrmEventDispatcher(null);
        this.a = obj;
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onDownstreamFormatChanged(int i, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
        if (a(i, mediaPeriodId)) {
            this.b.downstreamFormatChanged(b(mediaLoadData));
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void onDrmKeysLoaded(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        if (a(i, mediaPeriodId)) {
            this.c.drmKeysLoaded();
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void onDrmKeysRemoved(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        if (a(i, mediaPeriodId)) {
            this.c.drmKeysRemoved();
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void onDrmKeysRestored(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        if (a(i, mediaPeriodId)) {
            this.c.drmKeysRestored();
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void onDrmSessionAcquired(int i, MediaSource.MediaPeriodId mediaPeriodId, int i2) {
        if (a(i, mediaPeriodId)) {
            this.c.drmSessionAcquired(i2);
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void onDrmSessionManagerError(int i, MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
        if (a(i, mediaPeriodId)) {
            this.c.drmSessionManagerError(exc);
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void onDrmSessionReleased(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        if (a(i, mediaPeriodId)) {
            this.c.drmSessionReleased();
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onLoadCanceled(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        if (a(i, mediaPeriodId)) {
            this.b.loadCanceled(loadEventInfo, b(mediaLoadData));
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onLoadCompleted(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        if (a(i, mediaPeriodId)) {
            this.b.loadCompleted(loadEventInfo, b(mediaLoadData));
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onLoadError(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        if (a(i, mediaPeriodId)) {
            this.b.loadError(loadEventInfo, b(mediaLoadData), iOException, z);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onLoadStarted(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        if (a(i, mediaPeriodId)) {
            this.b.loadStarted(loadEventInfo, b(mediaLoadData));
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onUpstreamDiscarded(int i, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
        if (a(i, mediaPeriodId)) {
            this.b.upstreamDiscarded(b(mediaLoadData));
        }
    }
}
