package com.google.android.exoplayer2.source.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.CompositeMediaSource;
import com.google.android.exoplayer2.source.MaskingMediaPeriod;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.ui.AdViewProvider;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import defpackage.p4;
import defpackage.pv1;
import defpackage.r4;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class AdsMediaSource extends CompositeMediaSource<MediaSource.MediaPeriodId> {
    private static final MediaSource.MediaPeriodId CHILD_SOURCE_MEDIA_PERIOD_ID = new MediaSource.MediaPeriodId(new Object());
    private final MediaSource.Factory adMediaSourceFactory;

    @Nullable
    private AdPlaybackState adPlaybackState;
    private final DataSpec adTagDataSpec;
    private final AdViewProvider adViewProvider;
    private final Object adsId;
    private final AdsLoader adsLoader;

    @Nullable
    private b componentListener;
    private final MediaSource contentMediaSource;

    @Nullable
    private Timeline contentTimeline;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private final Timeline.Period period = new Timeline.Period();
    private r4[][] adMediaSourceHolders = new r4[0][];

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class AdLoadException extends IOException {
        public static final int TYPE_AD = 0;
        public static final int TYPE_AD_GROUP = 1;
        public static final int TYPE_ALL_ADS = 2;
        public static final int TYPE_UNEXPECTED = 3;
        public final int type;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Type {
        }

        public static AdLoadException createForAd(Exception exc) {
            return new AdLoadException(0, exc);
        }

        public static AdLoadException createForAdGroup(Exception exc, int i) {
            return new AdLoadException(1, new IOException(pv1.k(i, "Failed to load ad group "), exc));
        }

        public static AdLoadException createForAllAds(Exception exc) {
            return new AdLoadException(2, exc);
        }

        public static AdLoadException createForUnexpected(RuntimeException runtimeException) {
            return new AdLoadException(3, runtimeException);
        }

        public RuntimeException getRuntimeExceptionForUnexpected() {
            Assertions.checkState(this.type == 3);
            return (RuntimeException) Assertions.checkNotNull(getCause());
        }

        private AdLoadException(int i, Exception exc) {
            super(exc);
            this.type = i;
        }
    }

    private long[][] getAdDurationsUs() {
        Timeline timeline;
        long[][] jArr = new long[this.adMediaSourceHolders.length][];
        int i = 0;
        while (true) {
            r4[][] r4VarArr = this.adMediaSourceHolders;
            if (i >= r4VarArr.length) {
                return jArr;
            }
            jArr[i] = new long[r4VarArr[i].length];
            int i2 = 0;
            while (true) {
                r4[] r4VarArr2 = this.adMediaSourceHolders[i];
                if (i2 < r4VarArr2.length) {
                    r4 r4Var = r4VarArr2[i2];
                    long[] jArr2 = jArr[i];
                    long durationUs = -9223372036854775807L;
                    if (r4Var != null && (timeline = r4Var.e) != null) {
                        durationUs = timeline.getPeriod(0, r4Var.f.period).getDurationUs();
                    }
                    jArr2[i2] = durationUs;
                    i2++;
                }
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepareSourceInternal$0(b bVar) {
        this.adsLoader.start(this, this.adTagDataSpec, this.adsId, this.adViewProvider, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$releaseSourceInternal$1(b bVar) {
        this.adsLoader.stop(this, bVar);
    }

    private void maybeUpdateAdMediaSources() {
        Uri uri;
        AdPlaybackState adPlaybackState = this.adPlaybackState;
        if (adPlaybackState == null) {
            return;
        }
        for (int i = 0; i < this.adMediaSourceHolders.length; i++) {
            int i2 = 0;
            while (true) {
                r4[] r4VarArr = this.adMediaSourceHolders[i];
                if (i2 < r4VarArr.length) {
                    r4 r4Var = r4VarArr[i2];
                    AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i);
                    if (r4Var != null && r4Var.d == null) {
                        Uri[] uriArr = adGroup.uris;
                        if (i2 < uriArr.length && (uri = uriArr[i2]) != null) {
                            MediaItem.Builder uri2 = new MediaItem.Builder().setUri(uri);
                            MediaItem.LocalConfiguration localConfiguration = this.contentMediaSource.getMediaItem().localConfiguration;
                            if (localConfiguration != null) {
                                uri2.setDrmConfiguration(localConfiguration.drmConfiguration);
                            }
                            MediaSource mediaSourceCreateMediaSource = this.adMediaSourceFactory.createMediaSource(uri2.build());
                            AdsMediaSource adsMediaSource = r4Var.f;
                            ArrayList arrayList = r4Var.b;
                            r4Var.d = mediaSourceCreateMediaSource;
                            r4Var.c = uri;
                            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                                MaskingMediaPeriod maskingMediaPeriod = (MaskingMediaPeriod) arrayList.get(i3);
                                maskingMediaPeriod.setMediaSource(mediaSourceCreateMediaSource);
                                maskingMediaPeriod.setPrepareListener(new a(adsMediaSource, uri));
                            }
                            adsMediaSource.prepareChildSource(r4Var.a, mediaSourceCreateMediaSource);
                        }
                    }
                    i2++;
                }
            }
        }
    }

    private void maybeUpdateSourceInfo() {
        Timeline timeline = this.contentTimeline;
        AdPlaybackState adPlaybackState = this.adPlaybackState;
        if (adPlaybackState == null || timeline == null) {
            return;
        }
        if (adPlaybackState.adGroupCount == 0) {
            refreshSourceInfo(timeline);
        } else {
            this.adPlaybackState = adPlaybackState.withAdDurationsUs(getAdDurationsUs());
            refreshSourceInfo(new SinglePeriodAdTimeline(timeline, this.adPlaybackState));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAdPlaybackState(AdPlaybackState adPlaybackState) {
        AdPlaybackState adPlaybackState2 = this.adPlaybackState;
        if (adPlaybackState2 == null) {
            r4[][] r4VarArr = new r4[adPlaybackState.adGroupCount][];
            this.adMediaSourceHolders = r4VarArr;
            Arrays.fill(r4VarArr, new r4[0]);
        } else {
            Assertions.checkState(adPlaybackState.adGroupCount == adPlaybackState2.adGroupCount);
        }
        this.adPlaybackState = adPlaybackState;
        maybeUpdateAdMediaSources();
        maybeUpdateSourceInfo();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        if (((AdPlaybackState) Assertions.checkNotNull(this.adPlaybackState)).adGroupCount <= 0 || !mediaPeriodId.isAd()) {
            MaskingMediaPeriod maskingMediaPeriod = new MaskingMediaPeriod(mediaPeriodId, allocator, j);
            maskingMediaPeriod.setMediaSource(this.contentMediaSource);
            maskingMediaPeriod.createPeriod(mediaPeriodId);
            return maskingMediaPeriod;
        }
        int i = mediaPeriodId.adGroupIndex;
        int i2 = mediaPeriodId.adIndexInAdGroup;
        r4[][] r4VarArr = this.adMediaSourceHolders;
        r4[] r4VarArr2 = r4VarArr[i];
        if (r4VarArr2.length <= i2) {
            r4VarArr[i] = (r4[]) Arrays.copyOf(r4VarArr2, i2 + 1);
        }
        r4 r4Var = this.adMediaSourceHolders[i][i2];
        if (r4Var == null) {
            r4Var = new r4(this, mediaPeriodId);
            this.adMediaSourceHolders[i][i2] = r4Var;
            maybeUpdateAdMediaSources();
        }
        MaskingMediaPeriod maskingMediaPeriod2 = new MaskingMediaPeriod(mediaPeriodId, allocator, j);
        r4Var.b.add(maskingMediaPeriod2);
        MediaSource mediaSource = r4Var.d;
        if (mediaSource != null) {
            maskingMediaPeriod2.setMediaSource(mediaSource);
            maskingMediaPeriod2.setPrepareListener(new a(r4Var.f, (Uri) Assertions.checkNotNull(r4Var.c)));
        }
        Timeline timeline = r4Var.e;
        if (timeline != null) {
            maskingMediaPeriod2.createPeriod(new MediaSource.MediaPeriodId(timeline.getUidOfPeriod(0), mediaPeriodId.windowSequenceNumber));
        }
        return maskingMediaPeriod2;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
        return this.contentMediaSource.getMediaItem();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        MaskingMediaPeriod maskingMediaPeriod = (MaskingMediaPeriod) mediaPeriod;
        MediaSource.MediaPeriodId mediaPeriodId = maskingMediaPeriod.id;
        if (!mediaPeriodId.isAd()) {
            maskingMediaPeriod.releasePeriod();
            return;
        }
        r4 r4Var = (r4) Assertions.checkNotNull(this.adMediaSourceHolders[mediaPeriodId.adGroupIndex][mediaPeriodId.adIndexInAdGroup]);
        r4Var.b.remove(maskingMediaPeriod);
        maskingMediaPeriod.releasePeriod();
        if (r4Var.b.isEmpty()) {
            if (r4Var.d != null) {
                r4Var.f.releaseChildSource(r4Var.a);
            }
            this.adMediaSourceHolders[mediaPeriodId.adGroupIndex][mediaPeriodId.adIndexInAdGroup] = null;
        }
    }

    public AdsMediaSource(MediaSource mediaSource, DataSpec dataSpec, Object obj, MediaSource.Factory factory, AdsLoader adsLoader, AdViewProvider adViewProvider) {
        this.contentMediaSource = mediaSource;
        this.adMediaSourceFactory = factory;
        this.adsLoader = adsLoader;
        this.adViewProvider = adViewProvider;
        this.adTagDataSpec = dataSpec;
        this.adsId = obj;
        adsLoader.setSupportedContentTypes(factory.getSupportedTypes());
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(MediaSource.MediaPeriodId mediaPeriodId, MediaSource.MediaPeriodId mediaPeriodId2) {
        if (mediaPeriodId.isAd()) {
            return mediaPeriodId;
        }
        return mediaPeriodId2;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public void lambda$prepareChildSource$0(MediaSource.MediaPeriodId mediaPeriodId, MediaSource mediaSource, Timeline timeline) {
        boolean z = false;
        boolean z2 = true;
        if (mediaPeriodId.isAd()) {
            r4 r4Var = (r4) Assertions.checkNotNull(this.adMediaSourceHolders[mediaPeriodId.adGroupIndex][mediaPeriodId.adIndexInAdGroup]);
            ArrayList arrayList = r4Var.b;
            if (timeline.getPeriodCount() != 1) {
                z2 = false;
            }
            Assertions.checkArgument(z2);
            if (r4Var.e == null) {
                Object uidOfPeriod = timeline.getUidOfPeriod(0);
                for (int i = 0; i < arrayList.size(); i++) {
                    MaskingMediaPeriod maskingMediaPeriod = (MaskingMediaPeriod) arrayList.get(i);
                    maskingMediaPeriod.createPeriod(new MediaSource.MediaPeriodId(uidOfPeriod, maskingMediaPeriod.id.windowSequenceNumber));
                }
            }
            r4Var.e = timeline;
        } else {
            if (timeline.getPeriodCount() == 1) {
                z = true;
            }
            Assertions.checkArgument(z);
            this.contentTimeline = timeline;
        }
        maybeUpdateSourceInfo();
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public void prepareSourceInternal(@Nullable TransferListener transferListener) {
        super.prepareSourceInternal(transferListener);
        b bVar = new b(this);
        this.componentListener = bVar;
        prepareChildSource(CHILD_SOURCE_MEDIA_PERIOD_ID, this.contentMediaSource);
        this.mainHandler.post(new p4(this, bVar, 0));
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public void releaseSourceInternal() {
        super.releaseSourceInternal();
        b bVar = (b) Assertions.checkNotNull(this.componentListener);
        this.componentListener = null;
        bVar.b = true;
        bVar.a.removeCallbacksAndMessages(null);
        this.contentTimeline = null;
        this.adPlaybackState = null;
        this.adMediaSourceHolders = new r4[0][];
        this.mainHandler.post(new p4(this, bVar, 1));
    }
}
