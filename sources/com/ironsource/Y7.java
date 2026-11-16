package com.ironsource;

import defpackage.jc1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Y7 {
    private final int a;
    private final int b;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y7)) {
            return false;
        }
        Y7 y7 = (Y7) obj;
        return this.a == y7.a && this.b == y7.b;
    }

    public static /* synthetic */ Y7 a(Y7 y7, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = y7.a;
        }
        if ((i3 & 2) != 0) {
            i2 = y7.b;
        }
        return y7.a(i, i2);
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.b;
    }

    public final int d() {
        return this.a;
    }

    public int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    @NotNull
    public String toString() {
        return jc1.n("ISContainerParams(width=", this.a, ", height=", this.b, ")");
    }

    public Y7(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @NotNull
    public final Y7 a(int i, int i2) {
        return new Y7(i, i2);
    }

    public final int a() {
        return this.a;
    }
}
