package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.e6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4720e6 implements InterfaceC4939qa {

    @NotNull
    private final Xe a;
    private long b;

    @Override // com.ironsource.InterfaceC4939qa
    public void c() {
    }

    @Override // com.ironsource.InterfaceC4939qa
    public void d() {
    }

    @Override // com.ironsource.InterfaceC4939qa
    public void a() {
        this.a.a(Long.valueOf(e()));
        this.a.run();
    }

    public C4720e6(@NotNull InterfaceC4900o7 interfaceC4900o7, @NotNull Xe xe) {
        interfaceC4900o7.getClass();
        xe.getClass();
        this.a = xe;
        interfaceC4900o7.a(this);
        f();
    }

    private final long e() {
        return System.currentTimeMillis() - this.b;
    }

    private final void f() {
        this.b = System.currentTimeMillis();
    }

    @Override // com.ironsource.InterfaceC4939qa
    public void b() {
        f();
    }
}
