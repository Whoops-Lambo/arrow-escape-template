package com.ironsource;

import defpackage.n30;
import defpackage.sr0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class A1 {
    private final long a;
    private final int b;

    @NotNull
    private final String c;
    private final int d;
    private final boolean e;

    @NotNull
    private final String f;

    @NotNull
    private final sr0 g;

    public static /* synthetic */ A1 a(A1 a1, long j, int i, String str, int i2, boolean z, String str2, sr0 sr0Var, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = a1.a;
        }
        long j2 = j;
        if ((i3 & 2) != 0) {
            i = a1.b;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            str = a1.c;
        }
        String str3 = str;
        if ((i3 & 8) != 0) {
            i2 = a1.d;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            z = a1.e;
        }
        return a1.a(j2, i4, str3, i5, z, (i3 & 32) != 0 ? a1.f : str2, (i3 & 64) != 0 ? a1.g : sr0Var);
    }

    public final int b() {
        return this.b;
    }

    @NotNull
    public final String c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public boolean equals(@Nullable Object obj) {
        return this == obj;
    }

    @NotNull
    public final String f() {
        return this.f;
    }

    @NotNull
    public final sr0 g() {
        return this.g;
    }

    @NotNull
    public final String h() {
        return this.c;
    }

    public final int i() {
        return this.b;
    }

    @NotNull
    public final String j() {
        return this.f;
    }

    @NotNull
    public final sr0 k() {
        return this.g;
    }

    public final int l() {
        return this.d;
    }

    public final long m() {
        return this.a;
    }

    public final boolean n() {
        return this.e;
    }

    @NotNull
    public String toString() {
        long j = this.a;
        int i = this.b;
        String str = this.c;
        int i2 = this.d;
        boolean z = this.e;
        String str2 = this.f;
        sr0 sr0Var = this.g;
        StringBuilder sb = new StringBuilder("AnrExitRecord(timestampMillis=");
        sb.append(j);
        sb.append(", importance=");
        sb.append(i);
        n30.t(i2, ", description=", str, ", reason=", sb);
        sb.append(", isAnrReason=");
        sb.append(z);
        sb.append(", processName=");
        sb.append(str2);
        sb.append(", readMainThreadStack=");
        sb.append(sr0Var);
        sb.append(")");
        return sb.toString();
    }

    public A1(long j, int i, @NotNull String str, int i2, boolean z, @NotNull String str2, @NotNull sr0 sr0Var) {
        str.getClass();
        str2.getClass();
        sr0Var.getClass();
        this.a = j;
        this.b = i;
        this.c = str;
        this.d = i2;
        this.e = z;
        this.f = str2;
        this.g = sr0Var;
    }

    public int hashCode() {
        return System.identityHashCode(this);
    }

    @NotNull
    public final A1 a(long j, int i, @NotNull String str, int i2, boolean z, @NotNull String str2, @NotNull sr0 sr0Var) {
        str.getClass();
        str2.getClass();
        sr0Var.getClass();
        return new A1(j, i, str, i2, z, str2, sr0Var);
    }

    public final long a() {
        return this.a;
    }
}
