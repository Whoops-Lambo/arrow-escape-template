package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC5065xb
public final class La implements Sa {

    @NotNull
    private final Ja a;

    @Override // com.ironsource.Sa
    public void b() {
        this.a.a("Loading a destroyed ad");
    }

    @Override // com.ironsource.Sa
    public void c() {
        this.a.a("Destroying a destroyed ad");
    }

    @Override // com.ironsource.Sa
    public void d() {
        this.a.a("Pausing auto refresh on a destroyed ad");
    }

    @Override // com.ironsource.Sa
    public void f() {
        this.a.a("Resuming auto refresh on a destroyed ad");
    }

    public La(@NotNull Ja ja) {
        ja.getClass();
        this.a = ja;
    }

    @Override // com.ironsource.L0
    public void a(@NotNull C5000u0 c5000u0) {
        c5000u0.getClass();
        this.a.a("Received load success on a destroyed ad");
    }

    @Override // com.ironsource.L0
    public void b(@Nullable IronSourceError ironSourceError) {
        this.a.a("Received load failed on a destroyed ad");
    }
}
