package com.google.android.exoplayer2.drm;

import android.os.Looper;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.analytics.PlayerId;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class h implements DrmSessionManager {
    @Override // com.google.android.exoplayer2.drm.DrmSessionManager
    public final void setPlayer(Looper looper, PlayerId playerId) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManager
    public final DrmSession acquireSession(DrmSessionEventListener.EventDispatcher eventDispatcher, Format format) {
        if (format.drmInitData == null) {
            return null;
        }
        return new ErrorStateDrmSession(new DrmSession.DrmSessionException(new UnsupportedDrmException(1), 6001));
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManager
    public final int getCryptoType(Format format) {
        return format.drmInitData != null ? 1 : 0;
    }
}
