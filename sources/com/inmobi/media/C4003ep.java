package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.VideoExperience;
import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: renamed from: com.inmobi.media.ep, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C4003ep {
    public final boolean a;
    public final boolean b;
    public final Xh c;
    public final C4064h2 d;
    public final Wp e;

    public C4003ep(boolean z, VideoExperience videoExperience, AdConfig.NativeConfig nativeConfig) {
        boolean loopVideoOnComplete;
        videoExperience.getClass();
        nativeConfig.getClass();
        this.a = z;
        Boolean loopVideoOnComplete2 = videoExperience.getLoopVideoOnComplete();
        if (loopVideoOnComplete2 != null) {
            loopVideoOnComplete = loopVideoOnComplete2.booleanValue();
        } else {
            loopVideoOnComplete = nativeConfig.getVideoPlayerConfig().getLoopVideoOnComplete();
        }
        this.b = loopVideoOnComplete;
        this.c = new Xh(videoExperience, nativeConfig.getVideoPlayerConfig().getLoopVideoOnComplete(), nativeConfig.getVideoPlayerConfig().getProgressConfig());
        this.d = new C4064h2(videoExperience, nativeConfig.getVideoPlayerConfig().getAudioConfig());
        this.e = new Wp(nativeConfig.getVideoPlayerConfig().getViewability());
    }
}
