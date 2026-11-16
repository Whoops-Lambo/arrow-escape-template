package com.ironsource;

import defpackage.n30;
import defpackage.s71;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.f9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4741f9 {

    @NotNull
    private final String a;

    @NotNull
    private final String b;

    @Nullable
    private W c;
    private boolean d;

    @Nullable
    private String e;

    @Nullable
    private String f;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4741f9)) {
            return false;
        }
        C4741f9 c4741f9 = (C4741f9) obj;
        return s71.b(this.a, c4741f9.a) && s71.b(this.b, c4741f9.b);
    }

    public static /* synthetic */ C4741f9 a(C4741f9 c4741f9, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4741f9.a;
        }
        if ((i & 2) != 0) {
            str2 = c4741f9.b;
        }
        return c4741f9.a(str, str2);
    }

    @NotNull
    public final String b() {
        return this.b;
    }

    public final boolean c() {
        return this.d;
    }

    @NotNull
    public final String d() {
        return this.a;
    }

    @Nullable
    public final W e() {
        return this.c;
    }

    @Nullable
    public final String f() {
        return this.f;
    }

    @Nullable
    public final String g() {
        return this.e;
    }

    @NotNull
    public final String h() {
        return this.b;
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return n30.n("InitConfig(appKey=", this.a, ", userId=", this.b, ")");
    }

    public C4741f9(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final void b(@Nullable String str) {
        this.e = str;
    }

    @NotNull
    public final C4741f9 a(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        return new C4741f9(str, str2);
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    public final void a(@Nullable W w) {
        this.c = w;
    }

    public final void a(boolean z) {
        this.d = z;
    }

    public final void a(@Nullable String str) {
        this.f = str;
    }

    public final <T> T a(@NotNull Ob<C4741f9, T> ob) {
        ob.getClass();
        return ob.a(this);
    }
}
