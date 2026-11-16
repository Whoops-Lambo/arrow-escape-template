package com.ironsource;

import com.unity3d.mediation.rewarded.LevelPlayReward;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public interface S7 {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface a {
        void a(@NotNull String str, @NotNull String str2, int i);

        void b(@NotNull String str, @NotNull String str2, int i);
    }

    @Nullable
    LevelPlayReward a(@Nullable String str);

    @NotNull
    LevelPlayReward a(@Nullable String str, @NotNull String str2);

    @Nullable
    LevelPlayReward b(@NotNull String str);
}
