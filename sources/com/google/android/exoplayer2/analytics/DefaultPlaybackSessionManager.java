package com.google.android.exoplayer2.analytics;

import android.util.Base64;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import defpackage.i50;
import defpackage.ol2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class DefaultPlaybackSessionManager implements PlaybackSessionManager {
    public static final ol2 DEFAULT_SESSION_ID_GENERATOR = new i50(1);
    private static final Random RANDOM = new Random();
    private static final int SESSION_ID_LENGTH = 12;

    @Nullable
    private String currentSessionId;
    private Timeline currentTimeline;
    private PlaybackSessionManager.Listener listener;
    private final Timeline.Period period;
    private final ol2 sessionIdGenerator;
    private final HashMap<String, a> sessions;
    private final Timeline.Window window;

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized boolean belongsToSession(AnalyticsListener.EventTime eventTime, String str) {
        a aVar = this.sessions.get(str);
        if (aVar == null) {
            return false;
        }
        int i = eventTime.windowIndex;
        MediaSource.MediaPeriodId mediaPeriodId = eventTime.mediaPeriodId;
        if (aVar.c == -1 && i == aVar.b && mediaPeriodId != null) {
            aVar.c = mediaPeriodId.windowSequenceNumber;
        }
        return aVar.a(i, mediaPeriodId);
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized void finishAllSessions(AnalyticsListener.EventTime eventTime) {
        PlaybackSessionManager.Listener listener;
        this.currentSessionId = null;
        Iterator<a> it = this.sessions.values().iterator();
        while (it.hasNext()) {
            a next = it.next();
            it.remove();
            if (next.e && (listener = this.listener) != null) {
                listener.onSessionFinished(eventTime, next.a, false);
            }
        }
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    @Nullable
    public synchronized String getActiveSessionId() {
        return this.currentSessionId;
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized String getSessionForMediaPeriodId(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId) {
        return getOrAddSession(timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, mediaPeriodId).a;
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized void updateSessionsWithDiscontinuity(AnalyticsListener.EventTime eventTime, int i) {
        try {
            Assertions.checkNotNull(this.listener);
            boolean z = i == 0;
            Iterator<a> it = this.sessions.values().iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.b(eventTime)) {
                    it.remove();
                    if (next.e) {
                        boolean zEquals = next.a.equals(this.currentSessionId);
                        boolean z2 = z && zEquals && next.f;
                        if (zEquals) {
                            this.currentSessionId = null;
                        }
                        this.listener.onSessionFinished(eventTime, next.a, z2);
                    }
                }
            }
            updateCurrentSession(eventTime);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized void updateSessionsWithTimelineChange(AnalyticsListener.EventTime eventTime) {
        try {
            Assertions.checkNotNull(this.listener);
            Timeline timeline = this.currentTimeline;
            this.currentTimeline = eventTime.timeline;
            Iterator<a> it = this.sessions.values().iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (!next.c(timeline, this.currentTimeline) || next.b(eventTime)) {
                    it.remove();
                    if (next.e) {
                        if (next.a.equals(this.currentSessionId)) {
                            this.currentSessionId = null;
                        }
                        this.listener.onSessionFinished(eventTime, next.a, false);
                    }
                }
            }
            updateCurrentSession(eventTime);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String generateDefaultSessionId() {
        byte[] bArr = new byte[12];
        RANDOM.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private a getOrAddSession(int i, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        a aVar = null;
        long j = Long.MAX_VALUE;
        for (a aVar2 : this.sessions.values()) {
            if (aVar2.c == -1 && i == aVar2.b && mediaPeriodId != null) {
                aVar2.c = mediaPeriodId.windowSequenceNumber;
            }
            if (aVar2.a(i, mediaPeriodId)) {
                long j2 = aVar2.c;
                if (j2 == -1 || j2 < j) {
                    aVar = aVar2;
                    j = j2;
                } else if (j2 == j && ((a) Util.castNonNull(aVar)).d != null && aVar2.d != null) {
                    aVar = aVar2;
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        String str = (String) this.sessionIdGenerator.get();
        a aVar3 = new a(this, str, i, mediaPeriodId);
        this.sessions.put(str, aVar3);
        return aVar3;
    }

    private void updateCurrentSession(AnalyticsListener.EventTime eventTime) {
        MediaSource.MediaPeriodId mediaPeriodId;
        if (eventTime.timeline.isEmpty()) {
            this.currentSessionId = null;
            return;
        }
        a aVar = this.sessions.get(this.currentSessionId);
        a orAddSession = getOrAddSession(eventTime.windowIndex, eventTime.mediaPeriodId);
        this.currentSessionId = orAddSession.a;
        updateSessions(eventTime);
        MediaSource.MediaPeriodId mediaPeriodId2 = eventTime.mediaPeriodId;
        if (mediaPeriodId2 == null || !mediaPeriodId2.isAd()) {
            return;
        }
        if (aVar != null) {
            long j = aVar.c;
            MediaSource.MediaPeriodId mediaPeriodId3 = eventTime.mediaPeriodId;
            if (j == mediaPeriodId3.windowSequenceNumber && (mediaPeriodId = aVar.d) != null && mediaPeriodId.adGroupIndex == mediaPeriodId3.adGroupIndex && mediaPeriodId.adIndexInAdGroup == mediaPeriodId3.adIndexInAdGroup) {
                return;
            }
        }
        MediaSource.MediaPeriodId mediaPeriodId4 = eventTime.mediaPeriodId;
        this.listener.onAdPlaybackStarted(eventTime, getOrAddSession(eventTime.windowIndex, new MediaSource.MediaPeriodId(mediaPeriodId4.periodUid, mediaPeriodId4.windowSequenceNumber)).a, orAddSession.a);
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public void setListener(PlaybackSessionManager.Listener listener) {
        this.listener = listener;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        if (r3.windowSequenceNumber < r4) goto L21;
     */
    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void updateSessions(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r23) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.updateSessions(com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime):void");
    }

    public DefaultPlaybackSessionManager(ol2 ol2Var) {
        this.sessionIdGenerator = ol2Var;
        this.window = new Timeline.Window();
        this.period = new Timeline.Period();
        this.sessions = new HashMap<>();
        this.currentTimeline = Timeline.EMPTY;
    }

    public DefaultPlaybackSessionManager() {
        this(DEFAULT_SESSION_ID_GENERATOR);
    }
}
