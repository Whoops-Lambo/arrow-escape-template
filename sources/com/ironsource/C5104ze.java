package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import defpackage.e80;
import defpackage.pv1;
import defpackage.s71;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.ze, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5104ze {

    @NotNull
    private final String a;

    @Nullable
    private final String b;

    @NotNull
    private final List<IronSource.a> c;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5104ze)) {
            return false;
        }
        C5104ze c5104ze = (C5104ze) obj;
        return s71.b(this.a, c5104ze.a) && s71.b(this.b, c5104ze.b) && s71.b(this.c, c5104ze.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C5104ze a(C5104ze c5104ze, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c5104ze.a;
        }
        if ((i & 2) != 0) {
            str2 = c5104ze.b;
        }
        if ((i & 4) != 0) {
            list = c5104ze.c;
        }
        return c5104ze.a(str, str2, list);
    }

    @Nullable
    public final String b() {
        return this.b;
    }

    @NotNull
    public final List<IronSource.a> c() {
        return this.c;
    }

    @NotNull
    public final String d() {
        return this.a;
    }

    @NotNull
    public final List<IronSource.a> e() {
        return this.c;
    }

    @Nullable
    public final String f() {
        return this.b;
    }

    public int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.a;
        String str2 = this.b;
        List<IronSource.a> list = this.c;
        StringBuilder sbR = pv1.r("SdkInitRequest(appKey=", str, ", userId=", str2, ", legacyAdFormats=");
        sbR.append(list);
        sbR.append(")");
        return sbR.toString();
    }

    public C5104ze(@NotNull String str, @Nullable String str2, @NotNull List<IronSource.a> list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public /* synthetic */ C5104ze(String str, String str2, List list, int i, e80 e80Var) {
        this(str, (i & 2) != 0 ? null : str2, list);
    }

    @NotNull
    public final C5104ze a(@NotNull String str, @Nullable String str2, @NotNull List<IronSource.a> list) {
        str.getClass();
        list.getClass();
        return new C5104ze(str, str2, list);
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    public final void a(@NotNull List<? extends IronSource.a> list) {
        list.getClass();
        this.c.clear();
        this.c.addAll(list);
    }
}
