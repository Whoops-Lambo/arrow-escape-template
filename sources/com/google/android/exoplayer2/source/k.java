package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.drm.DrmSessionManagerProvider;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class k implements MediaSourceFactory {
    @Override // com.google.android.exoplayer2.source.MediaSource.Factory
    public final MediaSource.Factory setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
        return this;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource.Factory
    public final MediaSource.Factory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        return this;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource.Factory
    public final MediaSource createMediaSource(MediaItem mediaItem) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource.Factory
    public final int[] getSupportedTypes() {
        throw new UnsupportedOperationException();
    }
}
