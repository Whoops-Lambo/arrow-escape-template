package com.ironsource;

import defpackage.j52;
import defpackage.k52;
import defpackage.n30;
import defpackage.wr0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.m4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4861m4 implements InterfaceC4826k5<D8> {

    @NotNull
    private final InterfaceC4684c6 a;

    @NotNull
    private final String b;

    @NotNull
    private final C7 c;

    @NotNull
    private final wr0 d;

    @NotNull
    private D8 e;

    @Override // com.ironsource.InterfaceC4826k5
    @NotNull
    public String c() {
        return this.b;
    }

    @Override // com.ironsource.InterfaceC4826k5
    @NotNull
    public InterfaceC4684c6 d() {
        return this.a;
    }

    @Override // com.ironsource.InterfaceC4826k5
    @NotNull
    public wr0 i() {
        return this.d;
    }

    @Override // com.ironsource.InterfaceC4826k5
    @NotNull
    public D8 k() {
        return this.e;
    }

    @Override // com.ironsource.InterfaceC4826k5
    @NotNull
    public C7 l() {
        return this.c;
    }

    public C4861m4(@NotNull InterfaceC4684c6 interfaceC4684c6, @NotNull String str, @NotNull C7 c7, @NotNull wr0 wr0Var) {
        interfaceC4684c6.getClass();
        str.getClass();
        c7.getClass();
        wr0Var.getClass();
        this.a = interfaceC4684c6;
        this.b = str;
        this.c = c7;
        this.d = wr0Var;
        this.e = new D8(c());
    }

    @Override // com.ironsource.Vc
    public void a(@Nullable D8 d8, @NotNull C5008u8 c5008u8) {
        c5008u8.getClass();
        i().invoke(new k52(new j52(new Exception(n30.y("Unable to download mobileController.html: ", c5008u8.b())))));
    }

    @Override // com.ironsource.InterfaceC4826k5
    public void b(@NotNull D8 d8) {
        d8.getClass();
        this.e = d8;
    }

    @Override // com.ironsource.Vc
    public void a(@NotNull D8 d8) {
        d8.getClass();
        i().invoke(new k52(d8));
    }
}
