package com.unity3d.mediation.rewarded;

import defpackage.s71;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class LevelPlayReward {

    @NotNull
    private final String a;
    private final int b;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LevelPlayReward)) {
            return false;
        }
        LevelPlayReward levelPlayReward = (LevelPlayReward) obj;
        return s71.b(this.a, levelPlayReward.a) && this.b == levelPlayReward.b;
    }

    public static /* synthetic */ LevelPlayReward copy$default(LevelPlayReward levelPlayReward, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = levelPlayReward.a;
        }
        if ((i2 & 2) != 0) {
            i = levelPlayReward.b;
        }
        return levelPlayReward.copy(str, i);
    }

    @NotNull
    public final String component1() {
        return this.a;
    }

    public final int component2() {
        return this.b;
    }

    public final int getAmount() {
        return this.b;
    }

    @NotNull
    public final String getName() {
        return this.a;
    }

    public int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "LevelPlayReward(name=" + this.a + ", amount=" + this.b + ")";
    }

    public LevelPlayReward(@NotNull String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }

    @NotNull
    public final LevelPlayReward copy(@NotNull String str, int i) {
        str.getClass();
        return new LevelPlayReward(str, i);
    }
}
