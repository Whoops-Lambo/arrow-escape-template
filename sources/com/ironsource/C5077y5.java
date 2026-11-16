package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.y5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5077y5 implements Gb {

    @NotNull
    private final IronSourceError a;

    @NotNull
    private final C4806j3 b;

    @NotNull
    private final InterfaceC4947r1 c;

    @NotNull
    public final IronSourceError a() {
        return this.a;
    }

    @Override // com.ironsource.Gb
    public void start() {
        InterfaceC4822k1.c.a aVar = InterfaceC4822k1.c.a;
        aVar.a().a(this.c);
        aVar.a(new C4876n1.j(this.a.getErrorCode()), new C4876n1.k(this.a.getErrorMessage()), new C4876n1.f(0L)).a(this.c);
        this.b.a(this.a);
    }

    public C5077y5(@NotNull IronSourceError ironSourceError, @NotNull C4806j3 c4806j3, @NotNull InterfaceC4947r1 interfaceC4947r1) {
        ironSourceError.getClass();
        c4806j3.getClass();
        interfaceC4947r1.getClass();
        this.a = ironSourceError;
        this.b = c4806j3;
        this.c = interfaceC4947r1;
    }
}
