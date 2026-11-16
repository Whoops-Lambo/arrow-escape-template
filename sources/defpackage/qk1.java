package defpackage;

import com.google.android.exoplayer2.AbstractConcatenatedTimeline;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class qk1 implements MediaSourceEventListener, DrmSessionEventListener {
    public final sk1 a;
    public MediaSourceEventListener.EventDispatcher b;
    public DrmSessionEventListener.EventDispatcher c;
    public final /* synthetic */ tk1 d;

    public final boolean a(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        sk1 sk1Var = this.a;
        MediaSource.MediaPeriodId mediaPeriodIdCopyWithPeriodUid = null;
        if (mediaPeriodId != null) {
            for (int i2 = 0; i2 < sk1Var.c.size(); i2++) {
                if (((MediaSource.MediaPeriodId) sk1Var.c.get(i2)).windowSequenceNumber == mediaPeriodId.windowSequenceNumber) {
                    mediaPeriodIdCopyWithPeriodUid = mediaPeriodId.copyWithPeriodUid(AbstractConcatenatedTimeline.getConcatenatedUid(sk1Var.b, mediaPeriodId.periodUid));
                    break;
                }
            }
            if (mediaPeriodIdCopyWithPeriodUid == null) {
                return false;
            }
        }
        int i3 = i + sk1Var.d;
        MediaSourceEventListener.EventDispatcher eventDispatcher = this.b;
        int i4 = eventDispatcher.windowIndex;
        tk1 tk1Var = this.d;
        if (i4 != i3 || !Util.areEqual(eventDispatcher.mediaPeriodId, mediaPeriodIdCopyWithPeriodUid)) {
            this.b = tk1Var.f.withParameters(i3, mediaPeriodIdCopyWithPeriodUid, 0L);
        }
        DrmSessionEventListener.EventDispatcher eventDispatcher2 = this.c;
        if (eventDispatcher2.windowIndex == i3 && Util.areEqual(eventDispatcher2.mediaPeriodId, mediaPeriodIdCopyWithPeriodUid)) {
            return true;
        }
        this.c = tk1Var.g.withParameters(i3, mediaPeriodIdCopyWithPeriodUid);
        return true;
    }

    public qk1(tk1 tk1Var, sk1 sk1Var) {
        this.d = tk1Var;
        this.b = tk1Var.f;
        this.c = tk1Var.g;
        this.a = sk1Var;
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onDownstreamFormatChanged(int i, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
        if (a(i, mediaPeriodId)) {
            this.b.downstreamFormatChanged(mediaLoadData);
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
            this.b.loadCanceled(loadEventInfo, mediaLoadData);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onLoadCompleted(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        if (a(i, mediaPeriodId)) {
            this.b.loadCompleted(loadEventInfo, mediaLoadData);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onLoadError(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        if (a(i, mediaPeriodId)) {
            this.b.loadError(loadEventInfo, mediaLoadData, iOException, z);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onLoadStarted(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        if (a(i, mediaPeriodId)) {
            this.b.loadStarted(loadEventInfo, mediaLoadData);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onUpstreamDiscarded(int i, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
        if (a(i, mediaPeriodId)) {
            this.b.upstreamDiscarded(mediaLoadData);
        }
    }
}
