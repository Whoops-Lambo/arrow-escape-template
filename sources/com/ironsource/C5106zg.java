package com.ironsource;

import defpackage.pv1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.zg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5106zg implements InterfaceC4684c6 {

    @NotNull
    private final C4799id a;

    @NotNull
    private final String b;

    @NotNull
    public final String a() {
        return this.b;
    }

    @Override // com.ironsource.InterfaceC4684c6
    @NotNull
    public String value() {
        return pv1.w(this.a.a(), "/versions/", this.b, "/mobileController.html");
    }

    public C5106zg(@NotNull C4799id c4799id, @NotNull String str) {
        c4799id.getClass();
        str.getClass();
        this.a = c4799id;
        this.b = str;
    }
}
