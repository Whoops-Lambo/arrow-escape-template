package com.ironsource;

import defpackage.e80;
import defpackage.jc1;
import defpackage.n30;
import defpackage.pv1;
import defpackage.s71;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Hb {

    @NotNull
    private final EnumC5063x9 a;

    @NotNull
    private final String b;
    private final long c;
    private final boolean d;
    private final boolean e;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Hb)) {
            return false;
        }
        Hb hb = (Hb) obj;
        return this.a == hb.a && s71.b(this.b, hb.b) && this.c == hb.c && this.d == hb.d && this.e == hb.e;
    }

    public static /* synthetic */ Hb a(Hb hb, EnumC5063x9 enumC5063x9, String str, long j, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC5063x9 = hb.a;
        }
        if ((i & 2) != 0) {
            str = hb.b;
        }
        if ((i & 4) != 0) {
            j = hb.c;
        }
        if ((i & 8) != 0) {
            z = hb.d;
        }
        if ((i & 16) != 0) {
            z2 = hb.e;
        }
        long j2 = j;
        return hb.a(enumC5063x9, str, j2, z, z2);
    }

    @NotNull
    public final String b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    @NotNull
    public final String f() {
        return this.b;
    }

    @NotNull
    public final EnumC5063x9 g() {
        return this.a;
    }

    public final long h() {
        return this.c;
    }

    public int hashCode() {
        return Boolean.hashCode(this.e) + jc1.f(pv1.d(n30.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final boolean i() {
        return this.e;
    }

    public final boolean j() {
        return this.d;
    }

    @NotNull
    public String toString() {
        return "LoadTaskConfig(instanceType=" + this.a + ", adSourceNameForEvents=" + this.b + ", loadTimeoutInMills=" + this.c + ", isOneFlow=" + this.d + ", isMultipleAdObjects=" + this.e + ")";
    }

    public Hb(@NotNull EnumC5063x9 enumC5063x9, @NotNull String str, long j, boolean z, boolean z2) {
        enumC5063x9.getClass();
        str.getClass();
        this.a = enumC5063x9;
        this.b = str;
        this.c = j;
        this.d = z;
        this.e = z2;
    }

    public /* synthetic */ Hb(EnumC5063x9 enumC5063x9, String str, long j, boolean z, boolean z2, int i, e80 e80Var) {
        this(enumC5063x9, str, j, z, (i & 16) != 0 ? true : z2);
    }

    @NotNull
    public final Hb a(@NotNull EnumC5063x9 enumC5063x9, @NotNull String str, long j, boolean z, boolean z2) {
        enumC5063x9.getClass();
        str.getClass();
        return new Hb(enumC5063x9, str, j, z, z2);
    }

    @NotNull
    public final EnumC5063x9 a() {
        return this.a;
    }
}
