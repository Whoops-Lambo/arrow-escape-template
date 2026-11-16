package com.apm.insight;

import androidx.media3.extractor.text.ttml.TtmlNode;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public enum CrashType {
    LAUNCH("launch"),
    JAVA("java"),
    NATIVE("native"),
    ASAN("asan"),
    TSAN("tsan"),
    ANR("anr"),
    BLOCK("block"),
    ENSURE("ensure"),
    DART("dart"),
    CUSTOM_JAVA("custom_java"),
    OOM("oom"),
    ALL(TtmlNode.COMBINE_ALL);

    private String mName;

    public final String getName() {
        return this.mName;
    }

    CrashType(String str) {
        this.mName = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return getName();
    }
}
