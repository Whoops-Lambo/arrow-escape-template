package com.google.android.exoplayer2.source;

import android.os.Handler;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.UnknownNull;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class CompositeMediaSource<T> extends BaseMediaSource {
    private final HashMap<T, d> childSources = new HashMap<>();

    @Nullable
    private Handler eventHandler;

    @Nullable
    private TransferListener mediaTransferListener;

    @Nullable
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(@UnknownNull T t, MediaSource.MediaPeriodId mediaPeriodId) {
        return mediaPeriodId;
    }

    public long getMediaTimeForChildMediaTime(@UnknownNull T t, long j) {
        return j;
    }

    public int getWindowIndexForChildWindowIndex(@UnknownNull T t, int i) {
        return i;
    }

    /* JADX INFO: renamed from: onChildSourceInfoRefreshed, reason: merged with bridge method [inline-methods] */
    public abstract void lambda$prepareChildSource$0(@UnknownNull T t, MediaSource mediaSource, Timeline timeline);

    public final void disableChildSource(@UnknownNull T t) {
        d dVar = (d) Assertions.checkNotNull(this.childSources.get(t));
        dVar.a.disable(dVar.b);
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    @CallSuper
    public void disableInternal() {
        for (d dVar : this.childSources.values()) {
            dVar.a.disable(dVar.b);
        }
    }

    public final void enableChildSource(@UnknownNull T t) {
        d dVar = (d) Assertions.checkNotNull(this.childSources.get(t));
        dVar.a.enable(dVar.b);
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    @CallSuper
    public void enableInternal() {
        for (d dVar : this.childSources.values()) {
            dVar.a.enable(dVar.b);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    @CallSuper
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        Iterator<d> it = this.childSources.values().iterator();
        while (it.hasNext()) {
            it.next().a.maybeThrowSourceInfoRefreshError();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.exoplayer2.source.MediaSource$MediaSourceCaller, jw] */
    public final void prepareChildSource(@UnknownNull final T t, MediaSource mediaSource) {
        Assertions.checkArgument(!this.childSources.containsKey(t));
        ?? r0 = new MediaSource.MediaSourceCaller() { // from class: jw
            @Override // com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller
            public final void onSourceInfoRefreshed(MediaSource mediaSource2, Timeline timeline) {
                this.a.lambda$prepareChildSource$0(t, mediaSource2, timeline);
            }
        };
        c cVar = new c(this, t);
        this.childSources.put(t, new d(mediaSource, r0, cVar));
        mediaSource.addEventListener((Handler) Assertions.checkNotNull(this.eventHandler), cVar);
        mediaSource.addDrmEventListener((Handler) Assertions.checkNotNull(this.eventHandler), cVar);
        mediaSource.prepareSource(r0, this.mediaTransferListener, getPlayerId());
        if (isEnabled()) {
            return;
        }
        mediaSource.disable(r0);
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    @CallSuper
    public void prepareSourceInternal(@Nullable TransferListener transferListener) {
        this.mediaTransferListener = transferListener;
        this.eventHandler = Util.createHandlerForCurrentLooper();
    }

    public final void releaseChildSource(@UnknownNull T t) {
        d dVar = (d) Assertions.checkNotNull(this.childSources.remove(t));
        dVar.a.releaseSource(dVar.b);
        MediaSource mediaSource = dVar.a;
        c cVar = dVar.c;
        mediaSource.removeEventListener(cVar);
        mediaSource.removeDrmEventListener(cVar);
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    @CallSuper
    public void releaseSourceInternal() {
        for (d dVar : this.childSources.values()) {
            MediaSource mediaSource = dVar.a;
            c cVar = dVar.c;
            mediaSource.releaseSource(dVar.b);
            mediaSource.removeEventListener(cVar);
            mediaSource.removeDrmEventListener(cVar);
        }
        this.childSources.clear();
    }
}
