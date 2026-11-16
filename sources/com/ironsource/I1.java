package com.ironsource;

import defpackage.e80;
import defpackage.pv1;
import defpackage.s71;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class I1 {

    @NotNull
    private final String a;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof I1) && s71.b(this.a, ((I1) obj).a);
    }

    public /* synthetic */ I1(String str, int i, e80 e80Var) {
        this((i & 1) != 0 ? "" : str);
    }

    public static /* synthetic */ I1 a(I1 i1, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = i1.a;
        }
        return i1.a(str);
    }

    @NotNull
    public final String b() {
        return this.a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public String toString() {
        return pv1.n("ApplicationAuctionSettings(auctionData=", this.a, ")");
    }

    public I1(@NotNull String str) {
        str.getClass();
        this.a = str;
    }

    public I1() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public final I1 a(@NotNull String str) {
        str.getClass();
        return new I1(str);
    }

    @NotNull
    public final String a() {
        return this.a;
    }
}
