package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.md, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4870md extends AbstractC4985t3 {

    @NotNull
    private String e;
    private int f;

    public final int e() {
        return this.f;
    }

    @NotNull
    public final String f() {
        return this.e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4870md(@NotNull AbstractC4985t3 abstractC4985t3) {
        super(abstractC4985t3.b(), abstractC4985t3.c(), abstractC4985t3.d(), abstractC4985t3.a());
        abstractC4985t3.getClass();
        this.e = "";
    }

    @Override // com.ironsource.AbstractC4985t3
    @NotNull
    public String toString() {
        return super.toString() + ", reward name: " + this.e + " , amount: " + this.f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4870md(int i, @NotNull String str, boolean z, @NotNull String str2, int i2, @Nullable C4888nd c4888nd) {
        super(i, str, z, c4888nd);
        str.getClass();
        str2.getClass();
        this.f = i2;
        this.e = str2;
    }
}
