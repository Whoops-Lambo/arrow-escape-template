package com.unity3d.mediation;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class LevelPlayConfiguration {
    private final boolean a;

    @Nullable
    private final String b;

    @Nullable
    public final String getAb() {
        return this.b;
    }

    public final boolean isAdQualityEnabled() {
        return this.a;
    }

    public LevelPlayConfiguration(boolean z, @Nullable String str) {
        this.a = z;
        this.b = str;
    }
}
