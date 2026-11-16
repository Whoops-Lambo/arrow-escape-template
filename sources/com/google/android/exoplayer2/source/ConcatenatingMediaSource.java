package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractConcatenatedTimeline;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import defpackage.mw;
import defpackage.nw;
import defpackage.ow;
import defpackage.pw;
import io.p071bidmachine.media3.extractor.ts.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class ConcatenatingMediaSource extends CompositeMediaSource<f> {
    private static final MediaItem EMPTY_MEDIA_ITEM = new MediaItem.Builder().setUri(Uri.EMPTY).build();
    private static final int MSG_ADD = 0;
    private static final int MSG_MOVE = 2;
    private static final int MSG_ON_COMPLETION = 5;
    private static final int MSG_REMOVE = 1;
    private static final int MSG_SET_SHUFFLE_ORDER = 3;
    private static final int MSG_UPDATE_TIMELINE = 4;
    private final Set<f> enabledMediaSourceHolders;
    private final boolean isAtomic;
    private final IdentityHashMap<MediaPeriod, f> mediaSourceByMediaPeriod;
    private final Map<Object, f> mediaSourceByUid;
    private final List<f> mediaSourceHolders;

    @GuardedBy
    private final List<f> mediaSourcesPublic;
    private Set<ow> nextTimelineUpdateOnCompletionActions;

    @GuardedBy
    private final Set<ow> pendingOnCompletionActions;

    @Nullable
    @GuardedBy
    private Handler playbackThreadHandler;
    private ShuffleOrder shuffleOrder;
    private boolean timelineUpdateScheduled;
    private final boolean useLazyPreparation;

    private void addMediaSourceInternal(int i, f fVar) {
        if (i > 0) {
            f fVar2 = this.mediaSourceHolders.get(i - 1);
            int windowCount = fVar2.a.getTimeline().getWindowCount() + fVar2.e;
            fVar.d = i;
            fVar.e = windowCount;
            fVar.f = false;
            fVar.c.clear();
        } else {
            fVar.d = i;
            fVar.e = 0;
            fVar.f = false;
            fVar.c.clear();
        }
        correctOffsets(i, 1, fVar.a.getTimeline().getWindowCount());
        this.mediaSourceHolders.add(i, fVar);
        this.mediaSourceByUid.put(fVar.b, fVar);
        prepareChildSource(fVar, fVar.a);
        if (isEnabled() && this.mediaSourceByMediaPeriod.isEmpty()) {
            this.enabledMediaSourceHolders.add(fVar);
        } else {
            disableChildSource(fVar);
        }
    }

    @GuardedBy
    private void addPublicMediaSources(int i, Collection<MediaSource> collection, @Nullable Handler handler, @Nullable Runnable runnable) {
        Assertions.checkArgument((handler == null) == (runnable == null));
        Handler handler2 = this.playbackThreadHandler;
        Iterator<MediaSource> it = collection.iterator();
        while (it.hasNext()) {
            Assertions.checkNotNull(it.next());
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<MediaSource> it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(new f(it2.next(), this.useLazyPreparation));
        }
        this.mediaSourcesPublic.addAll(i, arrayList);
        if (handler2 != null && !collection.isEmpty()) {
            handler2.obtainMessage(0, new pw(i, arrayList, createOnCompletionAction(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    private synchronized void dispatchOnCompletionActions(Set<ow> set) {
        try {
            for (ow owVar : set) {
                owVar.a.post(owVar.b);
            }
            this.pendingOnCompletionActions.removeAll(set);
        } catch (Throwable th) {
            throw th;
        }
    }

    @GuardedBy
    private void movePublicMediaSource(int i, int i2, @Nullable Handler handler, @Nullable Runnable runnable) {
        Assertions.checkArgument((handler == null) == (runnable == null));
        Handler handler2 = this.playbackThreadHandler;
        List<f> list = this.mediaSourcesPublic;
        list.add(i2, list.remove(i));
        if (handler2 != null) {
            handler2.obtainMessage(2, new pw(i, Integer.valueOf(i2), createOnCompletionAction(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    @GuardedBy
    private void removePublicMediaSources(int i, int i2, @Nullable Handler handler, @Nullable Runnable runnable) {
        Assertions.checkArgument((handler == null) == (runnable == null));
        Handler handler2 = this.playbackThreadHandler;
        Util.removeRange(this.mediaSourcesPublic, i, i2);
        if (handler2 != null) {
            handler2.obtainMessage(1, new pw(i, Integer.valueOf(i2), createOnCompletionAction(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    @GuardedBy
    private void setPublicShuffleOrder(ShuffleOrder shuffleOrder, @Nullable Handler handler, @Nullable Runnable runnable) {
        Assertions.checkArgument((handler == null) == (runnable == null));
        Handler handler2 = this.playbackThreadHandler;
        if (handler2 != null) {
            int size = getSize();
            if (shuffleOrder.getLength() != size) {
                shuffleOrder = shuffleOrder.cloneAndClear().cloneAndInsert(0, size);
            }
            handler2.obtainMessage(3, new pw(0, shuffleOrder, createOnCompletionAction(handler, runnable))).sendToTarget();
            return;
        }
        if (shuffleOrder.getLength() > 0) {
            shuffleOrder = shuffleOrder.cloneAndClear();
        }
        this.shuffleOrder = shuffleOrder;
        if (runnable == null || handler == null) {
            return;
        }
        handler.post(runnable);
    }

    private void updateTimelineAndScheduleOnCompletionActions() {
        this.timelineUpdateScheduled = false;
        Set<ow> set = this.nextTimelineUpdateOnCompletionActions;
        this.nextTimelineUpdateOnCompletionActions = new HashSet();
        refreshSourceInfo(new nw(this.mediaSourceHolders, this.shuffleOrder, this.isAtomic));
        getPlaybackThreadHandlerOnPlaybackThread().obtainMessage(5, set).sendToTarget();
    }

    public synchronized void addMediaSource(MediaSource mediaSource) {
        addMediaSource(this.mediaSourcesPublic.size(), mediaSource);
    }

    public synchronized void addMediaSources(Collection<MediaSource> collection) {
        addPublicMediaSources(this.mediaSourcesPublic.size(), collection, null, null);
    }

    public synchronized void clear() {
        removeMediaSourceRange(0, getSize());
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public void enableInternal() {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public synchronized Timeline getInitialTimeline() {
        ShuffleOrder shuffleOrderCloneAndInsert;
        try {
            int length = this.shuffleOrder.getLength();
            int size = this.mediaSourcesPublic.size();
            shuffleOrderCloneAndInsert = this.shuffleOrder;
            if (length != size) {
                shuffleOrderCloneAndInsert = shuffleOrderCloneAndInsert.cloneAndClear().cloneAndInsert(0, this.mediaSourcesPublic.size());
            }
        } catch (Throwable th) {
            throw th;
        }
        return new nw(this.mediaSourcesPublic, shuffleOrderCloneAndInsert, this.isAtomic);
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    @Nullable
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(f fVar, MediaSource.MediaPeriodId mediaPeriodId) {
        for (int i = 0; i < fVar.c.size(); i++) {
            if (((MediaSource.MediaPeriodId) fVar.c.get(i)).windowSequenceNumber == mediaPeriodId.windowSequenceNumber) {
                return mediaPeriodId.copyWithPeriodUid(getPeriodUid(fVar, mediaPeriodId.periodUid));
            }
        }
        return null;
    }

    public synchronized MediaSource getMediaSource(int i) {
        return this.mediaSourcesPublic.get(i).a;
    }

    public synchronized int getSize() {
        return this.mediaSourcesPublic.size();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public boolean isSingleWindow() {
        return false;
    }

    public synchronized void moveMediaSource(int i, int i2) {
        movePublicMediaSource(i, i2, null, null);
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public synchronized void prepareSourceInternal(@Nullable TransferListener transferListener) {
        try {
            super.prepareSourceInternal(transferListener);
            this.playbackThreadHandler = new Handler(new mw(this, 0));
            if (this.mediaSourcesPublic.isEmpty()) {
                updateTimelineAndScheduleOnCompletionActions();
            } else {
                this.shuffleOrder = this.shuffleOrder.cloneAndInsert(0, this.mediaSourcesPublic.size());
                addMediaSourcesInternal(0, this.mediaSourcesPublic);
                scheduleTimelineUpdate();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public synchronized void releaseSourceInternal() {
        try {
            super.releaseSourceInternal();
            this.mediaSourceHolders.clear();
            this.enabledMediaSourceHolders.clear();
            this.mediaSourceByUid.clear();
            this.shuffleOrder = this.shuffleOrder.cloneAndClear();
            Handler handler = this.playbackThreadHandler;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.playbackThreadHandler = null;
            }
            this.timelineUpdateScheduled = false;
            this.nextTimelineUpdateOnCompletionActions.clear();
            dispatchOnCompletionActions(this.pendingOnCompletionActions);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized MediaSource removeMediaSource(int i) {
        MediaSource mediaSource;
        mediaSource = getMediaSource(i);
        removePublicMediaSources(i, i + 1, null, null);
        return mediaSource;
    }

    public synchronized void removeMediaSourceRange(int i, int i2) {
        removePublicMediaSources(i, i2, null, null);
    }

    public synchronized void setShuffleOrder(ShuffleOrder shuffleOrder) {
        setPublicShuffleOrder(shuffleOrder, null, null);
    }

    private void correctOffsets(int i, int i2, int i3) {
        while (i < this.mediaSourceHolders.size()) {
            f fVar = this.mediaSourceHolders.get(i);
            fVar.d += i2;
            fVar.e += i3;
            i++;
        }
    }

    @Nullable
    @GuardedBy
    private ow createOnCompletionAction(@Nullable Handler handler, @Nullable Runnable runnable) {
        if (handler == null || runnable == null) {
            return null;
        }
        ow owVar = new ow(handler, runnable);
        this.pendingOnCompletionActions.add(owVar);
        return owVar;
    }

    private void disableUnusedMediaSources() {
        Iterator<f> it = this.enabledMediaSourceHolders.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (next.c.isEmpty()) {
                disableChildSource(next);
                it.remove();
            }
        }
    }

    private void enableMediaSource(f fVar) {
        this.enabledMediaSourceHolders.add(fVar);
        enableChildSource(fVar);
    }

    private static Object getPeriodUid(f fVar, Object obj) {
        return AbstractConcatenatedTimeline.getConcatenatedUid(fVar.b, obj);
    }

    private Handler getPlaybackThreadHandlerOnPlaybackThread() {
        return (Handler) Assertions.checkNotNull(this.playbackThreadHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            pw pwVar = (pw) Util.castNonNull(message.obj);
            ShuffleOrder shuffleOrder = this.shuffleOrder;
            int i2 = pwVar.a;
            Object obj = pwVar.b;
            this.shuffleOrder = shuffleOrder.cloneAndInsert(i2, ((Collection) obj).size());
            addMediaSourcesInternal(pwVar.a, (Collection) obj);
            scheduleTimelineUpdate(pwVar.c);
        } else if (i == 1) {
            pw pwVar2 = (pw) Util.castNonNull(message.obj);
            int i3 = pwVar2.a;
            int iIntValue = ((Integer) pwVar2.b).intValue();
            if (i3 == 0 && iIntValue == this.shuffleOrder.getLength()) {
                this.shuffleOrder = this.shuffleOrder.cloneAndClear();
            } else {
                this.shuffleOrder = this.shuffleOrder.cloneAndRemove(i3, iIntValue);
            }
            for (int i4 = iIntValue - 1; i4 >= i3; i4--) {
                removeMediaSourceInternal(i4);
            }
            scheduleTimelineUpdate(pwVar2.c);
        } else if (i == 2) {
            pw pwVar3 = (pw) Util.castNonNull(message.obj);
            ShuffleOrder shuffleOrder2 = this.shuffleOrder;
            int i5 = pwVar3.a;
            Object obj2 = pwVar3.b;
            ShuffleOrder shuffleOrderCloneAndRemove = shuffleOrder2.cloneAndRemove(i5, i5 + 1);
            this.shuffleOrder = shuffleOrderCloneAndRemove;
            this.shuffleOrder = shuffleOrderCloneAndRemove.cloneAndInsert(((Integer) obj2).intValue(), 1);
            moveMediaSourceInternal(pwVar3.a, ((Integer) obj2).intValue());
            scheduleTimelineUpdate(pwVar3.c);
        } else if (i == 3) {
            pw pwVar4 = (pw) Util.castNonNull(message.obj);
            this.shuffleOrder = (ShuffleOrder) pwVar4.b;
            scheduleTimelineUpdate(pwVar4.c);
        } else if (i == 4) {
            updateTimelineAndScheduleOnCompletionActions();
        } else {
            if (i != 5) {
                y.b();
                return false;
            }
            dispatchOnCompletionActions((Set) Util.castNonNull(message.obj));
        }
        return true;
    }

    private void maybeReleaseChildSource(f fVar) {
        if (fVar.f && fVar.c.isEmpty()) {
            this.enabledMediaSourceHolders.remove(fVar);
            releaseChildSource(fVar);
        }
    }

    private void removeMediaSourceInternal(int i) {
        f fVarRemove = this.mediaSourceHolders.remove(i);
        this.mediaSourceByUid.remove(fVarRemove.b);
        correctOffsets(i, -1, -fVarRemove.a.getTimeline().getWindowCount());
        fVarRemove.f = true;
        maybeReleaseChildSource(fVarRemove);
    }

    private void scheduleTimelineUpdate(@Nullable ow owVar) {
        if (!this.timelineUpdateScheduled) {
            getPlaybackThreadHandlerOnPlaybackThread().obtainMessage(4).sendToTarget();
            this.timelineUpdateScheduled = true;
        }
        if (owVar != null) {
            this.nextTimelineUpdateOnCompletionActions.add(owVar);
        }
    }

    private void updateMediaSourceInternal(f fVar, Timeline timeline) {
        if (fVar.d + 1 < this.mediaSourceHolders.size()) {
            int windowCount = timeline.getWindowCount() - (this.mediaSourceHolders.get(fVar.d + 1).e - fVar.e);
            if (windowCount != 0) {
                correctOffsets(fVar.d + 1, 0, windowCount);
            }
        }
        scheduleTimelineUpdate();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        Object mediaSourceHolderUid = getMediaSourceHolderUid(mediaPeriodId.periodUid);
        MediaSource.MediaPeriodId mediaPeriodIdCopyWithPeriodUid = mediaPeriodId.copyWithPeriodUid(getChildPeriodUid(mediaPeriodId.periodUid));
        f fVar = this.mediaSourceByUid.get(mediaSourceHolderUid);
        if (fVar == null) {
            fVar = new f(new e(), this.useLazyPreparation);
            fVar.f = true;
            prepareChildSource(fVar, fVar.a);
        }
        enableMediaSource(fVar);
        fVar.c.add(mediaPeriodIdCopyWithPeriodUid);
        MaskingMediaPeriod maskingMediaPeriodCreatePeriod = fVar.a.createPeriod(mediaPeriodIdCopyWithPeriodUid, allocator, j);
        this.mediaSourceByMediaPeriod.put(maskingMediaPeriodCreatePeriod, fVar);
        disableUnusedMediaSources();
        return maskingMediaPeriodCreatePeriod;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
        return EMPTY_MEDIA_ITEM;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        f fVar = (f) Assertions.checkNotNull(this.mediaSourceByMediaPeriod.remove(mediaPeriod));
        fVar.a.releasePeriod(mediaPeriod);
        fVar.c.remove(((MaskingMediaPeriod) mediaPeriod).id);
        if (!this.mediaSourceByMediaPeriod.isEmpty()) {
            disableUnusedMediaSources();
        }
        maybeReleaseChildSource(fVar);
    }

    public ConcatenatingMediaSource(boolean z, boolean z2, ShuffleOrder shuffleOrder, MediaSource... mediaSourceArr) {
        for (MediaSource mediaSource : mediaSourceArr) {
            Assertions.checkNotNull(mediaSource);
        }
        this.shuffleOrder = shuffleOrder.getLength() > 0 ? shuffleOrder.cloneAndClear() : shuffleOrder;
        this.mediaSourceByMediaPeriod = new IdentityHashMap<>();
        this.mediaSourceByUid = new HashMap();
        this.mediaSourcesPublic = new ArrayList();
        this.mediaSourceHolders = new ArrayList();
        this.nextTimelineUpdateOnCompletionActions = new HashSet();
        this.pendingOnCompletionActions = new HashSet();
        this.enabledMediaSourceHolders = new HashSet();
        this.isAtomic = z;
        this.useLazyPreparation = z2;
        addMediaSources(Arrays.asList(mediaSourceArr));
    }

    private void addMediaSourcesInternal(int i, Collection<f> collection) {
        Iterator<f> it = collection.iterator();
        while (it.hasNext()) {
            addMediaSourceInternal(i, it.next());
            i++;
        }
    }

    private static Object getChildPeriodUid(Object obj) {
        return AbstractConcatenatedTimeline.getChildPeriodUidFromConcatenatedUid(obj);
    }

    private static Object getMediaSourceHolderUid(Object obj) {
        return AbstractConcatenatedTimeline.getChildTimelineUidFromConcatenatedUid(obj);
    }

    private void moveMediaSourceInternal(int i, int i2) {
        int iMin = Math.min(i, i2);
        int iMax = Math.max(i, i2);
        int windowCount = this.mediaSourceHolders.get(iMin).e;
        List<f> list = this.mediaSourceHolders;
        list.add(i2, list.remove(i));
        while (iMin <= iMax) {
            f fVar = this.mediaSourceHolders.get(iMin);
            fVar.d = iMin;
            fVar.e = windowCount;
            windowCount += fVar.a.getTimeline().getWindowCount();
            iMin++;
        }
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public void disableInternal() {
        super.disableInternal();
        this.enabledMediaSourceHolders.clear();
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public void lambda$prepareChildSource$0(f fVar, MediaSource mediaSource, Timeline timeline) {
        updateMediaSourceInternal(fVar, timeline);
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public int getWindowIndexForChildWindowIndex(f fVar, int i) {
        return i + fVar.e;
    }

    public synchronized void moveMediaSource(int i, int i2, Handler handler, Runnable runnable) {
        movePublicMediaSource(i, i2, handler, runnable);
    }

    public synchronized void removeMediaSourceRange(int i, int i2, Handler handler, Runnable runnable) {
        removePublicMediaSources(i, i2, handler, runnable);
    }

    public synchronized void setShuffleOrder(ShuffleOrder shuffleOrder, Handler handler, Runnable runnable) {
        setPublicShuffleOrder(shuffleOrder, handler, runnable);
    }

    public synchronized void clear(Handler handler, Runnable runnable) {
        removeMediaSourceRange(0, getSize(), handler, runnable);
    }

    public synchronized void addMediaSource(MediaSource mediaSource, Handler handler, Runnable runnable) {
        addMediaSource(this.mediaSourcesPublic.size(), mediaSource, handler, runnable);
    }

    public synchronized void addMediaSources(Collection<MediaSource> collection, Handler handler, Runnable runnable) {
        addPublicMediaSources(this.mediaSourcesPublic.size(), collection, handler, runnable);
    }

    public synchronized MediaSource removeMediaSource(int i, Handler handler, Runnable runnable) {
        MediaSource mediaSource;
        mediaSource = getMediaSource(i);
        removePublicMediaSources(i, i + 1, handler, runnable);
        return mediaSource;
    }

    public synchronized void addMediaSource(int i, MediaSource mediaSource) {
        addPublicMediaSources(i, Collections.singletonList(mediaSource), null, null);
    }

    public synchronized void addMediaSources(int i, Collection<MediaSource> collection) {
        addPublicMediaSources(i, collection, null, null);
    }

    public synchronized void addMediaSource(int i, MediaSource mediaSource, Handler handler, Runnable runnable) {
        addPublicMediaSources(i, Collections.singletonList(mediaSource), handler, runnable);
    }

    public synchronized void addMediaSources(int i, Collection<MediaSource> collection, Handler handler, Runnable runnable) {
        addPublicMediaSources(i, collection, handler, runnable);
    }

    private void scheduleTimelineUpdate() {
        scheduleTimelineUpdate(null);
    }

    public ConcatenatingMediaSource(boolean z, MediaSource... mediaSourceArr) {
        this(z, new ShuffleOrder.DefaultShuffleOrder(0), mediaSourceArr);
    }

    public ConcatenatingMediaSource(boolean z, ShuffleOrder shuffleOrder, MediaSource... mediaSourceArr) {
        this(z, false, shuffleOrder, mediaSourceArr);
    }

    public ConcatenatingMediaSource(MediaSource... mediaSourceArr) {
        this(false, mediaSourceArr);
    }
}
