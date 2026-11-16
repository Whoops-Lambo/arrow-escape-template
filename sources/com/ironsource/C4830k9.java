package com.ironsource;

import defpackage.e80;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.k9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4830k9 {

    @NotNull
    private final InterfaceC4986t4 a;

    @NotNull
    private final Rb.a b;

    @Nullable
    private Long c;

    @Nullable
    private Long d;

    @Nullable
    private Rb e;

    @Nullable
    private C4812j9 f;

    public /* synthetic */ C4830k9(InterfaceC4986t4 interfaceC4986t4, Rb.a aVar, int i, e80 e80Var) {
        this((i & 1) != 0 ? new InterfaceC4986t4.a() : interfaceC4986t4, (i & 2) != 0 ? new Rb.a.C0359a() : aVar);
    }

    @Nullable
    public final C4812j9 b() {
        Long l = this.d;
        if (l != null) {
            long jLongValue = l.longValue();
            Long l2 = this.c;
            if (l2 != null) {
                long jLongValue2 = l2.longValue();
                Rb rb = this.e;
                if (rb == null) {
                    return null;
                }
                long jA = this.a.a();
                Rb rb2 = this.b.get();
                C4812j9 c4812j9 = new C4812j9(jA - jLongValue, new C4812j9.a(Math.max(0L, rb2.d() - rb.d()), Math.max(0L, rb2.e() - rb.e()), Math.max(0L, rb2.f() - rb.f())), jLongValue2 / 1024);
                this.f = c4812j9;
                return c4812j9;
            }
        }
        return null;
    }

    public final void a(@NotNull String str) {
        str.getClass();
        this.c = Long.valueOf(str.length());
        this.e = this.b.get();
        this.d = Long.valueOf(this.a.a());
    }

    public C4830k9(@NotNull InterfaceC4986t4 interfaceC4986t4, @NotNull Rb.a aVar) {
        interfaceC4986t4.getClass();
        aVar.getClass();
        this.a = interfaceC4986t4;
        this.b = aVar;
    }

    public C4830k9() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Nullable
    public final C4812j9 a() {
        return this.f;
    }
}
