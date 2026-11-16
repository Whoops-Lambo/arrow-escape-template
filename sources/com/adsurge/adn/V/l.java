package com.adsurge.adn.V;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class l extends com.adsurge.adn.Y0.d {
    public l a(boolean z) {
        a("is_cache", Integer.valueOf(z ? 1 : 0));
        return this;
    }

    public l d(String str) {
        a("video_url", str);
        return this;
    }

    public l b(int i) {
        a("stutter_count", Integer.valueOf(i));
        return this;
    }

    public l c(long j) {
        a("video_start_duration", Long.valueOf(j));
        return this;
    }

    public l a(String str) {
        a("first_format_id", str);
        return this;
    }

    public l b(String str) {
        a("format_id", str);
        return this;
    }

    public l c(String str) {
        a("optimized_format_id", str);
        return this;
    }

    public l a(long j) {
        a("max_stutter_duration", Long.valueOf(j));
        return this;
    }

    public l b(long j) {
        a("video_play_time", Long.valueOf(j));
        return this;
    }

    public l a(int i) {
        a("player_type", Integer.valueOf(i));
        return this;
    }
}
