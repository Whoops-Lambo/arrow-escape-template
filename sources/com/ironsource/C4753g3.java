package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.g3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4753g3 implements InterfaceC5027v9 {

    @NotNull
    private final C4679c1 a;

    @NotNull
    private final C4663b3 b;

    @Override // com.ironsource.InterfaceC4697d1
    public boolean a() {
        return true;
    }

    @Override // com.ironsource.InterfaceC4999u
    public long b() {
        return this.b.b();
    }

    @Override // com.ironsource.InterfaceC4697d1
    @NotNull
    public String c() {
        String strF = this.a.f();
        strF.getClass();
        return strF;
    }

    @Override // com.ironsource.InterfaceC4697d1
    public boolean d() {
        return !this.a.j();
    }

    @Override // com.ironsource.InterfaceC4697d1
    @NotNull
    public String e() {
        String strA = this.a.a();
        strA.getClass();
        return strA;
    }

    @Override // com.ironsource.InterfaceC4697d1
    @NotNull
    public EnumC5063x9 f() {
        return EnumC5063x9.b.a(this.a.d());
    }

    public C4753g3(@NotNull C4679c1 c4679c1, @NotNull C4663b3 c4663b3) {
        c4679c1.getClass();
        c4663b3.getClass();
        this.a = c4679c1;
        this.b = c4663b3;
    }
}
