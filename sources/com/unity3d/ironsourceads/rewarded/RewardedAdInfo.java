package com.unity3d.ironsourceads.rewarded;

import defpackage.n30;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class RewardedAdInfo {

    @NotNull
    private final String a;

    @NotNull
    private final String b;

    @NotNull
    public final String getAdId() {
        return this.b;
    }

    @NotNull
    public final String getInstanceId() {
        return this.a;
    }

    @NotNull
    public String toString() {
        return n30.n("[instanceId: '", this.a, "', adId: '", this.b, "']");
    }

    public RewardedAdInfo(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }
}
