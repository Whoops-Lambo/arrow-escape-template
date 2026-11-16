package com.ironsource;

import defpackage.dt1;
import defpackage.qh1;
import java.util.Calendar;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.h1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4769h1 {

    @NotNull
    private final EnumC4872mf a;

    @NotNull
    private final W7 b;

    @NotNull
    private final String c;
    private final long d;

    @NotNull
    public final String a() {
        return this.c;
    }

    @NotNull
    public final W7 b() {
        return this.b;
    }

    @NotNull
    public final Map<String, Object> c() {
        return qh1.Y(new dt1(Ba.c, Integer.valueOf(this.b.c())), new dt1("ts", String.valueOf(this.d)));
    }

    @NotNull
    public final Map<String, Object> d() {
        return qh1.Y(new dt1(Ba.b, this.c), new dt1(Ba.c, Integer.valueOf(this.b.c())), new dt1("ts", String.valueOf(this.d)), new dt1("rt", Integer.valueOf(this.a.ordinal())));
    }

    @NotNull
    public final EnumC4872mf e() {
        return this.a;
    }

    public final long f() {
        return this.d;
    }

    public C4769h1(@NotNull EnumC4872mf enumC4872mf, @NotNull W7 w7, @NotNull String str) {
        enumC4872mf.getClass();
        w7.getClass();
        str.getClass();
        this.a = enumC4872mf;
        this.b = w7;
        this.c = str;
        this.d = Calendar.getInstance().getTimeInMillis() / 1000;
    }
}
