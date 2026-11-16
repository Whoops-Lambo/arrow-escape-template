package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.VideoExperience;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.h2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C4064h2 {
    public final boolean a;
    public final int b;
    public final int c;
    public final Yc d;
    public final int e;

    public C4064h2(VideoExperience videoExperience, AdConfig.VideoPlayerAudioConfig videoPlayerAudioConfig) {
        boolean startMuted;
        int muteIconWidth;
        int muteIconHeight;
        Yc yc;
        Yc yc2;
        int muteIconPosition;
        videoExperience.getClass();
        videoPlayerAudioConfig.getClass();
        Boolean startMuted2 = videoExperience.getAudio().getStartMuted();
        if (startMuted2 != null) {
            startMuted = startMuted2.booleanValue();
        } else {
            startMuted = videoPlayerAudioConfig.getStartMuted();
        }
        this.a = startMuted;
        Integer muteIconWidth2 = videoExperience.getAudio().getMuteIconWidth();
        if (muteIconWidth2 != null) {
            muteIconWidth = muteIconWidth2.intValue();
        } else {
            muteIconWidth = videoPlayerAudioConfig.getMuteIconWidth();
        }
        this.b = muteIconWidth;
        Integer muteIconHeight2 = videoExperience.getAudio().getMuteIconHeight();
        if (muteIconHeight2 != null) {
            muteIconHeight = muteIconHeight2.intValue();
        } else {
            muteIconHeight = videoPlayerAudioConfig.getMuteIconHeight();
        }
        this.c = muteIconHeight;
        int[] muteIconMargin = videoExperience.getAudio().getMuteIconMargin();
        if (muteIconMargin != null) {
            if (muteIconMargin.length != 4) {
                yc2 = new Yc(0, 0, 0, 0);
            } else {
                yc = new Yc(muteIconMargin[0], muteIconMargin[1], muteIconMargin[2], muteIconMargin[3]);
                yc2 = yc;
            }
        } else {
            List<Integer> muteIconMargin2 = videoPlayerAudioConfig.getMuteIconMargin();
            muteIconMargin2.getClass();
            if (muteIconMargin2.size() != 4) {
                yc2 = new Yc(0, 0, 0, 0);
            } else {
                yc = new Yc(muteIconMargin2.get(0).intValue(), muteIconMargin2.get(1).intValue(), muteIconMargin2.get(2).intValue(), muteIconMargin2.get(3).intValue());
                yc2 = yc;
            }
        }
        this.d = yc2;
        Integer muteIconPosition2 = videoExperience.getAudio().getMuteIconPosition();
        if (muteIconPosition2 != null) {
            muteIconPosition = muteIconPosition2.intValue();
        } else {
            muteIconPosition = videoPlayerAudioConfig.getMuteIconPosition();
        }
        this.e = muteIconPosition;
    }
}
