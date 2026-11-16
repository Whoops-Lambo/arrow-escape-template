package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.td, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C4995td {

    @NotNull
    private final String a;

    @NotNull
    private final LevelPlay.AdFormat b;

    @NotNull
    public final String a() {
        return this.a + "_" + this.b;
    }

    public C4995td(@NotNull String str, @NotNull LevelPlay.AdFormat adFormat) {
        str.getClass();
        adFormat.getClass();
        this.a = str;
        this.b = adFormat;
    }
}
