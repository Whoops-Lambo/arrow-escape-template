package com.ironsource.mediationsdk;

import defpackage.jc1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
final class b {

    @NotNull
    private final q.d a;
    private final boolean b;
    private final boolean c;
    private final boolean d;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d;
    }

    public static /* synthetic */ b a(b bVar, q.d dVar, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            dVar = bVar.a;
        }
        if ((i & 2) != 0) {
            z = bVar.b;
        }
        if ((i & 4) != 0) {
            z2 = bVar.c;
        }
        if ((i & 8) != 0) {
            z3 = bVar.d;
        }
        return bVar.a(dVar, z, z2, z3);
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    @NotNull
    public final q.d e() {
        return this.a;
    }

    public final boolean f() {
        return this.d;
    }

    public final boolean g() {
        return this.c;
    }

    public final boolean h() {
        return this.b;
    }

    public int hashCode() {
        return Boolean.hashCode(this.d) + jc1.f(jc1.f(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    @NotNull
    public String toString() {
        return "AdUnitInitStateInfo(sdkState=" + this.a + ", isRetryForMoreThan15Secs=" + this.b + ", isDemandOnlyInitRequested=" + this.c + ", isAdUnitInitRequested=" + this.d + ")";
    }

    public b(@NotNull q.d dVar, boolean z, boolean z2, boolean z3) {
        dVar.getClass();
        this.a = dVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    @NotNull
    public final b a(@NotNull q.d dVar, boolean z, boolean z2, boolean z3) {
        dVar.getClass();
        return new b(dVar, z, z2, z3);
    }

    @NotNull
    public final q.d a() {
        return this.a;
    }
}
