package com.ironsource;

import defpackage.e80;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.dd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4709dd {
    private final long a;

    @NotNull
    private final M3 b;

    public final long a() {
        return this.a;
    }

    @NotNull
    public final M3 b() {
        return this.b;
    }

    @NotNull
    public String toString() {
        return "PacingCappingConfig(timeInterval=" + this.a + " unit=" + this.b + ")";
    }

    public C4709dd(long j, @NotNull M3 m3) {
        m3.getClass();
        this.a = j;
        this.b = m3;
    }

    public /* synthetic */ C4709dd(long j, M3 m3, int i, e80 e80Var) {
        this(j, (i & 2) != 0 ? M3.Second : m3);
    }
}
