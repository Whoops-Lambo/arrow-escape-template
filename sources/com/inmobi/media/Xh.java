package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.VideoExperience;
import com.inmobi.media.core.config.models.AdConfig;
import defpackage.du;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Xh {
    public final boolean a;
    public final boolean b;
    public final int[] c;
    public final int[] d;
    public final int e;
    public final long f;

    public Xh(VideoExperience videoExperience, boolean z, AdConfig.VideoPlayerProgressConfig videoPlayerProgressConfig) {
        boolean showProgress;
        int height;
        videoExperience.getClass();
        videoPlayerProgressConfig.getClass();
        Boolean showProgress2 = videoExperience.getProgress().getShowProgress();
        if (showProgress2 != null) {
            showProgress = showProgress2.booleanValue();
        } else {
            showProgress = videoPlayerProgressConfig.getShowProgress();
        }
        this.a = showProgress;
        Boolean loopVideoOnComplete = videoExperience.getLoopVideoOnComplete();
        this.b = !(loopVideoOnComplete != null ? loopVideoOnComplete.booleanValue() : z);
        int[] color = videoExperience.getProgress().getColor();
        this.c = color == null ? du.y0(videoPlayerProgressConfig.getForegroundColor()) : color;
        this.d = du.y0(videoPlayerProgressConfig.getBackgroundColor());
        Integer height2 = videoExperience.getProgress().getHeight();
        if (height2 != null) {
            height = height2.intValue();
        } else {
            height = videoPlayerProgressConfig.getHeight();
        }
        this.e = height;
        this.f = videoPlayerProgressConfig.getProgressPolling();
    }
}
