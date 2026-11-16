package com.ironsource;

import defpackage.az2;
import defpackage.j52;
import defpackage.k52;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class R4 implements InterfaceC4989t7, InterfaceC4989t7.a {

    @NotNull
    private final ConcurrentHashMap<String, O4> a = new ConcurrentHashMap<>();

    @Override // com.ironsource.InterfaceC4989t7.a
    @NotNull
    public Object a(@NotNull String str, @NotNull N3 n3, @NotNull InterfaceC4953r7 interfaceC4953r7) {
        str.getClass();
        n3.getClass();
        interfaceC4953r7.getClass();
        Object objA = interfaceC4953r7.a();
        boolean z = objA instanceof j52;
        az2 az2Var = az2.a;
        if (!z) {
            O4 o4 = (O4) objA;
            if (o4 != null) {
                this.a.put(str, o4);
                return az2Var;
            }
        } else {
            Throwable thB = k52.b(objA);
            if (thB != null) {
                return new j52(thB);
            }
        }
        return az2Var;
    }

    @Override // com.ironsource.InterfaceC4989t7.a
    public void b(@NotNull String str) {
        str.getClass();
    }

    @Override // com.ironsource.InterfaceC4989t7
    @NotNull
    public L3 a(@NotNull String str) {
        str.getClass();
        O4 o4 = this.a.get(str);
        if (o4 != null && !o4.a()) {
            return new L3(true, N3.Delivery);
        }
        return new L3(false, null, 2, null);
    }
}
