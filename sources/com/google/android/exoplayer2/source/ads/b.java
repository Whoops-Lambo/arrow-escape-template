package com.google.android.exoplayer2.source.ads;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Util;
import defpackage.q4;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class b implements AdsLoader.EventListener {
    public final Handler a = Util.createHandlerForCurrentLooper();
    public volatile boolean b;
    public final /* synthetic */ AdsMediaSource c;

    @Override // com.google.android.exoplayer2.source.ads.AdsLoader.EventListener
    public final void onAdLoadError(AdsMediaSource.AdLoadException adLoadException, DataSpec dataSpec) {
        if (this.b) {
            return;
        }
        this.c.createEventDispatcher(null).loadError(new LoadEventInfo(LoadEventInfo.getNewId(), dataSpec, SystemClock.elapsedRealtime()), 6, (IOException) adLoadException, true);
    }

    @Override // com.google.android.exoplayer2.source.ads.AdsLoader.EventListener
    public final void onAdPlaybackState(AdPlaybackState adPlaybackState) {
        if (this.b) {
            return;
        }
        this.a.post(new q4(2, this, adPlaybackState));
    }

    public b(AdsMediaSource adsMediaSource) {
        this.c = adsMediaSource;
    }
}
