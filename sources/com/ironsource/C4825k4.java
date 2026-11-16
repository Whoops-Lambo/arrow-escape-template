package com.ironsource;

import defpackage.e80;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.k4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4825k4 implements InterfaceC5079y7 {

    @NotNull
    private final String a;

    @NotNull
    private final String b;
    private final boolean c;

    @NotNull
    private final C4799id d;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C4825k4(String str, String str2, boolean z, C4799id c4799id, int i, e80 e80Var) {
        str = (i & 1) != 0 ? "" : str;
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? new C4799id(str) : c4799id);
    }

    @Override // com.ironsource.InterfaceC5079y7
    @NotNull
    public String a() {
        return this.a;
    }

    @Override // com.ironsource.InterfaceC5079y7
    public boolean b() {
        return this.c;
    }

    @Override // com.ironsource.InterfaceC5079y7
    @NotNull
    public C4799id c() {
        return this.d;
    }

    @Override // com.ironsource.InterfaceC5079y7
    @NotNull
    public String d() {
        return this.b;
    }

    public C4825k4(@NotNull String str, @NotNull String str2, boolean z, @NotNull C4799id c4799id) {
        str.getClass();
        str2.getClass();
        c4799id.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = c4799id;
    }

    public C4825k4() {
        this(null, null, false, null, 15, null);
    }
}
