package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.tf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C4997tf {
    private final int a;

    @NotNull
    private final M3 b;

    public final int a() {
        return this.a;
    }

    @NotNull
    public final M3 b() {
        return this.b;
    }

    @NotNull
    public String toString() {
        return "ShowCountCappingConfig(maxImpressions=" + this.a + ", unit=" + this.b + ")";
    }

    public C4997tf(int i, @NotNull M3 m3) {
        m3.getClass();
        this.a = i;
        this.b = m3;
    }
}
