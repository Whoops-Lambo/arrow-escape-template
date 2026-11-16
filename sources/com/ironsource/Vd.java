package com.ironsource;

import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Vd implements S7, S7.a {

    @NotNull
    private final Map<String, LevelPlayReward> a = new LinkedHashMap();

    @NotNull
    private final Map<String, LevelPlayReward> b = new LinkedHashMap();

    @Override // com.ironsource.S7
    @NotNull
    public LevelPlayReward a(@Nullable String str, @NotNull String str2) {
        str2.getClass();
        LevelPlayReward levelPlayRewardA = a(str);
        if (levelPlayRewardA == null && (levelPlayRewardA = b(str2)) == null) {
            return a();
        }
        return levelPlayRewardA;
    }

    @Override // com.ironsource.S7.a
    public void b(@NotNull String str, @NotNull String str2, int i) {
        str.getClass();
        str2.getClass();
        this.b.put(str, new LevelPlayReward(str2, i));
    }

    @Override // com.ironsource.S7
    @Nullable
    public LevelPlayReward b(@NotNull String str) {
        str.getClass();
        return this.b.get(str);
    }

    @Override // com.ironsource.S7.a
    public void a(@NotNull String str, @NotNull String str2, int i) {
        str.getClass();
        str2.getClass();
        this.a.put(str, new LevelPlayReward(str2, i));
    }

    @Override // com.ironsource.S7
    @Nullable
    public LevelPlayReward a(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return this.a.get(str);
    }

    private final LevelPlayReward a() {
        return new LevelPlayReward("", 0);
    }
}
