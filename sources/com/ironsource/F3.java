package com.ironsource;

import defpackage.j52;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class F3 implements InterfaceC4971s7 {

    @Nullable
    private final Boolean a;

    @Nullable
    private final Integer b;

    @Nullable
    private final M3 c;

    @Override // com.ironsource.InterfaceC4971s7
    @NotNull
    public Object a() {
        Boolean bool = this.a;
        if (bool == null) {
            return new j52(new Exception("enabled flag is not provided or invalid"));
        }
        if (!bool.booleanValue()) {
            return Boolean.FALSE;
        }
        Integer num = this.b;
        if (num == null || num.intValue() <= 0) {
            return new j52(new Exception("limit flag is not provided or invalid"));
        }
        return this.c == null ? new j52(new Exception("unit flag is not provided or invalid")) : Boolean.TRUE;
    }

    public F3(@Nullable Boolean bool, @Nullable Integer num, @Nullable M3 m3) {
        this.a = bool;
        this.b = num;
        this.c = m3;
    }
}
