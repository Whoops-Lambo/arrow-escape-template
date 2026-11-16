package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.w5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5041w5 {

    @NotNull
    private final InterfaceC4947r1 a;

    public C5041w5(@NotNull InterfaceC4947r1 interfaceC4947r1, @NotNull String str, @NotNull Jd jd) {
        interfaceC4947r1.getClass();
        str.getClass();
        jd.getClass();
        this.a = interfaceC4947r1;
        interfaceC4947r1.a(new C4876n1.s(jd.value()), new C4876n1.b(str));
    }

    public final void a(@NotNull IronSourceError ironSourceError) {
        ironSourceError.getClass();
        InterfaceC4822k1.c.a.a(new C4876n1.j(ironSourceError.getErrorCode()), new C4876n1.k(ironSourceError.getErrorMessage()), new C4876n1.f(0L)).a(this.a);
    }

    public final void a() {
        InterfaceC4822k1.c.a.a().a(this.a);
    }
}
