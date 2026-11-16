package com.ironsource;

import defpackage.pv1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class I0 {
    private final long a;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof I0) && this.a == ((I0) obj).a;
    }

    public static /* synthetic */ I0 a(I0 i0, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = i0.a;
        }
        return i0.a(j);
    }

    public final long b() {
        return this.a;
    }

    public int hashCode() {
        return Long.hashCode(this.a);
    }

    @NotNull
    public String toString() {
        return pv1.m(this.a, "AdUnitInteractionData(impressionTimeout=", ")");
    }

    public I0(long j) {
        this.a = j;
    }

    @NotNull
    public final I0 a(long j) {
        return new I0(j);
    }

    public final long a() {
        return this.a;
    }
}
