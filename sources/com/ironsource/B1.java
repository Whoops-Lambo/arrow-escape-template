package com.ironsource;

import defpackage.s71;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class B1 {

    @NotNull
    private final String a;
    private final boolean b;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B1)) {
            return false;
        }
        B1 b1 = (B1) obj;
        return s71.b(this.a, b1.a) && this.b == b1.b;
    }

    public static /* synthetic */ B1 a(B1 b1, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = b1.a;
        }
        if ((i & 2) != 0) {
            z = b1.b;
        }
        return b1.a(str, z);
    }

    public final boolean b() {
        return this.b;
    }

    @NotNull
    public final String c() {
        return this.a;
    }

    public final boolean d() {
        return this.b;
    }

    public int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "AnrProcessIdentity(processName=" + this.a + ", isMainProcess=" + this.b + ")";
    }

    public B1(@NotNull String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
    }

    @NotNull
    public final B1 a(@NotNull String str, boolean z) {
        str.getClass();
        return new B1(str, z);
    }

    @NotNull
    public final String a() {
        return this.a;
    }
}
