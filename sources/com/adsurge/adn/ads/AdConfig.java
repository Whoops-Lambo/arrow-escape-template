package com.adsurge.adn.ads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class AdConfig {
    public final AdLogoPosition adLogoPosition;
    public final AdSurgeAdSize adSize;
    public final boolean autoplay;
    public final Double bidFloor;
    public final int count;
    public final Map<String, String> extra;
    public final String mediationAdUnitId;
    public final String mediationSource;
    public final String mediationTraceId;
    public final SoundState mute;
    public final String token;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum AdLogoPosition {
        TOP_LEFT,
        BOTTOM_LEFT,
        TOP_RIGHT,
        BOTTOM_RIGHT
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Builder {
        public int b;
        public String c;
        public Map d;
        public AdSurgeAdSize e;
        public String h;
        public String i;
        public String j;
        public Double k;
        public SoundState a = SoundState.DEFAULT;
        public AdLogoPosition f = AdLogoPosition.TOP_LEFT;
        public boolean g = true;

        @Deprecated
        public Builder adSize(AdSurgeAdSize adSurgeAdSize) {
            this.e = adSurgeAdSize;
            return this;
        }

        public Builder autoplay(boolean z) {
            this.g = z;
            return this;
        }

        public Builder bidFloor(Double d) {
            this.k = d;
            return this;
        }

        public AdConfig build() {
            return new AdConfig(this);
        }

        @Deprecated
        public Builder count(int i) {
            this.b = i;
            return this;
        }

        public Builder extra(Map<String, String> map) {
            this.d = map;
            return this;
        }

        public Builder mediationAdUnitId(String str) {
            this.i = str;
            return this;
        }

        public Builder mediationSource(String str) {
            this.h = str;
            return this;
        }

        public Builder mediationTraceId(String str) {
            this.j = str;
            return this;
        }

        public Builder mute(SoundState soundState) {
            this.a = soundState;
            return this;
        }

        public Builder nativeAdLogoPosition(AdLogoPosition adLogoPosition) {
            this.f = adLogoPosition;
            return this;
        }

        public Builder payload(String str) {
            this.c = str;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum SoundState {
        MUTED,
        UNMUTED,
        DEFAULT
    }

    public AdConfig(Builder builder) {
        this.mute = builder.a;
        this.count = builder.b;
        this.token = builder.c;
        this.extra = builder.d;
        this.adSize = builder.e;
        this.adLogoPosition = builder.f;
        this.autoplay = builder.g;
        this.mediationSource = builder.h;
        this.mediationAdUnitId = builder.i;
        this.mediationTraceId = builder.j;
        this.bidFloor = builder.k;
    }
}
