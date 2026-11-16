package com.ironsource;

import defpackage.az2;
import defpackage.j52;
import defpackage.k52;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.ed, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4727ed implements InterfaceC4989t7, InterfaceC4989t7.a {

    @NotNull
    private final InterfaceC4986t4 a;

    @NotNull
    private final N7 b;

    @NotNull
    private final Map<String, C4709dd> c;

    public C4727ed(@NotNull InterfaceC4986t4 interfaceC4986t4, @NotNull N7 n7) {
        interfaceC4986t4.getClass();
        n7.getClass();
        this.a = interfaceC4986t4;
        this.b = n7;
        this.c = new LinkedHashMap();
    }

    @Override // com.ironsource.InterfaceC4989t7
    @NotNull
    public L3 a(@NotNull String str) {
        str.getClass();
        C4709dd c4709dd = this.c.get(str);
        if (c4709dd == null) {
            return new L3(false, null, 2, null);
        }
        if (a(c4709dd, str)) {
            return new L3(true, N3.Pacing);
        }
        return new L3(false, null, 2, null);
    }

    @Override // com.ironsource.InterfaceC4989t7.a
    public void b(@NotNull String str) {
        str.getClass();
        if (this.c.get(str) == null) {
            return;
        }
        this.b.a(this.a.a(), str);
    }

    private final boolean a(C4709dd c4709dd, String str) {
        Long lA = this.b.a(str);
        return lA != null && this.a.a() - lA.longValue() < c4709dd.a();
    }

    @NotNull
    public final Map<String, C4709dd> a() {
        return this.c;
    }

    @Override // com.ironsource.InterfaceC4989t7.a
    @NotNull
    public Object a(@NotNull String str, @NotNull N3 n3, @NotNull InterfaceC4953r7 interfaceC4953r7) {
        str.getClass();
        n3.getClass();
        interfaceC4953r7.getClass();
        Object objB = interfaceC4953r7.b();
        boolean z = objB instanceof j52;
        az2 az2Var = az2.a;
        if (z) {
            Throwable thB = k52.b(objB);
            if (thB != null) {
                return new j52(thB);
            }
        } else {
            C4709dd c4709dd = (C4709dd) objB;
            if (c4709dd != null) {
                this.c.put(str, c4709dd);
                return az2Var;
            }
        }
        return az2Var;
    }
}
