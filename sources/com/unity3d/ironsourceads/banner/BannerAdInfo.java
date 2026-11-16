package com.unity3d.ironsourceads.banner;

import defpackage.n30;
import defpackage.s71;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class BannerAdInfo {

    @NotNull
    private final String a;

    @NotNull
    private final String b;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerAdInfo)) {
            return false;
        }
        BannerAdInfo bannerAdInfo = (BannerAdInfo) obj;
        return s71.b(this.a, bannerAdInfo.a) && s71.b(this.b, bannerAdInfo.b);
    }

    public static /* synthetic */ BannerAdInfo copy$default(BannerAdInfo bannerAdInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bannerAdInfo.a;
        }
        if ((i & 2) != 0) {
            str2 = bannerAdInfo.b;
        }
        return bannerAdInfo.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.a;
    }

    @NotNull
    public final String component2() {
        return this.b;
    }

    @NotNull
    public final String getAdId() {
        return this.b;
    }

    @NotNull
    public final String getInstanceId() {
        return this.a;
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return n30.n("[instanceId: '", this.a, "', adId: '", this.b, "']");
    }

    public BannerAdInfo(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    @NotNull
    public final BannerAdInfo copy(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        return new BannerAdInfo(str, str2);
    }
}
