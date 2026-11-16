package com.ironsource;

import defpackage.ek2;
import defpackage.jh0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.mf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public enum EnumC4872mf {
    LoadSuccess(0),
    ShowSuccess(1),
    ShowFailed(2),
    Destroyed(3),
    LoadRequest(-1);

    private static final /* synthetic */ jh0 h = ek2.m(a());
    private final int a;

    @NotNull
    public static jh0 c() {
        return h;
    }

    public final int b() {
        return this.a;
    }

    EnumC4872mf(int i) {
        this.a = i;
    }
}
