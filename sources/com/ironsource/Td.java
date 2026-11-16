package com.ironsource;

import defpackage.e80;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Td {

    @Nullable
    private final String a;

    @Nullable
    private final Integer b;

    public /* synthetic */ Td(String str, Integer num, int i, e80 e80Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num);
    }

    @Nullable
    public final String a() {
        return this.a;
    }

    @Nullable
    public final Integer b() {
        return this.b;
    }

    public Td(@Nullable String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
    }

    public Td(@Nullable String str, @Nullable Integer num) {
        this.a = str;
        this.b = num;
    }

    public Td() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
