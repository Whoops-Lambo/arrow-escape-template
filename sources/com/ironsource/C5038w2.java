package com.ironsource;

import defpackage.j52;
import defpackage.k52;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.w2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5038w2 implements InterfaceC5056x2 {

    @NotNull
    private final String a;

    @NotNull
    private final Jd b;

    public C5038w2(@NotNull String str, @NotNull Jd jd) {
        str.getClass();
        jd.getClass();
        this.a = str;
        this.b = jd;
    }

    @Override // com.ironsource.InterfaceC5056x2
    @NotNull
    public Object a() {
        Object j52Var;
        String strC = C4916p5.b().c();
        strC.getClass();
        try {
            j52Var = new C5064xa(new J4(this.a, strC)).a();
        } catch (Throwable th) {
            j52Var = new j52(th);
        }
        Throwable thB = k52.b(j52Var);
        if (thB == null) {
            return C5002u2.h.a((JSONObject) j52Var, this.b.value());
        }
        C4950r4.d().a(thB);
        if (thB instanceof IllegalArgumentException) {
            return new j52(new C4740f8(C5095z5.a.d()));
        }
        return new j52(new C4740f8(C5095z5.a.h()));
    }
}
