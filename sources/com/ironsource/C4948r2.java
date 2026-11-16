package com.ironsource;

import defpackage.hg0;
import defpackage.s71;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.r2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4948r2 {

    @NotNull
    private final String a;
    private final boolean b;
    private boolean c;

    @NotNull
    private String d;

    @NotNull
    private Map<String, ? extends Object> e;

    @Nullable
    private C4805j2 f;

    @NotNull
    private Map<String, Object> g;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4948r2)) {
            return false;
        }
        C4948r2 c4948r2 = (C4948r2) obj;
        return s71.b(this.a, c4948r2.a) && this.b == c4948r2.b;
    }

    public static /* synthetic */ C4948r2 a(C4948r2 c4948r2, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4948r2.a;
        }
        if ((i & 2) != 0) {
            z = c4948r2.b;
        }
        return c4948r2.a(str, z);
    }

    @NotNull
    public final Map<String, Object> c() {
        return this.g;
    }

    @Nullable
    public final C4805j2 d() {
        return this.f;
    }

    public final boolean e() {
        return this.b;
    }

    @NotNull
    public final Map<String, Object> f() {
        return this.e;
    }

    @NotNull
    public final String g() {
        return this.a;
    }

    @NotNull
    public final String h() {
        return this.d;
    }

    public int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final boolean i() {
        return this.c;
    }

    @NotNull
    public String toString() {
        return "AuctionRequestInstanceInfo(name=" + this.a + ", bidder=" + this.b + ")";
    }

    public C4948r2(@NotNull String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.d = "";
        this.e = hg0.a;
        this.g = new HashMap();
    }

    public final void b(@NotNull Map<String, ? extends Object> map) {
        map.getClass();
        this.e = map;
    }

    public final boolean b() {
        return this.b;
    }

    @NotNull
    public final C4948r2 a(@NotNull String str, boolean z) {
        str.getClass();
        return new C4948r2(str, z);
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    public final void a(boolean z) {
        this.c = z;
    }

    public final void a(@NotNull String str) {
        str.getClass();
        this.d = str;
    }

    public final void a(@Nullable C4805j2 c4805j2) {
        this.f = c4805j2;
    }

    public final void a(@NotNull Map<String, Object> map) {
        map.getClass();
        this.g = map;
    }
}
