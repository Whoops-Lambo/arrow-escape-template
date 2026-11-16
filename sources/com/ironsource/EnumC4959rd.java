package com.ironsource;

import androidx.media3.exoplayer.upstream.CmcdData;

/* JADX INFO: renamed from: com.ironsource.rd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public enum EnumC4959rd {
    PER_DAY("d"),
    PER_HOUR(CmcdData.STREAMING_FORMAT_HLS);

    public String a;

    @Override // java.lang.Enum
    public String toString() {
        return this.a;
    }

    EnumC4959rd(String str) {
        this.a = str;
    }
}
