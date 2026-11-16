package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Ib implements W5<Hb> {

    @NotNull
    private final String a;

    @NotNull
    private final Jd b;

    @NotNull
    private final InterfaceC4715e1 c;
    private final boolean d;

    @Override // com.ironsource.W5
    @Nullable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Hb a() throws Exception {
        InterfaceC5027v9 interfaceC5027v9A = this.c.a(this.b);
        new T(this.a, interfaceC5027v9A, this.d).a();
        if (interfaceC5027v9A != null) {
            return new Hb(interfaceC5027v9A.f(), interfaceC5027v9A.e(), interfaceC5027v9A.b(), interfaceC5027v9A.d(), false, 16, null);
        }
        return null;
    }

    public Ib(@NotNull String str, @NotNull Jd jd, @NotNull InterfaceC4715e1 interfaceC4715e1, boolean z) {
        str.getClass();
        jd.getClass();
        interfaceC4715e1.getClass();
        this.a = str;
        this.b = jd;
        this.c = interfaceC4715e1;
        this.d = z;
    }
}
