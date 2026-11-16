package com.ironsource;

import defpackage.dk2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.id, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4799id {

    @NotNull
    private final String a;

    @NotNull
    public final String a() {
        String str = this.a;
        return str.substring(0, dk2.a0(6, str, "/"));
    }

    public C4799id(@NotNull String str) {
        str.getClass();
        this.a = str;
    }
}
