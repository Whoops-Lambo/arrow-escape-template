package com.ironsource;

import defpackage.ek2;
import defpackage.jh0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public enum Pd {
    CAN_RECOVER("Can recover"),
    NO_LOADED_ADS("No loaded ad"),
    MAX_ATTEMPTS_REACHED("Fail to show"),
    FEATURE_DISABLED("Recovery feature is disabled");

    private static final /* synthetic */ jh0 g = ek2.m(a());

    @NotNull
    private final String a;

    @NotNull
    public static jh0 b() {
        return g;
    }

    @NotNull
    public final String c() {
        return this.a;
    }

    Pd(String str) {
        this.a = str;
    }
}
